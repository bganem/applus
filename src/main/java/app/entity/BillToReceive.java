package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela BILLTORECEIVE
 * @generated
 */
@Entity
@Table(name = "\"BILLTORECEIVE\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.BillToReceive")
public class BillToReceive implements Serializable {

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
  @Column(name = "note", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String receiveNote;

  /**
  * @generated
  */
  @Column(name = "description", nullable = false, unique = false, insertable=true, updatable=true)
  
  private java.lang.String descriptionReceive;

  /**
  * @generated
  */
  @Column(name = "amount", nullable = false, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double amount;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_billStatus", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private BillStatus billStatus;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_managementBill", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private ManagementBill managementBill;

  /**
  * @generated
  */
  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "receiptDate", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.util.Date receiptDate;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_salesOrder", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private SalesOrder salesOrder;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_accountMovement", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private AccountMovement accountMovement;

  /**
   * Construtor
   * @generated
   */
  public BillToReceive(){
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
  public BillToReceive setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém receiveNote
   * return receiveNote
   * @generated
   */
  
  public java.lang.String getReceiveNote(){
    return this.receiveNote;
  }

  /**
   * Define receiveNote
   * @param receiveNote receiveNote
   * @generated
   */
  public BillToReceive setReceiveNote(java.lang.String receiveNote){
    this.receiveNote = receiveNote;
    return this;
  }

  /**
   * Obtém descriptionReceive
   * return descriptionReceive
   * @generated
   */
  
  public java.lang.String getDescriptionReceive(){
    return this.descriptionReceive;
  }

  /**
   * Define descriptionReceive
   * @param descriptionReceive descriptionReceive
   * @generated
   */
  public BillToReceive setDescriptionReceive(java.lang.String descriptionReceive){
    this.descriptionReceive = descriptionReceive;
    return this;
  }

  /**
   * Obtém amount
   * return amount
   * @generated
   */
  
  public java.lang.Double getAmount(){
    return this.amount;
  }

  /**
   * Define amount
   * @param amount amount
   * @generated
   */
  public BillToReceive setAmount(java.lang.Double amount){
    this.amount = amount;
    return this;
  }

  /**
   * Obtém billStatus
   * return billStatus
   * @generated
   */
  
  public BillStatus getBillStatus(){
    return this.billStatus;
  }

  /**
   * Define billStatus
   * @param billStatus billStatus
   * @generated
   */
  public BillToReceive setBillStatus(BillStatus billStatus){
    this.billStatus = billStatus;
    return this;
  }

  /**
   * Obtém managementBill
   * return managementBill
   * @generated
   */
  
  public ManagementBill getManagementBill(){
    return this.managementBill;
  }

  /**
   * Define managementBill
   * @param managementBill managementBill
   * @generated
   */
  public BillToReceive setManagementBill(ManagementBill managementBill){
    this.managementBill = managementBill;
    return this;
  }

  /**
   * Obtém receiptDate
   * return receiptDate
   * @generated
   */
  
  public java.util.Date getReceiptDate(){
    return this.receiptDate;
  }

  /**
   * Define receiptDate
   * @param receiptDate receiptDate
   * @generated
   */
  public BillToReceive setReceiptDate(java.util.Date receiptDate){
    this.receiptDate = receiptDate;
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
  public BillToReceive setSalesOrder(SalesOrder salesOrder){
    this.salesOrder = salesOrder;
    return this;
  }

  /**
   * Obtém accountMovement
   * return accountMovement
   * @generated
   */
  
  public AccountMovement getAccountMovement(){
    return this.accountMovement;
  }

  /**
   * Define accountMovement
   * @param accountMovement accountMovement
   * @generated
   */
  public BillToReceive setAccountMovement(AccountMovement accountMovement){
    this.accountMovement = accountMovement;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    BillToReceive object = (BillToReceive)obj;
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
