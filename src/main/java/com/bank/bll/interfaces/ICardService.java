package com.bank.bll.interfaces;

import com.bank.dto.User.CountUserPaymentsHistoryDto;

public interface ICardService {
    CountUserPaymentsHistoryDto getUserPaymentsHistoryById(Integer Id, int limit, int offset);
}
