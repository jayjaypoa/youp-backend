package br.com.youp.app.validate;

import org.json.simple.JSONObject;
import org.springframework.stereotype.Component;

@Component
public class YoupValidate {

	/**
	 * Valida o JSON.
	 * @param dados JSON a ser validado.
	 * @return true Caso não haja erros.
	 * 		   false Caso haja algum erro no layout do JSON. 
	 **/
	private boolean validate(JSONObject dados) {
		if(!dados.containsKey("exemplo"))
			return false;
		if(!dados.containsKey("exemplo2"))
			return false;
		return true;
	}
	
}
