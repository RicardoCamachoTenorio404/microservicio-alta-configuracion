package com.asp.micrositio.eiyu.service.configuration;

import com.asp.micrositio.eiyu.model.Configuration;
import java.util.List;

public interface IParticipantConfigurationService {

    List<Configuration> getParticipantConfigurationById(Long idParticipante); 
    String patchParticipantConfiguration(Configuration parcicipantConfiguration);


}
