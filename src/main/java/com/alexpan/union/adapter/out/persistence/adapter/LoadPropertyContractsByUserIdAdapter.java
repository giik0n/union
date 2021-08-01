package com.alexpan.union.adapter.out.persistence.adapter;

import com.alexpan.union.adapter.out.persistence.dao.PropertyContractDAO;
import com.alexpan.union.adapter.out.persistence.dao.TravelContractDAO;
import com.alexpan.union.adapter.out.persistence.model.PropertyContractJPAEntity;
import com.alexpan.union.adapter.out.persistence.model.TravelContractJPAEntity;
import com.alexpan.union.domain.model.PropertyContract;
import com.alexpan.union.domain.model.TravelContract;
import com.alexpan.union.domain.port.out.LoadPropertyContractsByUserIdPort;
import com.alexpan.union.domain.port.out.LoadTravelContractsByUserIdPort;
import com.fasterxml.jackson.databind.annotation.JsonAppend;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

/*
 * @author Alexander Panyshchev
 * @since 01.08.2021
 * @version 1.0
 *Task:
 */
@Component
@RequiredArgsConstructor
public class LoadPropertyContractsByUserIdAdapter implements LoadPropertyContractsByUserIdPort {

    private final PropertyContractDAO propertyContractDAO;
    private final ModelMapper modelMapper;


    @Override
    public List<PropertyContract> load(Long id) {
        List<PropertyContractJPAEntity> propertyContractJPAEntities = propertyContractDAO.findAllByUserId(id);
        return propertyContractJPAEntities.stream().map(
                p -> modelMapper.map(p, PropertyContract.class)
        ).collect(Collectors.toList());
    }
}
