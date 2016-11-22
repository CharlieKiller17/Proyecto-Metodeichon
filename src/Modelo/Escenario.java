
package Modelo;

import java.util.Random;


public class Escenario {
    // Atributos y creacion de una matriz para el Escenario
    public Casilla[][] matrizEscenario = new Casilla[25][25];
    // Referencia de clase personaje para el constructor
    private Personaje personaje;
    
    

    public Escenario() {
    
        //Constructor para Hacer que cada elemento en la matriz sea una casilla 
         
        for(int i = 0; i < 25; i++){
            for(int j = 0; j < 25; j++){
                matrizEscenario[i][j] = new Casilla(i,j,0,0,0,personaje,true);
               
            }
        }
    } 
    
    
    public void GenerarTerrenoAreaPlanComun(){
        
        Random rnd = new Random();
        int tipoDeTerreno;
        int alturaTierra;
        //solo me interesa la altura en rio
        int alturaBYR;
        // Para Manejar las proporcionalidades de terreno (TipoTierra = 469 ), (TipoRIo = 156 )
        int contadorTipoTierra =0;
        int contadorTipoRio= 0;
     
        
        
        
        for(int i= 0; i<25; i++){
            for(int j = 0; j<25; j++){
                
                
                int contador = 0;
                
                do{
                    
                    tipoDeTerreno = rnd.nextInt(4);
                    alturaTierra =(int) Math.round(rnd.nextGaussian()* 1 + 5);
                    alturaBYR = (int) Math.round(rnd.nextGaussian()* 1 + 6);
                   
                    
                    if((tipoDeTerreno==3 || tipoDeTerreno == 0) && (alturaTierra <= 5 && alturaTierra >= 0 && alturaBYR>=0 && alturaBYR<=10 )){
                        
                        contador++;
                      
                    }
                    

                }while (contador == 0);   
                    
                    
                    
                    
                  
                
                matrizEscenario[i][j].setTipoDeTerreno(tipoDeTerreno);
                matrizEscenario[i][j].setCoordenadaX(i);
                matrizEscenario[i][j].setCoordenadaY(j);
                
                // Tipo de terreno Tierra
                if (tipoDeTerreno == 0){
                    
                    contadorTipoTierra++;
                    matrizEscenario[i][j].setAltura(alturaTierra);
                    matrizEscenario[i][j].setCaminable(true);
                    matrizEscenario[i][j].setProbabilidadDeFallo(0);    
                  
                } 
               
                // Tipo de terreno Rio
                if (tipoDeTerreno == 3){
                    
                    contadorTipoRio++;
                    matrizEscenario[i][j].setAltura(alturaBYR);
                    matrizEscenario[i][j].setCaminable(false);
                    matrizEscenario[i][j].setProbabilidadDeFallo(0);
                } 
            }
        }
        System.out.println(contadorTipoTierra);
        System.out.println(contadorTipoRio);
    }

    
    
    
    
    
    
    
    public void GenerarTerrenoAreaDeEconomia(){
        Random rnd = new Random();
        int tipoDeTerreno;
        int alturaTierra;
        //SOlo me interesa la altura en rio
        int alturaBYR;
        int alturaMontaña;
        // Para Manejar las proporcionalidades de terreno (TipoTierra = 357 ), (TipoRIo = 179 ),(TipoMontaña = 89 )
        int contadorTipoTierra =0;
        int contadorTipoRio= 0;
        int contadorTipoMontaña = 0;
        
        
        
        
        
        for(int i= 0; i<25; i++){
            for(int j = 0; j<25; j++){
                
                
                int contador = 0;
                
                do{
                    
                    tipoDeTerreno = rnd.nextInt(4);
                    alturaTierra =(int) Math.round(rnd.nextGaussian()* 1 + 5);
                    alturaBYR = (int) Math.round(rnd.nextGaussian()* 1 + 6);
                    alturaMontaña = (int) Math.round(rnd.nextGaussian()* 1 + 8);
                    
                    if((tipoDeTerreno==0 || tipoDeTerreno == 2 || tipoDeTerreno ==3 ) && (alturaTierra <= 5 && alturaTierra >= 0 && alturaBYR>=0 && alturaBYR<=10 && alturaMontaña>=6 && alturaMontaña<= 10)){
                        
                        contador++;
                      
                    }
                    

                }while (contador == 0);   
                    
                    
                    
                    
                  
                
                matrizEscenario[i][j].setTipoDeTerreno(tipoDeTerreno);
                matrizEscenario[i][j].setCoordenadaX(i);
                matrizEscenario[i][j].setCoordenadaY(j);
                
                // Tipo de terreno Tierra
                if (tipoDeTerreno == 0){
                    
                    matrizEscenario[i][j].setAltura(alturaTierra);
                    matrizEscenario[i][j].setCaminable(true);
                    matrizEscenario[i][j].setProbabilidadDeFallo(0);    
                  
                } 
                // Tipo de terreno Bosque
                if (tipoDeTerreno == 1){
                    
                    matrizEscenario[i][j].setAltura(alturaBYR);
                    matrizEscenario[i][j].setCaminable(true);
                    matrizEscenario[i][j].setProbabilidadDeFallo(20);
                } 
                if (tipoDeTerreno == 2){
                // Tipo de terreno Montaña    
                    matrizEscenario[i][j].setAltura(alturaMontaña);
                    matrizEscenario[i][j].setCaminable(true);
                    matrizEscenario[i][j].setProbabilidadDeFallo(0);
                } 
                // Tipo de terreno Rio
                if (tipoDeTerreno == 3){
                    
                    matrizEscenario[i][j].setAltura(alturaBYR);
                    matrizEscenario[i][j].setCaminable(false);
                    matrizEscenario[i][j].setProbabilidadDeFallo(0);
                } 
            }
        }
    }
    
    
    public void GenerarTerrenoAreaDeEspecialidad(){
        Random rnd = new Random();
        int tipoDeTerreno;
        int alturaTierra;
        int alturaBYR;
        int alturaMontaña;
        // Para Manejar las proporcionalidades de terreno (TipoTierra = 250 ), (TipoRIo = 125 ),(TipoMontaña = 62  ),(TipoBosque = 188 )
        int contadorTipoTierra =0;
        int contadorTipoRio= 0;
        int contadorTipoMontaña = 0;
        int contadorTipoBosque = 0;
        
        
        for(int i= 0; i<25; i++){
            for(int j = 0; j<25; j++){
                
                
                int contador = 0;
                
                do{
                    
                    tipoDeTerreno = rnd.nextInt(4);
                    alturaTierra =(int) Math.round(rnd.nextGaussian()* 1 + 5);
                    alturaBYR = (int) Math.round(rnd.nextGaussian()* 1 + 6);
                    alturaMontaña = (int) Math.round(rnd.nextGaussian()* 1 + 8);
                    
                    if(alturaTierra <= 5 && alturaTierra >= 0 && alturaBYR>=0 && alturaBYR<=10 && alturaMontaña>=6 && alturaMontaña<= 10){
                        
                        contador++;
                      
                    }
                    

                }while (contador == 0);   
                    
                    
                    
                    
                  
                
                matrizEscenario[i][j].setTipoDeTerreno(tipoDeTerreno);
                matrizEscenario[i][j].setCoordenadaX(i);
                matrizEscenario[i][j].setCoordenadaY(j);
                
                // Tipo de terreno Tierra
                if (tipoDeTerreno == 0){
                    
                    matrizEscenario[i][j].setAltura(alturaTierra);
                    matrizEscenario[i][j].setCaminable(true);
                    matrizEscenario[i][j].setProbabilidadDeFallo(0);    
                  
                } 
                // Tipo de terreno Bosque
                if (tipoDeTerreno == 1){
                    
                    matrizEscenario[i][j].setAltura(alturaBYR);
                    matrizEscenario[i][j].setCaminable(true);
                    matrizEscenario[i][j].setProbabilidadDeFallo(20);
                } 
                if (tipoDeTerreno == 2){
                // Tipo de terreno Montaña    
                    matrizEscenario[i][j].setAltura(alturaMontaña);
                    matrizEscenario[i][j].setCaminable(true);
                    matrizEscenario[i][j].setProbabilidadDeFallo(0);
                } 
                // Tipo de terreno Rio
                if (tipoDeTerreno == 3){
                    
                    matrizEscenario[i][j].setAltura(alturaBYR);
                    matrizEscenario[i][j].setCaminable(false);
                    matrizEscenario[i][j].setProbabilidadDeFallo(0);
                } 
            }
        }
    }
    
    
    
    
    
    
    
}

    
