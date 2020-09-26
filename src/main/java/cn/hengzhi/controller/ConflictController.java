package cn.hengzhi.controller;

import cn.hengzhi.entity.Account;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ConflictController {
//<<<<<<< HEAD
//    @ResponseBody
//    @RequestMapping("/findAll")
//    public Account findAll(){
//        System.out.println("表现层：查询所有账户...");
//
//        return new Account(1,"小明",1000);
//=======

    @ResponseBody
    @RequestMapping("/findAll")
    public Account findAll(){
        System.out.println("xiao分支的内容");

        return new Account(1,"小红",1000);
//>>>>>>> xiao
    }
}
