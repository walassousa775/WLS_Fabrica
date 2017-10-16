package Composite;




import java.util.ArrayList;

public class Garagem {
    int idGaragem;
    ArrayList<Carro> listaCarros;
    
    public Garagem(int idGaragem){
        this.idGaragem = idGaragem;
        listaCarros = new ArrayList<>();
    }
    public void adicionaCarro(Carro carroNovo){
        listaCarros.add(carroNovo);
    }
    public void removeCarro(Carro carroRemovido){
        listaCarros.remove(carroRemovido);
    }
    public ArrayList<Carro> getListaCarros(){
        return listaCarros;
    }
    
    public int getIdGaragem(){
    return idGaragem;
    }
}
