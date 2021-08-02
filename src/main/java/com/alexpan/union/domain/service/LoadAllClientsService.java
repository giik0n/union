package com.alexpan.union.domain.service;

import com.alexpan.union.domain.model.Client;
import com.alexpan.union.domain.port.in.LoadAllClientsUseCase;
import com.alexpan.union.domain.port.out.LoadAllClientsPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/*
 * @author Alexander Panyshchev
 * @since 01.08.2021
 * @version 1.0
 *Task: Create implementation service for loading all clients use case
 */
@Service
@RequiredArgsConstructor
public class LoadAllClientsService implements LoadAllClientsUseCase {

    private final LoadAllClientsPort loadAllClientsPort;

    @Override
    public List<Client> load() {
        return loadAllClientsPort.load();
    }

}
