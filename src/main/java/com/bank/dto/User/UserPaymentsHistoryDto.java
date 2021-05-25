package com.bank.dto.User;

import com.bank.dao.domain.enums.CardOperationType;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.Date;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserPaymentsHistoryDto {
    private Integer Id;
    private Date CompletedAt;
    private String Sender;
    private String Recipient;
    private double Sum;
    private String Commentary;
    private CardOperationType Type;
    private Integer FromCardId;

    /*public UserPaymentsHistoryDto(UserPaymentsHistory userPaymentsHistory) {
        this.Id = userPaymentsHistory.getId();
        this.CompletedAt = userPaymentsHistory.getCompletedAt();
        this.Sender = userPaymentsHistory.getSender();
        this.Recipient = userPaymentsHistory.getRecipient();
        this.Sum = userPaymentsHistory.getSum();
        this.Commentary = userPaymentsHistory.getCommentary();
        this.Type = userPaymentsHistory.getType();
        this.FromCardId = userPaymentsHistory.getFromCardId();
    }*/

    public UserPaymentsHistoryDto() {

    }
}
