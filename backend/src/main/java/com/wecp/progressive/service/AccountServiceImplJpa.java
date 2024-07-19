package com.wecp.progressive.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import com.wecp.progressive.entity.Accounts;
import com.wecp.progressive.repository.AccountRepository;

public class AccountServiceImplJpa implements AccountService {
    @Autowired
    private AccountRepository accountRepository;

    @Override
    public List<Accounts> getAllAccounts() throws SQLException {
        // TODO Auto-generated method stub
        return accountRepository.findAll();
        //throw new UnsupportedOperationException("Unimplemented method 'getAllAccounts'");
    }

    // @Override
    // public List<Accounts> getAccountsByUser(Long userId) throws SQLException {
    //     // TODO Auto-generated method stub
    //     // return accountRepository.getAccountsByUser(userId);
    //     return accountRepository.getAccountsByUser(userId);
    //     //throw new UnsupportedOperationException("Unimplemented method 'getAccountsByUser'");
    // }

    @Override
    public Accounts getAccountById(int accountId) throws SQLException {
        // TODO Auto-generated method stub
        Accounts a = accountRepository.findById(accountId).get();
        return a;
        //throw new UnsupportedOperationException("Unimplemented method 'getAccountById'");
    }

    @Override
    public int addAccount(Accounts accounts) throws SQLException {
        // TODO Auto-generated method stub
        accountRepository.save(accounts);
        return accounts.getAccountId();
        //throw new UnsupportedOperationException("Unimplemented method 'addAccount'");
    }

    // @Override
    // public void updateAccount(int accountId,Accounts accounts) throws SQLException {
    //     // TODO Auto-generated method stub
    //     accountRepository.save(accounts);
    //     throw new UnsupportedOperationException("Unimplemented method 'updateAccount'");
    // }

    @Override
    public void deleteAccount(int accountId) throws SQLException {
        // TODO Auto-generated method stub
        accountRepository.deleteById(accountId);
        throw new UnsupportedOperationException("Unimplemented method 'deleteAccount'");
    }

    @Override
    public List<Accounts> getAllAccountsSortedByBalance() throws SQLException {
        // TODO Auto-generated method stub
        //return accountRepository.getAllAccountsSortedByBalance();
        return accountRepository.getAllAccountsSortedByBalance();
        //throw new UnsupportedOperationException("Unimplemented method 'getAllAccountsSortedByBalance'");
    }

    @Override
    public List<Accounts> getAllAccountsFromArrayList() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllAccountsFromArrayList'");
    }

    @Override
    public List<Accounts> addAccountToArrayList(Accounts accounts) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addAccountToArrayList'");
    }

    @Override
    public List<Accounts> getAllAccountsSortedByBalanceFromArrayList() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllAccountsSortedByBalanceFromArrayList'");
    }

    @Override
    public void emptyArrayList() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'emptyArrayList'");
    }

    // @Override
    // public Object createAccounts(Accounts accounts) {
    //     // TODO Auto-generated method stub\
    //     return accountRepository.save(accounts);
    //     //throw new UnsupportedOperationException("Unimplemented method 'createAccounts'");
    // }

    @Override
    public List<Accounts> getAccountsByUser(int userId) throws SQLException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAccountsByUser'");
    }

    @Override
    public void updateAccount(Accounts accounts) throws SQLException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateAccount'");
    }
}