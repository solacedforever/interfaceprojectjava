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

  public abstract String speak();

  public String ultraslap() {
    return "MASSO SLAP";
  }
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

