package br.edu.utfpr.dv.sireata.model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import br.edu.utfpr.dv.sireata.util.DateUtils;

import javax.persistence.*;

@Entity
@Table(name= "atas")
public class Ata {
	
	public enum TipoAta{
		ORDINARIA(0), EXTRAORDINARIA(1);
		
		private final int value; 
		TipoAta(int value){ 
			this.value = value; 
		}
		
		public int getValue(){ 
			return value;
		}
		
		public static TipoAta valueOf(int value){
			for(TipoAta u : TipoAta.values()){
				if(u.getValue() == value){
					return u;
				}
			}
			
			return null;
		}
		
		public String toString(){
			switch(this){
				case ORDINARIA:
					return "Ordinária";
				case EXTRAORDINARIA:
					return "Extraordinária";
				default:
					return "";
			}
		}
	}
	@Id
	@Column(name = "idata")
	private int idAta;
	@ManyToOne
	@JoinColumn(name = "idorgao", referencedColumnName = "idorgao", foreignKey = @ForeignKey(name = "fk_ata_orgao"), nullable = false)
	private Orgao orgao;
	@ManyToOne
	@JoinColumn(name = "idpresidente", referencedColumnName = "idusuario", foreignKey = @ForeignKey(name = "fk_ata_presidente_idx"), nullable = false)
	private Usuario presidente;
	@ManyToOne
	@JoinColumn(name = "idsecretario", referencedColumnName = "idusuario", foreignKey = @ForeignKey(name = "fk_ata_secretario_idx"), nullable = false)
	private Usuario secretario;
	@Column(name = "tipo")
	private TipoAta tipo;
	@Column(name = "numero")
	private int numero;
	@Column(name = "data")
	private Date data;
	@Column(name = "local")
	private String local;
	@Column(name = "localCompleto")
	private String localCompleto;
	@Column(name = "dataLimiteComentarios")
	private Date dataLimiteComentarios;
	@Column(name = "consideracoesIniciais")
	private String consideracoesIniciais;
	@Column(name = "aceitarComentarios")
	private boolean aceitarComentarios;
	@Column(name = "audio")
	private byte[] audio;
	@Column(name = "publicada")
	private boolean publicada;
	@Column(name = "dataPublicacao")
	private Date dataPublicacao;
	@Column(name = "documento")
	private byte[] documento;
	@OneToMany(mappedBy = "pautas")
	private List<Pauta> pauta;
	@OneToMany(mappedBy = "ataparticipantes")
	private List<AtaParticipante> participantes;
	@OneToMany(mappedBy = "anexo")
	private List<Anexo> anexos;
	
	public Ata(){
		this.setIdAta(0);
		this.setOrgao(new Orgao());
		this.setPresidente(new Usuario());
		this.setSecretario(new Usuario());
		this.setTipo(TipoAta.ORDINARIA);
		this.setNumero(0);
		this.setData(DateUtils.getNow().getTime());
		this.setLocal("");
		this.setLocalCompleto("");
		this.setDataLimiteComentarios(DateUtils.getToday().getTime());
		this.setConsideracoesIniciais("");
		this.setAudio(null);
		this.setPublicada(false);
		this.setDataPublicacao(new Date());
		this.setPauta(null);
		this.setParticipantes(null);
		this.setAnexos(null);
	}
	
	public int getIdAta() {
		return idAta;
	}
	public void setIdAta(int idAta) {
		this.idAta = idAta;
	}
	public Orgao getOrgao() {
		return orgao;
	}
	public void setOrgao(Orgao orgao) {
		this.orgao = orgao;
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
	public TipoAta getTipo() {
		return tipo;
	}
	public void setTipo(TipoAta tipo) {
		this.tipo = tipo;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public String getLocalCompleto() {
		return localCompleto;
	}
	public void setLocalCompleto(String localCompleto) {
		this.localCompleto = localCompleto;
	}
	public Date getDataLimiteComentarios() {
		return dataLimiteComentarios;
	}
	public void setDataLimiteComentarios(Date dataLimiteComentarios) {
		this.dataLimiteComentarios = dataLimiteComentarios;
	}
	public String getConsideracoesIniciais() {
		return consideracoesIniciais;
	}
	public void setConsideracoesIniciais(String consideracoesIniciais) {
		this.consideracoesIniciais = consideracoesIniciais;
	}
	public byte[] getAudio() {
		return audio;
	}
	public void setAudio(byte[] audio) {
		this.audio = audio;
	}
	public boolean isPublicada() {
		return publicada;
	}
	public void setPublicada(boolean publicada) {
		this.publicada = publicada;
	}
	public Date getDataPublicacao() {
		return dataPublicacao;
	}
	public void setDataPublicacao(Date dataPublicacao) {
		this.dataPublicacao = dataPublicacao;
	}
	public byte[] getDocumento(){
		return this.documento;
	}
	public void setDocumento(byte[] documento){
		this.documento = documento;
	}
	public List<Pauta> getPauta() {
		return pauta;
	}
	public void setPauta(List<Pauta> pauta) {
		this.pauta = pauta;
	}
	public List<AtaParticipante> getParticipantes() {
		return participantes;
	}
	public void setParticipantes(List<AtaParticipante> participantes) {
		this.participantes = participantes;
	}
	public boolean isAceitarComentarios() {
		return aceitarComentarios;
	}
	public void setAceitarComentarios(boolean aceitarComentarios) {
		this.aceitarComentarios = aceitarComentarios;
	}
	public List<Anexo> getAnexos() {
		return anexos;
	}
	public void setAnexos(List<Anexo> anexos) {
		this.anexos = anexos;
	}
	public String getNome(){
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		
		return df.format(this.getData());
	}

}
