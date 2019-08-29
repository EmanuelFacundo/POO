/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufc.poo.ec.model;

/**
 *
 * @author emanuel
 */
public class Pet {
    
    
    private int energyMax, hungryMax, cleanMax;
    private int energy, hungry, clean;
    private int diamonds;
    private int age;
    private boolean alive;
    
    private void setEnergy(int value){
        this.energy = value;
    }
    
    private void setHungry(int value){
        this.hungry = value;
    }
    
    private void setClean(int value){
        this.clean = value;
    }
    
    public Pet(int energyMax, int hungryMax, int cleanMax){
        
        this.age = 0;
        this.alive = true;
        this.clean = cleanMax;
        this.cleanMax = cleanMax;
        this.diamonds = 0;
        this.energy = energyMax;
        this.energyMax = energyMax;
        this.hungry = hungryMax;
        this.hungryMax = hungryMax;
        
    }
    
    public int getClean(){        
        return this.clean;
    }
    
    public int getHungry(){
        return this.hungry;
    }
    
    public int getEnergy(){
        return this.energy;
    }
    
    public int getEnergyMax(){
        return this.energyMax;
    }
    
    public int getCleanMax(){
        return this.cleanMax;
    }
    
    public int getHungryMax(){
        return this.hungryMax;
    }
    
    public boolean getAlive(){
        return this.alive;
    }
    
    @Override
    public String toString(){
        String informacoes;
        
        informacoes = "Energia: " + this.energy + "\n";
        informacoes += "Saciedade: " + this.hungry + "\n";
        informacoes += "Limpeza: " + this.clean + "\n";
        informacoes += "Idade: " + this.age + "\n";
        informacoes += "Diamantes: " + this.diamonds + "\n";
        
        return informacoes;
    }
    
    public void play(){
        
        this.energy -= 2;
        if(this.energy <= 0){
            this.energy = 0;
            this.alive = false;
        }
        
        this.hungry --;
        if(this.hungry <= 0){
            this.hungry = 0;
            this.alive = false;
        }
        
        this.clean -= 3;
        if(this.clean <= 0){
            this.clean = 0;
            this.alive = false;
        }
        
        this.diamonds++;
        this.age++;
        
    }
    
    public void shower(){
        this.energy -= 3;
        if(this.energy <= 0){
            this.energy = 0;
            this.alive = false;
        }
        
        this.hungry--;
        if(this.hungry <= 0){
            this.hungry = 0;
            this.alive = false;
        }
        
        this.clean = this.cleanMax;
        this.age += 2;
    }
    
    public void eat(){
        this.energy--;
        if(this.energy <= 0){
            this.energy = 0;
            this.alive = false;
        }
        
        this.hungry += 4;
        if(this.hungry >= this.hungryMax) this.hungry = this.hungryMax;
        
        this.clean -=2;
        if(this.clean <= 0){
            this.clean = 0;
            this.alive = false;
        }
        
        this.age++;
    }
    
    public void sleep(){
        this.age += this.energyMax - this.energy;
        this.energy = this.energyMax;
    }
    
    
    
}
