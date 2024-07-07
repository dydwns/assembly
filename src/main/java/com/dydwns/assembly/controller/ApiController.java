package com.dydwns.assembly.controller;

import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @ResponseBody
    @GetMapping("/api/parts")
    public Parts parts() {
        Parts parts = new Parts();

        parts.setCpu("i7");
        parts.setRam("16G");
        parts.setHdd("2T");

        return parts;
    }


    @Getter
    @Setter
    static class Parts {
        String cpu;
        String ram;
        String hdd;
    }
}
