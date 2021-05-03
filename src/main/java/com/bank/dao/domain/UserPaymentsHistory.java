package com.bank.dao.domain;

import com.bank.dao.domain.enums.CardOperationType;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "user_payments_history")
@Data
public class UserPaymentsHistory {
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;

    @Column(name = "CompletedAt")
    private Date CompletedAt;

    @Column(name = "Sender")
    private String Sender;

    @Column(name = "Recipient")
    private String Recipient;

    @Column(name = "Sum")
    private double Sum;

    @Column(name = "Commentary")
    private String Commentary;

    @Column(name = "Type")
    private CardOperationType Type;

    @Column(name = "FromCardId")
    private Integer FromCardId;
}
