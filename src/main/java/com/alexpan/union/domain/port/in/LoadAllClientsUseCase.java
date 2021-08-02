package com.alexpan.union.domain.port.in;

import com.alexpan.union.domain.model.Client;

import java.util.List;

/*
 * @author Alexander Panyshchev
 * @since 31.07.2021
 * @version 1.0
 *Task: Crete use case for loading all clients
 */
public interface LoadAllClientsUseCase {
    List<Client> load();
}
