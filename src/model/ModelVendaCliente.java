
package model;

import java.util.ArrayList;


public class ModelVendaCliente {
    
    private ModelVenda modelVenda;
    private ModelCliente modelCliente;
    private ArrayList<ModelVendaCliente> listaModelVendaClientes;

    public ModelVenda getModelVenda() {
        return modelVenda;
    }

    public void setModelVenda(ModelVenda modelVenda) {
        this.modelVenda = modelVenda;
    }

    public ModelCliente getModelCliente() {
        return modelCliente;
    }

    public void setModelCliente(ModelCliente modelCliente) {
        this.modelCliente = modelCliente;
    }

    public ArrayList<ModelVendaCliente> getListaModelVendaClientes() {
        return listaModelVendaClientes;
    }

    public void setListaModelVendaClientes(ArrayList<ModelVendaCliente> listaModelVendaClientes) {
        this.listaModelVendaClientes = listaModelVendaClientes;
    }
    
    
    
}
