/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Douglas Willian CB3005348
 * João Vitor Gino CB3005488
 */
import java.lang.Object;
import java.util.UUID;

public class Aluno {
    private String endereco;
    private int idade;
    private String nome;
    private UUID uuid;
    
    Aluno(String e, int i, String n){
        endereco = e;
        idade = i;
        nome = n;
        uuid = UUID.randomUUID();

    }
  
    public String getEndereco() {
        return endereco;
      }
    
      public int getIdade() {
        return idade;
      }

      public String getNome() {
        return nome;
      }

      public UUID getUuid() {
        return uuid;
      }
    
    public void setEndereco(String x) {
      endereco = x;
    }
  
    public void setIdade(int x) {
      idade = x;
    }
    public void setNome(String x) {
        nome = x;
      }

      public void setUuid(UUID x) {
        uuid = x;
      }

  
    public static void main(String args[]) {
        //Aluno a = new Aluno();

        //a.setNome("aaaaaaa");
        //a.setUuid(UUID.fromString("3856c3da-ea56-4717-9f58-85f6c5f560a5"));

        //System.out.println(a.getUuid());
    }
  }