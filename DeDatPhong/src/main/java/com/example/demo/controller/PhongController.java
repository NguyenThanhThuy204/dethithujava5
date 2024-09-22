//package com.example.demo.controller;
//
//import com.example.demo.entity.LoaiPhong;
//import com.example.demo.entity.Phong;
//import com.example.demo.repository.LoaiPhongRepository;
//import com.example.demo.repository.PhongRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.PageRequest;
//import org.springframework.data.domain.Pageable;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.validation.BindingResult;
//import org.springframework.validation.annotation.Validated;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//import java.util.Optional;
//
//@Controller
//@RequestMapping("/phong")
//public class PhongController {
//    @Autowired
//    private PhongRepository phongRepository;
//    @Autowired
//    private LoaiPhongRepository loaiPhongRepository;
//
//    @ModelAttribute("listPhong")
//    Page<Phong> getListPhong() {
//        Pageable pageable = PageRequest.of(1, 5);
//        return this.phongRepository.findAll(pageable);
//    }
//
//    @ModelAttribute("listLoaiPhong")
//    List<LoaiPhong> getListLoaiPhong() {
//        return this.loaiPhongRepository.findAll();
//    }
//
//    @ModelAttribute("phong")
//    Phong getPhong() {
//        return new Phong();
//    }
//
//    @GetMapping("/hien-thi")
//    public String hienThi() {
//        return "home";
//    }
//
//    @GetMapping("/detail/{id}")
//    public String detail(@PathVariable int id, Model model) {
//        model.addAttribute("phong", this.phongRepository.findById(id).orElse(new Phong()));
//        return "home";
//    }
//
//    @PostMapping("/add")
//    public String add(@Validated @ModelAttribute("phong") Phong phong, BindingResult result, Model model) {
//        if (result.hasErrors()) {
//            model.addAttribute("phong", phong);
//            return "home";
//        }
//        this.phongRepository.save(phong);
//        return "redirect:/phong/hien-thi";
//    }
//
//    @GetMapping("/paging")
//    public String paging(Model model, @RequestParam("page") Optional<Integer> page) {
//        Pageable pageable = PageRequest.of(page.orElse(0), 5);
//        model.addAttribute("listPhong", this.phongRepository.findAll(pageable));
//        return "home";
//    }
//}