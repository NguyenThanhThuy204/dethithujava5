package com.example.demo.controller.dichvu;

import com.example.demo.entity.dichvu.DichVu;
import com.example.demo.entity.dichvu.LoaiDichVu;
import com.example.demo.repository.dichvu.DichVuRepository;
import com.example.demo.repository.dichvu.LoaiDichVuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("dich-vu")
public class DichVuController {
    @Autowired
    private DichVuRepository dichVuRepository;

    @Autowired
    private LoaiDichVuRepository loaiDichVuRepository;

    @GetMapping("hien-thi")
    public String index(Model model) {
        List<DichVu> dichVuList = this.dichVuRepository.findAll();
        List<LoaiDichVu> loaiDichVuList = this.loaiDichVuRepository.findAll();
        model.addAttribute("dichVuList", dichVuList);
        model.addAttribute("loaiDichVuList", loaiDichVuList);
        return "dich_vu/index";
    }

    @PostMapping("add")
    public String add(@ModelAttribute("data") DichVu dichVu, Model model) {
        List<LoaiDichVu> loaiDichVuList = this.loaiDichVuRepository.findAll();
        model.addAttribute("loaiDichVuList", loaiDichVuList);
        this.dichVuRepository.save(dichVu);
        return "redirect:/dich-vu/hien-thi";
    }


    @GetMapping("detail/{id}")
    public String detail(@PathVariable("id") Integer id, Model model) {
        DichVu dichVu = dichVuRepository.findById(id).get();
        List<LoaiDichVu> loaiDichVuList = this.loaiDichVuRepository.findAll();
        List<DichVu> dichVuList = this.dichVuRepository.findAll();
        model.addAttribute("dichVuList", dichVuList);
        model.addAttribute("loaiDichVuList", loaiDichVuList);
        model.addAttribute("data", dichVu);
        return "dich_vu/index";
    }

    @GetMapping("/remove/{id}")
    public String delete(@PathVariable Integer id) {
        dichVuRepository.deleteById(id);
        return "redirect:/dich-vu/hien-thi";
    }


}
