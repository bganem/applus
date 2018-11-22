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
@Repository("BillToReceiveDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface BillToReceiveDAO extends JpaRepository<BillToReceive, java.lang.String> {

  /**
   * Obtém a instância de BillToReceive utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM BillToReceive entity WHERE entity.id = :id")
  public BillToReceive findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de BillToReceive utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM BillToReceive entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);



  /**
   * Foreign Key billStatus
   * @generated
   */
  @Query("SELECT entity FROM BillToReceive entity WHERE entity.billStatus.id = :id")
  public Page<BillToReceive> findBillToReceivesByBillStatus(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * Foreign Key managementBill
   * @generated
   */
  @Query("SELECT entity FROM BillToReceive entity WHERE entity.managementBill.id = :id")
  public Page<BillToReceive> findBillToReceivesByManagementBill(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * Foreign Key salesOrder
   * @generated
   */
  @Query("SELECT entity FROM BillToReceive entity WHERE entity.salesOrder.id = :id")
  public Page<BillToReceive> findBillToReceivesBySalesOrder(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * Foreign Key accountMovement
   * @generated
   */
  @Query("SELECT entity FROM BillToReceive entity WHERE entity.accountMovement.id = :id")
  public Page<BillToReceive> findBillToReceivesByAccountMovement(@Param(value="id") java.lang.String id, Pageable pageable);

}
