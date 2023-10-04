package com.mibanco.historialconsultaclientecentralriesgo.es.grpc;

import com.mibanco.historialconsultaclientecentralriesgo.es.ConsultarUrlArchivoMasRecienteXmlGrpc;
import com.mibanco.historialconsultaclientecentralriesgo.es.ConsultarUrlArchivoMasRecienteXmlInput;
import io.quarkus.grpc.GrpcClient;
import io.quarkus.test.junit.QuarkusTest;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import static org.junit.jupiter.api.Assertions.assertThrows;


@QuarkusTest
public class HistorialConsultaCLienteCentralRIesgoGrpcControllerTest {

    @GrpcClient
    ConsultarUrlArchivoMasRecienteXmlGrpc client;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void HistorialConsultaTest() throws ExecutionException, InterruptedException, TimeoutException {

        CompletableFuture<String> message = new CompletableFuture<>();

        ConsultarUrlArchivoMasRecienteXmlInput dataRequest = ConsultarUrlArchivoMasRecienteXmlInput.newBuilder()
                .setDigitoVerificacion("1")
                .setNumeroDocumento("10002")
                .setTipoDocumento("CC").build();

        client.consultarUrlArchivoMasRecienteXml(dataRequest)
                .subscribe()
                .with(reply -> message.complete(reply.getUrl()));

        Assertions.assertThat(message.get(5, TimeUnit.SECONDS)).isEqualTo("url1");

    }

    @Test
    public void HistorialConsultaCatchTest()  {

        CompletableFuture<String> message = new CompletableFuture<>();

        assertThrows(TimeoutException.class, () -> {
            ConsultarUrlArchivoMasRecienteXmlInput dataRequest = ConsultarUrlArchivoMasRecienteXmlInput.newBuilder()
                    .setDigitoVerificacion("9999")
                    .setNumeroDocumento("10002")
                    .setTipoDocumento("CC").build();

            client.consultarUrlArchivoMasRecienteXml(dataRequest)
                    .subscribe()
                    .with(reply -> message.complete(reply.getUrl()));

            message.get(5, TimeUnit.SECONDS);
        });
    }

}
