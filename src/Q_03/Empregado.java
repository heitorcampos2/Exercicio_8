/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q_03;

/**
 *
 * @author HeiThor
 */
/*
Crie uma classe Empregado, que herde da classe Pessoa. 

Atributos:
codigoSetor, salarioBase (vencimento base) e imposto (porcentagem retida dos
impostos). 

Métodos: calcularSalario (leve em consideração o salario base e o
imposto). 

Crie um construtor para setar todos os atributos da classe
Empregado. Crie os gets e sets.
*/
public class Empregado extends Pessoa {
    private String codigoSetor;
    private double salarioBase;
    private double imposto;
    
    public Empregado(String n, String e, String t,String c,double s,double i){
    super(n,e,t);
    setCodigoSetor(c);
    setSalarioBase(s);
    setImposto(i);
    }
    
    public String getCodigoSetor(){
        return this.codigoSetor;
    }
    
    public double getSalarioBase(){
        return this.salarioBase;
    }
    
    public double getImposto(){
        return this.imposto;
    }
    
    public void setCodigoSetor(String c){
        this.codigoSetor = c;
    }
    
    public void setSalarioBase(double s){
        this.salarioBase = s;
    }
    
    public void setImposto(double i){
        this.imposto = i;
    }
    
    public double calcularSalario(){
        double s;
        s = getSalarioBase() - ( getImposto() * getSalarioBase() );
        return s;
    }
    
}
