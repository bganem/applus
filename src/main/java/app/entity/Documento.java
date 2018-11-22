package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;
import cronapi.CronapiCloud;


/**
 * Classe que representa a tabela DOCUMENTO
 * @generated
 */
@Entity
@Table(name = "\"DOCUMENTO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Documento")
public class Documento implements Serializable {

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
  @Column(name = "imagem", nullable = true, unique = false, insertable=true, updatable=true)
  @CronapiCloud(type = "dropbox", value="U_lYBuKaK-AAAAAAAAAADcK57kzkmKGLnjwnqQX-WGElq2d0A5CTKYQVxX16n1Q1")
  
  private java.lang.String imagem;

  /**
  * @generated
  */
  @Column(name = "imagem2", nullable = true, unique = false, insertable=true, updatable=true)
  @CronapiCloud(type = "dropbox", value="U_lYBuKaK-AAAAAAAAAADcK57kzkmKGLnjwnqQX-WGElq2d0A5CTKYQVxX16n1Q1")
  
  private java.lang.String imagem2;

  /**
   * Construtor
   * @generated
   */
  public Documento(){
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
  public Documento setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém imagem
   * return imagem
   * @generated
   */
  
  public java.lang.String getImagem(){
    return this.imagem;
  }

  /**
   * Define imagem
   * @param imagem imagem
   * @generated
   */
  public Documento setImagem(java.lang.String imagem){
    this.imagem = imagem;
    return this;
  }

  /**
   * Obtém imagem2
   * return imagem2
   * @generated
   */
  
  public java.lang.String getImagem2(){
    return this.imagem2;
  }

  /**
   * Define imagem2
   * @param imagem2 imagem2
   * @generated
   */
  public Documento setImagem2(java.lang.String imagem2){
    this.imagem2 = imagem2;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Documento object = (Documento)obj;
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
