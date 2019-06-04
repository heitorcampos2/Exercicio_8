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
public class TestaAnimais {
   public static void main(String [] args){
        
        Papagaio p = new Papagaio("Ranger vermelho",true,"Quero cafééeee!");
        p.imprime();
        p.talk();
        
        Arara a = new Arara("Malevola",true);
        a.imprime();
        a.talk();
        
        Cachorro c = new Cachorro("Bardock",4,true);
        c.imprime();
        c.talk();
        
        Vaca v = new Vaca("Mimosa",4,true);
        v.imprime();
        v.talk();
        
    }      
}
