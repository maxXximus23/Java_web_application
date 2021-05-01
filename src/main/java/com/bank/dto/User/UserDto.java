package com.bank.dto.User;

import com.bank.dao.domain.User;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.Date;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserDto {
    private Integer Id;
    private String Name;
    private String Surname;
    private Date Birthday;
    private String Patronymic;
    private String PassportCode;
    private String PhoneNumber;
    private Integer TaxId;
    private Integer CredentialId;

    public UserDto(User user){
        this.Id = user.getId();
        this.Name = user.getName();
        this.Surname = user.getSurname();
        this.Birthday = user.getBirthday();
        this.Patronymic = user.getPatronymic();
        this.PassportCode = user.getPassportCode();
        this.PhoneNumber = user.getPhoneNumber();
        this.TaxId = user.getTaxId();
        this.CredentialId = user.getCredentialId();
    }

}
