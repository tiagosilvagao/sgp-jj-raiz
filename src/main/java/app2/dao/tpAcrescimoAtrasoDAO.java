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
@Repository("tpAcrescimoAtrasoDAO")
@Transactional(transactionManager="app2-TransactionManager")
public interface tpAcrescimoAtrasoDAO extends JpaRepository<tpAcrescimoAtraso, java.lang.String> {

  /**
   * Obtém a instância de tpAcrescimoAtraso utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM tpAcrescimoAtraso entity WHERE entity.id = :id")
  public tpAcrescimoAtraso findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de tpAcrescimoAtraso utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM tpAcrescimoAtraso entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);



  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Plano entity WHERE entity.tpAcrescimoAtraso.id = :id")
  public Page<Plano> findPlano(@Param(value="id") java.lang.String id, Pageable pageable);

}
