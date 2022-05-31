package io.swagger.api;

import com.fasterxml.jackson.core.JsonParser;
import io.swagger.model.Train;
import io.swagger.model.Ville;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import io.swagger.repository.VilleRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-05-31T18:27:48.019Z")

@Controller
public class VilleApiController implements VilleApi {

    private static final Logger log = LoggerFactory.getLogger(VilleApiController.class);
    private final ObjectMapper objectMapper;
    private final HttpServletRequest request;
    private final VilleRepository villeRepository;

    @Autowired
    public VilleApiController(ObjectMapper objectMapper, HttpServletRequest request, VilleRepository villeRepository) {
        this.objectMapper = objectMapper;
        this.request = request;
        this.villeRepository = villeRepository;
    }

    public ResponseEntity<ApiResponseMessage> addVille(@ApiParam(value = "ville à ajouter"  )  @Valid @RequestBody Ville ville) {
        String accept = request.getHeader("Accept");
        try {
            log.info("Nom : " + ville.getNom());
            Optional<Ville> found = villeRepository.findByNom(ville.getNom());
            if(found.isPresent()) {
                log.info("Ville trouvée");
                return new ResponseEntity<ApiResponseMessage>(new ApiResponseMessage(1, ""), HttpStatus.CONFLICT);
            }

            villeRepository.save(ville);
            return new ResponseEntity<ApiResponseMessage>(new ApiResponseMessage(), HttpStatus.OK);

        } catch (Exception e) {
            return new ResponseEntity<ApiResponseMessage>(new ApiResponseMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    public ResponseEntity<List<Ville>> getVilles() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                List<Ville> villes = new ArrayList<>();
                villeRepository.findAll().forEach(ville -> {
                    villes.add(ville);
                });
                return new ResponseEntity<List<Ville>>(villes, HttpStatus.OK);
            } catch (Exception e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Ville>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Ville>>(HttpStatus.BAD_REQUEST);
    }

}
