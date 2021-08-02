package com.alexpan.union.configuration;

import org.modelmapper.ModelMapper;
import org.modelmapper.config.Configuration;
import org.springframework.context.annotation.Bean;

/*
 * @author Alexander Panyshchev
 * @since 01.08.2021
 * @version 1.0
 *Task: Model Mapper object configuration
 */
@org.springframework.context.annotation.Configuration
public class ModelMapperConfiguration {
    @Bean
    public ModelMapper modelMapper() {
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setFieldMatchingEnabled(true).setFieldAccessLevel(Configuration.AccessLevel.PRIVATE);
        return modelMapper;
    }
}
