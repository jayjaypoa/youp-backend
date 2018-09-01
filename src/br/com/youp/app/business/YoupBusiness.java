package br.com.youp.app.business;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.annotation.PostConstruct;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.youp.app.constants.Constant;
import br.com.youp.app.util.Response;
import br.com.youp.app.validate.YoupValidate;


@Component
public class YoupBusiness {

	// private Caixa caixa;
	
	@Autowired 
	private Response youpResponse;
	
	@Autowired
	private YoupValidate youpValidate;
	
	/*
	@PostConstruct
    public void init() {
		this.caixa = new Caixa();
    }
	*/

	/**
	 * Realiza o processamento.
	 * @return JSONObject retorna indicando status do processamento.
	 **/
	public JSONObject processar() {
		
		JSONObject objResponse = new JSONObject();
		
		try {
			
			JSONObject obj = new JSONObject();
			obj.put("dados", "ola mundo");
			objResponse = youpResponse.retornarSucesso(obj);
			
		} catch(Exception e) {
			e.printStackTrace();
			return youpResponse.retornarErroInterno(e.getMessage());
		}
			
		return objResponse;
	}
	
}
