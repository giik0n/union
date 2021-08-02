package com.alexpan.union.adapter.out.persistence.dao;

import com.alexpan.union.adapter.out.persistence.model.PropertyContractJPAEntity;
import com.alexpan.union.adapter.out.persistence.model.TravelContractJPAEntity;
import jdk.jfr.Registered;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/*
 * @author Alexander Panyshchev
 * @since 01.08.2021
 * @version 1.0
 *Task: Property contracts repository
 */
@Repository
public interface PropertyContractDAO extends JpaRepository<PropertyContractJPAEntity, Long> {
    List<PropertyContractJPAEntity> findAllByUserId(Long id);
}
