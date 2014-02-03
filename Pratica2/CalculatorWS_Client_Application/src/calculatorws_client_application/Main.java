/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatorws_client_application;

/**
 *
 * @author 37287
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try { // Call Web Service Operation
            org.me.calculator.CalculatorWSService service = new org.me.calculator.CalculatorWSService();
            org.me.calculator.CalculatorWS port = service.getCalculatorWSPort();
            // TODO initialize WS operation arguments here
            int i = 3;
            int j = 4;
            // TODO process result here
            int result = port.add(i, j);
            System.out.println("Result = " + result);
        } catch (Exception ex) {
            System.out.println("exception: " + ex);
        }

    }
}
