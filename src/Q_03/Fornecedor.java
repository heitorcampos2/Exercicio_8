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
public class Fornecedor extends Pessoa {
    private double valorCredito;
    private double valorDivida;
    
    public double getValorCredito(){
        return this.valorCredito;
    }
    
    public double getValorDivida(){
        return this.valorDivida;
    }
    
    public void setValorCredito(double vc){
        this.valorCredito = vc;
    }
    
    public void setValorDivida(double vd){
        this.valorDivida = vd;
    }
    ///////////////////////////////////////////////
    public void obterSaldo(){
        double saldo;
        saldo = getValorCredito() - getValorDivida();
        System.out.println("" + saldo );
    }
    ///////////////////////////////////////////////
    public Fornecedor(String n, String e, String t, double vc, double vd){
        super (n,e,t);
        setValorCredito(vc);
        setValorDivida(vd);
    }
    
}
