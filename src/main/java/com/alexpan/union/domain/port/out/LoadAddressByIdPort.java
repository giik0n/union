package com.alexpan.union.domain.port.out;

import com.alexpan.union.domain.model.Address;

/*
 * @author Alexander Panyshchev
 * @since 01.08.2021
 * @version 1.0
 *Task: Create port for loading address by id
 */
public interface LoadAddressByIdPort {
    Address load(Long id);
}
