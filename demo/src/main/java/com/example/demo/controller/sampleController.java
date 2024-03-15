package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class sampleController {

    public String login() {
        return "index";
    }

    @RequestMapping("/list")
    public String list() {
        return "list";
    }

    @RequestMapping("/create")
    public String create() {
        return "create";
    }

    @RequestMapping("/improvement")
    public String improvement() {
        return "improvement";
    }

    @RequestMapping("/schedule")
    public String schedule() {
        return "schedule";
    }

    @RequestMapping("/result")
    public String result() {
        return "result";
    }

    @RequestMapping("/management")
    public String management() {
        return "management";
    }

}
