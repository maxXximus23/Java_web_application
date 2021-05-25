package com.bank.bll.interfaces;

import com.bank.dto.Card.CardDto;

import java.util.List;

public interface IUserService {
   List<CardDto> getUserBalanceById(Integer id);
}
