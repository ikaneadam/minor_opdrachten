package com.example.minor_opdrachten.web.controller;

import com.example.minor_opdrachten.data.entity.Account;
import com.example.minor_opdrachten.domain.service.AccountService;
import com.example.minor_opdrachten.web.dto.AccountDto;
import com.example.minor_opdrachten.web.mapper.AccountMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.ConstraintViolationException;
import javax.validation.Valid;
import java.util.List;
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/accounts")
public class AccountController {

    private final AccountService accountService;
    private final AccountMapper accountMapper;

    public AccountController(AccountService accountService, AccountMapper accountMapper) {
        this.accountService = accountService;
        this.accountMapper = accountMapper;
    }

    @GetMapping
    public List<Account> getAccounts(){
        return this.accountService.getAllAccounts();
    }

    @ExceptionHandler(ConstraintViolationException.class)
    @PostMapping
    public ResponseEntity<AccountDto> createAccount(@Valid @RequestBody AccountDto dto) {
        Account account = accountMapper.toModel(dto);
        Account insertedAccount = this.accountService.createAccount(account);
        return ResponseEntity.ok(this.accountMapper.toDto(insertedAccount));
    }

}