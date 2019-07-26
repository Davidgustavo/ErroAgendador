package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;


@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Consulta {

public static final int TIMEOUT = 300;

/**
 *
 * @return Var
 */
// consulta
public static Var Executar() throws Exception {
 return new Callable<Var>() {

   private Var consulta = Var.VAR_NULL;

   public Var call() throws Exception {
    consulta = cronapi.database.Operations.query(Var.valueOf("app.entity.User"),Var.valueOf("select u.id from User u where u.name = \'Lucas\'"));
    consulta = cronapi.list.Operations.getFirst(consulta);
    cronapi.database.Operations.execute(Var.valueOf("app.entity.User"), Var.valueOf("update User set email = :email where id = :id"),Var.valueOf("email",Var.valueOf("4@gmail.com")),Var.valueOf("id",consulta));
    System.out.println(consulta.getObjectAsString());
    return Var.VAR_NULL;
   }
 }.call();
}

}

