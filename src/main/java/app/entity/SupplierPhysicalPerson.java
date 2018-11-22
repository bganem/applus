package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela SUPPLIERPHYSICALPERSON
 * @generated
 */
@Entity
@Table(name = "\"SUPPLIERPHYSICALPERSON\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.SupplierPhysicalPerson")
public class SupplierPhysicalPerson implements Serializable {

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
  @Column(name = "rg", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String rg;

  /**
  * @generated
  */
  @Column(name = "cpf", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String cpf;

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
  public SupplierPhysicalPerson(){
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
  public SupplierPhysicalPerson setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém rg
   * return rg
   * @generated
   */
  
  public java.lang.String getRg(){
    return this.rg;
  }

  /**
   * Define rg
   * @param rg rg
   * @generated
   */
  public SupplierPhysicalPerson setRg(java.lang.String rg){
    this.rg = rg;
    return this;
  }

  /**
   * Obtém cpf
   * return cpf
   * @generated
   */
  
  public java.lang.String getCpf(){
    return this.cpf;
  }

  /**
   * Define cpf
   * @param cpf cpf
   * @generated
   */
  public SupplierPhysicalPerson setCpf(java.lang.String cpf){
    this.cpf = cpf;
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
  public SupplierPhysicalPerson setSupplier(Supplier supplier){
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
    SupplierPhysicalPerson object = (SupplierPhysicalPerson)obj;
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
