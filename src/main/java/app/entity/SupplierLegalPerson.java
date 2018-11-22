package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela SUPPLIERLEGALPERSON
 * @generated
 */
@Entity
@Table(name = "\"SUPPLIERLEGALPERSON\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.SupplierLegalPerson")
public class SupplierLegalPerson implements Serializable {

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
  @Column(name = "cnpj", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String cnpj;

  /**
  * @generated
  */
  @Column(name = "fantasyName", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String fantasyName;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_supplier", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private Supplier supplier;

  /**
   * Construtor
   * @generated
   */
  public SupplierLegalPerson(){
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
  public SupplierLegalPerson setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém cnpj
   * return cnpj
   * @generated
   */
  
  public java.lang.String getCnpj(){
    return this.cnpj;
  }

  /**
   * Define cnpj
   * @param cnpj cnpj
   * @generated
   */
  public SupplierLegalPerson setCnpj(java.lang.String cnpj){
    this.cnpj = cnpj;
    return this;
  }

  /**
   * Obtém fantasyName
   * return fantasyName
   * @generated
   */
  
  public java.lang.String getFantasyName(){
    return this.fantasyName;
  }

  /**
   * Define fantasyName
   * @param fantasyName fantasyName
   * @generated
   */
  public SupplierLegalPerson setFantasyName(java.lang.String fantasyName){
    this.fantasyName = fantasyName;
    return this;
  }

  /**
   * Obtém supplier
   * return supplier
   * @generated
   */
  
  public Supplier getSupplier(){
    return this.supplier;
  }

  /**
   * Define supplier
   * @param supplier supplier
   * @generated
   */
  public SupplierLegalPerson setSupplier(Supplier supplier){
    this.supplier = supplier;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    SupplierLegalPerson object = (SupplierLegalPerson)obj;
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
