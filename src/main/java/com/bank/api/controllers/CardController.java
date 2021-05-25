package com.bank.api.controllers;

import com.bank.bll.interfaces.ICardService;
import com.bank.dto.User.CountUserPaymentsHistoryDto;
import com.bank.model.CountUserPaymentsHistoryModel;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("card")
@AllArgsConstructor
public class CardController {
    private final ICardService cardService;

    @GetMapping("{id}/paymentsHistory")
    @ResponseStatus(HttpStatus.OK)
    public CountUserPaymentsHistoryModel getUserPaymentsHistoryById(@PathVariable Integer id,
                                                                    @RequestParam(value="limit", defaultValue = "0") int limit,
                                                                    @RequestParam(value="offset", defaultValue = "0") int offset){
        CountUserPaymentsHistoryDto countUserPaymentsHistoryDto =
                cardService.getUserPaymentsHistoryById(id, limit, offset);
        CountUserPaymentsHistoryModel countUserPaymentsHistoryModel =
                new CountUserPaymentsHistoryModel(countUserPaymentsHistoryDto);
        return countUserPaymentsHistoryModel;
    }
}
