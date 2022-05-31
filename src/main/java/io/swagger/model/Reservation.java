package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Client;
import io.swagger.model.Compagnie;
import io.swagger.model.Passager;
import io.swagger.model.Train;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Reservation
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-05-31T18:27:48.019Z")


public class Reservation   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("confirme")
  private Boolean confirme = null;

  @JsonProperty("annule")
  private Boolean annule = null;

  @JsonProperty("trains")
  private Train trains = null;

  @JsonProperty("passager")
  private Passager passager = null;

  @JsonProperty("client")
  private Client client = null;

  @JsonProperty("compagnie")
  private Compagnie compagnie = null;

  public Reservation id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Reservation confirme(Boolean confirme) {
    this.confirme = confirme;
    return this;
  }

  /**
   * Get confirme
   * @return confirme
  **/
  @ApiModelProperty(value = "")


  public Boolean isConfirme() {
    return confirme;
  }

  public void setConfirme(Boolean confirme) {
    this.confirme = confirme;
  }

  public Reservation annule(Boolean annule) {
    this.annule = annule;
    return this;
  }

  /**
   * Get annule
   * @return annule
  **/
  @ApiModelProperty(value = "")


  public Boolean isAnnule() {
    return annule;
  }

  public void setAnnule(Boolean annule) {
    this.annule = annule;
  }

  public Reservation trains(Train trains) {
    this.trains = trains;
    return this;
  }

  /**
   * Get trains
   * @return trains
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Train getTrains() {
    return trains;
  }

  public void setTrains(Train trains) {
    this.trains = trains;
  }

  public Reservation passager(Passager passager) {
    this.passager = passager;
    return this;
  }

  /**
   * Get passager
   * @return passager
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Passager getPassager() {
    return passager;
  }

  public void setPassager(Passager passager) {
    this.passager = passager;
  }

  public Reservation client(Client client) {
    this.client = client;
    return this;
  }

  /**
   * Get client
   * @return client
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Client getClient() {
    return client;
  }

  public void setClient(Client client) {
    this.client = client;
  }

  public Reservation compagnie(Compagnie compagnie) {
    this.compagnie = compagnie;
    return this;
  }

  /**
   * Get compagnie
   * @return compagnie
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Compagnie getCompagnie() {
    return compagnie;
  }

  public void setCompagnie(Compagnie compagnie) {
    this.compagnie = compagnie;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Reservation reservation = (Reservation) o;
    return Objects.equals(this.id, reservation.id) &&
        Objects.equals(this.confirme, reservation.confirme) &&
        Objects.equals(this.annule, reservation.annule) &&
        Objects.equals(this.trains, reservation.trains) &&
        Objects.equals(this.passager, reservation.passager) &&
        Objects.equals(this.client, reservation.client) &&
        Objects.equals(this.compagnie, reservation.compagnie);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, confirme, annule, trains, passager, client, compagnie);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Reservation {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    confirme: ").append(toIndentedString(confirme)).append("\n");
    sb.append("    annule: ").append(toIndentedString(annule)).append("\n");
    sb.append("    trains: ").append(toIndentedString(trains)).append("\n");
    sb.append("    passager: ").append(toIndentedString(passager)).append("\n");
    sb.append("    client: ").append(toIndentedString(client)).append("\n");
    sb.append("    compagnie: ").append(toIndentedString(compagnie)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

