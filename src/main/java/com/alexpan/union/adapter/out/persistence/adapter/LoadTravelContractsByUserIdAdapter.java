package com.alexpan.union.adapter.out.persistence.adapter;

import com.alexpan.union.adapter.out.persistence.dao.ClientDAO;
import com.alexpan.union.adapter.out.persistence.dao.TravelContractDAO;
import com.alexpan.union.adapter.out.persistence.model.ClientJPAEntity;
import com.alexpan.union.adapter.out.persistence.model.TravelContractJPAEntity;
import com.alexpan.union.domain.model.TravelContract;
import com.alexpan.union.domain.port.out.LoadTravelContractsByUserIdPort;
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
public class LoadTravelContractsByUserIdAdapter implements LoadTravelContractsByUserIdPort {

    private final TravelContractDAO loadTravelContractsDAO;
    private final ModelMapper modelMapper;

    @Override
    public List<TravelContract> load(Long id) {
        List<TravelContractJPAEntity> travelContractJPAEntities = loadTravelContractsDAO.findAllByUserId(id);
        return travelContractJPAEntities.stream().map(
                p -> modelMapper.map(p, TravelContract.class)
        ).collect(Collectors.toList());
    }
}
