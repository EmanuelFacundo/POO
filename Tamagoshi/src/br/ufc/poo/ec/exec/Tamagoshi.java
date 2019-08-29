/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.ufc.poo.ec.exec;
import br.ufc.poo.ec.model.Pet;
import java.util.*;

/**
 *
 * @author emanuel
 */
public class Tamagoshi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        
        Pet tamagoshi = new Pet(20, 10, 15);   
        
        System.out.println("<<<< Tamagoshi >>>>");
        System.out.print("Diga o nome do seu pet: ");
        
        String nome = in.nextLine();
        
        System.out.println(nome + " is alive!!!");
        System.out.print(tamagoshi.toString());
        System.out.println("#######################################");
        System.out.println("Ações do jogo:");
        System.out.println("play = brincar com o pet");
        System.out.println("eat = da comida ao seu pet");
        System.out.println("sleep = seu pet irar dormir");
        System.out.println("shower = para da banho no seu pet");
        
        System.out.println("Digite as ações abaixo:");
        String acao;
        while(tamagoshi.getAlive()){
            acao = in.nextLine();
            
            switch(acao){
                case "play":
                    tamagoshi.play();
                    System.out.println(tamagoshi.toString());
                    break;
                
                case "eat":
                    tamagoshi.eat();
                    System.out.println(tamagoshi.toString());
                    break;
                
                case "sleep":
                    tamagoshi.sleep();
                    System.out.println(tamagoshi.toString());
                    break;
                    
                case "shower":
                    tamagoshi.shower();
                    System.out.println(tamagoshi.toString());
                    break;
                
                default:
                    System.out.println("Ação inexistente!!!");
                    System.out.println("Ações do jogo:");
                    System.out.println("play = brincar com o pet");
                    System.out.println("eat = da comida ao seu pet");
                    System.out.println("sleep = seu pet irar dormir");
                    System.out.println("shower = para da banho no seu pet");
                    
            }
            
            
        }
        
        System.out.println(nome + " is dead!!!");
        if(tamagoshi.getClean() == 0) System.out.println("O seu pet morreu porque o ele estava muito sujo...");
        
        else if(tamagoshi.getEnergy() == 0) System.out.println("O seu pet estava muito cansado por isso morreu...");
        
        else if(tamagoshi.getHungry() == 0) System.out.println("O seu pet morreu morreu de fome...");
        
    }
    
}
