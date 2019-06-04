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
public class Cachorro extends Mamifero {
    private boolean lateAlto;
    //////////////////////////////////////////////
    public Cachorro(String n, int p, boolean l){
        super(n,p);
        setLatealto(l);       
    }
    ///////////////////////////////////
    public void talk(){
        System.out.println("Au, au");
    }
    ///////////////////////////
    public boolean getLateALto(){
        return this.lateAlto;
    }
    
    public void setLatealto(boolean l){
        this.lateAlto = l;        
    }
    ///////////////////////////
    
}
