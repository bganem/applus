package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela ATIVIDADE
 * @generated
 */
@Entity
@Table(name = "\"ATIVIDADE\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Atividade")
public class Atividade implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @Column(name = "id", nullable = false, insertable=true, updatable=true)
  private java.lang.String id = UUID.randomUUID().toString().toUpperCase();

  /**
  * @generated
  */
  @Column(name = "nome", nullable = false, unique = false, insertable=true, updatable=true)
  
  private java.lang.String nome;

  /**
  * @generated
  */
  @Column(name = "tipo", nullable = false, unique = false, insertable=true, updatable=true)
  
  private java.lang.String tipo;

  /**
  * @generated
  */
  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "data", nullable = false, unique = false, insertable=true, updatable=true)
  
  private java.util.Date data;

  /**
  * @generated
  */
  @Column(name = "realizador", nullable = false, unique = false, insertable=true, updatable=true)
  
  private java.lang.String realizador;

  /**
  * @generated
  */
  @Column(name = "local", nullable = false, unique = false, insertable=true, updatable=true)
  
  private java.lang.String local;

  /**
  * @generated
  */
  @Column(name = "horas", nullable = false, unique = false, insertable=true, updatable=true)
  
  private java.lang.Integer horas;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_documento", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private Documento documento;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_user", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private User user;

  /**
   * Construtor
   * @generated
   */
  public Atividade(){
  }


  /**
   * Obtém id
   * return id
   * @generated
   */
  
  public java.lang.String getId(){
    return this.id;
  }

  /**
   * Define id
   * @param id id
   * @generated
   */
  public Atividade setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém nome
   * return nome
   * @generated
   */
  
  public java.lang.String getNome(){
    return this.nome;
  }

  /**
   * Define nome
   * @param nome nome
   * @generated
   */
  public Atividade setNome(java.lang.String nome){
    this.nome = nome;
    return this;
  }

  /**
   * Obtém tipo
   * return tipo
   * @generated
   */
  
  public java.lang.String getTipo(){
    return this.tipo;
  }

  /**
   * Define tipo
   * @param tipo tipo
   * @generated
   */
  public Atividade setTipo(java.lang.String tipo){
    this.tipo = tipo;
    return this;
  }

  /**
   * Obtém data
   * return data
   * @generated
   */
  
  public java.util.Date getData(){
    return this.data;
  }

  /**
   * Define data
   * @param data data
   * @generated
   */
  public Atividade setData(java.util.Date data){
    this.data = data;
    return this;
  }

  /**
   * Obtém realizador
   * return realizador
   * @generated
   */
  
  public java.lang.String getRealizador(){
    return this.realizador;
  }

  /**
   * Define realizador
   * @param realizador realizador
   * @generated
   */
  public Atividade setRealizador(java.lang.String realizador){
    this.realizador = realizador;
    return this;
  }

  /**
   * Obtém local
   * return local
   * @generated
   */
  
  public java.lang.String getLocal(){
    return this.local;
  }

  /**
   * Define local
   * @param local local
   * @generated
   */
  public Atividade setLocal(java.lang.String local){
    this.local = local;
    return this;
  }

  /**
   * Obtém horas
   * return horas
   * @generated
   */
  
  public java.lang.Integer getHoras(){
    return this.horas;
  }

  /**
   * Define horas
   * @param horas horas
   * @generated
   */
  public Atividade setHoras(java.lang.Integer horas){
    this.horas = horas;
    return this;
  }

  /**
   * Obtém documento
   * return documento
   * @generated
   */
  
  public Documento getDocumento(){
    return this.documento;
  }

  /**
   * Define documento
   * @param documento documento
   * @generated
   */
  public Atividade setDocumento(Documento documento){
    this.documento = documento;
    return this;
  }

  /**
   * Obtém user
   * return user
   * @generated
   */
  
  public User getUser(){
    return this.user;
  }

  /**
   * Define user
   * @param user user
   * @generated
   */
  public Atividade setUser(User user){
    this.user = user;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Atividade object = (Atividade)obj;
    if (id != null ? !id.equals(object.id) : object.id != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }

}
