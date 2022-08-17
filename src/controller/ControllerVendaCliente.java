
package controller;

import DAO.DAOVendaCliente;
import java.util.ArrayList;
import model.ModelVendaCliente;


public class ControllerVendaCliente {
    
    private DAOVendaCliente DAOVendaCliente = new DAOVendaCliente();

    public ArrayList<ModelVendaCliente> getListaVendaClienteController() {
       return this.DAOVendaCliente.getListaVendaClienteDAO();
    }
    
}
