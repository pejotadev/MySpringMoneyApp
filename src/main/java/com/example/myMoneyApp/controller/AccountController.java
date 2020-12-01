package com.example.myMoneyApp.controller;

import com.example.myMoneyApp.model.Account;
import com.example.myMoneyApp.service.interfaces.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping(value = "/account/getAll", method = RequestMethod.GET)
    public List<Account> getAccount() {
        return accountService.getAllAccount();
    }

    @RequestMapping(value = "/account/get/{id}", method = RequestMethod.GET)
    public Optional<Account> getAccount(@PathVariable("id") Integer id) {
        return accountService.getAccountById(id);
    }

    @RequestMapping(value = "/account/deleteAll", method = RequestMethod.DELETE)
    public void deleteAccounts() {
        accountService.deleteAllAccounts();
    }

    @RequestMapping(value = "/account/delete/{id}", method = RequestMethod.DELETE)
    public void deleteAccount(@PathVariable("id") Integer id) {
        accountService.deleteAccountById(id);
    }

    @RequestMapping(value = "/account/update/{id}", method = RequestMethod.POST)
    public void updateAccount(@RequestBody Account account, @PathVariable("id") Integer id) {
        accountService.updateAccountById(id, account);
    }

    @RequestMapping(value = "/account/insert", method = RequestMethod.POST)
    public void updateAccount(@RequestBody Account account) {
        accountService.insertAccount(account);
    }
}
