package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;


@CronapiMetaData(type = "blockly")
@CronappSecurity
public class DownArquivo {

public static final int TIMEOUT = 300;

/**
 *
 * @return Var
 */
// downArquivo
public static Var downLoad() throws Exception {
 return new Callable<Var>() {

   private Var anexo = Var.VAR_NULL;
   private Var nome_arq = Var.VAR_NULL;
   private Var ext_arq = Var.VAR_NULL;
   private Var arquivo = Var.VAR_NULL;

   public Var call() throws Exception {
    anexo = cronapi.database.Operations.query(Var.valueOf("app.entity.Arquivo"),Var.valueOf("select a from Arquivo a where a.nome_arq = :nome_arq"),Var.valueOf("nome_arq",cronapi.screen.Operations.getValueOfField(Var.valueOf("Arquivo.active.nome_arq"))));
    nome_arq = cronapi.object.Operations.getObjectField(anexo, Var.valueOf("nome_arq"));
    System.out.println(nome_arq.getObjectAsString());
    ext_arq = cronapi.object.Operations.getObjectField(anexo, Var.valueOf("ext_arq"));
    System.out.println(ext_arq.getObjectAsString());
    arquivo = cronapi.object.Operations.getObjectField(anexo, Var.valueOf("arquivo"));
    System.out.println(arquivo.getObjectAsString());
    cronapi.io.Operations.startDownload(arquivo, Var.valueOf(nome_arq.toString() + Var.valueOf(".").toString() + ext_arq.toString()));
    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.hideModal"), Var.valueOf("modal67424"));
    return Var.VAR_NULL;
   }
 }.call();
}

/**
 *
 * @return Var
 */
// Descreva esta função...
public static Var Atualiza() throws Exception {
 return new Callable<Var>() {

   private Var nome_arq = Var.VAR_NULL;
   private Var ext_arq = Var.VAR_NULL;
   private Var arquivo = Var.VAR_NULL;

   public Var call() throws Exception {
    arquivo = cronapi.database.Operations.query(Var.valueOf("app.entity.Arquivo"),Var.valueOf("select a.id from Arquivo a where a.nome_arq = :nome_arq"),Var.valueOf("nome_arq",cronapi.screen.Operations.getValueOfField(Var.valueOf("vars.nome"))));
    arquivo = cronapi.list.Operations.getFirst(arquivo);
    System.out.println(arquivo.getObjectAsString());
    cronapi.database.Operations.execute(Var.valueOf("app.entity.Arquivo"), Var.valueOf("update Arquivo set arquivo = :arquivo, nome_arq = :nome_arq, ext_arq = :ext_arq where id = :id"),Var.valueOf("arquivo",cronapi.screen.Operations.getValueOfField(Var.valueOf("vars.arquivo"))),Var.valueOf("nome_arq",cronapi.screen.Operations.getValueOfField(Var.valueOf("vars.nome"))),Var.valueOf("ext_arq",cronapi.screen.Operations.getValueOfField(Var.valueOf("vars.extensao"))),Var.valueOf("id",arquivo));
    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.hideModal"), Var.valueOf("modal67424"));
    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.refreshDatasource"), Var.valueOf("Arquivo"), Var.valueOf("false"));
    return Var.VAR_NULL;
   }
 }.call();
}

/**
 */
// Descreva esta função...
public static void abrirModal() throws Exception {
  new Callable<Var>() {

   public Var call() throws Exception {
    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.showModal"), Var.valueOf("modal67424"));
    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeValueOfField"), Var.valueOf("vars.arquivo"), Var.VAR_NULL);
    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeValueOfField"), Var.valueOf("vars.extensao"), Var.VAR_NULL);
    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeValueOfField"), Var.valueOf("vars.nome"), Var.VAR_NULL);
   return Var.VAR_NULL;
   }
 }.call();
}

/**
 *
 * @return Var
 */
// Descreva esta função...
public static Var insereRegistro() throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {
    cronapi.database.Operations.insert(Var.valueOf("app.entity.Arquivo"),Var.valueOf("ext_arq",cronapi.screen.Operations.getValueOfField(Var.valueOf("vars.extensao"))),Var.valueOf("arquivo",cronapi.screen.Operations.getValueOfField(Var.valueOf("vars.arquivo"))),Var.valueOf("nome_arq",cronapi.screen.Operations.getValueOfField(Var.valueOf("vars.nome"))));
    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.hideModal"), Var.valueOf("modal67424"));
    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.refreshDatasource"), Var.valueOf("Arquivo"), Var.valueOf("false"));
    return Var.VAR_NULL;
   }
 }.call();
}

}

