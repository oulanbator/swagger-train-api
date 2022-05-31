/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.27).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.Train;
import io.swagger.model.Ville;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-05-31T18:27:48.019Z")

@Validated
@Api(value = "ville", description = "the ville API")
@RequestMapping(value = "/victor.matheron/API-Voyage/1.0")
public interface VilleApi {

    @ApiOperation(value = "ajoute une ville", nickname = "addVille", notes = "Ajoute une ville en BDD ", tags={ "villes", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "item created"),
        @ApiResponse(code = 400, message = "invalid input, object invalid"),
        @ApiResponse(code = 409, message = "an existing item already exists"),
        @ApiResponse(code = 500, message = "internal server error") })
    @RequestMapping(value = "/ville",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<ApiResponseMessage> addVille(@ApiParam(value = "ville à ajouter"  )  @Valid @RequestBody Ville ville);

    @ApiOperation(value = "récupère l'ensemble des villes", nickname = "getVilles", notes = "Récupère l'ensemble des villes ", response = Ville.class, responseContainer = "List", tags={ "villes", })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "la liste des villes", response = Ville.class, responseContainer = "List"),
            @ApiResponse(code = 500, message = "internal server error") })
    @RequestMapping(value = "/villes",
            produces = { "application/json" },
            method = RequestMethod.GET)
    ResponseEntity<List<Ville>> getVilles();

}
