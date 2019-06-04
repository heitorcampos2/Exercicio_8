/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q_03;

/**
 *Cria uma Classe Operario que herde de Empregado. 
 * 
 * Atributos: valorProducao (valor monetário dos artigos efetivamente produzidos pelo operario) 
 * e comissao (porcentagem do valorProducao que será adicionado ao salário do operário).
 * 
Redefina o método calcularSalario para levar em consideração a comissao. 
* 
* Crie um construtor para setar todos os atributos da classe Operario. Crie os gets e sets
 * 
 * @author ifnmg
 */
public class Operario extends Empregado{
    private double valorProducao;
    private double comissao;
    
    public double getValorProducao(){
        return this.valorProducao;
    }
    
    public double getComissao(){
        return this.comissao;
    }
    
    public void setValorProducao(double vp){
        this.valorProducao = vp;
    }
    
    public void setComissao(double c){
        this.comissao = c;
    }
    
    public Operario(String n, String e, String t, String c,double s,double i, double vp, double co){
        super(n,e,t,c,s,i);
        setValorProducao(vp);
        setComissao(co);
       
    }

    public double calcularSalario(){
        double s = getSalarioBase() - ( getImposto() * getSalarioBase() ) + (this.getValorProducao() * (this.getComissao()/100));
        return s;
    }
}
