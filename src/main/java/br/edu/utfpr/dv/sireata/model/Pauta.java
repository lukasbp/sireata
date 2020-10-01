package br.edu.utfpr.dv.sireata.model;

import javax.persistence.*;

@Entity
@Table(name = "pauta")
public class Pauta {

	@Id
	@Column(name = "idpauta")
	private int idPauta;
	@ManyToOne
	@JoinColumn(name = "idata", referencedColumnName = "idata", foreignKey = @ForeignKey(name = "fk_pauta_ata"), nullable = false)
	private Ata ata;
	@Column(name = "ordem")
	private int ordem;
	@Column(name = "titulo")
	private String titulo;
	@Column(name = "descricao")
	private String descricao;
	
	public Pauta(){
		this.setIdPauta(0);
		this.setAta(new Ata());
		this.setOrdem(1);
		this.setTitulo("");
		this.setDescricao("");
	}
	
	public int getIdPauta() {
		return idPauta;
	}
	public void setIdPauta(int idPauta) {
		this.idPauta = idPauta;
	}
	public Ata getAta() {
		return ata;
	}
	public void setAta(Ata ata) {
		this.ata = ata;
	}
	public int getOrdem() {
		return ordem;
	}
	public void setOrdem(int ordem) {
		this.ordem = ordem;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
