package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class sampleController {

    // ログイン
    public String login() {
        return "index";
    }

    @RequestMapping("/list")
    public String list() {
        return "/pages/list";
    }

    @RequestMapping("/create")
    public String create() {
        return "/pages/create";
    }

    @RequestMapping("/improvement")
    public String improvement() {
        return "/pages/improvement";
    }

    @RequestMapping("/schedule")
    public String schedule() {
        return "/pages/schedule";
    }

    @RequestMapping("/result")
    public String result() {
        return "/pages/result";
    }

    @RequestMapping("/management")
    public String management() {
        return "/pages/management";
    }

}
