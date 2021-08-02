package com.alexpan.union.adapter.out.persistence.adapter;

import com.alexpan.union.adapter.out.persistence.dao.AddressDAO;
import com.alexpan.union.adapter.out.persistence.dao.ClientDAO;
import com.alexpan.union.adapter.out.persistence.model.AddressJPAEntity;
import com.alexpan.union.adapter.out.persistence.model.ClientJPAEntity;
import com.alexpan.union.domain.model.Address;
import com.alexpan.union.domain.model.Client;
import com.alexpan.union.domain.port.out.SaveNewAddressPort;
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
public class SaveNewAddressAdapter implements SaveNewAddressPort {

    private final AddressDAO addressDAO;
    private final ModelMapper modelMapper;

    @Override
    public Address save(Address address) {
        AddressJPAEntity addressJPAEntity = modelMapper.map(address, AddressJPAEntity.class);
        addressJPAEntity = addressDAO.save(addressJPAEntity);
        return modelMapper.map(addressJPAEntity, Address.class);
    }
}
