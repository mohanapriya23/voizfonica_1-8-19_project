package com.example.voizfonica.controller;




/*import com.example.demo.data.PrepaidPlanRepo;
import com.example.demo.model.PrepaidPlan;
import com.example.voizfonica.Plans;*/
import com.example.voizfonica.Plans;
import com.example.voizfonica.model.PlansRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/prepaidPlans")
public class PrepaidPlansController {
    @Autowired
    private PlansRepository preRepo;
    @GetMapping
    public String show_register(Model model){
        List<Plans> plans = new ArrayList<>();
        preRepo.findAll().forEach(i -> plans.add(i));
        model.addAttribute("plans",plans);
        return "prepaidPlans";
    }
}
