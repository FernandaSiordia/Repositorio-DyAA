/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrizcelulas;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class MatrizCelulas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
  //Prueba con una matriz pequeña, los ceros son muerte y los 1 vida
    Scanner datos = new Scanner (System.in);
       
        System.out.println("Ingresa el num de filas");
        int fil=datos.nextInt();
        System.out.println("Ingresa el num de columnas");
        int col=datos.nextInt();
  int mat[][]= new int[fil][col];
     System.out.println("Inserte 0 para célula muerta y 1 para célula viva");
  for(int i=0; i<fil;i++){
      for (int j=0; j<col;j++){
          System.out.println("Inserte valor de posición["+i+"] ["+j+"]= ");
          mat[i][j]=datos.nextInt();
      }

  
  }
  System.out.println("----------------------------------");
    System.out.println("Matriz Original");
  for(int i=0; i<fil;i++){
      for (int j=0; j<col;j++){
          System.out.print(mat[i][j]);
          
      }
      System.out.println(" ");

  }
  
  
  
  
       
      
  //Comenzamos a agregar las condiciones
   for(int i=0; i<fil;i++){
      for (int j=0; j<col;j++){
          
       if(mat[i][j]==1 && i==0){ //este if nos sirve para el índice principal con i ==0, para que no se salga de los bordes nuestro arreglo
           if(mat[i][j+1]+mat[i+1][j]+mat[i][j-1]+mat[i+1][j+1]+mat[i+1][j-1]>=2 
                      && mat[i][j+1]+mat[i+1][j]+mat[i][j-1]+mat[i+1][j+1]+mat[i+1][j-1]<4){ 
                  mat[i][j]=1;
              }
           else{
                mat[i][j]=0;
           }
           
           }
          
          
        if(mat[i][j]==1 && j==0){//el borde superior de la matriz
           if(mat[i+1][j]+mat[i][j-1]+mat[i-1][j]+mat[i+1][j-1]+mat[i-1][j-1]>=2 
                   && mat[i+1][j]+mat[i][j-1]+mat[i-1][j]+mat[i+1][j-1]+mat[i-1][j-1]<4){
                   mat[i][j]=1;
                }
           else{
                mat[i][j]=0;
           }
          }
     
      if(mat[i][j]==1 && j==1 && i==0){//para el primer elemento de la matriz 
           if(mat[i+1][j]+mat[i][j-1]+mat[i+1][j-1]>=2 
                   && mat[i+1][j]+mat[i][j-1]+mat[i+1][j-1]<4 ){
           mat[i][j]=1;
           }
           else{
                mat[i][j]=0;
           }
      }
      if(mat[i][j]==1 && i==fil-1){//para no salir del borde derecho
           if(mat[i][j+1]+mat[i][j-1]+mat[i-1][j]+mat[i-1][j+1]+mat[i-1][j-1]>=2 
                   && mat[i][j+1]+mat[i][j-1]+mat[i-1][j]+mat[i-1][j+1]+mat[i-1][j-1]<4 ){
           mat[i][j]=1;
           }
           else{
                mat[i][j]=0;
           }
      } 
      if(mat[i][j]==1 && i==col-1){//para no salir del borde inferior
           if(mat[i][j+1]+mat[i+1][j]+mat[i-1][j]+mat[i+1][j+1]+mat[i-1][j+1]>=2 
                   && mat[i][j+1]+mat[i+1][j]+mat[i-1][j]+mat[i+1][j+1]+mat[i-1][j+1]<4 ){
           mat[i][j]=1;
           }
           else{
                mat[i][j]=0;
           }
      }  
      if(mat[i][j]==1 && i==col-1 && j==fil-1){//para el último elemento
           if(mat[i][j+1]+mat[i-1][j]+mat[i-1][j+1]>=2 
                   && mat[i][j+1]+mat[i-1][j]+mat[i-1][j+1]<4 ){
           mat[i][j]=1;
      }
           else{
                mat[i][j]=0;
           }
      }
      if(mat[i][j]==1){//genérico
           if(mat[i][j+1]+mat[i+1][j]+mat[i][j-1]+mat[i-1][j]+mat[i+1][j+1]+mat[i+1][j-1]+mat[i-1][j+1]+mat[i-1][j-1]>=2 
                   && mat[i][j+1]+mat[i+1][j]+mat[i][j-1]+mat[i-1][j]+mat[i+1][j+1]+mat[i+1][j-1]+mat[i-1][j+1]+mat[i-1][j-1]<4 ){
           mat[i][j]=1;
           }
           else{
                mat[i][j]=0;
           }
      }
      
      
        
          
            
       else{
           if(mat[i][j]==0){
            if(mat[i][j]==1 && i==0) {  
                 if(mat[i][j+1]+mat[i+1][j]+mat[i][j-1]+mat[i+1][j+1]+mat[i+1][j-1]==3)//borde izq
                    {
                         mat[i][j]=1; 
                    }
                 else{ //con este else evitaremos errores
               
               mat[i][j]=0;
           }
             }
           
         if(mat[i][j]==1 && j==0){
                if(mat[i+1][j]+mat[i][j-1]+mat[i-1][j]+mat[i+1][j-1]+mat[i-1][j-1]==3)//borde sup
                {
                    mat[i][j]=1;
                }
                else{ //con este else evitaremos errores
               
               mat[i][j]=0;
           }
         }  
          
         if(mat[i][j]==1 && j==1 && i==0){
                if(mat[i+1][j]+mat[i][j-1]+mat[i+1][j-1]==3){ //primer elemento de la matriz
                     mat[i][j]=1; 
                 } 
                else{ //con este else evitaremos errores
               
               mat[i][j]=0;
           }
          }
         if(mat[i][j]==1 && i==col-1){//para no salir del borde inferior
                if(mat[i][j+1]+mat[i+1][j]+mat[i-1][j]+mat[i+1][j+1]+mat[i-1][j+1]==3 ){
                    mat[i][j]=1;
                }
                else{ //con este else evitaremos errores
               
               mat[i][j]=0;
           }
          }  
         
         if(mat[i][j]==1 && i==fil-1){//para no salir del borde derecho
                if(mat[i][j+1]+mat[i][j-1]+mat[i-1][j]+mat[i-1][j+1]+mat[i-1][j-1]==3 ){
                    mat[i][j]=1;
                }
                else{ //con este else evitaremos errores
               
               mat[i][j]=0;
           }
            }
         if(mat[i][j]==1 && i==col-1 && j==fil-1){//para el último elemento
                if(mat[i][j+1]+mat[i-1][j]+mat[i-1][j+1]==3){
                    mat[i][j]=1;
                }
                else{ //con este else evitaremos errores
               
               mat[i][j]=0;
           }
          }
         if(mat[i][j+1]+mat[i+1][j]+mat[i][j-1]+mat[i-1][j]+mat[i+1][j+1]+mat[i+1][j-1]+mat[i-1][j+1]+mat[i-1][j-1]==3){//genérico
              mat[i][j]=1; 
           }
         else{ //con este else evitaremos errores
               
               mat[i][j]=0;
           }
        }
           else{ //con este else evitaremos errores
               
               mat[i][j]=0;
           }
      }
       
       System.out.print(mat[i][j]);
         }
      System.out.println(" ");
    }
  
   
    
    // System.out.println(mat[0][0]);
    //Hasta aquí ya tengo una matriz como ejemplo que es de 4x4 con nuestro contador iniciado en 0
    //Primero tenemos que recorrer la matriz.
    
   
       // System.out.println(mat[0][1]);
        
    /*for(int i=0;i<3;i++){
        for(int j=0; j<3;j++){
            System.out.println(mat[i][j]);
        }
    }*/
    
      }
    
      
      
     
   }
    

   
