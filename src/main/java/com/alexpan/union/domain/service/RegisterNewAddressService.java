package com.alexpan.union.domain.service;

import com.alexpan.union.adapter.in.model.request.NewAddressRequest;
import com.alexpan.union.domain.model.Address;
import com.alexpan.union.domain.port.in.RegisterNewAddressUseCase;
import com.alexpan.union.domain.port.out.SaveNewAddressPort;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

/*
 * @author Alexander Panyshchev
 * @since 02.08.2021
 * @version 1.0
 *Task: Create service for new address registration
 */
@Component
@RequiredArgsConstructor
public class RegisterNewAddressService implements RegisterNewAddressUseCase {

    private final SaveNewAddressPort saveNewAddressPort;
    private final ModelMapper modelMapper;
    @Override
    public Long register(NewAddressRequest request) {
        Address address = modelMapper.map(request,Address.class);
        address = saveNewAddressPort.save(address);
        return address.getId();
    }
}
