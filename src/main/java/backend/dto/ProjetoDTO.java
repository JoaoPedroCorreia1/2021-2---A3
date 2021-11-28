package backend.dto;

public class ProjetoDTO {
    
    private int idProjeto;
    
    private int idUsuarioAutor;
    
    private String nome;
    private String descricao;

    public ProjetoDTO(
            int idUsuarioAutor,
            String nome,
            String descricao
    ) {
        this.idUsuarioAutor = idUsuarioAutor;
        
        this.nome = nome;
        this.descricao = descricao;
    }

    
    public int getIdProjeto() {
        return idProjeto;
    }
    

    public void setIdProjeto(int idProjeto) {
        this.idProjeto = idProjeto;
    }
    
    public int getIdUsuarioAutor() {
        return idUsuarioAutor;
    }
    
    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }
    
    // Métodos publicos
    public String getRelatorio()
    {
        String relatorio = "";
        
        // adicionar Título 1
        relatorio += "##### Relatório #####";
        relatorio += "\n";
        
        // adicionar Título 2
        relatorio += "Projeto: " + getNome();
        relatorio += "\n";
        
        return relatorio;
    }
    
}
