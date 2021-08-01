package com.alexpan.union.adapter.out.persistence.adapter;

import com.alexpan.union.adapter.out.persistence.dao.AddressDAO;
import com.alexpan.union.adapter.out.persistence.dao.ClientDAO;
import com.alexpan.union.adapter.out.persistence.model.AddressJPAEntity;
import com.alexpan.union.adapter.out.persistence.model.ClientJPAEntity;
import com.alexpan.union.domain.model.Address;
import com.alexpan.union.domain.model.Client;
import com.alexpan.union.domain.port.out.LoadAddressByIdPort;
import com.alexpan.union.domain.port.out.LoadClientByIdPort;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

/*
 * @author Alexander Panyshchev
 * @since 01.08.2021
 * @version 1.0
 *Task: Create adapter for loading addresses by id
 */
@Component
@RequiredArgsConstructor
public class LoadClientByIdAdapter implements LoadClientByIdPort {
    private final ClientDAO clientDAO;
    private final ModelMapper modelMapper;
    @Override
    public Client load(Long id) {
        ClientJPAEntity clientJPAEntity = clientDAO.findById(id).orElseThrow(()->new RuntimeException("No such client found"));
        return clientJPAEntity == null? null : modelMapper.map(clientJPAEntity, Client.class);
    }
}
