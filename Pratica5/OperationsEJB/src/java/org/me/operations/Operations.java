/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.me.operations;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.ejb.Stateless;

/**
 *
 * @author 37287
 */
@WebService()
@Stateless()
public class Operations {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "add")
    public int add(@WebParam(name = "num1") int num1, @WebParam(name = "num2") int num2) {
        return num1 + num2;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "mult")
    public int mult(@WebParam(name = "num1") int num1, @WebParam(name = "num2") int num2) {
        return num1 * num2;
    }
}
