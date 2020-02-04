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
@Repository("PlanoDAO")
@Transactional(transactionManager="app2-TransactionManager")
public interface PlanoDAO extends JpaRepository<Plano, java.lang.String> {

  /**
   * Obtém a instância de Plano utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM Plano entity WHERE entity.id = :id")
  public Plano findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de Plano utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM Plano entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);



  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Contrato entity WHERE entity.plano.id = :id")
  public Page<Contrato> findContrato(@Param(value="id") java.lang.String id, Pageable pageable);
  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.aluno FROM Contrato entity WHERE entity.plano.id = :id")
  public Page<Aluno> listAluno(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * ManyToOne Relation Delete
   * @generated
   */
  @Modifying
  @Query("DELETE FROM Contrato entity WHERE entity.plano.id = :instanceId AND entity.aluno.id = :relationId")
  public int deleteAluno(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

  /**
   * Foreign Key tpAcrescimoAtraso
   * @generated
   */
  @Query("SELECT entity FROM Plano entity WHERE entity.tpAcrescimoAtraso.id = :id")
  public Page<Plano> findPlanosByTpAcrescimoAtraso(@Param(value="id") java.lang.String id, Pageable pageable);

}
