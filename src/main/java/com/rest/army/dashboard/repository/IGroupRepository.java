package com.rest.army.dashboard.repository;

import com.rest.army.dashboard.model.Group;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by ionutmihailescu on 1/2/18.
 */
@Repository
public interface IGroupRepository extends JpaRepository<Group, Long> {
}
