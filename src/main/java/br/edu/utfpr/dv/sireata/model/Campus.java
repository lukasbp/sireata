package br.edu.utfpr.dv.sireata.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "campus")
public class Campus {

	@Id
	@Column(name = "idacampus")
	private int idCampus;
	@Column(name = "nome")
	private String nome;
	@Column(name = "endereco")
	private String endereco;
	@Column(name = "logo")
	private byte[] logo;
	@Column(name = "ativo")
	private boolean ativo;
	@Column(name = "site")
	private String site;
	
	public Campus(){
		this.setIdCampus(0);
		this.setNome("");
		this.setEndereco("");
		this.setLogo(null);
		this.setAtivo(true);
		this.setSite("");
	}
	
	public int getIdCampus() {
		return idCampus;
	}
	public void setIdCampus(int idCampus) {
		this.idCampus = idCampus;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public byte[] getLogo() {
		return logo;
	}
	public void setLogo(byte[] logo) {
		this.logo = logo;
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	public String getSite(){
		return site;
	}
	public void setSite(String site){
		this.site = site;
	}
	
	public String toString(){
		return this.getNome();
	}

}
