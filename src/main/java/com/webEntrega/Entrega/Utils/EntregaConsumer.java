package com.webEntrega.Entrega.Utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.webEntrega.Entrega.Repository.EntregaRepository;
import com.webEntrega.Entrega.model.EntregaEntity;

import static com.webEntrega.Entrega.Utils.ActiveMQConfig.ENTREGA_QUEUE;

import javax.jms.Session;


@Component
@Service
public class EntregaConsumer {
	
	@Autowired
	EntregaRepository repository;

    private static Logger log = LoggerFactory.getLogger(EntregaConsumer.class);

    @JmsListener(destination = ENTREGA_QUEUE)
    public void receiveMessage(@Payload EntregaEntity entrega,
                                    @Headers MessageHeaders headers,
                                    Message message,
                                    Session session) {

        log.info("recebeu <" + entrega + ">");
        
        repository.save(entrega);
        
        System.out.println("recebeu:"+entrega);
    }

}
