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
        
        Papagaio p = new Papagaio("Ranger",true,"Quero cafééeee!");
        p.talk();
        p.mostra();
        
        Arara a = new Arara("Malevola",true);
        a.talk();
        a.mostra();
        
        Cachorro c = new Cachorro("Bardock",4,true);
        c.talk();
        c.mostra();
        
        Vaca v = new Vaca("Mimosa",4,true);
        v.talk();
        v.mostra();
    }      
}
