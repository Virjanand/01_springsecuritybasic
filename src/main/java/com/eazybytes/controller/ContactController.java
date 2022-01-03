package com.eazybytes.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {

    @GetMapping("/Contact")
    public String getNotices(String input) {
        return "Here are the Contact details from the DB";
    }
}
