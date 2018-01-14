package com.rest.army.dashboard.repository;

import com.rest.army.dashboard.model.ArmyCorp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.orm.hibernate3.LocalTransactionManagerLookup;
import org.springframework.stereotype.Repository;

/**
 * Created by ionutmihailescu on 1/2/18.
 */
@Repository
public interface IArmyCorpRepository extends JpaRepository<ArmyCorp,Long>{
}
