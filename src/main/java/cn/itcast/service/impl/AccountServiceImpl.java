package cn.itcast.service.impl;

import cn.itcast.dao.AccountDao;
import cn.itcast.domain.Account;
import cn.itcast.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.List;

@Service("accountService")
public class AccountServiceImpl implements AccountService{
    @Autowired
    private AccountDao dao;

    public List<Account> findAll() {
        System.out.println("业务层查询所有账户");

        return dao.findAll();
    }

    public void saveAccount(Account account) {
        dao.saveAccount(account);
    }
}
