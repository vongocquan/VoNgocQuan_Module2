package com.codegym.controllers;

import com.codegym.models.HopDong;
import com.codegym.models.KhachHang;
import com.codegym.services.HopDongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.xml.ws.Action;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Controller
public class KhachHangSuDungController {
    @Autowired
    HopDongService hopDongService;
    @RequestMapping("/customer-use-service")
    public String listCustomerUseService(Model model){
        List<HopDong> listHopDong = hopDongService.findAll();
        Set<KhachHang> listKhachHang = new HashSet<>();
        for (HopDong hopDong : listHopDong) {
            listKhachHang.add(hopDong.getKhachHang());
        }
        model.addAttribute("listKhachHang", listKhachHang);
        return "khach_hang_su_dung_dich_vu/list";
    }
}
