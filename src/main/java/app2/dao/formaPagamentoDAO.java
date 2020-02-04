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
@Repository("formaPagamentoDAO")
@Transactional(transactionManager="app2-TransactionManager")
public interface formaPagamentoDAO extends JpaRepository<formaPagamento, java.lang.String> {

  /**
   * Obtém a instância de formaPagamento utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM formaPagamento entity WHERE entity.id = :id")
  public formaPagamento findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de formaPagamento utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM formaPagamento entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);



  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Pagamento entity WHERE entity.formaPagamento.id = :id")
  public Page<Pagamento> findPagamento(@Param(value="id") java.lang.String id, Pageable pageable);
  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.contrato FROM Pagamento entity WHERE entity.formaPagamento.id = :id")
  public Page<Contrato> listContrato(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * ManyToOne Relation Delete
   * @generated
   */
  @Modifying
  @Query("DELETE FROM Pagamento entity WHERE entity.formaPagamento.id = :instanceId AND entity.contrato.id = :relationId")
  public int deleteContrato(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

}
