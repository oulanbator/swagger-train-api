package io.swagger.repository;

import io.swagger.model.Ville;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface VilleRepository extends JpaRepository<Ville, Long> {
    Optional<Ville> findById(Long id);
    Optional<Ville> findByNom(String nom);
}
