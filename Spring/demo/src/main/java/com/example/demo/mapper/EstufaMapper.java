package com.example.demo.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.example.demo.dtos.EstufaDTO;
import com.example.demo.models.Estufa;

@Mapper(componentModel = "spring")
public interface EstufaMapper {

    @Mappings({
        @Mapping(target = "tipo", ignore = true),
        @Mapping(target = "usuario", ignore = true)
    })
    Estufa toEntity(EstufaDTO dto);
}
