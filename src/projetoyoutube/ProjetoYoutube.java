package projetoyoutube;
public class ProjetoYoutube {
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Video numero 1");
        v[1] = new Video("Video numero 2");
        v[2] = new Video("Video numero 3");
        
        Gafanhoto g[] = new Gafanhoto[3];
        g[0] = new Gafanhoto("William", 22, "M", "Will");
        g[1] = new Gafanhoto("Rosa", 22, "F", "Rosa");
        g[2] = new Gafanhoto("Jefferson", 33, "M", "Jeff");
        
        Visualizacao visu1 = new Visualizacao(g[0], v[0]);
        Visualizacao visu2 = new Visualizacao(g[0], v[1]);
        visu2.avaliar();
        visu1.avaliar(3);
        System.out.println(visu1.toString());
    }  
}
