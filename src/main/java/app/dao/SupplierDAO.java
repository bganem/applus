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
@Repository("SupplierDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface SupplierDAO extends JpaRepository<Supplier, java.lang.String> {

  /**
   * Obtém a instância de Supplier utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM Supplier entity WHERE entity.id = :id")
  public Supplier findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de Supplier utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM Supplier entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);



  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM SupplierPhysicalPerson entity WHERE entity.supplier.id = :id")
  public Page<SupplierPhysicalPerson> findSupplierPhysicalPerson(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM SupplierAddress entity WHERE entity.supplier.id = :id")
  public Page<SupplierAddress> findSupplierAddress(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM SupplierLegalPerson entity WHERE entity.supplier.id = :id")
  public Page<SupplierLegalPerson> findSupplierLegalPerson(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM PurchaseOrder entity WHERE entity.supplier.id = :id")
  public Page<PurchaseOrder> findPurchaseOrder(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Budget entity WHERE entity.supplier.id = :id")
  public Page<Budget> findBudget(@Param(value="id") java.lang.String id, Pageable pageable);
    
  /**
   * OneToMany Relation - Searchable fields - General search (Only strings fields)
   * @generated
   */
  @Query("SELECT entity FROM Product entity WHERE entity.supplier.id = :id AND (entity.name like concat('%',coalesce(:search,''),'%'))")
  public Page<Product> findProductGeneralSearch(@Param(value="search") java.lang.String search, @Param(value="id") java.lang.String id, Pageable pageable);

  /** 
   * OneToMany Relation - Searchable fields - Specific search
   * @generated
   */
  @Query("SELECT entity FROM Product entity WHERE entity.supplier.id = :id AND (:name is null OR entity.name like concat('%',:name,'%'))")
  public Page<Product> findProductSpecificSearch(@Param(value="id") java.lang.String id, @Param(value="name") java.lang.String name, Pageable pageable);

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Product entity WHERE entity.supplier.id = :id")
  public Page<Product> findProduct(@Param(value="id") java.lang.String id, Pageable pageable);
  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.budgetStatus FROM Budget entity WHERE entity.supplier.id = :id")
  public Page<BudgetStatus> listBudgetStatus(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * ManyToOne Relation Delete
   * @generated
   */
  @Modifying
  @Query("DELETE FROM Budget entity WHERE entity.supplier.id = :instanceId AND entity.budgetStatus.id = :relationId")
  public int deleteBudgetStatus(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

  /**
   * Foreign Key supplierType
   * @generated
   */
  @Query("SELECT entity FROM Supplier entity WHERE entity.supplierType.id = :id")
  public Page<Supplier> findSuppliersBySupplierType(@Param(value="id") java.lang.String id, Pageable pageable);

}
