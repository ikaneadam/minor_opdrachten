package com.example.minor_opdrachten.web.mapper;

import com.example.minor_opdrachten.data.entity.Account;
import com.example.minor_opdrachten.web.dto.AccountDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AccountMapper {
    AccountDto toDto(Account entity);
    Account toModel(AccountDto dto);
}