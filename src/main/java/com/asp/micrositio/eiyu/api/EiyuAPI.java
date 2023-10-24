package com.asp.micrositio.eiyu.api;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.asp.micrositio.eiyu.entity.ParticipanteEntity;
import com.asp.micrositio.eiyu.entity.TipoParticipanteEntity;
import com.asp.micrositio.eiyu.model.Participante;
import com.asp.micrositio.eiyu.request.PageResponse;
import com.asp.micrositio.eiyu.service.EiyuService;

import lombok.Data;

@RestController
@RequestMapping("/api/v1")
@Data
public class EiyuAPI {

	@Autowired
	private EiyuService service;

	@Autowired
	private ModelMapper modelMapper;

//	@PostMapping("/participantes")
//	private ParticipanteEntity participante(@RequestBody ParticipanteEntity veterinario) {
//		return service.insertParticipante(veterinario);
//	}

	@GetMapping("/participantes/{id}")
	private ParticipanteEntity participante(@PathVariable Long id) {
		return service.getParticipante(id);
	}

	@GetMapping("/participantes")
	private PageResponse<Participante> participante(@RequestParam(name = "page", defaultValue = "1") Integer page,
			@RequestParam(name = "size", defaultValue = "20") Integer size) {
		var pageData = service.getParticipantes(page, size);
		return new PageResponse<>(pageData, this::convertToDTO);
	}

	@GetMapping("/participantes/tipos")
	private List<TipoParticipanteEntity> participanteTipos() {
		return service.getTipoParticipantes();
	}

	public Participante convertToDTO(Object entity) {
		return modelMapper.map(entity, Participante.class);
	}

}
