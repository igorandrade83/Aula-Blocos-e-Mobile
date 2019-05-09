package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;


@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Ex3 {

public static final int TIMEOUT = 300;

/**
 *
 * @return Var
 */
// MaiorNumero
public static Var ValoresImpares() throws Exception {
 return new Callable<Var>() {

   private Var item01 = Var.VAR_NULL;
   private Var item02 = Var.VAR_NULL;
   private Var i = Var.VAR_NULL;
   private Var impares = Var.VAR_NULL;
   private Var i_inc = Var.VAR_NULL;

   public Var call() throws Exception {
    item01 = cronapi.screen.Operations.getValueOfField(Var.valueOf("vars.input01"));
    item02 = cronapi.screen.Operations.getValueOfField(Var.valueOf("vars.input02"));
    i_inc = Var.valueOf(1);
    if (item01.greaterThan(item02)) {
        i_inc.multiply(-1);
    }
    for (i = Var.valueOf(item01);
        i_inc.getObjectAsInt() >= 0 ? i.getObjectAsLong() <= item02.getObjectAsLong() : i.getObjectAsLong()  >= item02.getObjectAsLong();
    i.inc(i_inc))  {
        if (Var.valueOf(Var.valueOf(!cronapi.math.Operations.mod(i, Var.valueOf(2)).equals(Var.valueOf(0))).getObjectAsBoolean() && Var.valueOf(!i.equals(Var.valueOf(0))).getObjectAsBoolean()).getObjectAsBoolean()) {
            impares = Var.valueOf(i.toString() + Var.valueOf(", ").toString());
        }
    } // end for
    System.out.println(impares.getObjectAsString());
    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeValueOfField"), Var.valueOf("vars.textarea3327"), impares);
    return Var.VAR_NULL;
   }
 }.call();
}

}

