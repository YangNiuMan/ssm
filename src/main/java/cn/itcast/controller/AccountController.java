package cn.itcast.controller;


import cn.itcast.domain.Account;
import cn.itcast.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private AccountService accountService;
    @RequestMapping("/findAll")
    public String testSmvc(Model model){
        System.out.println("表现层查询所有用户信息");
        List<Account> list = accountService.findAll();
        for (Account account : list) {
            System.out.println(account);
        }
        model.addAttribute("list",list);
        return "list";
    }

    @RequestMapping("/save")
    public void testSave(Account account, HttpServletResponse response, HttpServletRequest request) throws Exception{
        System.out.println("表现层保存所有用户信息");
        accountService.saveAccount(account);
        response.sendRedirect(request.getContextPath()+"/account/findAll");
        return ;
    }
}
