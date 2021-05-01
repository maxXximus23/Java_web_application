package com.bank.model;

import com.bank.dao.domain.enums.CardPrivilege;
import com.bank.dao.domain.enums.CardType;
import com.bank.dto.Card.CardDto;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class CardModel {
    private double Balance;
    private double CreditBalance;
    private Integer CardId;
    private CardType Type;
    private CardPrivilege Privilege;

    public CardModel(CardDto cardDto) {
        this.Balance = cardDto.getBalance().getBalance();
        this.CreditBalance = cardDto.getBalance().getCreditBalance();
        this.CardId = cardDto.getId();
        this.Type = cardDto.getType();
        this.Privilege = cardDto.getPrivilege();
    }
}
