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
@Repository("PagamentoDAO")
@Transactional(transactionManager="app2-TransactionManager")
public interface PagamentoDAO extends JpaRepository<Pagamento, java.lang.String> {

  /**
   * Obtém a instância de Pagamento utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM Pagamento entity WHERE entity.id = :id")
  public Pagamento findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de Pagamento utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM Pagamento entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);



  /**
   * Foreign Key formaPagamento
   * @generated
   */
  @Query("SELECT entity FROM Pagamento entity WHERE entity.formaPagamento.id = :id")
  public Page<Pagamento> findPagamentosByFormaPagamento(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * Foreign Key contrato
   * @generated
   */
  @Query("SELECT entity FROM Pagamento entity WHERE entity.contrato.id = :id")
  public Page<Pagamento> findPagamentosByContrato(@Param(value="id") java.lang.String id, Pageable pageable);

}
