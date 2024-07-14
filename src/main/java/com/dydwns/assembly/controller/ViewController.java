package com.dydwns.assembly.controller;

import com.dydwns.assembly.entity.Board;
import com.dydwns.assembly.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
public class ViewController {
    ApiController restController = new ApiController();

    @Autowired
    BoardRepository boardRepository;

    @RequestMapping("/money")
    public String money() {
        return "money";
    }

    @RequestMapping("/result")
    public String result(Model model, @RequestParam(value = "money") int money) {
        model.addAttribute("money", money);
        model.addAttribute("cpu", restController.parts().cpu);
        model.addAttribute("ram", restController.parts().ram);
        model.addAttribute("hdd", restController.parts().hdd);
        return "result";
    }

    @RequestMapping("/board")
    public String board(Model model, @RequestParam(value = "id") int id) {
        Optional<Board> result = boardRepository.findById(Long.valueOf(id));

        Board board = result.orElse(null);
        model.addAttribute("board", board);

        return "board";
    }
}
