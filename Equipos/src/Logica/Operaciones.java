package Logica;

import java.util.Scanner;

public class Operaciones {

	
	private String resultados[][];
	private int lista_resultados[][];
    private final int TAMANO = 5;

    public Operaciones() {
        this.resultados = new String[TAMANO][TAMANO];
        this.iniciarDiagonal();
    }
    
    public void imprimir(){
        for(int i=0;i<resultados.length;i++){
            for(int j = 0;j< resultados.length; j++){
                System.out.print(
                        (this.resultados[i][j]==null ? "-":this.resultados[i][j]) +"\t");
            }
            System.out.print("\n");
        }
    } 
    
    public void iniciarDiagonal(){
        for(int i=0;i<resultados.length;i++){
            for(int j = 0;j< resultados.length; j++){
                if(i == j)
                    this.resultados[i][j] = "X";
            }
        }
    }
    
    public void adicionarPuntaje() {
    	
    	Scanner entrada = new Scanner(System.in);
    	 for(int i=0;i<resultados.length;i++){
             for(int j = 0;j< resultados.length; j++){
            	 if(i!=j) {	
            		 System.out.println("Ingrese el puntaje del equipo local numero"+i+" "+"\nSi gana digite 3 puntos \nSi empata digite 1 punto\nSi pierde digite 0 puntos"); 
            		 String puntaje=entrada.nextLine();
            		 this.resultados[i][j]= puntaje; 
            		
            	}
            }
        } 	
    }
    public void listaResultado() {
    	int partidas_perdidas=0;
    	int partidas_empatadas=0;
    	int partidas_ganadas=0;
    	int puntaje_final=0;
    	for(int i=0;i<resultados.length;i++) {
    		for (int j=0;j<resultados.length;j++) {
    			if(this.resultados[i][j]=="0") {
    				partidas_perdidas++;
    				puntaje_final=puntaje_final+0;
    			}
    			if(this.resultados[i][j]=="1") {
    				partidas_empatadas++;
    				puntaje_final=puntaje_final+1;
    			}
    			if(this.resultados[i][j]=="3") {
    				partidas_ganadas++;
    				puntaje_final=puntaje_final+3;
    			}
    		}
    	}
    }
	
}
