package com.bank.dto.User;

import com.bank.bll.mapper.Mapper;
import com.bank.dao.domain.UserPaymentsHistory;
import lombok.Getter;

import java.util.List;
import java.util.Set;

@Getter
public class CountUserPaymentsHistoryDto {
    private List<UserPaymentsHistoryDto> userPaymentsHistoriesDto;
    private long count;

    public CountUserPaymentsHistoryDto (Set<UserPaymentsHistory> userPaymentsHistory, long count) {
        this.userPaymentsHistoriesDto = Mapper.mapSetToListDto(userPaymentsHistory, UserPaymentsHistoryDto.class);
        this.count = count;
    }
}
