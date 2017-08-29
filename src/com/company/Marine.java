package com.company;

public class Marine extends Soldier implements Fight {


  public Marine(String name, String rank, int serialNumber) {
    super(name,rank,serialNumber);

  }

  public String speak() {
    return "Speak";
  }

  public String punch() {
    return "POWW!";
  }

  public String kick() {
    return "SLAM";
  }

  public String shoot() {
    return "POWWWWWW!";
  }

  public String slap() {
    return "WAPISHHH";
  }
}

