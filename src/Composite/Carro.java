package Composite;





public class Carro {
    
    String nome;
    String marca;
    int ano;
    String cor;
    
 public Carro(String nome, String marca, int ano, String cor){
     this.nome = nome;
     this.marca = marca;
     this.ano = ano;
     this.cor = cor;
 }
 public String getNome(){
     return nome;
 }
 
 public String getMarca(){
     return marca;
 }
 
 public int getAno(){
     return ano;
 }
   public String getCor(){
     return cor;
 }
}
