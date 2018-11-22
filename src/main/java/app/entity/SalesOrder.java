package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela SALESORDER
 * @generated
 */
@Entity
@Table(name = "\"SALESORDER\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.SalesOrder")
public class SalesOrder implements Serializable {

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
  @Column(name = "addedDate", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.util.Date addedDate;

  /**
  * @generated
  */
  @Column(name = "fiscalDocument", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String fiscalDocument;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_orderStatus", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private OrderStatus orderStatus;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_client", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private Client client;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_formOfPayment", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private FormOfPayment formOfPayment;

  /**
   * Construtor
   * @generated
   */
  public SalesOrder(){
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
  public SalesOrder setId(java.lang.String id){
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
  public SalesOrder setAddedDate(java.util.Date addedDate){
    this.addedDate = addedDate;
    return this;
  }

  /**
   * Obtém fiscalDocument
   * return fiscalDocument
   * @generated
   */
  
  public java.lang.String getFiscalDocument(){
    return this.fiscalDocument;
  }

  /**
   * Define fiscalDocument
   * @param fiscalDocument fiscalDocument
   * @generated
   */
  public SalesOrder setFiscalDocument(java.lang.String fiscalDocument){
    this.fiscalDocument = fiscalDocument;
    return this;
  }

  /**
   * Obtém orderStatus
   * return orderStatus
   * @generated
   */
  
  public OrderStatus getOrderStatus(){
    return this.orderStatus;
  }

  /**
   * Define orderStatus
   * @param orderStatus orderStatus
   * @generated
   */
  public SalesOrder setOrderStatus(OrderStatus orderStatus){
    this.orderStatus = orderStatus;
    return this;
  }

  /**
   * Obtém client
   * return client
   * @generated
   */
  
  public Client getClient(){
    return this.client;
  }

  /**
   * Define client
   * @param client client
   * @generated
   */
  public SalesOrder setClient(Client client){
    this.client = client;
    return this;
  }

  /**
   * Obtém formOfPayment
   * return formOfPayment
   * @generated
   */
  
  public FormOfPayment getFormOfPayment(){
    return this.formOfPayment;
  }

  /**
   * Define formOfPayment
   * @param formOfPayment formOfPayment
   * @generated
   */
  public SalesOrder setFormOfPayment(FormOfPayment formOfPayment){
    this.formOfPayment = formOfPayment;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    SalesOrder object = (SalesOrder)obj;
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
