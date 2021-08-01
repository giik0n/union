package com.alexpan.union.adapter.out.persistence.model;

import com.alexpan.union.adapter.out.persistence.model.enums.PropertyType;
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
 *Task: Entity for property contracts
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "PropertyContract")
@Table(name = "t_property_contracts")
public class PropertyContractJPAEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "c_create_date")
    private LocalDate createDate;


    @Enumerated(EnumType.STRING)
    @Column(name = "c_property_type")
    private PropertyType propertyType;


    @ManyToOne
    @JoinColumn(name = "c_mail_address")
    private AddressJPAEntity propertyAddress;

    @Column(name = "c_price")
    private BigDecimal price;

    @Column(name = "fk_user_id")
    private Long userId;

}
