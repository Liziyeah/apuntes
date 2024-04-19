package model;

public class Product {
  private String name;
  private double naturalPercentage;
  private TypeProduct typeproduct;
  private boolean handmadeProduct;
  private String associationWithCommunity;
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public double getNaturalPercentage() {
    return naturalPercentage;
  }
  public void setNaturalPercentage(double naturalPercentage) {
    this.naturalPercentage = naturalPercentage;
  }
  public TypeProduct getTypeproduct() {
    return typeproduct;
  }
  public void setTypeproduct(TypeProduct typeproduct) {
    this.typeproduct = typeproduct;
  }
  public boolean isHandmadeProduct() {
    return handmadeProduct;
  }
  public void setHandmadeProduct(boolean handmadeProduct) {
    this.handmadeProduct = handmadeProduct;
  }
  public String getAssociationWithCommunity() {
    return associationWithCommunity;
  }
  public void setAssociationWithCommunity(String associationWithCommunity) {
    this.associationWithCommunity = associationWithCommunity;
  }
}