package com.codegym.controllers;

import com.codegym.models.DichVuDiKem;
import com.codegym.models.HopDongChiTiet;
import com.codegym.services.DichVuDiKemService;
import com.codegym.services.HopDongChiTietService;
import com.codegym.services.HopDongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
public class HopDongChiTietController {
    @Autowired
    HopDongChiTietService hopDongChiTietService;
    @Autowired
    HopDongService hopDongService;
    @Autowired
    DichVuDiKemService dichVuDiKemService;
    @RequestMapping("/contract-detail-create")
    public String addContractDetailForm(Model model){
        model.addAttribute("hopDongChiTiet", new HopDongChiTiet());
        model.addAttribute("listDichVuDiKem", dichVuDiKemService.findAll());
        model.addAttribute("listHopDong", hopDongService.findAll());
        return "hop_dong_chi_tiet/create";
    }
    @PostMapping("/contract-detail-create")
    public String addContractDetail(@Valid @ModelAttribute("hopDongChiTiet") HopDongChiTiet hopDongChiTiet,
                                    BindingResult bindingResult, Model model){
        if (bindingResult.hasFieldErrors()){
            model.addAttribute("listDichVuDiKem", dichVuDiKemService.findAll());
            model.addAttribute("listHopDong", hopDongService.findAll());
        }
        else {
            hopDongChiTietService.save(hopDongChiTiet);
            model.addAttribute("hopDongChiTiet", new HopDongChiTiet());
            model.addAttribute("listDichVuDiKem", dichVuDiKemService.findAll());
            model.addAttribute("listHopDong", hopDongService.findAll());
            model.addAttribute("message", "thêm hợp đồng chi tiết thành công");
        }
        return "hop_dong_chi_tiet/create";
    }
}
