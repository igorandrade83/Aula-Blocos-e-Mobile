package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;


@CronapiMetaData(type = "blockly")
@CronappSecurity
public class While {

public static final int TIMEOUT = 300;

/**
 *
 * @return Var
 */
// while
public static Var Executar() throws Exception {
 return new Callable<Var>() {

   private Var num = Var.VAR_NULL;
   private Var i = Var.VAR_NULL;
   private Var i_start = Var.VAR_NULL;
   private Var i_end = Var.VAR_NULL;
   private Var i_inc = Var.VAR_NULL;

   public Var call() throws Exception {
    num = Var.valueOf(0);
    i_start = Var.valueOf(1);
    i_end = Var.valueOf(10);
    i_inc = Var.valueOf(1);
    if (i_start.greaterThan(i_end)) {
        i_inc.multiply(-1);
    }
    for (i = Var.valueOf(i_start);
        i_inc.getObjectAsInt() >= 0 ? i.getObjectAsLong() <= i_end.getObjectAsLong() : i.getObjectAsLong()  >= i_end.getObjectAsLong();
    i.inc(i_inc))  {
        num = cronapi.math.Operations.sum(num,Var.valueOf(10));
    } // end for
    System.out.println(num.getObjectAsString());
    return Var.VAR_NULL;
   }
 }.call();
}

}

