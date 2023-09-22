package com.mibanco.historialconsultaclientecentralriesgo.es.controller;

import com.mibanco.historialconsultaclientecentralriesgo.es.gen.contract.V1Historialconsultaclientecentralriesgo;
import com.mibanco.historialconsultaclientecentralriesgo.es.gen.type.TipoDocumentoEnum;
import jakarta.ws.rs.core.Response;

public class HistorialConsultaRiesgoController implements V1Historialconsultaclientecentralriesgo {


    @Override
    public Response consultarUrlArchivoMasRecienteXml(TipoDocumentoEnum tipoDocumento, Integer numeroDocumento, Integer digitoVerificacion) {
        return Response.status(Response.Status.OK).entity("OK").build();
    }
}
