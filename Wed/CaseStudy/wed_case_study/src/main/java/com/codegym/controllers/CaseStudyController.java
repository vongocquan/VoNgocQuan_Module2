package com.codegym.controllers;

import com.codegym.models.*;
import com.codegym.services.dich_vu.DichVuService;
import com.codegym.services.dich_vu_di_kem.DichVuDiKemService;
import com.codegym.services.hop_dong.HopDongService;
import com.codegym.services.hop_dong_chi_tiet.HopDongChiTietService;
import com.codegym.services.khach_hang.KhachHangService;
import com.codegym.services.kieu_thue.KieuThueService;
import com.codegym.services.loai_dich_vu.LoaiDichVuService;
import com.codegym.services.loai_khach.LoaiKhachService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class CaseStudyController {
    @Autowired
    KhachHangService khachHangService;
    @Autowired
    LoaiKhachService loaiKhachService;
    @RequestMapping("/")
    public String home(){
        return "home";
    }

//    *******************Khách Hàng*********************
    @RequestMapping("/customer")
    public String listCustomer(Model model, @PageableDefault(size = 3)Pageable pageable){
        model.addAttribute("listKhachHang", khachHangService.findAll(pageable));
        return "khach_hang/list";
    }
    @RequestMapping("/customer-create")
    public String addCustomerForm(Model model){
        model.addAttribute("khachHang", new KhachHang());
        model.addAttribute("listLoaiKhach", loaiKhachService.findAll());
        return "khach_hang/create";
    }
    @PostMapping("/customer-create")
    public String addCustomer(@ModelAttribute("khachHang") KhachHang khachHang){
        khachHangService.save(khachHang);
        return "redirect:/customer";
    }
    @RequestMapping("/customer-edit/{id}")
    public String editCustomerForm(@PathVariable("id") int id, Model model){
        model.addAttribute("khachHang", khachHangService.findById(id));
        model.addAttribute("listLoaiKhach", loaiKhachService.findAll());
        return "khach_hang/edit";
    }
    @PostMapping("/customer-edit")
    public String editCustomer(@ModelAttribute("khachHang") KhachHang khachHang){
        khachHangService.save(khachHang);
        return "redirect:/customer";
    }

    @GetMapping("/customer-delete/{id}")
    public String deleteCustomer( @PathVariable("id") int id){
        khachHangService.delete(id);
        return "redirect:/customer";
    }
//    *******************Dich Vụ**************************
    @Autowired
    DichVuService dichVuService;
    @Autowired
    KieuThueService kieuThueService;
    @Autowired
    LoaiDichVuService loaiDichVuService;
    @RequestMapping("/service")
    public String listService(Model model, @PageableDefault(size = 3) Pageable pageable){
        model.addAttribute("listDichVu", dichVuService.findAll(pageable));
        return "dich_vu/list";
    }
    @RequestMapping("/service-create")
    public String addServiceForm1(Model model){
        model.addAttribute("dichVu", new DichVu());
        model.addAttribute("listLoaiDichVu", loaiDichVuService.findAll());
        model.addAttribute("listKieuThue", kieuThueService.findAll());
        return "dich_vu/create";
    }
    @PostMapping("/service-create/type-service")
    public String addServiceForm2(@ModelAttribute("dichVu") DichVu dichVu, Model model){
        model.addAttribute("dichVu", dichVu);
        return "dich_vu/create_other";
    }
    @PostMapping("/service-create/other")
    public String addService(@ModelAttribute("dicVu") DichVu dichVu){
        dichVuService.save(dichVu);
        return "redirect:/service";
    }
    @RequestMapping("/service-edit/{id}")
    public String updateServiceForm1(@PathVariable("id") int id, Model model){
        model.addAttribute("dichVu", dichVuService.findById(id));
        model.addAttribute("listLoaiDichVu", loaiDichVuService.findAll());
        model.addAttribute("listKieuThue", kieuThueService.findAll());
        return "dich_vu/edit";
    }
    @PostMapping("/service-edit/type-service")
    public String updateServiceForm2(@ModelAttribute("dichVu") DichVu dichVu, Model model){
        model.addAttribute("dichVu", dichVu);
        return "dich_vu/edit_other";
    }
    @PostMapping("/service-edit/other")
    public String updateService(@ModelAttribute("dichVu") DichVu dichVu){
        dichVuService.save(dichVu);
        return "redirect:/service";
    }
    @GetMapping("/service-delete/{id}")
    public String deleteService( @PathVariable("id") int id){
        dichVuService.delete(id);
        return "redirect:/service";
    }
//    ******************Hợp Đồng******************
    @Autowired
    HopDongService hopDongService;
    @RequestMapping("/contract")
    public String list(Model model, @PageableDefault(size = 3) Pageable pageable){
        model.addAttribute("listHopDong", hopDongService.findAll(pageable));
        return "hop_dong/list";
    }
    @RequestMapping("/contract-create")
    public String addContractForm(Model model){
        model.addAttribute("hopDong", new HopDong());
        return "hop_dong/create";
    }

    @GetMapping("/search-customer")
    public String searchCustomerForm(Model model,@PageableDefault(size = 3) Pageable pageable){
        model.addAttribute("listKhachHang", khachHangService.findAll(pageable));
        return "hop_dong/search";
    }
    @PostMapping("/search-customer-list")
    public String searchCustomerFormList(@RequestParam Optional<String> key,Model model, @PageableDefault(size = 3)
                                         Pageable pageable){
        Page<KhachHang> listKhachHang = null;
        if (!key.isPresent()){
            listKhachHang =  khachHangService.findAll(pageable);
        }else {
            listKhachHang =  khachHangService.findByTenKhachHangContainingOrChungMinhThuContaining(key.get(), key.get(), pageable);
            model.addAttribute("key", key.get());
        }
        model.addAttribute("listKhachHang", listKhachHang);
        return "hop_dong/search";
    }
    @RequestMapping("/contract/customer/{id}")
    public String createContractForm(@PathVariable int id,Model model){
        HopDong hopDong = new HopDong();
        hopDong.setKhachHang(khachHangService.findById(id));
        model.addAttribute("hopDong", hopDong);
        return "hop_dong/create";
    }
    @PostMapping("/contract-create")
    public String createContract(@ModelAttribute("hopDong") HopDong hopDong){
        hopDongService.save(hopDong);
        return "redirect:/contract";
    }
//    *********Hợp Đồng Chi Tiết************
    @Autowired
    HopDongChiTietService hopDongChiTietService;
    @Autowired
    DichVuDiKemService dichVuDiKemService;
    @RequestMapping("/contract-detail-create")
    public String addContractDetailForm(Model model){
        model.addAttribute("hopDongChiTiet", new HopDongChiTiet());
        return "hop_dong_chi_tiet/create";
    }
    @RequestMapping("/search-contract")
    public String searchContract(Model model,@PageableDefault(size = 3) Pageable pageable){
        model.addAttribute("listHopDong", hopDongService.findAll(pageable));
        return "hop_dong_chi_tiet/search_contract";
    }
    @PostMapping("/search-contract-list")
    public String searchContractFormList(@RequestParam Optional<String> key,Model model, @PageableDefault(size = 3)
            Pageable pageable){
        Page<HopDong> listHopDong = null;
        if (!key.isPresent()){
            listHopDong =  hopDongService.findByNgayKetThucHopDongContainingOrNgayLamHopDongContaining(key.get(),
                    key.get(), pageable);
        }else {
            listHopDong =  hopDongService.findByNgayKetThucHopDongContainingOrNgayLamHopDongContaining(key.get(), key.get(),
                    pageable);
            model.addAttribute("key", key.get());
        }
        model.addAttribute("listHopDong", listHopDong);
        return "hop_dong_chi_tiet/search_contract";
    }
    @RequestMapping("contract-detail/contract/{id}")
    public String createContractDetailForm(@PathVariable int id, Model model){
        HopDongChiTiet hopDongChiTiet = new HopDongChiTiet();
        hopDongChiTiet.setHopDong(hopDongService.findById(id));
        model.addAttribute("hopDongChiTiet", hopDongChiTiet);
        return "hop_dong_chi_tiet/create";
    }
    @RequestMapping("/search-accompanied-service-list")
    public String searchAccompanied(Model model,@PageableDefault(size = 3) Pageable pageable) {
        model.addAttribute("listDichVuDiKem", dichVuDiKemService.findAll(pageable));
        return "hop_dong_chi_tiet/sear";
    }
}
