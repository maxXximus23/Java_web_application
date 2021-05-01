package com.bank.dao.domain;

import com.bank.dao.domain.enums.CardPrivilege;
import com.bank.dao.domain.enums.CardType;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "cards")
@Data
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;

    @Column(name = "Number")
    private String Number;

    @Column(name = "ExpirationDate")
    private Date ExpirationDate;

    @Column(name = "Type")
    private CardType Type;

    @Column(name = "Privilege")
    private CardPrivilege Privilege;

    @Column(columnDefinition = "char(3)", name = "CVC")
    private String CVC;

    @Column(columnDefinition = "char(4)", name = "PinCode")
    private String PinCode;

    @Column(name = "IsLocked")
    private boolean IsLocked;

    @Column(name = "LockedDate")
    private Date LockedDate;

    @Column(name = "LockedById")
    private Integer LockedById;

    @Column(name = "BalanceId")
    private Integer BalanceId;

    @OneToOne
    @JoinColumn(name = "id", nullable = false)
    private CardBalance Balance;
}
