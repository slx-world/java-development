package com.itheima.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: Song Laixiong
 * @Create: 2024-10-23
 * @Description:
 */

@Controller
@ResponseBody
public class UserController {

    @RequestMapping("/save")
    public String save() {
        System.out.println("user save ...");
        return "{'module':'springmvc'}";
    }
}
