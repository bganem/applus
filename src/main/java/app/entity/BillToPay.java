package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela BILLTOPAY
 * @generated
 */
@Entity
@Table(name = "\"BILLTOPAY\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.BillToPay")
public class BillToPay implements Serializable {

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
  
  private java.lang.String payNote;

  /**
  * @generated
  */
  @Column(name = "description", nullable = false, unique = false, insertable=true, updatable=true)
  
  private java.lang.String payDescription;

  /**
  * @generated
  */
  @Column(name = "value", nullable = false, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double amount;

  /**
  * @generated
  */
  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "dueDate", nullable = false, unique = false, insertable=true, updatable=true)
  
  private java.util.Date dueDate;

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
  @ManyToOne
  @JoinColumn(name="fk_purchaseOrder", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private PurchaseOrder purchaseOrder;

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
  public BillToPay(){
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
  public BillToPay setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém payNote
   * return payNote
   * @generated
   */
  
  public java.lang.String getPayNote(){
    return this.payNote;
  }

  /**
   * Define payNote
   * @param payNote payNote
   * @generated
   */
  public BillToPay setPayNote(java.lang.String payNote){
    this.payNote = payNote;
    return this;
  }

  /**
   * Obtém payDescription
   * return payDescription
   * @generated
   */
  
  public java.lang.String getPayDescription(){
    return this.payDescription;
  }

  /**
   * Define payDescription
   * @param payDescription payDescription
   * @generated
   */
  public BillToPay setPayDescription(java.lang.String payDescription){
    this.payDescription = payDescription;
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
  public BillToPay setAmount(java.lang.Double amount){
    this.amount = amount;
    return this;
  }

  /**
   * Obtém dueDate
   * return dueDate
   * @generated
   */
  
  public java.util.Date getDueDate(){
    return this.dueDate;
  }

  /**
   * Define dueDate
   * @param dueDate dueDate
   * @generated
   */
  public BillToPay setDueDate(java.util.Date dueDate){
    this.dueDate = dueDate;
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
  public BillToPay setBillStatus(BillStatus billStatus){
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
  public BillToPay setManagementBill(ManagementBill managementBill){
    this.managementBill = managementBill;
    return this;
  }

  /**
   * Obtém purchaseOrder
   * return purchaseOrder
   * @generated
   */
  
  public PurchaseOrder getPurchaseOrder(){
    return this.purchaseOrder;
  }

  /**
   * Define purchaseOrder
   * @param purchaseOrder purchaseOrder
   * @generated
   */
  public BillToPay setPurchaseOrder(PurchaseOrder purchaseOrder){
    this.purchaseOrder = purchaseOrder;
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
  public BillToPay setAccountMovement(AccountMovement accountMovement){
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
    BillToPay object = (BillToPay)obj;
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
