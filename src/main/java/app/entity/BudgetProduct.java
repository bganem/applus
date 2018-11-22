package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela BUDGETPRODUCT
 * @generated
 */
@Entity
@Table(name = "\"BUDGETPRODUCT\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.BudgetProduct")
public class BudgetProduct implements Serializable {

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
  @ManyToOne
  @JoinColumn(name="fk_budget", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private Budget budget;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_product", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private Product product;

  /**
  * @generated
  */
  @Column(name = "price", nullable = false, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double price;

  /**
   * Construtor
   * @generated
   */
  public BudgetProduct(){
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
  public BudgetProduct setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém budget
   * return budget
   * @generated
   */
  
  public Budget getBudget(){
    return this.budget;
  }

  /**
   * Define budget
   * @param budget budget
   * @generated
   */
  public BudgetProduct setBudget(Budget budget){
    this.budget = budget;
    return this;
  }

  /**
   * Obtém product
   * return product
   * @generated
   */
  
  public Product getProduct(){
    return this.product;
  }

  /**
   * Define product
   * @param product product
   * @generated
   */
  public BudgetProduct setProduct(Product product){
    this.product = product;
    return this;
  }

  /**
   * Obtém price
   * return price
   * @generated
   */
  
  public java.lang.Double getPrice(){
    return this.price;
  }

  /**
   * Define price
   * @param price price
   * @generated
   */
  public BudgetProduct setPrice(java.lang.Double price){
    this.price = price;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    BudgetProduct object = (BudgetProduct)obj;
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
