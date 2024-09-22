package com.example.demo.controller.dichvu1;

import com.example.demo.entity.dichvu1.DichVu1;
import com.example.demo.entity.dichvu1.LoaiDichVu1;
import com.example.demo.repository.dichvu1.DichVu1Repository;
import com.example.demo.repository.dichvu1.LoaiDichVu1Repository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("dich-vu1")
public class DichVu1Controller {
    @Autowired
    private DichVu1Repository dv1Repo;
    @Autowired
    private LoaiDichVu1Repository loaidv1Repo;

    @GetMapping("index")
    public String index(Model model) {
        List<DichVu1> ds = dv1Repo.findAll();
        List<LoaiDichVu1> ds2 = loaidv1Repo.findAll();
        model.addAttribute("listDV", ds);
        model.addAttribute("listLoaiDV", ds2);
        return "dich_vu1/index";

    }

    @GetMapping("delete/{id}")
    public String delete(@PathVariable Integer id) {
        dv1Repo.deleteById(id);
        return "redirect:/dich-vu1/index";

    }

    @PostMapping("add")
    public String add(@ModelAttribute("data") DichVu1 dv1, Model model) {
        List<DichVu1> ds = dv1Repo.findAll();
        List<LoaiDichVu1> ds2 = loaidv1Repo.findAll();
        model.addAttribute("listDV", ds);
        model.addAttribute("listLoaiDV", ds2);
        dv1Repo.save(dv1);
        return "redirect:/dich-vu1/index";
    }

    @GetMapping("edit/{id}")
    public String edit(@PathVariable Integer id, Model model) {
        model.addAttribute("data", dv1Repo.findById(id).get());
        model.addAttribute("listLoaiDV", loaidv1Repo.findAll());
        return "dich_vu1/edit";
    }

    @PostMapping("update/{id}")
    public String update(@Valid @ModelAttribute("data") DichVu1 dv1, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("listLoaiDV", loaidv1Repo.findAll());
            return "dich_vu1/edit";
        }
        dv1Repo.save(dv1);
        return "redirect:/dich-vu1/index";
    }


}
