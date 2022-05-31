package io.swagger.service;

import io.swagger.model.Ville;
import io.swagger.repository.VilleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class VilleService {
    private final VilleRepository villeRepository;

    @Autowired
    public VilleService(VilleRepository villeRepository) {
        this.villeRepository = villeRepository;
    }

    @Transactional
    public Ville addVille(Ville ville) {
        return this.villeRepository.save(ville);
    }
}
