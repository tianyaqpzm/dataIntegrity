package com.pei.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by pei on 2017/7/23.
 */

@Controller
@RequestMapping("/backend")
public class Chain_BackedController {

    /**
     * 打开首页
     */
    // 注意 URL 有/   返回的没有/
    @RequestMapping("/index")
    public String showIndex(){
        return "backend/address/index";
    }
}
