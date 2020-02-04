package app2.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela PAGAMENTO
 * @generated
 */
@Entity
@Table(name = "\"PAGAMENTO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app2.entity.Pagamento")
public class Pagamento implements Serializable {

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
  @Column(name = "dt", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String dtPagamento;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_formaPagamento", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private formaPagamento formaPagamento;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_contrato", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private Contrato contrato;

  /**
   * Construtor
   * @generated
   */
  public Pagamento(){
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
  public Pagamento setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém dtPagamento
   * return dtPagamento
   * @generated
   */
  
  public java.lang.String getDtPagamento(){
    return this.dtPagamento;
  }

  /**
   * Define dtPagamento
   * @param dtPagamento dtPagamento
   * @generated
   */
  public Pagamento setDtPagamento(java.lang.String dtPagamento){
    this.dtPagamento = dtPagamento;
    return this;
  }

  /**
   * Obtém formaPagamento
   * return formaPagamento
   * @generated
   */
  
  public formaPagamento getFormaPagamento(){
    return this.formaPagamento;
  }

  /**
   * Define formaPagamento
   * @param formaPagamento formaPagamento
   * @generated
   */
  public Pagamento setFormaPagamento(formaPagamento formaPagamento){
    this.formaPagamento = formaPagamento;
    return this;
  }

  /**
   * Obtém contrato
   * return contrato
   * @generated
   */
  
  public Contrato getContrato(){
    return this.contrato;
  }

  /**
   * Define contrato
   * @param contrato contrato
   * @generated
   */
  public Pagamento setContrato(Contrato contrato){
    this.contrato = contrato;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Pagamento object = (Pagamento)obj;
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
