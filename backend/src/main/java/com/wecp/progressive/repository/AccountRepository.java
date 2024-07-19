package com.wecp.progressive.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.wecp.progressive.entity.Accounts;

@Repository
public interface AccountRepository extends JpaRepository<Accounts,Integer>{
    @Query("select a from Accounts a where a.customers.customerId=:customerId")
    public List<Accounts> getAccountsByUser(Long ID);

    @Query("select a from Accounts a order a.balance by asc")
    public List<Accounts> getAllAccountsSortedByBalance();
}
