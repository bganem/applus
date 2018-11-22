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
@Repository("BillStatusDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface BillStatusDAO extends JpaRepository<BillStatus, java.lang.String> {

  /**
   * Obtém a instância de BillStatus utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM BillStatus entity WHERE entity.id = :id")
  public BillStatus findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de BillStatus utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM BillStatus entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);



  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM BillToPay entity WHERE entity.billStatus.id = :id")
  public Page<BillToPay> findBillToPay(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM BillToReceive entity WHERE entity.billStatus.id = :id")
  public Page<BillToReceive> findBillToReceive(@Param(value="id") java.lang.String id, Pageable pageable);

}
