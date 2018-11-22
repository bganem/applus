package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela ORDERPRODUCT
 * @generated
 */
@Entity
@Table(name = "\"ORDERPRODUCT\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.OrderProduct")
public class OrderProduct implements Serializable {

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
  @JoinColumn(name="fk_product", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private Product product;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_salesOrder", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private SalesOrder salesOrder;

  /**
  * @generated
  */
  @Column(name = "price", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double price;

  /**
   * Construtor
   * @generated
   */
  public OrderProduct(){
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
  public OrderProduct setId(java.lang.String id){
    this.id = id;
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
  public OrderProduct setProduct(Product product){
    this.product = product;
    return this;
  }

  /**
   * Obtém salesOrder
   * return salesOrder
   * @generated
   */
  
  public SalesOrder getSalesOrder(){
    return this.salesOrder;
  }

  /**
   * Define salesOrder
   * @param salesOrder salesOrder
   * @generated
   */
  public OrderProduct setSalesOrder(SalesOrder salesOrder){
    this.salesOrder = salesOrder;
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
  public OrderProduct setPrice(java.lang.Double price){
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
    OrderProduct object = (OrderProduct)obj;
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
