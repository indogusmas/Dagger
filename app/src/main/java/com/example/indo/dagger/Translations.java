package com.example.indo.dagger;

import com.google.gson.annotations.SerializedName;

public class Translations{

	@SerializedName("de")
	private String de;

	@SerializedName("ja")
	private String ja;

	@SerializedName("it")
	private String it;

	@SerializedName("fr")
	private String fr;

	@SerializedName("es")
	private String es;

	public void setDe(String de){
		this.de = de;
	}

	public String getDe(){
		return de;
	}

	public void setJa(String ja){
		this.ja = ja;
	}

	public String getJa(){
		return ja;
	}

	public void setIt(String it){
		this.it = it;
	}

	public String getIt(){
		return it;
	}

	public void setFr(String fr){
		this.fr = fr;
	}

	public String getFr(){
		return fr;
	}

	public void setEs(String es){
		this.es = es;
	}

	public String getEs(){
		return es;
	}

	@Override
 	public String toString(){
		return 
			"Translations{" + 
			"de = '" + de + '\'' + 
			",ja = '" + ja + '\'' + 
			",it = '" + it + '\'' + 
			",fr = '" + fr + '\'' + 
			",es = '" + es + '\'' + 
			"}";
		}
}