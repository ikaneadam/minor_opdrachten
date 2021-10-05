package com.example.minor_opdrachten.data.repository;

import com.example.minor_opdrachten.data.entity.Account;
import com.example.minor_opdrachten.data.entity.Rekening;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AccountRepository extends JpaRepository<Account, UUID> {
}
