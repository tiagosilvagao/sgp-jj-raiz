package app2.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela CONTRATO
 * @generated
 */
@Entity
@Table(name = "\"CONTRATO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app2.entity.Contrato")
public class Contrato implements Serializable {

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
  @ManyToOne
  @JoinColumn(name="fk_aluno", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private Aluno aluno;

  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "dataInatividade", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.util.Date dataInatividade;

  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "dtInicio", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.util.Date dtInicio;

  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "dtFim", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.util.Date dtFim;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_plano", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private Plano plano;

  /**
   * Construtor
   * @generated
   */
  public Contrato(){
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
  public Contrato setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém aluno
   * return aluno
   * @generated
   */
  
  public Aluno getAluno(){
    return this.aluno;
  }

  /**
   * Define aluno
   * @param aluno aluno
   * @generated
   */
  public Contrato setAluno(Aluno aluno){
    this.aluno = aluno;
    return this;
  }

  /**
   * Obtém dataInatividade
   * return dataInatividade
   * @generated
   */
  
  public java.util.Date getDataInatividade(){
    return this.dataInatividade;
  }

  /**
   * Define dataInatividade
   * @param dataInatividade dataInatividade
   * @generated
   */
  public Contrato setDataInatividade(java.util.Date dataInatividade){
    this.dataInatividade = dataInatividade;
    return this;
  }

  /**
   * Obtém dtInicio
   * return dtInicio
   * @generated
   */
  
  public java.util.Date getDtInicio(){
    return this.dtInicio;
  }

  /**
   * Define dtInicio
   * @param dtInicio dtInicio
   * @generated
   */
  public Contrato setDtInicio(java.util.Date dtInicio){
    this.dtInicio = dtInicio;
    return this;
  }

  /**
   * Obtém dtFim
   * return dtFim
   * @generated
   */
  
  public java.util.Date getDtFim(){
    return this.dtFim;
  }

  /**
   * Define dtFim
   * @param dtFim dtFim
   * @generated
   */
  public Contrato setDtFim(java.util.Date dtFim){
    this.dtFim = dtFim;
    return this;
  }

  /**
   * Obtém plano
   * return plano
   * @generated
   */
  
  public Plano getPlano(){
    return this.plano;
  }

  /**
   * Define plano
   * @param plano plano
   * @generated
   */
  public Contrato setPlano(Plano plano){
    this.plano = plano;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Contrato object = (Contrato)obj;
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
