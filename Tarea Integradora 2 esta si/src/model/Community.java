package model;

public class Community {
  private String name;
  private TypeCommunity typeCommunity;
  private String nameRepresentant;
  private int contactNumberRepresentant;
  private int amountResidents;
  private MainTrouble mainTrouble;
  private Product [] arrayProducts;

  public Community(String name, int typeCommunity, String nameRepresentant, int contactNumberRepresentant,
  int amountResidents, int mainTrouble) {
    this.name = name;
    this.typeCommunity = assignCommunity(typeCommunity);
    this.nameRepresentant = nameRepresentant;
    this.contactNumberRepresentant = contactNumberRepresentant;
    this.amountResidents = amountResidents;
    this.mainTrouble = assignTrouble(mainTrouble);
    this.arrayProducts = new Product[20];
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TypeCommunity getTypeCommunity() {
    return typeCommunity;
  }

  public void setTypeCommunity(TypeCommunity typeCommunity) {
    this.typeCommunity = typeCommunity;
  }

  public String getNameRepresentant() {
    return nameRepresentant;
  }

  public void setNameRepresentant(String nameRepresentant) {
    this.nameRepresentant = nameRepresentant;
  }

  public int getContactNumberRepresentant() {
    return contactNumberRepresentant;
  }

  public void setContactNumberRepresentant(int contactNumberRepresentant) {
    this.contactNumberRepresentant = contactNumberRepresentant;
  }

  public int getAmountResidents() {
    return amountResidents;
  }

  public void setAmountResidents(int amountResidents) {
    this.amountResidents = amountResidents;
  }

  public MainTrouble getMainTrouble() {
    return mainTrouble;
  }

  public void setMainTrouble(MainTrouble mainTrouble) {
    this.mainTrouble = mainTrouble;
  }

  public Product[] getArrayProducts() {
    return arrayProducts;
  }

  public void setArrayProducts(Product[] arrayProducts) {
    this.arrayProducts = arrayProducts;
  }

  public void addProduct (Product product) {
    boolean añadido = true;
    for (int i = 0; i < arrayProducts.length && añadido; i++){
      if(arrayProducts[i] == null) {
        arrayProducts[i] = product;
        añadido = false;
      }
    }
  }

  public void deleteProduct (Product product) {
    for (int i = 0; i < arrayProducts.length; i++) {
      if(arrayProducts[i] == product) {
        product = null;
      }
    }
  }

  public TypeCommunity assignCommunity (int opcion) {
    switch (opcion) {
      case 1:
        return TypeCommunity.AFROCOLOMBIAN;
      case 2:
        return TypeCommunity.NATIVE;
      case 3:
        return TypeCommunity.RAIZAL;
    }
    return null;
  }

  public MainTrouble assignTrouble (int opcion2) {
    switch (opcion2) {
      case 1:
        return MainTrouble.LACK_HOSPITALS;
      case 2:
        return MainTrouble.LIMITED_ACCESS_CLEAN_WATER;
      case 3:
       return MainTrouble.LACK_FOOD;
      case 4:
        return MainTrouble.LACK_SCHOOL;
    }
    return null;
  }
}
