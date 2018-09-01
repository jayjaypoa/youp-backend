package br.com.youp.app.service;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.youp.app.business.YoupBusiness;
import br.com.youp.app.util.Response;

@Service
@RequestMapping("/youp")
public class YoupService {
    
	@Autowired
	private YoupBusiness business;
	
	/**
     * Realiza o processamento de abastecimento do Caixa.
     **/
    @RequestMapping(value = "/processar", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody JSONObject processar() {
    	return business.processar();
    }
    
}
