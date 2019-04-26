package com.lll.item.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("category")
public class CategoryController {
    @GetMapping("bid/{id}")
    public void queryCategoryListByBid(){

    }
}
