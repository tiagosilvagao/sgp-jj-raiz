package app2.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela FORMAPAGAMENTO
 * @generated
 */
@Entity
@Table(name = "\"FORMAPAGAMENTO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app2.entity.formaPagamento")
public class formaPagamento implements Serializable {

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
  @Column(name = "formaPagamento", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String formaPagamento;

  /**
   * Construtor
   * @generated
   */
  public formaPagamento(){
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
  public formaPagamento setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém formaPagamento
   * return formaPagamento
   * @generated
   */
  
  public java.lang.String getFormaPagamento(){
    return this.formaPagamento;
  }

  /**
   * Define formaPagamento
   * @param formaPagamento formaPagamento
   * @generated
   */
  public formaPagamento setFormaPagamento(java.lang.String formaPagamento){
    this.formaPagamento = formaPagamento;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    formaPagamento object = (formaPagamento)obj;
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
