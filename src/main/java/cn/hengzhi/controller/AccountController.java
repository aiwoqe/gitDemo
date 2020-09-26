package cn.hengzhi.controller;

import cn.hengzhi.entity.Account;
import cn.hengzhi.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @ Author     ：MI
 * @ Date       ：Created in 23:59 2019/9/26
 * @ Description：控制层
 */
@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    AccountService accountService;

    @ResponseBody
    @RequestMapping("/findAll")
    public Account findAll(){
        System.out.println("表现层：查询所有账户...");
        // 调用service的方法

        return new Account(1,"小明",1000);
    }
    /**
     * 保存
     * @return
     */
    @RequestMapping("/save")
//    将前台送过来的name和money封装进account对象中
    public void save(Account account, HttpServletRequest request, HttpServletResponse response) throws IOException {
        accountService.saveAccount(account);
        response.sendRedirect(request.getContextPath()+"/account/findAll");
        return;
    }

}
