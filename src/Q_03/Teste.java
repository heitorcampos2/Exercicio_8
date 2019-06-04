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
    public void main(String[] args){
        Pessoa p = new Pessoa("Heitor","Rua Zero, 01",555555555);
        Fornecedor f = new Fornecedor("Samara","Rua Um, 02",55555555,2004,500);
        Empregado e = new Empregado("João","Rua nove, 225",444444444,0003,1500,7);
        Administrador a = new Administrador("Izabela","Rua quatro, 220",666666666,0002,1750,5,500);
        Operario o = new Operario("Julesca","Rua P2, 69",666666666,0007,1001,10,300,5);
        
        System.out.println("FORNECEDOR");
        System.out.println(f.obterSaldo());
        
        System.out.println("EMPREGADO");
        System.out.println(e.calcularSalario());

        System.out.println("ADMINISTRADOR");
        System.out.println(a.calcularSalario());
        
        System.out.println("OPERARIO");
        System.out.println(o.calcularSalario());
        
    }
}
