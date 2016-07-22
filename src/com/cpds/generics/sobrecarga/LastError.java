/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cpds.generics.sobrecarga;

/**
 *
 * @author dml
 */
public class LastError<T> {

    private T lastError;

    void setError(T t) {
        lastError = t;
        System.out.println("LastError: setError");
    }
}

class StrLastError<S extends CharSequence> extends LastError<String> {

    public StrLastError(S s) {
    }

    void setError(S s) {
        System.out.println("StrLastError: setError");
    }
}

class Test {

    public static void main(String[] args) {
        StrLastError<String> err = new StrLastError<String>("Error");
        //err.setError("Last error");
    }
}
