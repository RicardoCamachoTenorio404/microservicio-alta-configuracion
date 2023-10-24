package com.asp.micrositio.eiyu.service.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asp.micrositio.eiyu.model.Configuration;
import com.eiyu.common.persistence.repository.azul.PbluRepository;
import com.eiyu.common.persistence.repository.azul.UdnRepostory;
import java.util.List;
@Service
public class ParticipantConfigurationServiceImpl implements IParticipantConfigurationService{
    


    private final PbluRepository pbluRepository;
    private final UdnRepostory udnRepostory;

    @Autowired 
    public ParticipantConfigurationServiceImpl (PbluRepository pbluRepository,UdnRepostory udnRepostory){
        this.udnRepostory = udnRepostory;
        this.pbluRepository = pbluRepository;
    }

    @Override
    public List<Configuration> getParticipantConfigurationById(Long idParticipante) {
        // TODO Auto-generated method stub
        return null;
    }


    @Override
    public String patchParticipantConfiguration(Configuration parcicipantConfiguration) {
        // TODO Auto-generated method stub
            return "OK";
    }
}


