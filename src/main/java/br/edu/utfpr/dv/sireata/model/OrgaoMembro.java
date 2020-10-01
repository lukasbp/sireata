package br.edu.utfpr.dv.sireata.model;

import javax.persistence.*;

@Entity
@Table(name = "membros")
public class OrgaoMembro {
	@Id
	@ManyToOne
	@JoinColumn(name = "idorgao", referencedColumnName = "idorgao", foreignKey = @ForeignKey(name = "fk_membro_orgao"), nullable = false)
	private int idMembro;
	@ManyToOne
	@JoinColumn(name = "idusuario", referencedColumnName = "idusuario", foreignKey = @ForeignKey(name = "fk_membro_usuario"), nullable = false)
	private Usuario usuario;
	@Column(name = "designacao")
	private String designacao;
	
	public OrgaoMembro(){
		this.setIdMembro(0);
		this.setUsuario(new Usuario());
		this.setDesignacao("");
	}
	
	public int getIdMembro() {
		return idMembro;
	}
	public void setIdMembro(int idMembro) {
		this.idMembro = idMembro;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public String getDesignacao() {
		return designacao;
	}
	public void setDesignacao(String designacao) {
		this.designacao = designacao;
	}

}
