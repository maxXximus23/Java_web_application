package com.bank.bll.interfaces;

import com.bank.dto.Card.CardDto;
import com.bank.dto.User.UserDto;
import com.bank.dto.User.UserPaymentsHistoryDto;

import java.util.List;

public interface IUserService {
   List<CardDto> getUserBalanceById(Integer id);
}
