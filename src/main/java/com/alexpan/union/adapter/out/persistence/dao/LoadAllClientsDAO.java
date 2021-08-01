package com.alexpan.union.adapter.out.persistence.dao;

import com.alexpan.union.adapter.out.persistence.model.ClientJPAEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/*
 * @author Alexander Panyshchev
 * @since 01.08.2021
 * @version 1.0
 *Task: Create data access object for loading clients
 */
@Repository
public interface LoadAllClientsDAO extends JpaRepository<ClientJPAEntity, Long> {
    List<ClientJPAEntity> findByOrderBySurnameAsc();
}
