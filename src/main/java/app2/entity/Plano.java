package app2.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela PLANO
 * @generated
 */
@Entity
@Table(name = "\"PLANO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app2.entity.Plano")
public class Plano implements Serializable {

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
  @Column(name = "nomePlano", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String nomePlano;

  /**
  * @generated
  */
  @Column(name = "valorPeriodo", nullable = true, unique = false, scale=2, insertable=true, updatable=true)
  
  private java.math.BigDecimal valorPeriodo;

  /**
  * @generated
  */
  @Column(name = "valorAcrescimoAtraso", nullable = true, unique = false, scale=2, insertable=true, updatable=true)
  
  private java.math.BigDecimal valorAcrescimoAtraso;

  /**
  * @generated
  */
  @Column(name = "periodicidadeEmMes", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Integer periodicidadeEmMes;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_tpAcrescimoAtraso", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private tpAcrescimoAtraso tpAcrescimoAtraso;

  /**
   * Construtor
   * @generated
   */
  public Plano(){
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
  public Plano setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém nomePlano
   * return nomePlano
   * @generated
   */
  
  public java.lang.String getNomePlano(){
    return this.nomePlano;
  }

  /**
   * Define nomePlano
   * @param nomePlano nomePlano
   * @generated
   */
  public Plano setNomePlano(java.lang.String nomePlano){
    this.nomePlano = nomePlano;
    return this;
  }

  /**
   * Obtém valorPeriodo
   * return valorPeriodo
   * @generated
   */
  
  public java.math.BigDecimal getValorPeriodo(){
    return this.valorPeriodo;
  }

  /**
   * Define valorPeriodo
   * @param valorPeriodo valorPeriodo
   * @generated
   */
  public Plano setValorPeriodo(java.math.BigDecimal valorPeriodo){
    this.valorPeriodo = valorPeriodo;
    return this;
  }

  /**
   * Obtém valorAcrescimoAtraso
   * return valorAcrescimoAtraso
   * @generated
   */
  
  public java.math.BigDecimal getValorAcrescimoAtraso(){
    return this.valorAcrescimoAtraso;
  }

  /**
   * Define valorAcrescimoAtraso
   * @param valorAcrescimoAtraso valorAcrescimoAtraso
   * @generated
   */
  public Plano setValorAcrescimoAtraso(java.math.BigDecimal valorAcrescimoAtraso){
    this.valorAcrescimoAtraso = valorAcrescimoAtraso;
    return this;
  }

  /**
   * Obtém periodicidadeEmMes
   * return periodicidadeEmMes
   * @generated
   */
  
  public java.lang.Integer getPeriodicidadeEmMes(){
    return this.periodicidadeEmMes;
  }

  /**
   * Define periodicidadeEmMes
   * @param periodicidadeEmMes periodicidadeEmMes
   * @generated
   */
  public Plano setPeriodicidadeEmMes(java.lang.Integer periodicidadeEmMes){
    this.periodicidadeEmMes = periodicidadeEmMes;
    return this;
  }

  /**
   * Obtém tpAcrescimoAtraso
   * return tpAcrescimoAtraso
   * @generated
   */
  
  public tpAcrescimoAtraso getTpAcrescimoAtraso(){
    return this.tpAcrescimoAtraso;
  }

  /**
   * Define tpAcrescimoAtraso
   * @param tpAcrescimoAtraso tpAcrescimoAtraso
   * @generated
   */
  public Plano setTpAcrescimoAtraso(tpAcrescimoAtraso tpAcrescimoAtraso){
    this.tpAcrescimoAtraso = tpAcrescimoAtraso;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Plano object = (Plano)obj;
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
