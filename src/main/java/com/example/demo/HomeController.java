package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/") //or @GetMapping("/home")
    public String getHome() {
        return "home";
    }

    @RequestMapping("/about")
    public String getAbout() {
        return "about";
    }

    @RequestMapping("/profile")
    public String getProfile() {
        return "profile";
    }

    @RequestMapping("/github1")
    public String getGetHub1() {
        return "github1";
    }

    @RequestMapping("/github2")
    public String getGetHub2() {
        return "github2";
    }

    @RequestMapping("/pda1")
    public String getPDA1() {
        return "pda1";
    }

    @RequestMapping("/pda2")
    public String getPDA2() {
        return "pda2";
    }

    @RequestMapping("/corejava1")
    public String getCoreJava1() {
        return "corejava1";
    }

    @RequestMapping("/corejava2")
    public String getCoreJava2() {
        return "corejava2";
    }

    @RequestMapping("/oop1")
    public String getOOP1() {
        return "oop1";
    }

    @RequestMapping("/oop2")
    public String getOOP2() {
        return "oop2";
    }

    @RequestMapping("/htmlcssbootstrap1")
    public String getHtmlCSSBootstrap1() {
        return "htmlcssbootstrap1";
    }

    @GetMapping("/htmlcssbootstrap2")
    public String getHtmlCSSBootstrap2() {
        return "htmlcssbootstrap2";
    }

    @GetMapping("/housing")
    public String getHousing() {
        return "housing";
    }
}