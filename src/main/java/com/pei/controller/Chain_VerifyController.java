package com.pei.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pei.service.MerkleService;
import com.pei.utils.JsonUtils;

import javax.annotation.Resource;

/**
 * Created by pei on 2017/8/21.
 */
@RequestMapping("/backend/verify")
@Controller
public class Chain_VerifyController {

    @Resource
    private MerkleService merkleService;

    @RequestMapping("/index")
    public String showIndex(){
        return "backend/verify/index";
    }

    @RequestMapping("/merkle")
    @ResponseBody
    public String computeMerkleRoot(){
        String s = merkleService.computeRoot();
        return JsonUtils.objectToJson(s);
    }

    @RequestMapping("/chain")
    @ResponseBody
    public String serveToChain(){
        String s = merkleService.computeRoot();
        // 想nodejs 系统发送http请求
        return JsonUtils.objectToJson(s);
    }


}
