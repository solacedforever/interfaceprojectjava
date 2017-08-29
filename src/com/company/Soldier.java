package com.company;

public abstract class Soldier implements Fight {
  String name;
  String rank;
  int serialNumber;

  public Soldier (String name, String rank, int serialNumber) {
  this.name = name;
  this.rank = rank;
  this.serialNumber = serialNumber;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getRank() {
    return rank;
  }

  public void setRank(String rank) {
    this.rank = rank;
  }

  public int getSerialNumber() {
    return serialNumber;
  }

  public void setSerialNumber(int serialNumber) {
    this.serialNumber = serialNumber;
  }

  public abstract String speak();

  public String chew(){
    return "chew food";
  }
  public String snore(){
    return "snore";
  }
  public String trudge(){
    return "trudge";
  }
}

