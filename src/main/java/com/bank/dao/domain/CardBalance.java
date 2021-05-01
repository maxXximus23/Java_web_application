package com.bank.dao.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "cardsbalance")
@Data
public class CardBalance {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;

    @Column(name = "Balance")
    private double Balance;

    @Column(name = "CreditBalance")
    private double CreditBalance;
}
