package com.alexpan.union.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

/*
 * @author Alexander Panyshchev
 * @since 31.07.2021
 * @version 1.0
 *Task: Create model for travel contract
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TravelContract{
    private Long id;
    private LocalDate createDate;
    private LocalDate startDate;
    private LocalDate endDate;
    private boolean isInsuredDamage;
    private boolean isInsuredAccident;
    private Long userId;
}
