package com.bank.dto.Card;

import com.bank.dao.domain.Card;
import com.bank.dao.domain.CardBalance;
import com.bank.dao.domain.enums.CardPrivilege;
import com.bank.dao.domain.enums.CardType;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.Column;
import java.util.Date;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class CardDto {
    private Integer Id;
    private String Number;
    private Date ExpirationDate;
    private CardType Type;
    private CardPrivilege Privilege;
    private String CVC;
    private String PinCode;
    private boolean IsLocked;
    private Date LockedDate;
    private Integer LockedById;
    private Integer BalanceId;
    private CardBalance Balance;


    public CardDto(Card card) {
        this.Id = card.getId();
        this.Number = card.getNumber();
        this.ExpirationDate = card.getExpirationDate();
        this.Type = card.getType();
        this.Privilege = card.getPrivilege();
        this.CVC = card.getCVC();
        this.PinCode = card.getPinCode();
        this.IsLocked = card.isIsLocked();
        this.LockedDate = card.getLockedDate();
        this.LockedById = card.getLockedById();
        this.BalanceId = card.getBalanceId();
        this.Balance = card.getBalance();
    }
}
