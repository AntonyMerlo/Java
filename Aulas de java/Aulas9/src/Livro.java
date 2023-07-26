public class Livro implements Publicacao{
    private String titulo, autor;
    private int totPaginas, pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.leitor = leitor;
        this.aberto = false;
        this.pagAtual = 0;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    public String detalhes() {
        return "Livro: \ntitulo=" + titulo + "\nautor=" + autor + "\ntotPaginas=" + totPaginas + "\npagAtual=" + pagAtual
                + "\naberto=" + aberto + "\nleitor=" + leitor.getNome() + "\nsexo=" + leitor.getSexo();
    }

    @Override
    public void abrir(){
        setAberto(true);
    }
    @Override
    public void fechar(){
        setAberto(false);
    }
    @Override
    public void folhear(int p){
        if(p > this.totPaginas){
            this.pagAtual = 0;
        }
        else if(p < 0){
            this.pagAtual = 0;
        }
        setPagAtual(p);
    }
    @Override
    public void avançarPag(){
        setPagAtual(getPagAtual() + 1);
    }
    @Override
    public void voltarPag(){
        setPagAtual(getPagAtual() - 1);
    }
}
