package com.dydwns.assembly.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ViewController {
    ApiController restController = new ApiController();

    @RequestMapping("/money")
    public String money() {
        return "money";
    }


    @RequestMapping("/result")
    public String result(Model model, @RequestParam(value="money") int money) {
        model.addAttribute("money", money);
        model.addAttribute("cpu", restController.parts().cpu);
        model.addAttribute("ram", restController.parts().ram);
        model.addAttribute("hdd", restController.parts().hdd);
        return "result";
    }
}
