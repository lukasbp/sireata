package br.edu.utfpr.dv.sireata.model;


import javax.persistence.*;

@Entity
@Table(name= "anexos")
public class Anexo {

	@Column(name= "idanexo")
	private int idAnexo;
	@ManyToOne
	@JoinColumn(name = "idata", referencedColumnName = "idata", foreignKey = @ForeignKey(name = "fk_anexos_ata"), nullable = false)
	private Ata ata;
	@Column(name= "descricao")
	private int ordem;
	@Column(name= "ordem")
	private String descricao;
	@Column(name= "arquivo")
	private byte[] arquivo;

	
	public Anexo() {
		this.setIdAnexo(0);
		this.setAta(new Ata());
		this.setDescricao("");
		this.setOrdem(0);
		this.setArquivo(null);
	}
	
	public int getIdAnexo() {
		return idAnexo;
	}
	public void setIdAnexo(int idAnexo) {
		this.idAnexo = idAnexo;
	}
	public Ata getAta() {
		return ata;
	}
	public void setAta(Ata ata) {
		this.ata = ata;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getOrdem() {
		return ordem;
	}
	public void setOrdem(int ordem) {
		this.ordem = ordem;
	}
	public byte[] getArquivo() {
		return arquivo;
	}
	public void setArquivo(byte[] arquivo) {
		this.arquivo = arquivo;
	}

}
