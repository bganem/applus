package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela SUPPLIERADDRESS
 * @generated
 */
@Entity
@Table(name = "\"SUPPLIERADDRESS\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.SupplierAddress")
public class SupplierAddress implements Serializable {

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
  @Column(name = "address", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String address;

  /**
  * @generated
  */
  @Column(name = "city", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String city;

  /**
  * @generated
  */
  @Column(name = "postalCode", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String postalCode;

  /**
  * @generated
  */
  @Column(name = "country", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String country;

  /**
  * @generated
  */
  @Column(name = "state", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String state;

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
  public SupplierAddress(){
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
  public SupplierAddress setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém address
   * return address
   * @generated
   */
  
  public java.lang.String getAddress(){
    return this.address;
  }

  /**
   * Define address
   * @param address address
   * @generated
   */
  public SupplierAddress setAddress(java.lang.String address){
    this.address = address;
    return this;
  }

  /**
   * Obtém city
   * return city
   * @generated
   */
  
  public java.lang.String getCity(){
    return this.city;
  }

  /**
   * Define city
   * @param city city
   * @generated
   */
  public SupplierAddress setCity(java.lang.String city){
    this.city = city;
    return this;
  }

  /**
   * Obtém postalCode
   * return postalCode
   * @generated
   */
  
  public java.lang.String getPostalCode(){
    return this.postalCode;
  }

  /**
   * Define postalCode
   * @param postalCode postalCode
   * @generated
   */
  public SupplierAddress setPostalCode(java.lang.String postalCode){
    this.postalCode = postalCode;
    return this;
  }

  /**
   * Obtém country
   * return country
   * @generated
   */
  
  public java.lang.String getCountry(){
    return this.country;
  }

  /**
   * Define country
   * @param country country
   * @generated
   */
  public SupplierAddress setCountry(java.lang.String country){
    this.country = country;
    return this;
  }

  /**
   * Obtém state
   * return state
   * @generated
   */
  
  public java.lang.String getState(){
    return this.state;
  }

  /**
   * Define state
   * @param state state
   * @generated
   */
  public SupplierAddress setState(java.lang.String state){
    this.state = state;
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
  public SupplierAddress setSupplier(Supplier supplier){
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
    SupplierAddress object = (SupplierAddress)obj;
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
