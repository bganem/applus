package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


import org.eclipse.persistence.annotations.*;
/**
 * Classe que representa a tabela DEPARTMENT
 * @generated
 */
@Entity
@Table(name = "\"DEPARTMENT\"" ,uniqueConstraints=@UniqueConstraint(columnNames={
"name" }))
@XmlRootElement
@CronappSecurity
@Multitenant(MultitenantType.SINGLE_TABLE)
@TenantDiscriminatorColumn(name = "fk_company", contextProperty = "tenant")
@JsonFilter("app.entity.Department")
public class Department implements Serializable {

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
  @Column(name = "name", nullable = false, unique = true, insertable=true, updatable=true)
  
  private java.lang.String name;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_company", nullable = false, referencedColumnName = "id", insertable=false, updatable=false)
  
  private Company company;

  /**
  * @generated
  */
  @Column(name = "chHoraria", nullable = false, unique = false, insertable=true, updatable=true)
  
  private java.lang.Integer chHoraria;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_user", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private User user;

  /**
   * Construtor
   * @generated
   */
  public Department(){
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
  public Department setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém name
   * return name
   * @generated
   */
  
  public java.lang.String getName(){
    return this.name;
  }

  /**
   * Define name
   * @param name name
   * @generated
   */
  public Department setName(java.lang.String name){
    this.name = name;
    return this;
  }

  /**
   * Obtém company
   * return company
   * @generated
   */
  
  public Company getCompany(){
    return this.company;
  }

  /**
   * Define company
   * @param company company
   * @generated
   */
  public Department setCompany(Company company){
    this.company = company;
    return this;
  }

  /**
   * Obtém chHoraria
   * return chHoraria
   * @generated
   */
  
  public java.lang.Integer getChHoraria(){
    return this.chHoraria;
  }

  /**
   * Define chHoraria
   * @param chHoraria chHoraria
   * @generated
   */
  public Department setChHoraria(java.lang.Integer chHoraria){
    this.chHoraria = chHoraria;
    return this;
  }

  /**
   * Obtém user
   * return user
   * @generated
   */
  
  public User getUser(){
    return this.user;
  }

  /**
   * Define user
   * @param user user
   * @generated
   */
  public Department setUser(User user){
    this.user = user;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Department object = (Department)obj;
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
