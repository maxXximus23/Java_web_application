package com.bank.bll.mapper;

import com.bank.config.ApplicationConfig;
import com.bank.dto.Card.CardDto;
import com.bank.dto.User.UserPaymentsHistoryDto;
import com.bank.model.CardModel;
import com.bank.model.UserPaymentsHistoryModel;
import org.modelmapper.ModelMapper;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Mapper {
    private static ModelMapper modelMapper = new ApplicationConfig().modelMapper();
    /*public static List<CardDto> mapCardsToCardsDto(Set<Card> cards) {
        return cards.stream()
                .map(card -> new CardDto(card))
                .collect(Collectors.toList());
    }*/

    public static List<CardModel> mapCardsDtoToModels(List<CardDto> cardsDto) {
        return cardsDto.stream()
                .map(cardDto -> new CardModel(cardDto))
                .collect(Collectors.toList());
    }

    public static List<UserPaymentsHistoryModel> mapUserPaymentsHistoryDtoToModels(List<UserPaymentsHistoryDto> userPaymentsHistoryDtos) {
        return userPaymentsHistoryDtos.stream()
                .map(Dto -> new UserPaymentsHistoryModel(Dto))
                .collect(Collectors.toList());
    }

    public static <S, T> List<T> mapSetToListDto(Set<S> source, Class<T> targetClass) {
        return source
                .stream()
                .map(element -> modelMapper.map(element, targetClass))
                .collect(Collectors.toList());
    }

    /*public static <S, T> List<T> mapModel(List<S> source, Class<T> targetClass) {
        return source
                .stream()
                .map(element -> modelMapper.map(element, targetClass))
                .collect(Collectors.toList());
    }*/
}
