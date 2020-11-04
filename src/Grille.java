/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mchelaif
 */
public class Grille {
   Cellule [][] Cellules= new Cellule[6][7] ;
   String [][] grillePresentation= new String [6][7];
   
 
public Grille(){
    for (int nombre=0;nombre<6;nombre++){
            for (int numero=0;numero<7;numero++){
                Cellules[nombre][numero]=null;
}
}
    }
public boolean ajouterJetonDansColonne(Jeton jetoncolonne, int numero){
    for (int nombre=0;nombre<6;nombre++){
             if (Cellules[nombre][numero]==null){
                Cellules[nombre][numero].jetonCourant=jetoncolonne;
                return true;
}
         

}
    return false;
    }
public boolean etreRemplie(){
    for (int nombre=0;nombre<6;nombre++){
            for (int numero=0;numero<7;numero++){
                if (Cellules[nombre][numero]==null){
                    return false;
}
}
    }
    return true;
    }
public void viderGrille(){
    for (int nombre=0;nombre<6;nombre++){
            for (int numero=0;numero<7;numero++){
                Cellules[nombre][numero]=null;
}
}
    }
public String[][] afficherGrilleSurConsole(){
    
    for (int nombre=0;nombre<6;nombre++){
            for (int numero=0;numero<7;numero++){
                if (Cellules[nombre][numero]!=null){
                    grillePresentation[nombre][numero]=Cellules[nombre][numero].jetonCourant.couleur;
}
                                if (Cellules[nombre][numero].trouNoir==true){
                    grillePresentation[nombre][numero]="TN";
}
}
    }
    return  grillePresentation;
    }
public boolean celluleOccupee(int numero,int nombre){
 if (Cellules[nombre][numero].jetonCourant ==null){
  return false  ;  
}
 else {
     return true;
 }
 }

public String lireCouleurDuJeton(int nombre, int numero){
    return Cellules[nombre][numero].jetonCourant.couleur;
}
public boolean etreGagnantePourJoueur(Joueur Joueur1){
  for (int nombre=0;nombre<6;nombre++){
      for (int numero=0;numero<7;numero++){
          
          if(Cellules[nombre][numero].jetonCourant.couleur==Joueur1.couleur){
              
              if(Cellules[nombre][numero].jetonCourant.couleur==Cellules[nombre+1][numero].jetonCourant.couleur||
                      Cellules[nombre][numero].jetonCourant.couleur==Cellules[nombre+2][numero].jetonCourant.couleur||
                      Cellules[nombre][numero].jetonCourant.couleur==Cellules[nombre+3][numero].jetonCourant.couleur){
                  return true;
                  
              }
          
            if(Cellules[nombre][numero].jetonCourant.couleur==Cellules[nombre][numero+1].jetonCourant.couleur||
                      Cellules[nombre][numero].jetonCourant.couleur==Cellules[nombre][numero+2].jetonCourant.couleur||
                      Cellules[nombre][numero].jetonCourant.couleur==Cellules[nombre][numero+3].jetonCourant.couleur){
                  return true;}
      
          if(Cellules[nombre][numero].jetonCourant.couleur==Cellules[nombre+1][numero+1].jetonCourant.couleur||
                      Cellules[nombre][numero].jetonCourant.couleur==Cellules[nombre+2][numero+2].jetonCourant.couleur||
                      Cellules[nombre][numero].jetonCourant.couleur==Cellules[nombre+3][numero+3].jetonCourant.couleur){
                  return true;}
          if(Cellules[nombre][numero].jetonCourant.couleur==Cellules[nombre-1][numero-1].jetonCourant.couleur||
                      Cellules[nombre][numero].jetonCourant.couleur==Cellules[nombre-2][numero-2].jetonCourant.couleur||
                      Cellules[nombre][numero].jetonCourant.couleur==Cellules[nombre-3][numero-3].jetonCourant.couleur){
                  return true;}
          }
  } 
} 
  return false;
}
public boolean placerTrouNoir(int numLigne, int numCologne){

if ( Cellules[numLigne][numCologne].trouNoir==true){
return false;
}
else {
    Cellules[numLigne][numCologne].trouNoir=true; 
  return true;
 }   

}
public boolean placerdesintegrateur(int numLigne, int numCologne){
 if (Cellules[numLigne][numCologne].desintegrateur==true){
return false;
}
else {
    Cellules[numLigne][numCologne].desintegrateur=true; 
  return true;
 }   
} 
   public boolean supprimerJeton(int numLigne, int numCologne){
 if ( Cellules[numLigne][numCologne].jetonCourant==null){
return false;
}
else {
    Cellules[numLigne][numCologne].jetonCourant=null; 
  return true;
 }   
}
public Jeton recupererJeton(int numLigne, int numCologne){
       Jeton jeton2 = Cellules[numLigne][numCologne].jetonCourant;
       Cellules[numLigne][numCologne].jetonCourant=null;
      return jeton2;
 }   
}