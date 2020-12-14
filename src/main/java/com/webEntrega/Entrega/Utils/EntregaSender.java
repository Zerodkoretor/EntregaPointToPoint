package com.webEntrega.Entrega.Utils;


import static com.webEntrega.Entrega.Utils.ActiveMQConfig.ENTREGA_QUEUE;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;
import com.webEntrega.Entrega.model.EntregaEntity;


@Service
public class EntregaSender {
	
	 private static Logger log = LoggerFactory.getLogger(EntregaSender.class);

	    @Autowired
	    private JmsTemplate jmsTemplate;

	    public void sendQueue(EntregaEntity order) {
	        log.info("sending with convertAndSend() to queue <" + order + ">");
	        jmsTemplate.convertAndSend(ENTREGA_QUEUE, order);
	    }
}
