package br.edu.utfpr.dv.sireata.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "orgaos")
public class Orgao {

	@Id
	@Column(name = "idorgao")
	private int idOrgao;
	@ManyToOne
	@JoinColumn(name = "iddepartamento", referencedColumnName = "iddepartamento", foreignKey = @ForeignKey(name = "fk_orgao_departamento"), nullable = false)
	private Departamento departamento;
	@ManyToOne
	@JoinColumn(name = "idpresidente", referencedColumnName = "idusuario", foreignKey = @ForeignKey(name = "fk_orgao_presidente"), nullable = false)
	private Usuario presidente;
	@ManyToOne
	@JoinColumn(name = "idsecretario", referencedColumnName = "idusuario", foreignKey = @ForeignKey(name = "fk_orgao_secretario"), nullable = false)
	private Usuario secretario;
	@Column(name = "nome")
	private String nome;
	@Column(name = "nomeCompleto")
	private String nomeCompleto;
	@Column(name = "designacaoPresidente")
	private String designacaoPresidente;
	@Column(name = "ativo")
	private boolean ativo;
	@OneToMany(mappedBy = "membros")
	private List<OrgaoMembro> membros;

	public Orgao(){
		this.setIdOrgao(0);
		this.setDepartamento(new Departamento());
		this.setPresidente(new Usuario());
		this.setSecretario(new Usuario());
		this.setNome("");
		this.setNomeCompleto("");
		this.setDesignacaoPresidente("");
		this.setAtivo(true);
		this.setMembros(new ArrayList<OrgaoMembro>());
	}
	
	public int getIdOrgao() {
		return idOrgao;
	}
	public void setIdOrgao(int idOrgao) {
		this.idOrgao = idOrgao;
	}
	public Departamento getDepartamento() {
		return departamento;
	}
	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	public Usuario getPresidente() {
		return presidente;
	}
	public void setPresidente(Usuario presidente) {
		this.presidente = presidente;
	}
	public Usuario getSecretario() {
		return secretario;
	}
	public void setSecretario(Usuario secretario) {
		this.secretario = secretario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNomeCompleto() {
		return nomeCompleto;
	}
	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}
	public String getDesignacaoPresidente() {
		return designacaoPresidente;
	}
	public void setDesignacaoPresidente(String designacaoPresidente) {
		this.designacaoPresidente = designacaoPresidente;
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	public List<OrgaoMembro> getMembros() {
		return membros;
	}
	public void setMembros(List<OrgaoMembro> membros) {
		this.membros = membros;
	}
	
	public String toString(){
		return this.getNome();
	}

}
