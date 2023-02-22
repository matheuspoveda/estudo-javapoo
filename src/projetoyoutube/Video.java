package projetoyoutube;
public class Video implements AcoesVideo{
    private String titulo;
    private int views;
    private int avaliacoes;
    private int curtidas;
    private boolean reproduzindo;

    public Video(String titulo) {
        this.titulo = titulo;
        this.avaliacoes = 0;
        this.curtidas = 0;
        this.reproduzindo = false;
        this.views = 0;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getAvaliacoes() {
        return avaliacoes;
    }

    public void setAvaliacoes(int avaliacoes) {
        int nova;
        nova = (this.avaliacoes + avaliacoes)/this.views;
        this.avaliacoes = avaliacoes;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean getReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }
    
    
    @Override
    public void play() {
        this.views += 1;
        this.reproduzindo = true;
    }

    @Override
    public void pause() {
        this.reproduzindo = false;
    }

    @Override
    public void like() {
        this.curtidas += 1;
    }

    @Override
    public String toString() {
        return "Video: " + "\ntitulo = " + titulo + " \nviews = " + views + " \navaliacoes = " + avaliacoes + " \ncurtidas = " + curtidas + " \nreproduzindo = " + reproduzindo;
    }
    
}
