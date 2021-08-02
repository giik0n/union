package com.alexpan.union.domain.port.in;

import com.alexpan.union.domain.model.Client;

import java.util.List;

/*
 * @author Alexander Panyshchev
 * @since 31.07.2021
 * @version 1.0
 *Task: Create use case for loading client by id
 */
public interface LoadClientByIdUseCase {
    Client load(Long id);
}
