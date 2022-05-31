package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Gare;
import io.swagger.model.Train;
import org.springframework.validation.annotation.Validated;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Arret
 */
@Entity
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-05-31T18:27:48.019Z")
public class Arret   {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id = null;

  @JsonProperty("heureDepart")
  private Integer heureDepart = null;

  @JsonProperty("heureArrivee")
  private Integer heureArrivee = null;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "train_id")
  @JsonProperty("train")
  private Train train = null;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "gare_id")
  @JsonProperty("gare")
  private Gare gare = null;

  public Arret() {
  }

  public Arret(Integer heureDepart, Integer heureArrivee, Train train, Gare gare) {
    this.heureDepart = heureDepart;
    this.heureArrivee = heureArrivee;
    this.train = train;
    this.gare = gare;
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
//  public Arret id(Long id) {
//    this.id = id;
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
//  public Arret heureDepart(Integer heureDepart) {
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
//  public Arret heureArrivee(Integer heureArrivee) {
//    this.heureArrivee = heureArrivee;
//    return this;
//  }


  /**
   * Get train
   * @return train
  **/
  @ApiModelProperty(value = "")
  @Valid
  public Train getTrain() {
    return train;
  }
  public void setTrain(Train train) {
    this.train = train;
  }
//  public Arret train(Train train) {
//    this.train = train;
//    return this;
//  }


  /**
   * Get gare
   * @return gare
  **/
  @ApiModelProperty(value = "")
  @Valid
  public Gare getGare() {
    return gare;
  }
  public void setGare(Gare gare) {
    this.gare = gare;
  }
//  public Arret gare(Gare gare) {
//    this.gare = gare;
//    return this;
//  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Arret arret = (Arret) o;
    return Objects.equals(this.id, arret.id) &&
        Objects.equals(this.heureDepart, arret.heureDepart) &&
        Objects.equals(this.heureArrivee, arret.heureArrivee) &&
        Objects.equals(this.train, arret.train) &&
        Objects.equals(this.gare, arret.gare);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, heureDepart, heureArrivee, train, gare);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Arret {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    heureDepart: ").append(toIndentedString(heureDepart)).append("\n");
    sb.append("    heureArrivee: ").append(toIndentedString(heureArrivee)).append("\n");
    sb.append("    train: ").append(toIndentedString(train)).append("\n");
    sb.append("    gare: ").append(toIndentedString(gare)).append("\n");
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

