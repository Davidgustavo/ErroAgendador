package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;
import cronapi.CronapiByteHeaderSignature;


/**
 * Classe que representa a tabela ARQUIVO
 * @generated
 */
@Entity
@Table(name = "\"ARQUIVO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Arquivo")
public class Arquivo implements Serializable {

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
  @Column(name = "nome_arq", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String nome_arq;

  /**
  * @generated
  */
  @Column(name = "arquivo", nullable = true, unique = false, insertable=true, updatable=true)
  @CronapiByteHeaderSignature
  
  private byte[] arquivo;

  /**
  * @generated
  */
  @Column(name = "ext_arq", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String ext_arq;

  /**
   * Construtor
   * @generated
   */
  public Arquivo(){
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
  public Arquivo setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém nome_arq
   * return nome_arq
   * @generated
   */
  
  public java.lang.String getNome_arq(){
    return this.nome_arq;
  }

  /**
   * Define nome_arq
   * @param nome_arq nome_arq
   * @generated
   */
  public Arquivo setNome_arq(java.lang.String nome_arq){
    this.nome_arq = nome_arq;
    return this;
  }

  /**
   * Obtém arquivo
   * return arquivo
   * @generated
   */
  
  public byte[] getArquivo(){
    return this.arquivo;
  }

  /**
   * Define arquivo
   * @param arquivo arquivo
   * @generated
   */
  public Arquivo setArquivo(byte[] arquivo){
    this.arquivo = arquivo;
    return this;
  }

  /**
   * Obtém ext_arq
   * return ext_arq
   * @generated
   */
  
  public java.lang.String getExt_arq(){
    return this.ext_arq;
  }

  /**
   * Define ext_arq
   * @param ext_arq ext_arq
   * @generated
   */
  public Arquivo setExt_arq(java.lang.String ext_arq){
    this.ext_arq = ext_arq;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Arquivo object = (Arquivo)obj;
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
