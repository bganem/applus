package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela BUDGET
 * @generated
 */
@Entity
@Table(name = "\"BUDGET\"" ,uniqueConstraints=@UniqueConstraint(columnNames={
"id" }))
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Budget")
public class Budget implements Serializable {

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
  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "addeddate", nullable = false, unique = false, insertable=true, updatable=true)
  
  private java.util.Date addedDate;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_budgetStatus", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private BudgetStatus budgetStatus;

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
  public Budget(){
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
  public Budget setId(java.lang.String id){
    this.id = id;
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
  public Budget setAddedDate(java.util.Date addedDate){
    this.addedDate = addedDate;
    return this;
  }

  /**
   * Obtém budgetStatus
   * return budgetStatus
   * @generated
   */
  
  public BudgetStatus getBudgetStatus(){
    return this.budgetStatus;
  }

  /**
   * Define budgetStatus
   * @param budgetStatus budgetStatus
   * @generated
   */
  public Budget setBudgetStatus(BudgetStatus budgetStatus){
    this.budgetStatus = budgetStatus;
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
  public Budget setSupplier(Supplier supplier){
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
    Budget object = (Budget)obj;
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
