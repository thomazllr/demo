package com.thomazllr.demo.model.client;

import com.thomazllr.demo.core.mapper.BaseMapper;
import com.thomazllr.demo.entity.Client;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ClientMapper extends BaseMapper<Client, ClientRequest, ClientResponse> {

}
