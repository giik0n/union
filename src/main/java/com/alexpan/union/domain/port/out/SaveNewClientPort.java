package com.alexpan.union.domain.port.out;

import com.alexpan.union.domain.model.Client;

/*
 * @author Alexander Panyshchev
 * @since 01.08.2021
 * @version 1.0
 *Task:
 */
public interface SaveNewClientPort {
    Client save(Client client);
}
