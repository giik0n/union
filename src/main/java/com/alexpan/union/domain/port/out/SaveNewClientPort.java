package com.alexpan.union.domain.port.out;

import com.alexpan.union.domain.model.Client;

/*
 * @author Alexander Panyshchev
 * @since 01.08.2021
 * @version 1.0
 *Task: Create port for save new client
 */
public interface SaveNewClientPort {
    Client save(Client client);
}
