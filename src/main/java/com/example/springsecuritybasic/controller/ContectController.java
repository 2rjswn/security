package com.example.springsecuritybasic.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class ContectController {
    @GetMapping("/contact")
    public String saveContactInquiryDetails() {
        return "Inquiry details are saved to the DB";
    }
}
