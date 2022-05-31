package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Gare
 */
@Entity
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-05-31T18:27:48.019Z")
public class Gare   {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id = null;

  @JsonProperty("nom")
  private String nom = null;

  @OneToMany(mappedBy = "gareDepart", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
  @Valid
  private List<Train> trainsDeparts = null;

  @OneToMany(mappedBy = "gareArrivee", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
  @Valid
  private List<Train> trainsArrivees = null;

  @OneToMany(mappedBy = "gare", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
  @JsonProperty("villes")
  @Valid
  private List<Ville> villes = null;

  @OneToMany(mappedBy = "gare", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
  @Valid
  private List<Arret> arrets = null;

  public Gare() {
  }

  public Gare(String nom, List<Ville> villes) {
    this.nom = nom;
    this.villes = villes;
  }


//  /**
//   * Get id
//   * @return id
//  **/
//  @ApiModelProperty(required = true, value = "")
//  @NotNull

//  public Long getId() {
//    return id;
//  }

//  public void setId(Long id) {
//    this.id = id;
//  }
//  public Gare id(Long id) {
//    this.id = id;
//    return this;
//  }


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
//  public Gare nom(String nom) {
//    this.nom = nom;
//    return this;
//  }


  /**
   * Get ville
   * @return ville
  **/
  @ApiModelProperty(value = "")
  @Valid
  public List<Ville> getVilles() {
    return villes;
  }
  public void setVilles(List<Ville> ville) {
    this.villes = ville;
  }
//  public Gare ville(List<Ville> ville) {
//    this.ville = ville;
//    return this;
//  }


  public Gare addVilleItem(Ville villeItem) {
    if (this.villes == null) {
      this.villes = new ArrayList<Ville>();
    }
    this.villes.add(villeItem);
    return this;
  }

  public Gare addArretItem(Arret arretItem) {
    if (this.arrets == null) {
      this.arrets = new ArrayList<Arret>();
    }
    this.arrets.add(arretItem);
    return this;
  }

  public Gare addTrainDepartItem(Train trainItem) {
    if (this.trainsDeparts == null) {
      this.trainsDeparts = new ArrayList<Train>();
    }
    this.trainsDeparts.add(trainItem);
    return this;
  }

  public Gare addTrainArriveeItem(Train trainItem) {
    if (this.trainsArrivees == null) {
      this.trainsArrivees = new ArrayList<Train>();
    }
    this.trainsArrivees.add(trainItem);
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
    Gare gare = (Gare) o;
    return Objects.equals(this.id, gare.id) &&
        Objects.equals(this.nom, gare.nom) &&
        Objects.equals(this.villes, gare.villes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, nom, villes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Gare {\n");
    sb.append("    nom: ").append(toIndentedString(nom)).append("\n");
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

