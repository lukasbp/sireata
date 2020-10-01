package br.edu.utfpr.dv.sireata.model;

import javax.persistence.*;

@Entity
@Table(name = "departamentos")
public class Departamento {

	@Id
	@Column(name = "idDepartamento")
	private int idDepartamento;
	@ManyToOne
	@JoinColumn(name = "idcampus", referencedColumnName = "idcampus", foreignKey = @ForeignKey(name = "fk_departamento_campus"), nullable = false)
	private Campus campus;
	@Column(name = "nome")
	private String nome;
	@Column(name = "nomeCompleto")
	private String nomeCompleto;
	@Column(name = "logo")
	private byte[] logo;
	@Column(name = "ativo")
	private boolean ativo;
	@Column(name = "site")
	private String site;
	
	public Departamento(){
		this.setIdDepartamento(0);
		this.setCampus(new Campus());
		this.setNome("");
		this.setNomeCompleto("");
		this.setLogo(null);
		this.setAtivo(true);
		this.setSite("");
	}
	
	public int getIdDepartamento() {
		return idDepartamento;
	}
	public void setIdDepartamento(int idDepartamento) {
		this.idDepartamento = idDepartamento;
	}
	public Campus getCampus() {
		return campus;
	}
	public void setCampus(Campus campus) {
		this.campus = campus;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNomeCompleto(){
		return nomeCompleto;
	}
	public void setNomeCompleto(String nomeCompleto){
		this.nomeCompleto = nomeCompleto;
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
