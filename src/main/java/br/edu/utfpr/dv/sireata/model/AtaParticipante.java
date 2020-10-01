package br.edu.utfpr.dv.sireata.model;

import javax.persistence.*;

@Entity
@Table(name= "ataparticipantes")
public class AtaParticipante {

	@Id
	@Column(name = "idataparticipante")
	private int idAtaParticipante;
	@ManyToOne
	@JoinColumn(name = "idata", referencedColumnName = "idata", foreignKey = @ForeignKey(name = "fk_ataparticipantes_ata"), nullable = false)
	private Ata ata;
	@ManyToOne
	@JoinColumn(name = "idparticipante", referencedColumnName = "idparticipante", foreignKey = @ForeignKey(name = "fk_ataparticipantes_usuarios"), nullable = false)
	private Usuario participante;
	@Column(name = "presente")
	private boolean presente;
	@Column(name = "motivo")
	private String motivo;
	@Column(name = "designacao")
	private String designacao;
	@Column(name = "membro")
	private boolean membro;
	
	public AtaParticipante(){
		this.setIdAtaParticipante(0);
		this.setAta(new Ata());
		this.setParticipante(new Usuario());
		this.setPresente(true);
		this.setMotivo("");
		this.setDesignacao("");
		this.setMembro(false);
	}
	
	public int getIdAtaParticipante() {
		return idAtaParticipante;
	}
	public void setIdAtaParticipante(int idAtaParticipante) {
		this.idAtaParticipante = idAtaParticipante;
	}
	public Ata getAta() {
		return ata;
	}
	public void setAta(Ata ata) {
		this.ata = ata;
	}
	public Usuario getParticipante() {
		return participante;
	}
	public void setParticipante(Usuario participante) {
		this.participante = participante;
	}
	public boolean isPresente() {
		return presente;
	}
	public void setPresente(boolean presente) {
		this.presente = presente;
	}
	public String getMotivo() {
		return motivo;
	}
	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}
	public String getDesignacao() {
		return designacao;
	}
	public void setDesignacao(String designacao) {
		this.designacao = designacao;
	}
	public boolean isMembro() {
		return membro;
	}
	public void setMembro(boolean membro) {
		this.membro = membro;
	}

}
