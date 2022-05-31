package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Compagnie
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-05-31T18:27:48.019Z")


public class Compagnie   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("nom")
  private String nom = null;

  @JsonProperty("annule")
  private Boolean annule = null;

  public Compagnie id(Long id) {
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

  public Compagnie nom(String nom) {
    this.nom = nom;
    return this;
  }

  /**
   * Get nom
   * @return nom
  **/
  @ApiModelProperty(value = "")


  public String getNom() {
    return nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

  public Compagnie annule(Boolean annule) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Compagnie compagnie = (Compagnie) o;
    return Objects.equals(this.id, compagnie.id) &&
        Objects.equals(this.nom, compagnie.nom) &&
        Objects.equals(this.annule, compagnie.annule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, nom, annule);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Compagnie {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nom: ").append(toIndentedString(nom)).append("\n");
    sb.append("    annule: ").append(toIndentedString(annule)).append("\n");
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

