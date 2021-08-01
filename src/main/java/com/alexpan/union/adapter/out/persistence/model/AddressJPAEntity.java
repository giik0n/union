package com.alexpan.union.adapter.out.persistence.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

/*
 * @author Alexander Panyshchev
 * @since 29.07.2021
 * @version 1.0
 *Task: Create entity for addresses
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "Address")
@Table(name = "t_address")
public class AddressJPAEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pk_id")
    private Long id;

    @Column(name = "c_postal_code", nullable = false)
    private int postalCode;

    @Column(name = "c_region", nullable = false)
    private String region;

    @Column(name = "c_street", nullable = false)
    private String street;

    @Column(name = "c_house_number", nullable = false)
    private int houseNumber;

}
