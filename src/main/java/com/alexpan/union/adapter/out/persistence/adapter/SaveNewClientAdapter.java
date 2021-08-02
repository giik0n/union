package com.alexpan.union.adapter.out.persistence.adapter;

import com.alexpan.union.adapter.out.persistence.model.ClientJPAEntity;
import com.alexpan.union.domain.model.Client;
import com.alexpan.union.adapter.out.persistence.dao.ClientDAO;
import com.alexpan.union.domain.port.out.SaveNewClientPort;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

/*
 * @author Alexander Panyshchev
 * @since 01.08.2021
 * @version 1.0
 *Task: Create adapter to save new client
 */
@Component
@RequiredArgsConstructor
public class SaveNewClientAdapter implements SaveNewClientPort {

    private final ClientDAO userDAO;
    private final ModelMapper modelMapper;

    @Override
    public Client save(Client client) {
        ClientJPAEntity clientJPAEntity = modelMapper.map(client, ClientJPAEntity.class);
        clientJPAEntity = userDAO.save(clientJPAEntity);
        return modelMapper.map(clientJPAEntity, Client.class);
    }
}
