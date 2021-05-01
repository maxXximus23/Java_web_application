package com.bank.dao.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "user")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;

    @Column(name = "Name")
    private String Name;

    @Column(name = "Surname")
    private String Surname;

    @Column(name = "Birthday")
    private Date Birthday;

    @Column(name = "Patronymic")
    private String Patronymic;

    @Column(name = "PassportCode")
    private String PassportCode;

    @Column(name = "PhoneNumber")
    private String PhoneNumber;

    @Column(name = "TaxId")
    private Integer TaxId;

    @Column(name = "CredentialId")
    private Integer CredentialId;

    @JsonIgnore
    @OneToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "usercards",
            joinColumns = {@JoinColumn(name = "UserId", referencedColumnName = "Id")},
            inverseJoinColumns = {@JoinColumn(name = "CardsId", referencedColumnName = "Id")})
    private Set<Card> cards;
}
