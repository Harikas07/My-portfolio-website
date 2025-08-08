package com.harika.portfolio.controller;

import com.harika.portfolio.model.Contact;
import com.harika.portfolio.service.FirebaseContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
// import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class PortfolioController {

    @Autowired
    private FirebaseContactService firebaseContactService;

    @PostMapping("/submitContact")
    public String submitContact(@ModelAttribute Contact contact) {
        firebaseContactService.saveContact(contact);
        return "redirect:/#contact?success";
    }
}
