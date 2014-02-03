
package teste;

// importar declaracoes para anotacoes
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

// anotacao do Servico Web
@WebService( name = "Testando", serviceName = "Teste")
public class Testando {

    

   int cont;

   public Testando(){
      cont = 0;
   }

   // inserir anotacao da operacao/metodo Web
   @WebMethod( operationName = "TestandoOp")
   public int TestandoOp( @WebParam( name = "param1") String param1)
    
   {

         return (param1.length());
    
   }

   // inserir anotacao da operacao/metodo Web
   @WebMethod( operationName = "TestandoOp1")
   public int TestandoOp1()
    
   {

         return (++cont);
    
   }




}
