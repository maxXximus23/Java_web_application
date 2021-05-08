package com.bank.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.Arrays;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class CountCardModel {
    private CardModel[] CardModel;
    private long Count;

    public CountCardModel(CardModel[] cardModel) {
        this.CardModel = cardModel;
        this.Count = Arrays.stream(cardModel).count();
    }
}
