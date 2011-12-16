/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author User
 */
public class A {
    
    private void displayMsg(String str) {
        System.out.println("String " + str);
    }
    
    private void displayMsg(Object obj) {
         System.out.println("Object " + obj);
    }
    
    private void displayMsg(A a) {
         System.out.println("A " + a);
    }
    
    @Override
    public String toString() {
        return "A";
    }
    public static void main(String[] args) {
        A a = new A();
        Object o = new A();
        a.displayMsg(new String("aaa"));
        a.displayMsg(a);
        a.displayMsg(o);
    }
    
}
