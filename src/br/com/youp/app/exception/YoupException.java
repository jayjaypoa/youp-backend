package br.com.youp.app.exception;

public class YoupException extends Exception {

	private static final long serialVersionUID = 1L;

	public YoupException(String msg, boolean fatal) {
		super(msg);		
		// Aborta caso seja um erro fatal
		if(fatal){
			System.exit(1);
		}
    }
	
}
