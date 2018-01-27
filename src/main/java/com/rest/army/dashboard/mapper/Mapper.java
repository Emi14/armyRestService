package com.rest.army.dashboard.mapper;

import com.rest.army.dashboard.model.FireGroup;
import com.rest.army.dashboard.resource.FireGroupResource;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.ConfigurableMapper;
import ma.glasnost.orika.impl.DefaultMapperFactory;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Created by ionutmihailescu on 12/9/17.
 */
@Component
public class Mapper extends ConfigurableMapper {

    @PostConstruct
    public void init() {
        final MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();

        mapperFactory.classMap(FireGroup.class, FireGroupResource.class)
                .byDefault()
                .register();
    }

}
