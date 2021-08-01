package com.alexpan.union.adapter.out.persistence.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

/*
 * @author Alexander Panyshchev
 * @since 29.07.2021
 * @version 1.0
 *Task: Entity for travel contracts
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "TravelContract")
@Table(name = "t_travel_contracts")
public class TravelContractJPAEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "c_create_date")
    private LocalDate createDate;

    @Column(name = "c_start_date")
    private LocalDate startDate;

    @Column(name = "c_end_date")
    private LocalDate endDate;

    @Column(name = "c_is_damage")
    private boolean isInsuredDamage;

    @Column(name = "c_is_accident")
    private boolean isInsuredAccident;

    @Column(name = "fk_user_id")
    private Long userId;
}
