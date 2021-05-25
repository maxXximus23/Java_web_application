package com.bank.bll.services;

import com.bank.bll.interfaces.ICardService;
import com.bank.dao.domain.UserPaymentsHistory;
import com.bank.dao.repos.CardsRepository;
import com.bank.dao.repos.UserPaymentsHistoryRepository;
import com.bank.dto.User.CountUserPaymentsHistoryDto;
import com.bank.exception.ItemNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@AllArgsConstructor
public class CardService implements ICardService {
    private final UserPaymentsHistoryRepository userPaymentsHistoryRepository;
    private final CardsRepository cardsRepository;

    @Override
    public CountUserPaymentsHistoryDto getUserPaymentsHistoryById(Integer id, int limit, int offset) {
        cardsRepository.findById(id)
                .orElseThrow(() -> new ItemNotFoundException("Card with id " + id + " has not found!"));

        Set<UserPaymentsHistory> userPaymentsHistory = userPaymentsHistoryRepository.findByFromCardId(id, limit, offset)
                .orElseThrow(() -> new ItemNotFoundException("Payments history for card with id " + id +
                        " has not found!"));
        long count = userPaymentsHistoryRepository.countUserPaymentsHistoriesByFromCardId(id);
        CountUserPaymentsHistoryDto countUserPaymentsHistoryDto = new CountUserPaymentsHistoryDto(userPaymentsHistory,
                count);
        return countUserPaymentsHistoryDto;
    }
}
