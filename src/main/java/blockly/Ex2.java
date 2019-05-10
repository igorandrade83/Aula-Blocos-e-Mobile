package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;
import org.springframework.data.domain.*;
import org.springframework.validation.annotation.*;
import org.springframework.web.bind.annotation.*;


/** 
* 
* RestController @generated 
* 
*/ 

@RestController
@RequestMapping(value = "/api/rest/main/Ex2")
@CronapiMetaData(type = "blockly")
@CronappSecurity(get = "Public")
public class Ex2 {

public static final int TIMEOUT = 300;

/**
 *
 * @return Var
 */

@RequestMapping(method = RequestMethod.GET, value="/Executar")
// ex2
public static Var Executar() throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {
    return Var.valueOf("Teste restfull");
   }
 }.call();
}

}

