package com.mibanco.historialconsultaclientecentralriesgo.es.utils.mapper;

import jakarta.enterprise.context.ApplicationScoped;
import org.modelmapper.ModelMapper;

@ApplicationScoped
public class HistorialConsultaClienteCentralRiesgoMapperGrpc {

    public String tipoDocumentoToEnum(String grpc) {
        return new ModelMapper().map(grpc, String.class);
    }

}
