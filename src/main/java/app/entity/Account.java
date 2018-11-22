package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela ACCOUNT
 * @generated
 */
@Entity
@Table(name = "\"ACCOUNT\"" ,uniqueConstraints=@UniqueConstraint(columnNames={
"name" }))
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Account")
public class Account implements Serializable {

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
  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "addedDate", nullable = false, unique = false, insertable=true, updatable=true)
  
  private java.util.Date addedDate;

  /**
  * @generated
  */
  @Column(name = "active", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Boolean active;

  /**
   * Construtor
   * @generated
   */
  public Account(){
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
  public Account setId(java.lang.String id){
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
  public Account setName(java.lang.String name){
    this.name = name;
    return this;
  }

  /**
   * Obtém addedDate
   * return addedDate
   * @generated
   */
  
  public java.util.Date getAddedDate(){
    return this.addedDate;
  }

  /**
   * Define addedDate
   * @param addedDate addedDate
   * @generated
   */
  public Account setAddedDate(java.util.Date addedDate){
    this.addedDate = addedDate;
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
  public Account setActive(java.lang.Boolean active){
    this.active = active;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Account object = (Account)obj;
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
