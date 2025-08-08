package com.harika.portfolio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        // Personal Information
        model.addAttribute("name", "Harika Sunkara");
        model.addAttribute("title", "Data Scientist | Data Analyst | Machine Learning Engineer");
        model.addAttribute("phone", "+1 (520)-499-7730");
        model.addAttribute("email", "hari.harika1910.v2@gmail.com");
        model.addAttribute("location", "Tucson, AZ");
        model.addAttribute("linkedin", "https://www.linkedin.com/in/harika-sunkara-09ba271ba");

        // Objective
        model.addAttribute("objective",
                "Graduate in Information Science specializing in Machine Learning, focused on leveraging skills in data analysis, statistical modeling, and machine learning to extract insights and recommend data-driven solutions for organizational growth.");

        return "index"; // Loads src/main/resources/templates/index.html
    }
}
