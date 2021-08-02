package com.alexpan.union.adapter.out.persistence.dao;

import com.alexpan.union.adapter.out.persistence.model.ClientJPAEntity;
import com.alexpan.union.adapter.out.persistence.model.TravelContractJPAEntity;
import com.alexpan.union.domain.model.TravelContract;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/*
 * @author Alexander Panyshchev
 * @since 01.08.2021
 * @version 1.0
 *Task: Travel contracts repository
 */
@Repository
public interface TravelContractDAO extends JpaRepository<TravelContractJPAEntity, Long> {
    List<TravelContractJPAEntity> findAllByUserId(Long id);
}
