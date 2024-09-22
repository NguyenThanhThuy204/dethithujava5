package com.example.demo.controller.phong;

import com.example.demo.entity.datphong.DatPhong;
import com.example.demo.entity.datphong.KhachHang;
import com.example.demo.entity.phong.LoaiPhong;
import com.example.demo.entity.phong.Phong;
import com.example.demo.repository.phong.LoaiPhongRepository;
import com.example.demo.repository.phong.PhongRepository;
import jakarta.validation.Valid;
import org.eclipse.tags.shaded.org.apache.xpath.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Controller
@RequestMapping("phong")
public class PhongController {
//    @Autowired
//    private PhongRepository phongRepo;
//    @Autowired
//    private LoaiPhongRepository lpRepo;
//
//    @GetMapping("index")
//    public String index(Model model) {
//        List<Phong> ds = phongRepo.findAll();
//        List<LoaiPhong> ds2 = lpRepo.findAll();
//        model.addAttribute("listP", ds);
//        model.addAttribute("listLP", ds2);
//        return "phong/index";
//    }
//
//
//    @PostMapping("add")
//    public String add( Model model ,@Valid Phong p, BindingResult bindingResult) {
//        if (bindingResult.hasErrors()) {
//            List<FieldError> fieldErrors = bindingResult.getFieldErrors();
//            Map<String, String> error = new HashMap<>();
//            for (FieldError f : fieldErrors) {
//                error.put(f.getField(), f.getDefaultMessage());
//                List<Phong> ds =phongRepo.findAll();
//                List<LoaiPhong> ds2=lpRepo.findAll();
//                model.addAttribute("listP",ds);
//                model.addAttribute("listLP",ds2);
//                model.addAttribute("error",error);
//                model.addAttribute("data",p);
//            }
//            return "phong/index";
//        }
//        phongRepo.save(p);
//        return "redirect:/phong/index";
//    }
//
//    @GetMapping("remove/{id}")
//    public String delete(@PathVariable Integer id) {
//        phongRepo.deleteById(id);
//        return "redirect:/phong/index";
//    }
//
//    @GetMapping("search")
//    public String search(@RequestParam("keyword") String keyword, Model model) {
//        model.addAttribute("keyword", keyword);
//        model.addAttribute("listP", phongRepo.findByKeyword(keyword));
//        return "phong/index";
//    }

    @Autowired
    private PhongRepository phongRepo;
    @Autowired
    private LoaiPhongRepository lpRepo;

    @GetMapping("index")
    public String index(Model model) {
        List<Phong> ds = phongRepo.findAll();
        List<LoaiPhong> ds2 = lpRepo.findAll();
        model.addAttribute("listP", ds);
        model.addAttribute("listLP", ds2);
        return "phong/index";

    }

    @GetMapping("remove/{id}")
    public String delete(@PathVariable Integer id) {
        phongRepo.deleteById(id);
        return "redirect:/phong/index";
    }

    @PostMapping("add")
    public String add(Model model, @Valid Phong p, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            List<FieldError> fieldErrors = bindingResult.getFieldErrors();
            Map<String, String> error = new HashMap<>();
            for (FieldError f : fieldErrors) {
                error.put(f.getField(), f.getDefaultMessage());
                List<Phong> ds = phongRepo.findAll();
                List<LoaiPhong> ds2 = lpRepo.findAll();
                model.addAttribute("listP", ds);
                model.addAttribute("listLP", ds2);
                model.addAttribute("data", p);
                model.addAttribute("error", error);
            }
            return "phong/index";
        }
        phongRepo.save(p);
        return "redirect:/phong/index";
    }

    @GetMapping("search")
    public String search(@RequestParam("keyword") String keyword, Model model) {
        model.addAttribute("keyword", keyword);
        model.addAttribute("listP", phongRepo.findByKeyword(keyword));
        return "phong/index";
    }
}
