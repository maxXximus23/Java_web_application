package com.bank.dao.repos;

import com.bank.dao.domain.CardBalance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardsBalanceRepository extends JpaRepository<CardBalance, Integer> {
}
