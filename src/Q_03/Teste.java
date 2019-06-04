/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q_03;

/**
 *
 *Crie uma classe de teste que contenha um main e 
 * crie uma pessoa, um fornecedor, um empregado, um administrador e um operário. 
 * 
 * Chame os métodos de cada classe (que não sejam os gets e sets). 
 * 
 * @author ifnmg
 */
public class Teste {
    public static void main(String[] args){
        Pessoa p = new Pessoa("Heitor","Rua Zero, 01","(38) 0000-0000");
        Fornecedor f = new Fornecedor("Samara","Rua Um, 02","(38) 0000-0000",2600,400);
        Empregado e = new Empregado("João","Rua nove, 225","(38) 0000-0000","0003",2500,0.07);
        Administrador a = new Administrador("Izabela","Rua quatro", "220","(38) 0000-0000",3000,0.75,0.8);
        Operario o = new Operario("Julesca","Rua P2", "69","(38) 0000-0000",2200,0.50,1000,0.5);
        
        
        System.out.println(f.obterSaldo());
        
        System.out.println(e.calcularSalario());

        System.out.println(a.calcularSalario());
        
        System.out.println(o.calcularSalario());
        
    }
}
