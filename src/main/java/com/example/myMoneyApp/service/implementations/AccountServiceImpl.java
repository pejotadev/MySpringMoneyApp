package com.example.myMoneyApp.service.implementations;

import com.example.myMoneyApp.model.Account;
import com.example.myMoneyApp.repository.AccountRepository;
import com.example.myMoneyApp.service.interfaces.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    AccountRepository accountRepository;

    @Override
    public Optional<Account> getAccountById(Integer id) {
        return accountRepository.findById(id);
    }

    @Override
    public List<Account> getAllAccount() {
        return accountRepository.findAll();
    }

    @Override
    public void deleteAllAccounts() {
        accountRepository.deleteAll();
    }

    @Override
    public void deleteAccountById(Integer id) {
        accountRepository.deleteById(id);
    }

    @Override
    public void updateAccountById(Integer id, Account account) {
        Optional<Account> getAccount = getAccountById(id);
        getAccount.get().setAgency(account.getAgency());
        getAccount.get().setCards(account.getCards());
        getAccount.get().setLimit(account.getLimit());
        getAccount.get().setUser(account.getUser());

        accountRepository.save(account);
    }

    @Override
    public void updateAccount(Account account) {
        accountRepository.save(account);
    }

    @Override
    public void insertAccount(Account account) {
        accountRepository.save(account);
    }
}
