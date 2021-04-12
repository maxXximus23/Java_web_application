package com.bank.bll.mapper;

import com.bank.dao.domain.Card;
import com.bank.dto.Card.CardDto;
import com.bank.model.CardModel;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Mapper {
    public static List<CardDto> mapCardsToCardsDto(Set<Card> cards) {
        return cards.stream()
                .map(card -> new CardDto(card))
                .collect(Collectors.toList());
    }

    public static List<CardModel> mapCardsDtoToCardsModel(List<CardDto> cardsDto) {
        return cardsDto.stream()
                .map(cardDto -> new CardModel(cardDto))
                .collect(Collectors.toList());
    }
}
