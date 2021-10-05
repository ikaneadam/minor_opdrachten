package com.example.minor_opdrachten.domain.service;

import com.example.minor_opdrachten.data.entity.Account;
import com.example.minor_opdrachten.data.repository.AccountRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Random;

@Service
@Transactional
public class AccountService {

    private final AccountRepository accountRepository;

    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public List<Account> getAllAccounts(){
        return this.accountRepository.findAll();
    }

    public Account createAccount(Account accountToSave){
        accountToSave.setIban(generateIban());
        return accountRepository.save(accountToSave);
    }

    public String generateIban(){
        Random randomNumber = new Random();
        return "NL99RABO" + String.format("%09d", randomNumber.nextInt(1000000000));
    }

}
