package com.bank.bll.interfaces;

import com.bank.dto.User.UserPaymentsHistoryDto;

import java.util.List;

public interface ICardService {
    List<UserPaymentsHistoryDto> getUserPaymentsHistoryById(Integer Id);
}
