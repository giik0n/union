package com.alexpan.union.adapter.out.persistence.adapter;

import com.alexpan.union.adapter.out.persistence.dao.AddressDAO;
import com.alexpan.union.adapter.out.persistence.model.AddressJPAEntity;
import com.alexpan.union.domain.model.Address;
import com.alexpan.union.domain.port.out.LoadAddressByIdPort;
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
public class LoadAddressByIdAdapter implements LoadAddressByIdPort {
    private final AddressDAO addressDAO;
    private final ModelMapper modelMapper;
    @Override
    public Address load(Long id) {
        AddressJPAEntity addressJPAEntity = addressDAO.findById(id).orElseThrow(()->new RuntimeException("No such address found"));
        return addressJPAEntity == null? null : modelMapper.map(addressJPAEntity, Address.class);
    }
}
