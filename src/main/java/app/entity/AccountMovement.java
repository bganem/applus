package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela ACCOUNTMOVEMENT
 * @generated
 */
@Entity
@Table(name = "\"ACCOUNTMOVEMENT\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.AccountMovement")
public class AccountMovement implements Serializable {

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
  @Temporal(TemporalType.DATE)
  @Column(name = "movementDate", nullable = false, unique = false, insertable=true, updatable=true)
  
  private java.util.Date movementDate;

  /**
  * @generated
  */
  @Column(name = "note", nullable = false, unique = false, insertable=true, updatable=true)
  
  private java.lang.String note;

  /**
  * @generated
  */
  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "addedDate", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.util.Date addedDate;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_account", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private Account account;

  /**
  * @generated
  */
  @Column(name = "value", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double value;

  /**
   * Construtor
   * @generated
   */
  public AccountMovement(){
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
  public AccountMovement setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém movementDate
   * return movementDate
   * @generated
   */
  
  public java.util.Date getMovementDate(){
    return this.movementDate;
  }

  /**
   * Define movementDate
   * @param movementDate movementDate
   * @generated
   */
  public AccountMovement setMovementDate(java.util.Date movementDate){
    this.movementDate = movementDate;
    return this;
  }

  /**
   * Obtém note
   * return note
   * @generated
   */
  
  public java.lang.String getNote(){
    return this.note;
  }

  /**
   * Define note
   * @param note note
   * @generated
   */
  public AccountMovement setNote(java.lang.String note){
    this.note = note;
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
  public AccountMovement setAddedDate(java.util.Date addedDate){
    this.addedDate = addedDate;
    return this;
  }

  /**
   * Obtém account
   * return account
   * @generated
   */
  
  public Account getAccount(){
    return this.account;
  }

  /**
   * Define account
   * @param account account
   * @generated
   */
  public AccountMovement setAccount(Account account){
    this.account = account;
    return this;
  }

  /**
   * Obtém value
   * return value
   * @generated
   */
  
  public java.lang.Double getValue(){
    return this.value;
  }

  /**
   * Define value
   * @param value value
   * @generated
   */
  public AccountMovement setValue(java.lang.Double value){
    this.value = value;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    AccountMovement object = (AccountMovement)obj;
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
