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
@Repository("UserDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface UserDAO extends JpaRepository<User, java.lang.String> {

  /**
   * Obtém a instância de User utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM User entity WHERE entity.id = :id")
  public User findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de User utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM User entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);



  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Role entity WHERE entity.user.id = :id")
  public Page<Role> findRole(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Department entity WHERE entity.user.id = :id")
  public Page<Department> findDepartment(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Atividade entity WHERE entity.user.id = :id")
  public Page<Atividade> findAtividade(@Param(value="id") java.lang.String id, Pageable pageable);
  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.company FROM Department entity WHERE entity.user.id = :id")
  public Page<Company> listCompany(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * ManyToOne Relation Delete
   * @generated
   */
  @Modifying
  @Query("DELETE FROM Department entity WHERE entity.user.id = :instanceId AND entity.company.id = :relationId")
  public int deleteCompany(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);
  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.documento FROM Atividade entity WHERE entity.user.id = :id")
  public Page<Documento> listDocumento(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * ManyToOne Relation Delete
   * @generated
   */
  @Modifying
  @Query("DELETE FROM Atividade entity WHERE entity.user.id = :instanceId AND entity.documento.id = :relationId")
  public int deleteDocumento(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

  /**
   * Foreign Key company
   * @generated
   */
  @Query("SELECT entity FROM User entity WHERE entity.company.id = :id")
  public Page<User> findUsersByCompany(@Param(value="id") java.lang.String id, Pageable pageable);

}
