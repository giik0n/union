package com.alexpan.union.domain.service;

import com.alexpan.union.adapter.in.model.request.NewClientRequest;
import com.alexpan.union.domain.model.Client;
import com.alexpan.union.domain.port.in.RegisterNewClientUseCase;
import com.alexpan.union.domain.port.out.LoadAddressByIdPort;
import com.alexpan.union.domain.port.out.SaveNewClientPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

/*
 * @author Alexander Panyshchev
 * @since 01.08.2021
 * @version 1.0
 *Task: Create Service for registration new client
 */
@Component
@RequiredArgsConstructor
public class RegisterNewClientService implements RegisterNewClientUseCase {

    private final SaveNewClientPort saveNewUserPort;
    private final LoadAddressByIdPort loadAddressByIdPort;

    @Override
    public Long register(NewClientRequest request) {
        Client client = new Client();
        client.setName(request.getName());
        client.setSurname(request.getSurname());
        client.setBirthday(request.getBirthday());
        client.setEmail(request.getEmail());
        client.setPermanentAddress(loadAddressByIdPort.load(request.getPermanentAddressId()));
        client.setMailAddress(loadAddressByIdPort.load(request.getMailAddressId()));
        client.setPropertyContracts(null);
        client.setTravelContracts(null);

        client = saveNewUserPort.save(client);

        return client.getId();
    }
}
