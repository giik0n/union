package com.alexpan.union.adapter.out.persistence.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

/*
 * @author Alexander Panyshchev
 * @since 29.07.2021
 * @version 1.0
 *Task: Define Data Model
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "Client")
@Table(name = "t_clients")
public class ClientJPAEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="c_name", nullable = false)
    private String name;

    @Column(name="c_surname", nullable = false)
    private String surname;

    @Column(name="c_birthday", nullable = false, columnDefinition = "DATE")
    private LocalDate birthday;

    @Column(name = "c_email", nullable = false)
    private String email;

    @ManyToOne
    @JoinColumn(name = "c_permanent_address", nullable = false)
    private AddressJPAEntity permanentAddress;

    @ManyToOne
    @JoinColumn(name = "c_mail_address")
    private AddressJPAEntity mailAddress;
}
