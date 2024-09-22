package com.example.demo.controller.giohang;

import com.example.demo.entity.giohang.HoaDon;
import com.example.demo.entity.giohang.KhachHang;
import com.example.demo.repository.giohang.HoaDonRepository;
import com.example.demo.repository.giohang.KhachHangRepository;
import jakarta.validation.Valid;
import org.eclipse.tags.shaded.org.apache.xpath.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("gio-hang")
public class GioHangController {
    @Autowired
    private HoaDonRepository hdRepo;
    @Autowired
    private KhachHangRepository khRepo;
    private HoaDon hdr;

    @GetMapping("hien-thi")
    public String index(Model model) {
        List<HoaDon> ds = hdRepo.findAll();
        List<KhachHang> ds2 = khRepo.findAll();
        model.addAttribute("listHD", ds);
        model.addAttribute("listKH", ds2);
        return "gio_hang/index";
    }

    @PostMapping("add")
    public String add(@ModelAttribute("data") HoaDon hd, Model model) {
        List<KhachHang> ds2 = khRepo.findAll();
        List<HoaDon> ds = hdRepo.findAll();
        model.addAttribute("listKH", ds2);
        model.addAttribute("listHD", ds);
        hdRepo.save(hd);
        return "gio_hang/index";
    }

    @GetMapping("remove/{id}")
    public String remove(@PathVariable Integer id) {
        hdRepo.deleteById(id);
        return "redirect:/gio-hang/hien-thi";
    }

    @GetMapping("/detail/{id}")
    public String detail(@PathVariable Integer id, Model model) {
        HoaDon hd = hdRepo.findById(id).get();
        model.addAttribute("data", hd);
        model.addAttribute("listHD", hdRepo.findAll());
        model.addAttribute("listKH", khRepo.findAll());
        return "gio_hang/index";

    }

    @GetMapping("edit/{id}")
    public String edit(@PathVariable Integer id, Model model) {
        model.addAttribute("data", hdRepo.findById(id).get());
        model.addAttribute("listKH", khRepo.findAll());
        return "gio_hang/update";
    }

    @PostMapping("update/{id}")
    public String update(@Valid @ModelAttribute("data") HoaDon hd, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("listKH", khRepo.findAll());
            return "/gio_hang/update";
        }
        hdRepo.save(hd);
        return "redirect:/gio-hang/hien-thi";
    }

}
