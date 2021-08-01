package com.alexpan.union.domain.model;

import com.alexpan.union.adapter.out.persistence.model.enums.PropertyType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

/*
 * @author Alexander Panyshchev
 * @since 31.07.2021
 * @version 1.0
 *Task: Create model for property contract
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PropertyContract{
    private Long id;
    private LocalDate createDate;
    private PropertyType propertyType;
    private Address propertyAddress;
    private BigDecimal propertyPrice;
    private Long userId;
}
