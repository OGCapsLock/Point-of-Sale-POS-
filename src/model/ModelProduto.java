
package model;

public class ModelProduto {
    
    private int idProduto;
    private String proNome;
    private Double proValor;
    private int proEstoque;
    private int proCodBarra;

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getProNome() {
        return proNome;
    }

    public void setProNome(String proNome) {
        this.proNome = proNome;
    }

    public Double getProValor() {
        return proValor;
    }

    public void setProValor(Double proValor) {
        this.proValor = proValor;
    }

    public int getProEstoque() {
        return proEstoque;
    }

    public void setProEstoque(int proEstoque) {
        this.proEstoque = proEstoque;
    }

    public int getProCodBarra() {
        return proCodBarra;
    }

    public void setProCodBarra(int proCodBarra) {
        this.proCodBarra = proCodBarra;
    }
    
    

    @Override
    public String toString() {
        return "ModelProduto{" + "idProduto=" + idProduto + ", proNome=" + proNome + ", proValor=" + proValor + ", proEstoque=" + proEstoque + ", proCodBarra=" + proCodBarra +'}';
    }
    
    
    
    
    
}
