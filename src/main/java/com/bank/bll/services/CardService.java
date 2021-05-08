package com.bank.bll.services;

import com.bank.bll.interfaces.ICardService;
import com.bank.bll.mapper.Mapper;
import com.bank.dao.domain.UserPaymentsHistory;
import com.bank.dao.repos.CardsRepository;
import com.bank.dao.repos.UserPaymentsHistoryRepository;
import com.bank.dto.User.UserPaymentsHistoryDto;
import com.bank.exception.ItemNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
@AllArgsConstructor
public class CardService implements ICardService {
    private final UserPaymentsHistoryRepository userPaymentsHistoryRepository;
    private final CardsRepository cardsRepository;

    @Override
    public List<UserPaymentsHistoryDto> getUserPaymentsHistoryById(Integer id) {
        cardsRepository.findById(id)
                .orElseThrow(() -> new ItemNotFoundException("Card with id " + id + " has not found!"));
        Set<UserPaymentsHistory> userPaymentsHistory = userPaymentsHistoryRepository.findByFromCardId(id)
                .orElseThrow(() -> new ItemNotFoundException("Payments history for card with id " + id +
                        " has not found!"));
        return Mapper.mapList(userPaymentsHistory, UserPaymentsHistoryDto.class);
    }
}
