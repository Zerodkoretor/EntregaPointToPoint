package com.webEntrega.Entrega.Controller;




import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webEntrega.Entrega.Exception.RecordNotFoundException;
import com.webEntrega.Entrega.Service.EntregaService;
import com.webEntrega.Entrega.model.EntregaEntity;


@RestController
@RequestMapping("/entrega")
public class EntregaController {
	
	@Autowired
	EntregaService service;
	
	
	@PostMapping
	public ResponseEntity<EntregaEntity> createOrUpdateEntrega(@Valid @RequestBody EntregaEntity entrega) throws RecordNotFoundException{
		EntregaEntity atualizado = service.createOrUpdateEntrega(entrega);
		return new ResponseEntity<EntregaEntity>(atualizado, new HttpHeaders(), HttpStatus.FORBIDDEN);
				
	}
	
}
