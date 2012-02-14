/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.List;

/**
 *
 * @author User
 */
public class B {
    
    public boolean methodA() {
        try {
            System.out.println("AAA");
            return false;
            //throw new Exception("Exxxx");
        } catch(Exception ex) {
            ex.printStackTrace();
        } finally {
            System.out.println("finally1");
        }
        
        return false;
        
        /*try {
            System.out.println("bbb");
            return false;
        } finally {
            System.out.println("finally2");
        }
        
        if (false) {
            return true;
        }
        
        if (true) {
                return true;
         }
        
        return false; */
    }
    
    public boolean methodB() {
        try {
        throw new RuntimeException();
        } finally {
            System.out.println("finally");
        }
    }
    
    public static void main(String[] args) {
        B b = new B();
        b.methodA();
        //b.methodB();
    }
    
    public <R> R getR(List<R> r) {
        return r.get(0);
    }
    
}
