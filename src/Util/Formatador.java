
package Util;


public class Formatador {
    
    /**
     * Efetua a troca de virgulas por ponto
     * @param pValor
     * @return double
     */
    public double converteVirgulaParaPonto(String pValor){
        
        String retorno = new String();
        int tamanhoString = pValor.length();
      
        for (int i = 0; i < tamanhoString; i++) {
            if (pValor.charAt(i) == ',') {
                retorno += '.';
            }else{
                retorno += pValor.charAt(i);
            }   
        }
        return Double.parseDouble(retorno);
    }
    
}
