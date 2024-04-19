package model;

import java.util.Calendar;

public class Controller{

   Community [] arrayCommunity;
   Place [] arrayPlaces;

  public Controller (){
    this.arrayCommunity = new Community[200];
    this.arrayPlaces = new Place[200];
  }
  public String ingresarComunidad(String nameCommunity, int typeCommunity, String nameRepresentant, int contactNumberRepresentant,
  int amountResidents, int mainTrouble) {
    Community community = new Community(nameCommunity, typeCommunity, nameRepresentant, contactNumberRepresentant, amountResidents, mainTrouble);
    for(int i = 0; i < arrayCommunity.length; i++) {
      if(arrayCommunity[i] == null) {
        arrayCommunity[i] = community;
        return "La comunidad fue creada";
      }
    }
    return "La comunidad no fue creada";
  }

  public void ingresarLugar(String namePlace, double area, String photo, double resources, TypeDepartment deparment, TypePlace typePlace,
  Calendar date, String nameCommunityPlace, String[] species) {

    Place place2 = new Place(namePlace, area, photo, resources, deparment, place, date, nameCommunityPlace, species);
    arrayPlaces[encontrarPlace()] = place2;

  }
/**
  * Enters or deletes a new product.
*/
  public void ingresarBorrarProducto() {

  }
/**
  * Enters a new species.
*/
  public void ingresarEspecie() {

  }
/**
  * Modifies the data of an existing species.
*/
  public void modificardatosEspecie() {

  }

/**
   * Finds the empty position in the array of communities*
   * @return empty position.
*/
  private int encontrarCommunity() {
    int posicion = 0;

    for(int i = 0; i<arrayCommunity.length; i++){
      if (arrayCommunity[i]==null) {
        posicion = i;
      }
    }

    return posicion;
  }

/**
  * Finds the empty position in the array of places*
  * @return empty position.
 */
  private int encontrarPlace() {
    int posicion = 0;

    for(int i = 0; i<arrayPlaces.length; i++){
      if (arrayPlaces[i]==null) {
        posicion = i;
      }
    }
   return posicion;
  }

}