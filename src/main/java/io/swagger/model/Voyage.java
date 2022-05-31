package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Arret;
import io.swagger.model.Passager;
import io.swagger.model.Reservation;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Voyage
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-05-31T18:27:48.019Z")


public class Voyage   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("passager")
  private Passager passager = null;

  @JsonProperty("reservation")
  private Reservation reservation = null;

  @JsonProperty("arret")
  @Valid
  private List<Arret> arret = null;

  public Voyage id(Long id) {
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

  public Voyage passager(Passager passager) {
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

  public Voyage reservation(Reservation reservation) {
    this.reservation = reservation;
    return this;
  }

  /**
   * Get reservation
   * @return reservation
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Reservation getReservation() {
    return reservation;
  }

  public void setReservation(Reservation reservation) {
    this.reservation = reservation;
  }

  public Voyage arret(List<Arret> arret) {
    this.arret = arret;
    return this;
  }

  public Voyage addArretItem(Arret arretItem) {
    if (this.arret == null) {
      this.arret = new ArrayList<Arret>();
    }
    this.arret.add(arretItem);
    return this;
  }

  /**
   * Get arret
   * @return arret
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Arret> getArret() {
    return arret;
  }

  public void setArret(List<Arret> arret) {
    this.arret = arret;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Voyage voyage = (Voyage) o;
    return Objects.equals(this.id, voyage.id) &&
        Objects.equals(this.passager, voyage.passager) &&
        Objects.equals(this.reservation, voyage.reservation) &&
        Objects.equals(this.arret, voyage.arret);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, passager, reservation, arret);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Voyage {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    passager: ").append(toIndentedString(passager)).append("\n");
    sb.append("    reservation: ").append(toIndentedString(reservation)).append("\n");
    sb.append("    arret: ").append(toIndentedString(arret)).append("\n");
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

