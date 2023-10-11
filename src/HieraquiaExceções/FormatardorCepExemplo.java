package HieraquiaExceções;

public class FormatardorCepExemplo {
    public static void main(String[] args) {
        try{
        final String cepFormatado = formatarCep("23765064");
        System.out.println(cepFormatado);
    }catch (CepInvalidoExcption e) {
        e.printStackTrace();
    }
    }
   
Static String formatarCep(String cep) throws CepInvalidoExcption{
    if(cep.length() != 8)
        throw new CepInvalidoExcption();
        return "23.765-064";}
        }
