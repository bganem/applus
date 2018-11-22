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
@Repository("OrderProductDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface OrderProductDAO extends JpaRepository<OrderProduct, java.lang.String> {

  /**
   * Obtém a instância de OrderProduct utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM OrderProduct entity WHERE entity.id = :id")
  public OrderProduct findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de OrderProduct utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM OrderProduct entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);



  /**
   * Foreign Key product
   * @generated
   */
  @Query("SELECT entity FROM OrderProduct entity WHERE entity.product.id = :id")
  public Page<OrderProduct> findOrderProductsByProduct(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * Foreign Key salesOrder
   * @generated
   */
  @Query("SELECT entity FROM OrderProduct entity WHERE entity.salesOrder.id = :id")
  public Page<OrderProduct> findOrderProductsBySalesOrder(@Param(value="id") java.lang.String id, Pageable pageable);

}
