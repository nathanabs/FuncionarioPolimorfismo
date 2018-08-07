/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidade;

/**
 *
 * @author Nathan
 */
public class EmpregadoTerceirizado extends Empregado {

    private double despesaAdicional;

    public EmpregadoTerceirizado() {
    }

    public EmpregadoTerceirizado(double despesaAdicional, String nome, int horasTrabalhadas, double valorPorHora) {
        super(nome, horasTrabalhadas, valorPorHora);
        this.despesaAdicional = despesaAdicional;
    }

    public double getDespesaAdicional() {
        return despesaAdicional;
    }

    public void setDespesaAdicional(double despesaAdicional) {
        this.despesaAdicional = despesaAdicional;
    }

    @Override
    public double pagamento() {
        return super.pagamento() + despesaAdicional * 1.1;
    }

}
