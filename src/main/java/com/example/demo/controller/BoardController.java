package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board") //상위 매핑으로 분리 할 수 있따
public class BoardController {
    @GetMapping("/save")
    public String saveForm() {
        return "save";
    }
}
