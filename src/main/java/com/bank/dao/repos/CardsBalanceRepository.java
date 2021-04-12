package com.bank.dao.repos;

import com.bank.dao.domain.CardBalance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardsBalanceRepository extends JpaRepository<CardBalance, Integer> {
}
