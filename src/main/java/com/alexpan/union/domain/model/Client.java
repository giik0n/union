package com.alexpan.union.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

/*
 * @author Alexander Panyshchev
 * @since 31.07.2021
 * @version 1.0
 *Task: Create model for Client
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Client {
    private Long id;
    private String name;
    private String surname;
    private LocalDate birthday;
    private String email;
    private Address permanentAddress;
    private Address mailAddress;
    private List<TravelContract> travelContracts;
    private List<PropertyContract> propertyContracts;
}
