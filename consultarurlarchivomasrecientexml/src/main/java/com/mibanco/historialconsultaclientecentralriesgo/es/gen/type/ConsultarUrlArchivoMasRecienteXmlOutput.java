package com.mibanco.historialconsultaclientecentralriesgo.es.gen.type;

import com.fasterxml.jackson.annotation.JsonTypeName;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("consultarUrlArchivoMasRecienteXmlOutput")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2023-09-25T09:25:46.946121900-05:00[America/Bogota]")
public class ConsultarUrlArchivoMasRecienteXmlOutput   {
  private @Valid String url;

  /**
   **/
  public ConsultarUrlArchivoMasRecienteXmlOutput url(String url) {
    this.url = url;
    return this;
  }

  
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }

  @JsonProperty("url")
  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsultarUrlArchivoMasRecienteXmlOutput consultarUrlArchivoMasRecienteXmlOutput = (ConsultarUrlArchivoMasRecienteXmlOutput) o;
    return Objects.equals(this.url, consultarUrlArchivoMasRecienteXmlOutput.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsultarUrlArchivoMasRecienteXmlOutput {\n");
    
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

