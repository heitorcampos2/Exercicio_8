/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q_03;

/**
 *
Cria uma classe Administrador que herde da classe Empregado. 
* 
* Atributos: ajudaDeCusto (ajudas referentes a estadia, viagens, etc). 
* 
* Na classe Administrador o método calcularSalario deve ser redefinido de tal forma que o
cálculo leve em consideração a ajudaDeCusto. 
* 
* Crie um construtor para setar
todos os atributos da classe Administrador. Crie os gets e sets.
 * 
 * @author ifnmg
 */
public class Administrador extends Empregado{
    private double ajudaDeCusto;
    
    public double getAjudaDeCusto(){
        return this.ajudaDeCusto;
    }
    
    public void setAjudaDeCusto(double a){
        this.ajudaDeCusto = a;
    }
    
    public Administrador(String n, String e, String t, String c,double s,double i, double a){
        super(n,e,t,c,s,i);
        setAjudaDeCusto(a);
    }
    
    @Override
    public double calcularSalario(){
        double s = this.getSalarioBase() - ( this.getImposto() * this.getSalarioBase() )+ this.getAjudaDeCusto();
        return s;
    }
    
    
}
