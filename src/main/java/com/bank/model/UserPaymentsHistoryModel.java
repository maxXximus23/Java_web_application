package com.bank.model;

import com.bank.dto.User.UserPaymentsHistoryDto;
import com.bank.utils.DateFormatUtil;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserPaymentsHistoryModel {
    private Integer Id;
    private String CompletedAt;
    private String From;
    private String To;
    private String Sum;
    private String Commentary;
    private String Type;

    public UserPaymentsHistoryModel(UserPaymentsHistoryDto userPaymentsHistoryDto) {
        this.Id = userPaymentsHistoryDto.getId();
        this.CompletedAt = DateFormatUtil.toISO(userPaymentsHistoryDto.getCompletedAt());
        this.From = userPaymentsHistoryDto.getSender();
        this.To = userPaymentsHistoryDto.getRecipient();
        this.Sum = Double.toString(userPaymentsHistoryDto.getSum());
        this.Commentary = userPaymentsHistoryDto.getCommentary();
        this.Type = userPaymentsHistoryDto.getType().toString();
    }
}
