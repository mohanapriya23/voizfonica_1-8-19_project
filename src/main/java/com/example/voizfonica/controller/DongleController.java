package com.example.voizfonica.controller;


import com.example.voizfonica.data.DongleRepository;
import com.example.voizfonica.model.DonglePlans;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;


import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/plans")
public class DongleController {
    @Autowired
    private  DongleRepository donglerepo;

    @GetMapping
    public String show_register(Model model){
        List<DonglePlans> plans = new ArrayList<>();
        donglerepo.findAll().forEach(i -> plans.add(i));
        model.addAttribute("plans",plans);
        return "plans";
    }
}

   /* @ModelAttribute
    @GetMapping
    public String showPlans(Model model){
        model.addAttribute("dongleplans",new DonglePlans());
        return "plans";
    }
    @PostMapping
    public String processPlans(@Valid DonglePlans dongleplans, Errors errors) {
        if (errors.hasErrors()) {
            return "plans";
        }
        donglerepo.save(dongleplans);
        return "redirect:/payment";
    }
}*/