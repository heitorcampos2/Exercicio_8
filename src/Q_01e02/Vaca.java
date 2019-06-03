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
public class Vaca extends Mamifero {
    private boolean temLeite;
    
    public Vaca(String n, int p, boolean t){
       super(n); 
       setPatas(p);
       isTemLeite(l);
    }
    ////////////////////////////////
    public boolean getTemLeite(){
        return this.temLeite;
    }
    
    public void isTemLeite(boolean t){
        this.temLeite = t;
    }
    ///////////////////////////////
    public void talk(){
        System.out.println("Muuu");
    }
}
