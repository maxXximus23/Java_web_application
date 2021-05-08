package com.bank.api.controllers;

import com.bank.bll.interfaces.IUserService;
import com.bank.bll.mapper.Mapper;
import com.bank.model.CardModel;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("client")
@AllArgsConstructor
public class UserController {
    private final IUserService userService;

    @GetMapping("{id}/balance")
    @ResponseStatus(HttpStatus.OK)
    public List<CardModel> getUserBalanceById(@PathVariable Integer id){
        return Mapper.mapCardsDtoToModels(userService.getUserBalanceById(id));
    }
}
