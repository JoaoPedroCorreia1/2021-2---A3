
package backend.controler;


public class AplicacaoController {
    
    // Atr
    static private int idUsuarioSelecionado = -1;
    static private int idProjetoSelecionado = -1;
    static private int idRequisitoSelecionado = -1;

    // Get e Set
    public static int getIdUsuarioSelecionado() {
        return idUsuarioSelecionado;
    }

    public static void setIdUsuarioSelecionado(int idUsuarioSelecionado) {
        AplicacaoController.idUsuarioSelecionado = idUsuarioSelecionado;
    }

    public static int getIdProjetoSelecionado() {
        return idProjetoSelecionado;
    }

    public static void setIdProjetoSelecionado(int idProjetoSelecionado) {
        AplicacaoController.idProjetoSelecionado = idProjetoSelecionado;
    }

    public static int getIdRequisitoSelecionado() {
        return idRequisitoSelecionado;
    }

    public static void setIdRequisitoSelecionado(int idRequisitoSelecionado) {
        AplicacaoController.idRequisitoSelecionado = idRequisitoSelecionado;
    }
    
    
}
