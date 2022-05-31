package io.swagger.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Gare;
import org.springframework.validation.annotation.Validated;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Train
 */
@Entity
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-05-31T18:27:48.019Z")
public class Train   {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id = null;

  @JsonProperty("numero")
  private Integer numero = null;

  @JsonProperty("heureDepart")
  private Integer heureDepart = null;

  @JsonProperty("heureArrivee")
  private Integer heureArrivee = null;

  @JsonProperty("dateDepart")
  private String dateDepart = null;

  @JsonProperty("dateArrivee")
  private String dateArrivee = null;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "gare_depart_id")
  @JsonProperty("gareDepart")
  private Gare gareDepart = null;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "gare_arrivee_id")
  @JsonProperty("gareArrivee")
  private Gare gareArrivee = null;

  @OneToMany(mappedBy = "train", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
  private List<Reservation> reservations;

  @OneToMany(mappedBy = "train", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
  private List<Arret> arrets;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "compagnie_id")
  private Compagnie compagnie;

  public Train() {
  }

  public Train(Integer numero, Integer heureDepart, Integer heureArrivee, String dateDepart, String dateArrivee, Gare gareDepart, Gare gareArrivee) {
    this.numero = numero;
    this.heureDepart = heureDepart;
    this.heureArrivee = heureArrivee;
    this.dateDepart = dateDepart;
    this.dateArrivee = dateArrivee;
    this.gareDepart = gareDepart;
    this.gareArrivee = gareArrivee;
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
//  public Train id(Long id) {
//    this.id = id;
//    return this;
//  }


  /**
   * Get numero
   * @return numero
  **/
  @ApiModelProperty(value = "")
  public Integer getNumero() {
    return numero;
  }
  public void setNumero(Integer numero) {
    this.numero = numero;
  }
//  public Train numero(Integer numero) {
//    this.numero = numero;
//    return this;
//  }


  /**
   * Get heureDepart
   * @return heureDepart
  **/
  @ApiModelProperty(value = "")
  public Integer getHeureDepart() {
    return heureDepart;
  }
  public void setHeureDepart(Integer heureDepart) {
    this.heureDepart = heureDepart;
  }
//  public Train heureDepart(Integer heureDepart) {
//    this.heureDepart = heureDepart;
//    return this;
//  }


  /**
   * Get heureArrivee
   * @return heureArrivee
  **/
  @ApiModelProperty(value = "")
  public Integer getHeureArrivee() {
    return heureArrivee;
  }
  public void setHeureArrivee(Integer heureArrivee) {
    this.heureArrivee = heureArrivee;
  }
//  public Train heureArrivee(Integer heureArrivee) {
//    this.heureArrivee = heureArrivee;
//    return this;
//  }


  /**
   * Get dateDepart
   * @return dateDepart
  **/
  @ApiModelProperty(value = "")
  public String getDateDepart() {
    return dateDepart;
  }
  public void setDateDepart(String dateDepart) {
    this.dateDepart = dateDepart;
  }
//  public Train dateDepart(Integer dateDepart) {
//    this.dateDepart = dateDepart;
//    return this;
//  }


  /**
   * Get dateArrivee
   * @return dateArrivee
  **/
  @ApiModelProperty(value = "")
  public String getDateArrivee() {
    return dateArrivee;
  }
  public void setDateArrivee(String dateArrivee) {
    this.dateArrivee = dateArrivee;
  }
//  public Train dateArrivee(Integer dateArrivee) {
//    this.dateArrivee = dateArrivee;
//    return this;
//  }


  /**
   * Get gareDepart
   * @return gareDepart
  **/
  @ApiModelProperty(value = "")
  @Valid
  public Gare getGareDepart() {
    return gareDepart;
  }
  public void setGareDepart(Gare gareDepart) {
    this.gareDepart = gareDepart;
  }
//  public Train gareDepart(Gare gareDepart) {
//    this.gareDepart = gareDepart;
//    return this;
//  }


  /**
   * Get gareArrivee
   * @return gareArrivee
  **/
  @ApiModelProperty(value = "")
  @Valid
  public Gare getGareArrivee() {
    return gareArrivee;
  }
  public void setGareArrivee(Gare gareArrivee) {
    this.gareArrivee = gareArrivee;
  }
//  public Train gareArrivee(Gare gareArrivee) {
//    this.gareArrivee = gareArrivee;
//    return this;
//  }


  public Train addReservationItem(Reservation reservationItem) {
    if (this.reservations == null) {
      this.reservations = new ArrayList<Reservation>();
    }
    this.reservations.add(reservationItem);
    return this;
  }

  public Train addArretItem(Arret arretItem) {
    if (this.arrets == null) {
      this.arrets = new ArrayList<Arret>();
    }
    this.arrets.add(arretItem);
    return this;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Train train = (Train) o;
    return Objects.equals(this.id, train.id) &&
        Objects.equals(this.numero, train.numero) &&
        Objects.equals(this.heureDepart, train.heureDepart) &&
        Objects.equals(this.heureArrivee, train.heureArrivee) &&
        Objects.equals(this.dateDepart, train.dateDepart) &&
        Objects.equals(this.dateArrivee, train.dateArrivee) &&
        Objects.equals(this.gareDepart, train.gareDepart) &&
        Objects.equals(this.gareArrivee, train.gareArrivee);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, numero, heureDepart, heureArrivee, dateDepart, dateArrivee, gareDepart, gareArrivee);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Train {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    numero: ").append(toIndentedString(numero)).append("\n");
    sb.append("    heureDepart: ").append(toIndentedString(heureDepart)).append("\n");
    sb.append("    heureArrivee: ").append(toIndentedString(heureArrivee)).append("\n");
    sb.append("    dateDepart: ").append(toIndentedString(dateDepart)).append("\n");
    sb.append("    dateArrivee: ").append(toIndentedString(dateArrivee)).append("\n");
    sb.append("    gareDepart: ").append(toIndentedString(gareDepart)).append("\n");
    sb.append("    gareArrivee: ").append(toIndentedString(gareArrivee)).append("\n");
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

