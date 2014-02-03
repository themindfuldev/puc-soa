


package client;

// importar declaracoes do servico do proxy
import usingteste.Testando;
import usingteste.Teste;

public class TesteCliente {

    // declarar servico
    private Teste service;

    // declarar proxy
    private Testando proxy;

    public static void main(String[] args) {
        TesteCliente client = new TesteCliente();
	client.doTest(args);
    }

    public void doTest(String[] args) {
        try {

	    // criar instancia do servico
	    service = new Teste();

	    // obter instancia do proxy (ou porta)
	    proxy = service.getTestandoPort();

	    int ret = proxy.testandoOp1();
	    System.out.println("Resultado testandoOp1: "+ret);

	    ret = proxy.testandoOp("1234567890");
	    System.out.println("Resultado testandoOp: "+ret);

	    ret = proxy.testandoOp1();
	    System.out.println("Resultado testandoOp1: "+ret);

	} catch(Exception e) {
	      e.printStackTrace();
	}
    }
}
