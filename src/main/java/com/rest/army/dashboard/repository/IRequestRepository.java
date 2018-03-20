package com.rest.army.dashboard.repository;

import com.rest.army.dashboard.model.Request;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by ionutmihailescu on 1/2/18.
 */
@Repository
public interface IRequestRepository extends JpaRepository<Request, Long> {
}
