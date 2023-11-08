package com.example.maven01.controller;

import com.example.maven01.domain.Test;
import com.example.maven01.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class TestController {

    private final TestService testService;

    @Autowired
    public TestController(TestService testService) {
        this.testService = testService;
    }

    @GetMapping("/")
    public String test(Model model) {
        int count = testService.testService();
        model.addAttribute("count", count);
        System.out.println(count);
        return "index";
    }

}
