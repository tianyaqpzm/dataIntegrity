package com.pei.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pei.service.Chain_IAddressService;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * Created by pei on 2017/7/23.
 */
@Controller
@RequestMapping("/backend/address")
public class Chain_AddressController {

    @Resource
    private Chain_IAddressService chain_iAddressService;

    // 显示 当前用户address  以及创建address 秘钥等
    @RequestMapping(value="/")
    public String index(Model model){
        List<Map<String, String>> list = chain_iAddressService.list("123456");
//        model.addAttribute(list);
        System.out.println(list);
        model.addAttribute("list",list);
        return "backend/address/index";
    }

    @RequestMapping(value="/register")
    @ResponseBody
    public String register(HttpServletRequest request, HttpServletResponse response)  throws IOException
    {
        String name = request.getParameter("name");
        String password = request.getParameter("password");
        String address = request.getParameter("address");
//        Users user = new Users(name,password,address);
//        System.out.println(user);
//        int flag = addressService.insert(model);
        return "";
    }
}
