package com.mibanco.historialconsultaclientecentralriesgo.es.services.impl;

import com.mibanco.historialconsultaclientecentralriesgo.es.services.contract.HistorialConsultaClienteCentralRiesgoService;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class HistorialConsultaClienteCentralRiesgoServiceImpl implements HistorialConsultaClienteCentralRiesgoService {
    @Override
    public String consultarUrlMasReciente(String tipoDocumentoEnum, String numeroDocuemnte, String digitoVerificacion) {
        return "https://www.pruebaconsultaurl.com";
    }
}
