package com.wecp.progressive.controller;
 
import com.wecp.progressive.entity.Accounts;
import com.wecp.progressive.service.AccountService;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
 
import java.sql.SQLException;
import java.util.List;
 
 
 
public class AccountController {
 
    @Autowired
    private AccountService accountService;
 
 
    public ResponseEntity<List<Accounts>> getAllAccounts() throws SQLException {
        return new ResponseEntity<>(accountService.getAllAccounts(),HttpStatus.OK);
    }
 
    public ResponseEntity<Accounts> getAccountById(int accountId) {
        return null;
    }
 
    public ResponseEntity<List<Accounts>> getAccountsByUser(String param) {
        return null;
    }
 
    public ResponseEntity<Integer> addAccount(Accounts accounts) {
        return null;
    }
 
    public ResponseEntity<Void> updateAccount(int accountId, Accounts accounts) {
        return null;
    }
 
    public ResponseEntity<Void> deleteAccount(int accountId) {
        return null;
    }
}
 