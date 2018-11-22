package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela SUPPLIER
 * @generated
 */
@Entity
@Table(name = "\"SUPPLIER\"" ,uniqueConstraints=@UniqueConstraint(columnNames={
"name" }))
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Supplier")
public class Supplier implements Serializable {

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
  @Column(name = "name", nullable = false, unique = true, insertable=true, updatable=true)
  
  private java.lang.String name;

  /**
  * @generated
  */
  @Column(name = "phone", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String phone;

  /**
  * @generated
  */
  @Column(name = "email", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String email;

  /**
  * @generated
  */
  @Column(name = "active", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Boolean active;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_supplierType", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private SupplierType supplierType;

  /**
   * Construtor
   * @generated
   */
  public Supplier(){
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
  public Supplier setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém name
   * return name
   * @generated
   */
  
  public java.lang.String getName(){
    return this.name;
  }

  /**
   * Define name
   * @param name name
   * @generated
   */
  public Supplier setName(java.lang.String name){
    this.name = name;
    return this;
  }

  /**
   * Obtém phone
   * return phone
   * @generated
   */
  
  public java.lang.String getPhone(){
    return this.phone;
  }

  /**
   * Define phone
   * @param phone phone
   * @generated
   */
  public Supplier setPhone(java.lang.String phone){
    this.phone = phone;
    return this;
  }

  /**
   * Obtém email
   * return email
   * @generated
   */
  
  public java.lang.String getEmail(){
    return this.email;
  }

  /**
   * Define email
   * @param email email
   * @generated
   */
  public Supplier setEmail(java.lang.String email){
    this.email = email;
    return this;
  }

  /**
   * Obtém active
   * return active
   * @generated
   */
  
  public java.lang.Boolean getActive(){
    return this.active;
  }

  /**
   * Define active
   * @param active active
   * @generated
   */
  public Supplier setActive(java.lang.Boolean active){
    this.active = active;
    return this;
  }

  /**
   * Obtém supplierType
   * return supplierType
   * @generated
   */
  
  public SupplierType getSupplierType(){
    return this.supplierType;
  }

  /**
   * Define supplierType
   * @param supplierType supplierType
   * @generated
   */
  public Supplier setSupplierType(SupplierType supplierType){
    this.supplierType = supplierType;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Supplier object = (Supplier)obj;
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
