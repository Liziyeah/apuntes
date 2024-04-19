package model;

import java.util.Calendar;

public class Place {
  private String name;
  private double area;
  private String photo;
  private double resources;
  private TypeDepartment deparment;
  private TypePlace typePlace;
  private Calendar date;
  private String nameCommunityPlace;
  private String[] species;

  public Place(String name, double area, String photo, double resources, TypeDepartment deparment, TypePlace typePlace,
  Calendar date, String nameCommunityPlace, String[] species) {
    this.name = name;
    this.area = area;
    this.photo = photo;
    this.resources = resources;
    this.deparment = deparment;
    this.typePlace = typePlace;
    this.date = date;
    this.nameCommunityPlace = nameCommunityPlace;
    this.species = species;
  }

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }

  public double getArea() {
    return area;
  }


  public void setArea(double area) {
    this.area = area;
  }


  public String getPhoto() {
    return photo;
  }


  public void setPhoto(String photo) {
    this.photo = photo;
  }


  public double getResources() {
    return resources;
  }


  public void setResources(double resources) {
    this.resources = resources;
  }


  public TypeDepartment getDeparment() {
    return deparment;
  }


  public void setDeparment(TypeDepartment deparment) {
    this.deparment = deparment;
  }


  public TypePlace getPlace() {
    return typePlace;
  }


  public void setPlace(TypePlace typePlace) {
    this.typePlace = typePlace;
  }


  public Calendar getDate() {
    return date;
  }


  public void setDate(Calendar date) {
    this.date = date;
  }


  public String getNameCommunityPlace() {
    return nameCommunityPlace;
  }


  public void setNameCommunityPlace(String nameCommunityPlace) {
    this.nameCommunityPlace = nameCommunityPlace;
  }


  public String[] getSpecies() {
    return species;
  }


  public void setSpecies(String[] species) {
    this.species = species;
  }



}