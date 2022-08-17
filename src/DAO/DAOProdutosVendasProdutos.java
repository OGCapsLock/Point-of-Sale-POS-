
package DAO;

import conexoes.ConexaoMySql;
import java.util.ArrayList;
import model.ModelProdutosVendasProdutos;
import model.ModelProduto;
import model.ModelVendasProdutos;


public class DAOProdutosVendasProdutos extends ConexaoMySql {

    public ArrayList<ModelProdutosVendasProdutos> getListaProdutosVendasProdutosDAO(int pCodigoVenda) {
        ArrayList<ModelProdutosVendasProdutos> listaModelProdutosVendasProdutos = new ArrayList<>();
        ModelProdutosVendasProdutos modelProdutosVendasProdutos = new ModelProdutosVendasProdutos();
        ModelProduto modelProduto = new ModelProduto();
        ModelVendasProdutos modelVendasProdutos = new ModelVendasProdutos();

        try {
            this.conectar();
            this.executarSQL("SELECT tbl_produto.pk_id_produto, tbl_produto.pro_estoque, tbl_produto.pro_nome, tbl_produto.pro_valor, pro_Cod_Barras, tbl_vendas_produtos.fk_produto, tbl_vendas_produtos.fk_venda, tbl_vendas_produtos.pk_id_venda_produto, tbl_vendas_produtos.ven_pro_quantidade, tbl_vendas_produtos.ven_pro_valor FROM tbl_vendas_produtos INNER JOIN tbl_produto ON tbl_produto.pk_id_produto = tbl_vendas_produtos.fk_produto WHERE tbl_vendas_produtos.fk_venda = '" + pCodigoVenda + "';");

            while (this.getResultSet().next()) {
                modelProdutosVendasProdutos = new ModelProdutosVendasProdutos();
                modelProduto = new ModelProduto();
                modelVendasProdutos = new ModelVendasProdutos();
                
                modelProduto.setIdProduto(this.getResultSet().getInt(1));
                modelProduto.setProEstoque(this.getResultSet().getInt(2));
                modelProduto.setProNome(this.getResultSet().getString(3));
                modelProduto.setProValor(this.getResultSet().getDouble(4));
                modelProduto.setProCodBarra(this.getResultSet().getInt(5));
                
                modelVendasProdutos.setProduto(this.getResultSet().getInt(6));
                modelVendasProdutos.setVenda(this.getResultSet().getInt(7));
                modelVendasProdutos.setIdVendaProduto(this.getResultSet().getInt(8));
                modelVendasProdutos.setVenProQuantidade(this.getResultSet().getInt(9));
                modelVendasProdutos.setVenProValor(this.getResultSet().getDouble(10));
                
                modelProdutosVendasProdutos.setModelProdutos(modelProduto);
                modelProdutosVendasProdutos.setModelVendasProdutos(modelVendasProdutos);
                
                listaModelProdutosVendasProdutos.add(modelProdutosVendasProdutos);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
            return listaModelProdutosVendasProdutos;
    }
}
