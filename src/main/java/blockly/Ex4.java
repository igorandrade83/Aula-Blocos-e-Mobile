package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;


@CronapiMetaData(type = "blockly")
@CronappSecurity(post = "Public", execute = "Public")
public class Ex4 {

public static final int TIMEOUT = 300;

/**
 *
 * @return Var
 */
// Ex4
public static Var Executar() throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {
    cronapi.database.Operations.insert(Var.valueOf("app.entity.User"),Var.valueOf("password",cronapi.screen.Operations.getValueOfField(Var.valueOf("vars.input5077_senha"))),Var.valueOf("name",cronapi.screen.Operations.getValueOfField(Var.valueOf("vars.input3854_nome"))),Var.valueOf("login",cronapi.screen.Operations.getValueOfField(Var.valueOf("vars.input3912_login"))));
    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeView"), Var.valueOf("#/home/login"));
    return Var.VAR_NULL;
   }
 }.call();
}

}

