package com.Salomon.Dagher.service;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Salomon.Dagher.Compra;
@Service
public class CompraService {
	
	@Autowired
	private KieContainer kieContainer;
	
	public Compra Descuento(Compra compra) {
		
		 KieSession kieSession = kieContainer.newKieSession("ksession-rules");
	     kieSession.insert(compra);
	     kieSession.fireAllRules();
	     kieSession.dispose();
	     return compra;
		
	}
	
}
