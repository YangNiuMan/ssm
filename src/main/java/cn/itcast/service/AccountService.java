package cn.itcast.service;

import cn.itcast.domain.Account;
import org.springframework.ui.Model;

import java.util.List;

public interface AccountService {

    //查询账户信息
    public List<Account> findAll();

    //保存账户信息

    public void saveAccount(Account account);
}
