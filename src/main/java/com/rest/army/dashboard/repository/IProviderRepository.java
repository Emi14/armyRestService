package com.rest.army.dashboard.repository;

import com.rest.army.dashboard.model.Provider;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by ionutmihailescu on 1/2/18.
 */
public interface IProviderRepository extends JpaRepository<Provider,Long> {
}
