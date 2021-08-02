package com.alexpan.union.adapter.out.persistence.dao;

import com.alexpan.union.adapter.out.persistence.model.AddressJPAEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*
 * @author Alexander Panyshchev
 * @since 01.08.2021
 * @version 1.0
 *Task: Address repository
 */
@Repository
public interface AddressDAO extends JpaRepository<AddressJPAEntity, Long> {
//    AddressJPAEntity findById(Long id);
}
