package com.alexpan.union.adapter.out.persistence.adapter;

import com.alexpan.union.adapter.out.persistence.dao.ClientDAO;
import com.alexpan.union.adapter.out.persistence.model.ClientJPAEntity;
import com.alexpan.union.domain.model.Client;
import com.alexpan.union.domain.port.out.LoadAllClientsPort;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

/*
 * @author Alexander Panyshchev
 * @since 01.08.2021
 * @version 1.0
 *Task: Create adapter to load all clients from ClientsDAO
 */
@Component
@RequiredArgsConstructor
public class LoadAllClientsAdapter implements LoadAllClientsPort {

    private final ClientDAO clientDAO;
    private final ModelMapper modelMapper;

    @Override
    public List<Client> load() {
        List<ClientJPAEntity> userJPAEntities = clientDAO.findByOrderBySurnameAsc();
        return userJPAEntities.stream().map(
                p -> modelMapper.map(p, Client.class)
        ).collect(Collectors.toList());
    }
}
