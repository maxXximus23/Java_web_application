package com.bank.api.controllers;

import com.bank.bll.interfaces.ICardService;
import com.bank.bll.interfaces.IUserService;
import com.bank.bll.mapper.Mapper;
import com.bank.dto.Card.CardDto;
import com.bank.dto.User.UserPaymentsHistoryDto;
import com.bank.model.CardModel;
import com.bank.model.UserPaymentsHistoryModel;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("card")
@AllArgsConstructor
public class CardController {
    private final ICardService cardService;

    @GetMapping("{id}/paymentsHistory")
    @ResponseStatus(HttpStatus.OK)
    public List<UserPaymentsHistoryModel> getUserPaymentsHistoryById(@PathVariable Integer id){
        return Mapper.mapUserPaymentsHistoryDtoToModels(cardService.getUserPaymentsHistoryById(id));
    }
}
