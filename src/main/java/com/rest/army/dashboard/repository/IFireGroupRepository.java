package com.rest.army.dashboard.repository;

import com.rest.army.dashboard.model.FireGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by ionutmihailescu on 12/9/17.
 */
@Repository
public interface IFireGroupRepository extends JpaRepository<FireGroup,Long> {
}
