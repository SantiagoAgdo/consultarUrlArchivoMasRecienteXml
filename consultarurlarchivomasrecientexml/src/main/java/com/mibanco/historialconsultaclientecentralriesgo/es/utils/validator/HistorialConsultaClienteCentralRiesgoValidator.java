package com.mibanco.historialconsultaclientecentralriesgo.es.utils.validator;

import com.mibanco.historialconsultaclientecentralriesgo.es.ConsultarUrlArchivoMasRecienteXmlInput;
import com.mibanco.historialconsultaclientecentralriesgo.es.contants.Constants;
import com.mibanco.historialconsultaclientecentralriesgo.es.utils.exception.ApplicationExceptionValidation;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.core.Response;

@ApplicationScoped
public class HistorialConsultaClienteCentralRiesgoValidator {

    public boolean validarConsulta(ConsultarUrlArchivoMasRecienteXmlInput data){
        if (data.getNumeroDocumento() == null){
            throw new ApplicationExceptionValidation(
                    Response.Status.BAD_REQUEST.getStatusCode(), Constants.ERROR_SERVICIO + " numero de documento es nulo"
            );
        }
        if (data.getDigitoVerificacion() == null || data.getDigitoVerificacion().length() >2){
            throw new ApplicationExceptionValidation(
                    Response.Status.BAD_REQUEST.getStatusCode(), Constants.ERROR_SERVICIO + " digito de verificacion es nulo"
            );
        }
        if (data.getTipoDocumento() == null){ //validar que sea del enumerador
            throw new ApplicationExceptionValidation(
                    Response.Status.BAD_REQUEST.getStatusCode(), Constants.ERROR_SERVICIO + " tipo de documento es nulo"
            );
        }
        return true;
    }

}
