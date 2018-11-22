package app.dao;

import app.entity.*;
import java.util.*;
import org.springframework.stereotype.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.domain.*;
import org.springframework.data.repository.query.*;
import org.springframework.transaction.annotation.*; 


/**
 * Realiza operação de Create, Read, Update e Delete no banco de dados.
 * Os métodos de create, edit, delete e outros estão abstraídos no JpaRepository
 * 
 * @see org.springframework.data.jpa.repository.JpaRepository
 * 
 * @generated
 */
@Repository("BillToPayDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface BillToPayDAO extends JpaRepository<BillToPay, java.lang.String> {

  /**
   * Obtém a instância de BillToPay utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM BillToPay entity WHERE entity.id = :id")
  public BillToPay findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de BillToPay utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM BillToPay entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);



  /**
   * Foreign Key billStatus
   * @generated
   */
  @Query("SELECT entity FROM BillToPay entity WHERE entity.billStatus.id = :id")
  public Page<BillToPay> findBillToPaysByBillStatus(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * Foreign Key managementBill
   * @generated
   */
  @Query("SELECT entity FROM BillToPay entity WHERE entity.managementBill.id = :id")
  public Page<BillToPay> findBillToPaysByManagementBill(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * Foreign Key purchaseOrder
   * @generated
   */
  @Query("SELECT entity FROM BillToPay entity WHERE entity.purchaseOrder.id = :id")
  public Page<BillToPay> findBillToPaysByPurchaseOrder(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * Foreign Key accountMovement
   * @generated
   */
  @Query("SELECT entity FROM BillToPay entity WHERE entity.accountMovement.id = :id")
  public Page<BillToPay> findBillToPaysByAccountMovement(@Param(value="id") java.lang.String id, Pageable pageable);

}
