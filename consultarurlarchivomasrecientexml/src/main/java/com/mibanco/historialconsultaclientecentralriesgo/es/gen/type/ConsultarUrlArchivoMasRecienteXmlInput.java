package com.mibanco.historialconsultaclientecentralriesgo.es.gen.type;

import com.fasterxml.jackson.annotation.JsonTypeName;
import com.mibanco.historialconsultaclientecentralriesgo.es.gen.type.TipoDocumentoEnum;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("consultarUrlArchivoMasRecienteXmlInput")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2023-09-25T09:25:46.946121900-05:00[America/Bogota]")
public class ConsultarUrlArchivoMasRecienteXmlInput   {
  private @Valid TipoDocumentoEnum tipoDocumento;
  private @Valid String numeroDocumento;
  private @Valid String digitoVerificacion;

  /**
   **/
  public ConsultarUrlArchivoMasRecienteXmlInput tipoDocumento(TipoDocumentoEnum tipoDocumento) {
    this.tipoDocumento = tipoDocumento;
    return this;
  }

  
  @JsonProperty("tipoDocumento")
  public TipoDocumentoEnum getTipoDocumento() {
    return tipoDocumento;
  }

  @JsonProperty("tipoDocumento")
  public void setTipoDocumento(TipoDocumentoEnum tipoDocumento) {
    this.tipoDocumento = tipoDocumento;
  }

  /**
   **/
  public ConsultarUrlArchivoMasRecienteXmlInput numeroDocumento(String numeroDocumento) {
    this.numeroDocumento = numeroDocumento;
    return this;
  }

  
  @JsonProperty("numeroDocumento")
  public String getNumeroDocumento() {
    return numeroDocumento;
  }

  @JsonProperty("numeroDocumento")
  public void setNumeroDocumento(String numeroDocumento) {
    this.numeroDocumento = numeroDocumento;
  }

  /**
   **/
  public ConsultarUrlArchivoMasRecienteXmlInput digitoVerificacion(String digitoVerificacion) {
    this.digitoVerificacion = digitoVerificacion;
    return this;
  }

  
  @JsonProperty("digitoVerificacion")
  public String getDigitoVerificacion() {
    return digitoVerificacion;
  }

  @JsonProperty("digitoVerificacion")
  public void setDigitoVerificacion(String digitoVerificacion) {
    this.digitoVerificacion = digitoVerificacion;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsultarUrlArchivoMasRecienteXmlInput consultarUrlArchivoMasRecienteXmlInput = (ConsultarUrlArchivoMasRecienteXmlInput) o;
    return Objects.equals(this.tipoDocumento, consultarUrlArchivoMasRecienteXmlInput.tipoDocumento) &&
        Objects.equals(this.numeroDocumento, consultarUrlArchivoMasRecienteXmlInput.numeroDocumento) &&
        Objects.equals(this.digitoVerificacion, consultarUrlArchivoMasRecienteXmlInput.digitoVerificacion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tipoDocumento, numeroDocumento, digitoVerificacion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsultarUrlArchivoMasRecienteXmlInput {\n");
    
    sb.append("    tipoDocumento: ").append(toIndentedString(tipoDocumento)).append("\n");
    sb.append("    numeroDocumento: ").append(toIndentedString(numeroDocumento)).append("\n");
    sb.append("    digitoVerificacion: ").append(toIndentedString(digitoVerificacion)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

