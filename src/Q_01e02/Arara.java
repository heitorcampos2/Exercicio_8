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
public class Arara extends Ave{
    
    public Arara(String n, boolean v){
        super(n);
        voa(v);        
    }
    
    public void talk(){
       System.out.println("arara, arara");         
    }
}
