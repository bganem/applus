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
@Repository("FormOfPaymentDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface FormOfPaymentDAO extends JpaRepository<FormOfPayment, java.lang.String> {

  /**
   * Obtém a instância de FormOfPayment utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM FormOfPayment entity WHERE entity.id = :id")
  public FormOfPayment findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de FormOfPayment utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM FormOfPayment entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);



  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM SalesOrder entity WHERE entity.formOfPayment.id = :id")
  public Page<SalesOrder> findSalesOrder(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM PurchaseOrder entity WHERE entity.formOfPayment.id = :id")
  public Page<PurchaseOrder> findPurchaseOrder(@Param(value="id") java.lang.String id, Pageable pageable);

}
