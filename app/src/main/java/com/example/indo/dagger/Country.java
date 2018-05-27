package com.example.indo.dagger;

import java.util.List;
import com.google.gson.annotations.SerializedName;


public class Country{

	@SerializedName("area")
	private int area;

	@SerializedName("nativeName")
	private String nativeName;

	@SerializedName("capital")
	private String capital;

	@SerializedName("demonym")
	private String demonym;

	@SerializedName("alpha2Code")
	private String alpha2Code;

	@SerializedName("languages")
	private List<String> languages;

	@SerializedName("borders")
	private List<String> borders;

	@SerializedName("subregion")
	private String subregion;

	@SerializedName("callingCodes")
	private List<String> callingCodes;

	@SerializedName("gini")
	private double gini;

	@SerializedName("relevance")
	private String relevance;

	@SerializedName("population")
	private int population;

	@SerializedName("numericCode")
	private String numericCode;

	@SerializedName("alpha3Code")
	private String alpha3Code;

	@SerializedName("topLevelDomain")
	private List<String> topLevelDomain;

	@SerializedName("timezones")
	private List<String> timezones;

	@SerializedName("translations")
	private Translations translations;

	@SerializedName("name")
	private String name;

	@SerializedName("altSpellings")
	private List<String> altSpellings;

	@SerializedName("region")
	private String region;

	@SerializedName("latlng")
	private List<Integer> latlng;

	@SerializedName("currencies")
	private List<String> currencies;

	public void setArea(int area){
		this.area = area;
	}

	public int getArea(){
		return area;
	}

	public void setNativeName(String nativeName){
		this.nativeName = nativeName;
	}

	public String getNativeName(){
		return nativeName;
	}

	public void setCapital(String capital){
		this.capital = capital;
	}

	public String getCapital(){
		return capital;
	}

	public void setDemonym(String demonym){
		this.demonym = demonym;
	}

	public String getDemonym(){
		return demonym;
	}

	public void setAlpha2Code(String alpha2Code){
		this.alpha2Code = alpha2Code;
	}

	public String getAlpha2Code(){
		return alpha2Code;
	}

	public void setLanguages(List<String> languages){
		this.languages = languages;
	}

	public List<String> getLanguages(){
		return languages;
	}

	public void setBorders(List<String> borders){
		this.borders = borders;
	}

	public List<String> getBorders(){
		return borders;
	}

	public void setSubregion(String subregion){
		this.subregion = subregion;
	}

	public String getSubregion(){
		return subregion;
	}

	public void setCallingCodes(List<String> callingCodes){
		this.callingCodes = callingCodes;
	}

	public List<String> getCallingCodes(){
		return callingCodes;
	}

	public void setGini(double gini){
		this.gini = gini;
	}

	public double getGini(){
		return gini;
	}

	public void setRelevance(String relevance){
		this.relevance = relevance;
	}

	public String getRelevance(){
		return relevance;
	}

	public void setPopulation(int population){
		this.population = population;
	}

	public int getPopulation(){
		return population;
	}

	public void setNumericCode(String numericCode){
		this.numericCode = numericCode;
	}

	public String getNumericCode(){
		return numericCode;
	}

	public void setAlpha3Code(String alpha3Code){
		this.alpha3Code = alpha3Code;
	}

	public String getAlpha3Code(){
		return alpha3Code;
	}

	public void setTopLevelDomain(List<String> topLevelDomain){
		this.topLevelDomain = topLevelDomain;
	}

	public List<String> getTopLevelDomain(){
		return topLevelDomain;
	}

	public void setTimezones(List<String> timezones){
		this.timezones = timezones;
	}

	public List<String> getTimezones(){
		return timezones;
	}

	public void setTranslations(Translations translations){
		this.translations = translations;
	}

	public Translations getTranslations(){
		return translations;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setAltSpellings(List<String> altSpellings){
		this.altSpellings = altSpellings;
	}

	public List<String> getAltSpellings(){
		return altSpellings;
	}

	public void setRegion(String region){
		this.region = region;
	}

	public String getRegion(){
		return region;
	}

	public void setLatlng(List<Integer> latlng){
		this.latlng = latlng;
	}

	public List<Integer> getLatlng(){
		return latlng;
	}

	public void setCurrencies(List<String> currencies){
		this.currencies = currencies;
	}

	public List<String> getCurrencies(){
		return currencies;
	}

	@Override
 	public String toString(){
		return 
			"Country{" + 
			"area = '" + area + '\'' + 
			",nativeName = '" + nativeName + '\'' + 
			",capital = '" + capital + '\'' + 
			",demonym = '" + demonym + '\'' + 
			",alpha2Code = '" + alpha2Code + '\'' + 
			",languages = '" + languages + '\'' + 
			",borders = '" + borders + '\'' + 
			",subregion = '" + subregion + '\'' + 
			",callingCodes = '" + callingCodes + '\'' + 
			",gini = '" + gini + '\'' + 
			",relevance = '" + relevance + '\'' + 
			",population = '" + population + '\'' + 
			",numericCode = '" + numericCode + '\'' + 
			",alpha3Code = '" + alpha3Code + '\'' + 
			",topLevelDomain = '" + topLevelDomain + '\'' + 
			",timezones = '" + timezones + '\'' + 
			",translations = '" + translations + '\'' + 
			",name = '" + name + '\'' + 
			",altSpellings = '" + altSpellings + '\'' + 
			",region = '" + region + '\'' + 
			",latlng = '" + latlng + '\'' + 
			",currencies = '" + currencies + '\'' + 
			"}";
		}
}