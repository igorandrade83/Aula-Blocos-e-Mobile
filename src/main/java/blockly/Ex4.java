package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;


@CronapiMetaData(type = "blockly")
@CronappSecurity
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
    System.out.println(cronapi.screen.Operations.getValueOfField(Var.valueOf("vars.input5077_senha")).getObjectAsString());
    System.out.println(cronapi.screen.Operations.getValueOfField(Var.valueOf("vars.input3854_nome")).getObjectAsString());
    System.out.println(cronapi.screen.Operations.getValueOfField(Var.valueOf("vars.input3912_login")).getObjectAsString());
    System.out.println(cronapi.util.Operations.generateUUID().getObjectAsString());
    return Var.VAR_NULL;
   }
 }.call();
}

}

