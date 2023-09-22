package com.mibanco.historialconsultaclientecentralriesgo.es.grpc;

import com.mibanco.historialconsultaclientecentralriesgo.es.ConsultarUrlArchivoMasRecienteXmlGrpcGrpc;
import com.mibanco.historialconsultaclientecentralriesgo.es.ResponseConsultaUrlArchivoMasRecienteXmlOutput;
import com.mibanco.historialconsultaclientecentralriesgo.es.ConsultarUrlArchivoMasRecienteXmlInput;
import com.mibanco.historialconsultaclientecentralriesgo.es.services.impl.HistorialConsultaClienteCentralRiesgoServiceImpl;
import com.mibanco.historialconsultaclientecentralriesgo.es.utils.exception.ApplicationExceptionValidation;
import com.mibanco.historialconsultaclientecentralriesgo.es.utils.mapper.HistorialConsultaClienteCentralRiesgoMapperGrpc;
import com.mibanco.historialconsultaclientecentralriesgo.es.utils.validator.HistorialConsultaClienteCentralRiesgoValidator;
import io.grpc.Metadata;
import io.grpc.Status;
import io.grpc.StatusException;
import io.grpc.stub.StreamObserver;
import io.quarkus.grpc.GrpcService;
import io.smallrye.common.annotation.Blocking;
import jakarta.inject.Inject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@GrpcService
public class HistorialConsultaClienteCentralRiesgoGrpcController extends ConsultarUrlArchivoMasRecienteXmlGrpcGrpc.ConsultarUrlArchivoMasRecienteXmlGrpcImplBase {

    public static final Logger LOG = LoggerFactory.getLogger(HistorialConsultaClienteCentralRiesgoGrpcController.class);

    @Inject
    HistorialConsultaClienteCentralRiesgoServiceImpl service;

    @Inject
    HistorialConsultaClienteCentralRiesgoMapperGrpc mapper;

    @Inject
    HistorialConsultaClienteCentralRiesgoValidator validator;

    @Override
    @Blocking
    public void consultarUrlArchivoMasRecienteXml(ConsultarUrlArchivoMasRecienteXmlInput request, StreamObserver<ResponseConsultaUrlArchivoMasRecienteXmlOutput> responseObserver){


        LOG.info("Inicia consultarUrlArchivoMasRecienteXml por GRPC");
        try {
            validator.validarConsulta(request);
            String rptService = service.consultarUrlMasReciente(request.getTipoDocumento(),request.getNumeroDocumento(), request.getDigitoVerificacion());

            ResponseConsultaUrlArchivoMasRecienteXmlOutput response = ResponseConsultaUrlArchivoMasRecienteXmlOutput.newBuilder().setUrl(rptService).build();
            LOG.info("Finaliza consultarUrlArchivoMasRecienteXml por GRPC");

            responseObserver.onNext(response);
            responseObserver.onCompleted();

        } catch (ApplicationExceptionValidation e) {

            StatusException statusException = responseExceptionGrpc(Status.INVALID_ARGUMENT, e.getMessage());
            responseObserver.onError(statusException);

        } catch (Exception e) {
            StatusException statusException = responseExceptionGrpc(Status.INTERNAL, e.getMessage());
            responseObserver.onError(statusException);
        }

    }

    private StatusException responseExceptionGrpc(Status statusCode, String exceptionMessage) {

        LOG.error(exceptionMessage + "Exception: " + exceptionMessage);

        Metadata metadata = new Metadata();
        metadata.put(Metadata.Key.of("Error: ", Metadata.ASCII_STRING_MARSHALLER), exceptionMessage);

        return statusCode.asException(metadata);
    }


}
