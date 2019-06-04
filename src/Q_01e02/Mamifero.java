/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q_01e02;

/**
 *
 * @author HeiThor
 */
public class Mamifero extends Animal {
    private int patas;
    
    ///////////////////////////
    public int getPatas(){
        return this.patas;
    }
    
    public void setPatas(int p){
        this.patas = p;
    }
   //////////////////////////////
    
    public Mamifero(String n, int p){
        super(n);
        setPatas(p);
    }
    
}
