package com.bank.bll.services;

import com.bank.bll.interfaces.IUserService;
import com.bank.bll.mapper.Mapper;
import com.bank.dao.domain.User;
import com.bank.dao.repos.UserRepository;
import com.bank.dto.Card.CardDto;
import com.bank.dto.User.UserDto;
import com.bank.exception.ItemNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.MapReactiveUserDetailsService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UserService implements IUserService {
    private final UserRepository userRepository;

    @Override
    public List<CardDto> getUserBalanceById(Integer id) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new ItemNotFoundException("User with id has not found!"));
        return Mapper.mapCardsToCardsDto(user.getCards());
    }
}
