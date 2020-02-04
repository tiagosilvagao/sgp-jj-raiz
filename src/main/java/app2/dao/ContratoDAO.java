package app2.dao;

import app2.entity.*;
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
@Repository("ContratoDAO")
@Transactional(transactionManager="app2-TransactionManager")
public interface ContratoDAO extends JpaRepository<Contrato, java.lang.String> {

  /**
   * Obtém a instância de Contrato utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM Contrato entity WHERE entity.id = :id")
  public Contrato findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de Contrato utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM Contrato entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);



  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Pagamento entity WHERE entity.contrato.id = :id")
  public Page<Pagamento> findPagamento(@Param(value="id") java.lang.String id, Pageable pageable);
  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.formaPagamento FROM Pagamento entity WHERE entity.contrato.id = :id")
  public Page<formaPagamento> listFormaPagamento(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * ManyToOne Relation Delete
   * @generated
   */
  @Modifying
  @Query("DELETE FROM Pagamento entity WHERE entity.contrato.id = :instanceId AND entity.formaPagamento.id = :relationId")
  public int deleteFormaPagamento(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

  /**
   * Foreign Key aluno
   * @generated
   */
  @Query("SELECT entity FROM Contrato entity WHERE entity.aluno.id = :id")
  public Page<Contrato> findContratosByAluno(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * Foreign Key plano
   * @generated
   */
  @Query("SELECT entity FROM Contrato entity WHERE entity.plano.id = :id")
  public Page<Contrato> findContratosByPlano(@Param(value="id") java.lang.String id, Pageable pageable);

}
