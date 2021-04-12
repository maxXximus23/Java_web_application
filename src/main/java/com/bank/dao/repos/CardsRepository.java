package com.bank.dao.repos;

import com.bank.dao.domain.Card;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardsRepository extends JpaRepository<Card, Integer> {
}
