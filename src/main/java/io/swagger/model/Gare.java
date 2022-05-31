package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Ville;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Gare
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-05-31T18:27:48.019Z")


public class Gare   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("nom")
  private String nom = null;

  @JsonProperty("ville")
  @Valid
  private List<Ville> ville = null;

  public Gare id(Long id) {
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

  public Gare nom(String nom) {
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

  public Gare ville(List<Ville> ville) {
    this.ville = ville;
    return this;
  }

  public Gare addVilleItem(Ville villeItem) {
    if (this.ville == null) {
      this.ville = new ArrayList<Ville>();
    }
    this.ville.add(villeItem);
    return this;
  }

  /**
   * Get ville
   * @return ville
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Ville> getVille() {
    return ville;
  }

  public void setVille(List<Ville> ville) {
    this.ville = ville;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Gare gare = (Gare) o;
    return Objects.equals(this.id, gare.id) &&
        Objects.equals(this.nom, gare.nom) &&
        Objects.equals(this.ville, gare.ville);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, nom, ville);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Gare {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nom: ").append(toIndentedString(nom)).append("\n");
    sb.append("    ville: ").append(toIndentedString(ville)).append("\n");
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

