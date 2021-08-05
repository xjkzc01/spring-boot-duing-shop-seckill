package com.duing.controller;

import com.duing.model.Goods;
import com.duing.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
//@RestController
public class GoodsController {

    @Autowired
    private GoodsService goodsService;

    @GetMapping("/")
    public String list(Model model){
        // 逐层调用 :controller -> service -> dao -> xml
        List<Goods> result = goodsService.getGoods();
        model.addAttribute("goodsList",result);
        return "list";
    }
}
