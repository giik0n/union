package com.alexpan.union.adapter.in.model.dto;

import com.alexpan.union.domain.model.Address;
import lombok.Data;

import java.time.LocalDate;

/*
 * @author Alexander Panyshchev
 * @since 01.08.2021
 * @version 1.0
 *Task:
 */
@Data
public class ClientDTO {
    private Long id;
    private String name;
    private String surname;
    private LocalDate birthday;
    private String email;
    private Address permanentAddress;
    private Address mailAddress;
}
