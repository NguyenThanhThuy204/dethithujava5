package com.example.demo.controller.phong;

import com.example.demo.entity.phong.LoaiPhong;
import com.example.demo.entity.phong.Phong;
import com.example.demo.repository.phong.LoaiPhongRepository;
import com.example.demo.repository.phong.PhongRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("phong")
public class PhongControlller {
    @Autowired
    private PhongRepository phongRepo;
    @Autowired
    private LoaiPhongRepository loaiphongRepo;

//    @GetMapping("hien-thi")
//    public String index(Model model) {
//        List<Phong> ds = this.phongRepo.findAll();
//        List<LoaiPhong> ds2 = this.loaiphongRepo.findAll();
//        model.addAttribute("listPhong", ds);
//        model.addAttribute("listLP", ds2);
//        return "phong/index";
//    }

    @GetMapping("/hien-thi")
    public String hienThi(@RequestParam(defaultValue = "0", name = "page") Integer number, Model model) {
        Pageable pageable = PageRequest.of(number, 3);
        Page<Phong> list = phongRepo.findAll(pageable);
        model.addAttribute("data", new Phong());
        model.addAttribute("listPhong", list);
        model.addAttribute("listLP", loaiphongRepo.findAll());
        return "phong/index";
    }

    @PostMapping("add")
    public String add(@ModelAttribute("data") Phong p, Model model) {
        List<Phong> ds = this.phongRepo.findAll();
        List<LoaiPhong> ds2 = this.loaiphongRepo.findAll();
        model.addAttribute("listLP", ds2);
        model.addAttribute("listPhong", ds);
        this.phongRepo.save(p);
        return "redirect:/phong/hien-thi";
    }


//    @GetMapping("detail/{id}")
//    public String detail(@PathVariable("id") Integer id, Model model){
//        Phong p =phongRepo.findById(id).get();
//        List<Phong> ds=phongRepo.findAll();
//        List<LoaiPhong> ds2=loaiphongRepo.findAll();
//        model.addAttribute("listPhong",ds);
//        model.addAttribute("listLP",ds2);
//        model.addAttribute("data",p);
//        return "phong/index";
//
//    }

    @GetMapping("/detail/{id}")
    public String detailSach(@PathVariable Integer id, Model model) {
        Phong p = phongRepo.findById(id).get();
        model.addAttribute("data", p);
        // load table
        model.addAttribute("listPhong", phongRepo.findAll());
        // load cbb
        model.addAttribute("listLP", loaiphongRepo.findAll());
        return "phong/index";
    }

    @GetMapping("/remove/{id}")
    public String remove(@PathVariable Integer id) {
        phongRepo.deleteById(id);
        return "redirect:/phong/hien-thi";
    }

    @GetMapping("/view-update/{id}")
    public String viewUpdate(@PathVariable Integer id, Model model) {
        model.addAttribute("data", phongRepo.findById(id).get());
        model.addAttribute("listLP", loaiphongRepo.findAll());
        return "/phong/edit";
    }

    @PostMapping("/update/{id}")
    public String update(@Valid @ModelAttribute("data") Phong p, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("listLP", loaiphongRepo.findAll());
            return "/phong/edit";
        }
        phongRepo.save(p);
        return "redirect:/phong/hien-thi";
    }

    @GetMapping("/search")
    public String searchTenPhong(@RequestParam String tenSearch, @RequestParam(defaultValue = "0", name = "page") Integer number, Model model) {
        if (tenSearch.isEmpty()) {
            return "redirect:/phong/hien-thi";
        }
        Pageable pageable = PageRequest.of(number, 3);
        Page<Phong> list = phongRepo.findAllByTen(tenSearch, pageable);
        model.addAttribute("data", new Phong());
        model.addAttribute("listPhong", list);
        model.addAttribute("listLP", loaiphongRepo.findAll());
        return "/phong/index";
    }

}
