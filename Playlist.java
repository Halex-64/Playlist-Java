import java.util.ArrayList;
public class Playlist {
    public static void main(String[] args){
        String bluePen = "Lá Ele";

        ArrayList<String> listaParalhaDeserta = new ArrayList<String>();
        listaParalhaDeserta.add ("Lá Ele");
        listaParalhaDeserta.add ("Bat Country");
        listaParalhaDeserta.add ("Feel Good");
        listaParalhaDeserta.add ("Mocking Bird");
        listaParalhaDeserta.add ("Good Morning");
        listaParalhaDeserta.add ("Homecoming");

        System.out.println(listaParalhaDeserta);
        System.out.println(listaParalhaDeserta.size());

        listaParalhaDeserta.remove(0);
        System.out.println(listaParalhaDeserta);
        System.out.println(listaParalhaDeserta.size());

        int indexA = 0;
        int indexB = 3;
        String temp = listaParalhaDeserta.get(indexA);
        listaParalhaDeserta.set(0, listaParalhaDeserta.get(indexB));
        listaParalhaDeserta.set(indexB, temp);
        System.out.println(listaParalhaDeserta);

        
    }
    
    
}
