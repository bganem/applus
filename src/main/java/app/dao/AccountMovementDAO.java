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
@Repository("AccountMovementDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface AccountMovementDAO extends JpaRepository<AccountMovement, java.lang.String> {

  /**
   * Obtém a instância de AccountMovement utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM AccountMovement entity WHERE entity.id = :id")
  public AccountMovement findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de AccountMovement utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM AccountMovement entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);



  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM BillToPay entity WHERE entity.accountMovement.id = :id")
  public Page<BillToPay> findBillToPay(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM BillToReceive entity WHERE entity.accountMovement.id = :id")
  public Page<BillToReceive> findBillToReceive(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * Foreign Key account
   * @generated
   */
  @Query("SELECT entity FROM AccountMovement entity WHERE entity.account.id = :id")
  public Page<AccountMovement> findAccountMovementsByAccount(@Param(value="id") java.lang.String id, Pageable pageable);

}
