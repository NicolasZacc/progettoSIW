package it.uniroma3.spring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Quadro {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@NotNull
	@Size(min=1)
	private String titolo;
	@NotNull
	@Max(2017)
	private Integer annoRealizzazione;
	@NotNull
	@Size(min=1)
	private String tecnica;
	@NotNull
	@Min(0)
	private Double lunghezza;
	@NotNull
	@Min(0)
	private Double altezza;
	@ManyToOne
	private Autore autore;
	
	protected Quadro(){
	}
	
	public Quadro(String titolo, Integer annoRealizzazione, String tecnica, Double lunghezza, Double altezza){
		this.titolo = titolo;
		this.annoRealizzazione = annoRealizzazione;
		this.tecnica = tecnica;
		this.lunghezza = lunghezza;
		this.altezza = altezza;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = (titolo.substring(0,1).toUpperCase() + titolo.substring(1).toLowerCase());;
	}
	public Integer getAnnoRealizzazione() {
		return annoRealizzazione;
	}
	public void setAnnoRealizzazione(Integer anno) {
		this.annoRealizzazione = anno;
	}
	public String getTecnica() {
		return tecnica;
	}
	public void setTecnica(String tecnica) {
		this.tecnica = (tecnica.substring(0,1).toUpperCase() + tecnica.substring(1).toLowerCase());;
	}
	public Double getLunghezza() {
		return lunghezza;
	}
	public void setLunghezza(Double lunghezza) {
		this.lunghezza = lunghezza;
	}
	public Double getAltezza() {
		return altezza;
	}
	public void setAltezza(Double altezza) {
		this.altezza = altezza;
	}
	public Autore getAutore() {
		return autore;
	}
	public void setAutore(Autore autore) {
		this.autore = autore;
	}
}