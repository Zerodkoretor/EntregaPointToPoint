package com.webEntrega.Entrega.Service;



 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webEntrega.Entrega.Utils.EntregaSender;
import com.webEntrega.Entrega.model.EntregaEntity;
import com.webEntrega.Entrega.Exception.RecordNotFoundException;



@Service
public class EntregaService {
	
	  @Autowired
	  private EntregaSender entregaSender;


	public EntregaEntity createOrUpdateEntrega (EntregaEntity entrega) throws RecordNotFoundException{

			entregaSender.sendQueue(entrega);
			return entrega;
		
	}
	
}
