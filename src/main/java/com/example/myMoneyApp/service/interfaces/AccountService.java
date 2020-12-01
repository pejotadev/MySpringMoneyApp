package com.example.myMoneyApp.service.interfaces;

import com.example.myMoneyApp.model.Account;

import java.util.List;
import java.util.Optional;

public interface AccountService {
    Optional<Account> getAccountById(Integer id);
    List<Account> getAllAccount();
    void deleteAllAccounts();
    void deleteAccountById(Integer id);
    void updateAccountById(Integer id, Account account);
    void updateAccount(Account account);
    void insertAccount(Account account);


}
