package com.rest.army.dashboard.repository;

import com.rest.army.dashboard.model.Weapon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by ionutmihailescu on 1/2/18.
 */
@Repository
public interface IWeaponRepository extends JpaRepository<Weapon,Long> {
}
