package com.example.HW15;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestTemplateController {

    @GetMapping("/test-template")
    public String testTemplate() {
        return "test";
    }
}
