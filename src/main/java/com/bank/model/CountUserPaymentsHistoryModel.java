package com.bank.model;

import com.bank.bll.mapper.Mapper;
import com.bank.dto.User.CountUserPaymentsHistoryDto;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class CountUserPaymentsHistoryModel {
    private List<UserPaymentsHistoryModel> Payments;
    private long Count;

    public CountUserPaymentsHistoryModel(CountUserPaymentsHistoryDto countUserPaymentsHistoryDto) {
        this.Payments = Mapper.mapUserPaymentsHistoryDtoToModels(
                countUserPaymentsHistoryDto.getUserPaymentsHistoriesDto());
        this.Count = countUserPaymentsHistoryDto.getCount();
    }
}
