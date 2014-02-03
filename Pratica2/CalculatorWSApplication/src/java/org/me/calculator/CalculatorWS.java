/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.me.calculator;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author 37287
 */
@WebService()
public class CalculatorWS {

    /**
     * Operação de serviço web
     */
    @WebMethod(operationName = "add")
    public int add(@WebParam(name = "i")
    int i, @WebParam(name = "j")
    int j) {
        int k = i + j;
        return k;
    }

}
