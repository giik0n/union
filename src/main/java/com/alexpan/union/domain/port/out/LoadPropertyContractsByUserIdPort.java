package com.alexpan.union.domain.port.out;

import com.alexpan.union.domain.model.PropertyContract;
import com.alexpan.union.domain.model.TravelContract;

import java.util.List;

/*
 * @author Alexander Panyshchev
 * @since 01.08.2021
 * @version 1.0
 *Task:
 */
public interface LoadPropertyContractsByUserIdPort {
    List<PropertyContract> load(Long id);
}
