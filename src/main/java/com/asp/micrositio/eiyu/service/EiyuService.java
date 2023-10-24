package com.asp.micrositio.eiyu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.asp.micrositio.eiyu.entity.ParticipanteEntity;
import com.asp.micrositio.eiyu.entity.TipoParticipanteEntity;
import com.asp.micrositio.eiyu.exception.ResourceNotFoundException;
import com.asp.micrositio.eiyu.repository.ParticipantesRepository;
import com.asp.micrositio.eiyu.repository.TipoParticipanteRepository;

@Service
public class EiyuService {

	@Autowired
	private ParticipantesRepository participantesRepository;

	@Autowired
	private TipoParticipanteRepository tipoParticipantesRepository;

	public ParticipanteEntity insertParticipante(ParticipanteEntity doctor) {
		return participantesRepository.save(doctor);
	}

	public ParticipanteEntity getParticipante(Long id) {
		return participantesRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException(id));
	}

	public Page<ParticipanteEntity> getParticipantes(int page, int size) {
		Pageable pageable = PageRequest.of(Math.max(page - 1, 0), Math.max(size, 1));
		return participantesRepository.findAll(pageable);
	}

	public List<TipoParticipanteEntity> getTipoParticipantes() {
		return tipoParticipantesRepository.findAll();
	}

}
