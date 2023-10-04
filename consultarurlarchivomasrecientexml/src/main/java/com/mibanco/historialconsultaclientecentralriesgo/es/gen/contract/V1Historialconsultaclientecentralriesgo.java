package com.mibanco.historialconsultaclientecentralriesgo.es.gen.contract;

import com.mibanco.historialconsultaclientecentralriesgo.es.gen.type.Error;
import com.mibanco.historialconsultaclientecentralriesgo.es.gen.type.TipoDocumentoEnum;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;



import java.io.InputStream;
import java.util.Map;
import java.util.List;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

@Path("/v1/es/central-riesgo/ubicacion/xml/{tipoDocumento}/{numeroDocumento}/{digitoVerificacion}")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2023-10-04T16:13:44.886348-05:00[America/Bogota]")
public interface V1Historialconsultaclientecentralriesgo {

    @GET
    @Produces({ "application/json" })
    Response consultarUrlArchivoMasRecienteXml(@PathParam("tipoDocumento") TipoDocumentoEnum tipoDocumento,@PathParam("numeroDocumento") Integer numeroDocumento,@PathParam("digitoVerificacion") Integer digitoVerificacion);
}
