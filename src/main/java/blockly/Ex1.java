package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;


@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Ex1 {

public static final int TIMEOUT = 300;

/**
 *
 * @return Var
 */
// Noticacao
public static Var OlaUsuario() throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {
    cronapi.util.Operations.callClientFunction( Var.valueOf("cronapi.screen.notify"), Var.valueOf("success"), Var.valueOf(Var.valueOf("Olá ").toString() + cronapi.util.Operations.getCurrentUserName().toString() + Var.valueOf(", bom dia!").toString()));
    return Var.VAR_NULL;
   }
 }.call();
}

}

