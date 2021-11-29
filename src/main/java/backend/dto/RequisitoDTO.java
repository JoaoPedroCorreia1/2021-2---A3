package backend.dto;

public class RequisitoDTO {
    
    private int idRequisito;
    
    private int idUsuarioAutor;
    private String autor;
    
    private String dataDeCriacao;
    private String dataDeUltimaAlteracao;
    private String dataDeUltimaModificacao;
    
    private String estado;
    
    private String modulo;
    private String funcinalidades;
    private String versao;
    private String prioridade;
    private String complexidade;
    private String fase;
    
    private String descricao;

    public RequisitoDTO(
            int idRequisito, 
            
            int idUsuarioAutor, 
            String autor, 
            
            String dataDeCriacao, 
            String dataDeUltimaAlteracao, 
            String dataDeUltimaModificacao,
            
            String estado, 
           
            String modulo, 
            String funcinalidades, 
            String versao, 
            String prioridade, 
            String complexidade, 
            String fase, 
            
            String descricao) {
        this.idRequisito = idRequisito;
        this.idUsuarioAutor = idUsuarioAutor;
        this.autor = autor;
        this.dataDeCriacao = dataDeCriacao;
        this.dataDeUltimaAlteracao = dataDeUltimaAlteracao;
        this.dataDeUltimaModificacao = dataDeUltimaModificacao;
        this.estado = estado;
        this.modulo = modulo;
        this.funcinalidades = funcinalidades;
        this.versao = versao;
        this.prioridade = prioridade;
        this.complexidade = complexidade;
        this.fase = fase;
        this.descricao = descricao;
    }
    
    public int getIdRequisito() {
        return idRequisito;
    }

    public void setIdRequisito(int idRequisito) {
        this.idRequisito = idRequisito;
    }
    
    public int getIdUsuarioAutor() {
        return idUsuarioAutor;
    }

    public String getAutor() {
        return autor;
    }

    public String getDataDeCriacao() {
        return dataDeCriacao;
    }

    public String getDataDeUltimaAlteracao() {
        return dataDeUltimaAlteracao;
    }

    public String getDataDeUltimaModificacao() {
        return dataDeUltimaModificacao;
    }

    public String getEstado() {
        return estado;
    }

    public String getModulo() {
        return modulo;
    }

    public String getFuncinalidades() {
        return funcinalidades;
    }

    public String getVersao() {
        return versao;
    }

    public String getPrioridade() {
        return prioridade;
    }

    public String getComplexidade() {
        return complexidade;
    }

    public String getFase() {
        return fase;
    }

    public String getDescricao() {
        return descricao;
    }
    
    
}
