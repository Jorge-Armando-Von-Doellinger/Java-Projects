package me.dio.santander_dev_week_2023_dio.model;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Entity(name = "tb_account")
public class Account {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String number;
    private String agency;
    @Column(scale = 13, precision = 2)
    private BigDecimal balance;
    @Column(scale = 13, precision = 2, name = "account_limit")
    private BigDecimal limit;
}
