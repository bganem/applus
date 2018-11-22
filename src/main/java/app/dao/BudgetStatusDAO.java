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
@Repository("BudgetStatusDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface BudgetStatusDAO extends JpaRepository<BudgetStatus, java.lang.String> {

  /**
   * Obtém a instância de BudgetStatus utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM BudgetStatus entity WHERE entity.id = :id")
  public BudgetStatus findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de BudgetStatus utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM BudgetStatus entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);



  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Budget entity WHERE entity.budgetStatus.id = :id")
  public Page<Budget> findBudget(@Param(value="id") java.lang.String id, Pageable pageable);
  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.supplier FROM Budget entity WHERE entity.budgetStatus.id = :id")
  public Page<Supplier> listSupplier(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * ManyToOne Relation Delete
   * @generated
   */
  @Modifying
  @Query("DELETE FROM Budget entity WHERE entity.budgetStatus.id = :instanceId AND entity.supplier.id = :relationId")
  public int deleteSupplier(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

}
