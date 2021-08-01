package com.alexpan.union.domain.service;

import com.alexpan.union.domain.model.Client;
import com.alexpan.union.domain.port.in.LoadClientByIdUseCase;
import com.alexpan.union.domain.port.out.LoadClientByIdPort;
import com.alexpan.union.domain.port.out.LoadPropertyContractsByUserIdPort;
import com.alexpan.union.domain.port.out.LoadTravelContractsByUserIdPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/*
 * @author Alexander Panyshchev
 * @since 01.08.2021
 * @version 1.0
 *Task:
 */
@Service
@RequiredArgsConstructor
public class LoadClientByIdService implements LoadClientByIdUseCase {

    private final LoadClientByIdPort loadClientByIdPort;
    private final LoadTravelContractsByUserIdPort loadTravelContractsByUserIdPort;
    private final LoadPropertyContractsByUserIdPort loadPropertyContractsByUserIdPort;


    @Override
    public Client load(Long id) {
        Client client = loadClientByIdPort.load(id);
        client.setTravelContracts(loadTravelContractsByUserIdPort.load(id));
        client.setPropertyContracts(loadPropertyContractsByUserIdPort.load(id));
        return client;
    }
}
