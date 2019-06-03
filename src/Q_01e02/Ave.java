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
public class Ave extends Animal{
    private String voa;
    /////////////////////////
    public String getVoa(){
        return this.voa;
    }
    
    public void setVoa(String v){
        this.voa = v;
    }
   //////////////////////////////
   public boolean voa(boolean v){
       return true;
   }
   
   public void talk(String t){
       System.out.println("piu-piu");
   }
   //////////////////////////////////
   public Ave(String n){
       super (n);
   }
}
