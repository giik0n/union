package com.alexpan.union.adapter.in.model.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

/*
 * @author Alexander Panyshchev
 * @since 31.07.2021
 * @version 1.0
 *Task: Create new registration request
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class NewClientRequest {
    private String name;
    private String surname;
    private LocalDate birthday;
    private String email;
    private Long permanentAddressId;
    private Long mailAddressId;
}

