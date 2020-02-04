package app2.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela ALUNO
 * @generated
 */
@Entity
@Table(name = "\"ALUNO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app2.entity.Aluno")
public class Aluno implements Serializable {

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
  @Column(name = "nome", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String nome;

  /**
  * @generated
  */
  @Column(name = "cpf", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String cpf;

  /**
  * @generated
  */
  @Column(name = "telefoneFixo", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String telefoneFixo;

  /**
  * @generated
  */
  @Column(name = "telefoneCelular", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String telefoneCelular;

  /**
  * @generated
  */
  @Column(name = "desconto", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String desconto;

  /**
   * Construtor
   * @generated
   */
  public Aluno(){
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
  public Aluno setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém nome
   * return nome
   * @generated
   */
  
  public java.lang.String getNome(){
    return this.nome;
  }

  /**
   * Define nome
   * @param nome nome
   * @generated
   */
  public Aluno setNome(java.lang.String nome){
    this.nome = nome;
    return this;
  }

  /**
   * Obtém cpf
   * return cpf
   * @generated
   */
  
  public java.lang.String getCpf(){
    return this.cpf;
  }

  /**
   * Define cpf
   * @param cpf cpf
   * @generated
   */
  public Aluno setCpf(java.lang.String cpf){
    this.cpf = cpf;
    return this;
  }

  /**
   * Obtém telefoneFixo
   * return telefoneFixo
   * @generated
   */
  
  public java.lang.String getTelefoneFixo(){
    return this.telefoneFixo;
  }

  /**
   * Define telefoneFixo
   * @param telefoneFixo telefoneFixo
   * @generated
   */
  public Aluno setTelefoneFixo(java.lang.String telefoneFixo){
    this.telefoneFixo = telefoneFixo;
    return this;
  }

  /**
   * Obtém telefoneCelular
   * return telefoneCelular
   * @generated
   */
  
  public java.lang.String getTelefoneCelular(){
    return this.telefoneCelular;
  }

  /**
   * Define telefoneCelular
   * @param telefoneCelular telefoneCelular
   * @generated
   */
  public Aluno setTelefoneCelular(java.lang.String telefoneCelular){
    this.telefoneCelular = telefoneCelular;
    return this;
  }

  /**
   * Obtém desconto
   * return desconto
   * @generated
   */
  
  public java.lang.String getDesconto(){
    return this.desconto;
  }

  /**
   * Define desconto
   * @param desconto desconto
   * @generated
   */
  public Aluno setDesconto(java.lang.String desconto){
    this.desconto = desconto;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Aluno object = (Aluno)obj;
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
