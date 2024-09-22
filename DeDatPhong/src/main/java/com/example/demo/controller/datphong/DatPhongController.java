package com.example.demo.controller.datphong;

import com.example.demo.entity.datphong.DatPhong;
import com.example.demo.entity.datphong.KhachHang;
import com.example.demo.entity.phong.Phong;
import com.example.demo.repository.datphong.DatPhongRepository;
import com.example.demo.repository.datphong.KhachHangRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import javax.print.attribute.standard.PageRanges;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Controller
@RequestMapping("dat-phong")
public class DatPhongController {
    @Autowired
    private DatPhongRepository dpRepo;
    @Autowired
    private KhachHangRepository khRepo;

    @GetMapping("index")
    public String index(Model model) {
        List<DatPhong> ds = dpRepo.findAll();
        List<KhachHang> ds2 = khRepo.findAll();
        model.addAttribute("listDP", ds);
        model.addAttribute("listKH", ds2);
        return "dat_phong/index";
    }

    @PostMapping("add")
    public String add(@Valid @ModelAttribute("data") DatPhong dp, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            List<FieldError> fieldErrors = bindingResult.getFieldErrors();
            Map<String, String> error = new HashMap<>();
            for (FieldError f : fieldErrors) {
                error.put(f.getField(), f.getDefaultMessage());
                List<DatPhong> phongEntityList = this.dpRepo.findAll();
                List<KhachHang> loaiPhongEntities = this.khRepo.findAll();
                model.addAttribute("listDP", phongEntityList);
                model.addAttribute("listKH", loaiPhongEntities);
                model.addAttribute("error", error);
//                model.addAttribute("data", dp);
            }
            return "dat_phong/index";
        }
        this.dpRepo.save(dp);
        return "redirect:/dat-phong/index";
    }

    @GetMapping("edit/{id}")
    public String edit(@PathVariable Integer id, Model model) {
        model.addAttribute("data", dpRepo.findById(id).get());
        model.addAttribute("listKH", khRepo.findAll());
        return "dat_phong/edit";
    }

    @PostMapping("update/{id}")
    public String update(@Valid @ModelAttribute("data") DatPhong dp, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("listKH", khRepo.findAll());
            return "dat_phong/edit";
        }
        dpRepo.save(dp);
        return "redirect:/dat-phong/index";
    }

    @GetMapping("remove/{id}")
    public String delete(@PathVariable Integer id) {
        dpRepo.deleteById(id);
        return "redirect:/dat-phong/index";
    }

    @GetMapping("detail/{id}")
    public String detail(@PathVariable Integer id, Model model) {
        DatPhong dp = dpRepo.findById(id).get();
        model.addAttribute("listKH", khRepo.findAll());
        model.addAttribute("listDP", dpRepo.findAll());
        model.addAttribute("data", dp);
        return "dat_phong/index";

    }


    @GetMapping("search")
    public String search(@RequestParam("keyword") String keyword, Model model) {
        model.addAttribute("keyword", keyword);
        model.addAttribute("listDP", dpRepo.findByKeyword(keyword));
        return "dat_phong/index";

    }

    @GetMapping("paging")
    public String page(@RequestParam("page") Optional<Integer> page, Model model) {
        Pageable pageable = PageRequest.of(page.orElse(0), 2);
        model.addAttribute("listDP", dpRepo.findAll(pageable));
        return "dat_phong/index";
    }

//    @Autowired
//    private DatPhongRepository dpRepo;
//    @Autowired
//    private KhachHangRepository khRepo;
//
//    @GetMapping("index")
//    public String index(Model model) {
//        List<DatPhong> ds = dpRepo.findAll();
//        model.addAttribute("listDP", ds);
//        List<KhachHang> ds2 = khRepo.findAll();
//        model.addAttribute("listKH", ds2);
//        return "dat_phong/index";
//    }
//
//
////    @GetMapping("/index")
////    public String hienThi(@RequestParam(defaultValue = "0", name = "page") Integer number, Model model) {
////        Pageable pageable = PageRequest.of(number, 3);
////        Page<DatPhong> list = dpRepo.findAll(pageable);
////        model.addAttribute("data", new DatPhong());
////        model.addAttribute("listDP", list);
////        model.addAttribute("listKH",khRepo.findAll());
////        return "dat_phong/index";
////    }
//
//    @GetMapping("delete/{id}")
//    public String remove(@PathVariable Integer id) {
//        dpRepo.deleteById(id);
//        return "redirect:/dat-phong/index";
//    }
//
//    @GetMapping("detail/{id}")
//    public String detail(@PathVariable Integer id, Model model) {
//        DatPhong dp = dpRepo.findById(id).get();
//        model.addAttribute("data", dp);
//        model.addAttribute("listDP", dpRepo.findAll());
//        model.addAttribute("listKH", khRepo.findAll());
//        return "dat_phong/index";
//
//    }
//
//    @PostMapping("add")
//    public String add(@Valid @ModelAttribute("data") DatPhong dp, BindingResult bindingResult, Model model){
//        if(bindingResult.hasErrors()){
//            List<FieldError> fieldErrors = bindingResult.getFieldErrors();
//            Map<String, String> error = new HashMap<>();
//            for(FieldError f : fieldErrors){
//                error.put(f.getField(), f.getDefaultMessage());
//                List<DatPhong> phongEntityList = this.dpRepo.findAll();
//                List<KhachHang> loaiPhongEntities = this.khRepo.findAll();
//                 model.addAttribute("listDP", phongEntityList);
//                model.addAttribute("listKH", loaiPhongEntities);
//                model.addAttribute("error", error);
////                model.addAttribute("data", dp);
//            }
//            return "dat_phong/index";
//        }
//        this.dpRepo.save(dp);
//        return "redirect:/dat-phong/index";
//    }
//
//
//   @GetMapping("paging")
//   public String page(@RequestParam("page")Optional<Integer> page,Model model){
//        Pageable pageable=PageRequest.of(page.orElse(0),2);
//        model.addAttribute("listDP",dpRepo.findAll(pageable));
//        return "dat_phong/index";
//   }
//
//    @GetMapping("search")
//    public String search(Model model,@RequestParam("keyword") String keyword){
//        model.addAttribute("keyword",keyword);
//        model.addAttribute("listDP",dpRepo.findByKeyword(keyword));
//        return "dat_phong/index";
//
//    }
//
//    @GetMapping("edit/{id}")
//    public String edit(@PathVariable Integer id,Model model){
//        model.addAttribute("data",dpRepo.findById(id).get());
//        model.addAttribute("listKH",khRepo.findAll());
//        return "dat_phong/edit";
//    }
//    @PostMapping("update/{id}")
//    public  String update(@Valid @ModelAttribute("data") DatPhong dp, BindingResult bindingResult, Model model){
//        if (bindingResult.hasErrors()){
//            model.addAttribute("listKH",khRepo.findAll());
////            model.addAttribute("data",dp);
//            return "dat_phong/edit";
//        }
//        dpRepo.save(dp);
//        return "redirect:/dat-phong/index";
//    }
//

}
