package com.asp.micrositio.eiyu.controller;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.asp.micrositio.eiyu.model.Configuration;
import com.asp.micrositio.eiyu.service.configuration.IParticipantConfigurationService;

import jakarta.websocket.server.PathParam;



@RestController
@RequestMapping("/api/v1")
public class ParticipantConfigurationController {
    

    private final  IParticipantConfigurationService configurationService;

    public ParticipantConfigurationController(IParticipantConfigurationService configurationService){

        this.configurationService = configurationService; 

    }
    


    @GetMapping(path = "/configuration/{idParcicipant}" ,produces =  MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody 
    List<Configuration> getConfigurationsByParticipant(@PathVariable Long idParcicipant){
        return configurationService.getParticipantConfigurationById(idParcicipant);
    }  
    
    
    @PatchMapping(path = "/configuration/{idParcicipant}",consumes =  MediaType.APPLICATION_JSON_VALUE,produces =  MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody 
    String  patchParticipantConfiguration( @PathVariable Long idParcicipant, @RequestBody Configuration configuration){
            return configurationService.patchParticipantConfiguration(configuration);
    }    


}
