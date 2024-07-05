package com.example.demo.controller;

import com.example.demo.dto.BoardDTO;
import com.example.demo.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
@RequestMapping("/board") //상위 매핑으로 분리 할 수 있따
public class BoardController {

    private final BoardService boardService;

    @GetMapping("/save")
    public String saveForm() {
        return "save";
    }

    //같은 Mapping일 때 같은 uri쓰면 안된다.
    @PostMapping("/save")
    public String save(@ModelAttribute BoardDTO boardDTO) {
        System.out.println("boardDTO = " + boardDTO);
        boardService.save(boardDTO);
        return "index";
    }
}
