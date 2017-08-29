package com.company;

public class Marine extends Soldier implements Bomb {


  public Marine(String name, String rank, int serialNumber) {
    super(name,rank,serialNumber);

  }
@Override
  public String speak() {
    return "GET TO THE CHOPPA!";
  }
@Override
  public String punch() {
    return "POWW!";
  }
@Override
  public String kick() {
    return "SLAM";
  }
@Override
  public String shoot() {
    return "POWWWWWW!";
  }
@Override
  public String slap() {
    return "WAPISHHH";
  }
  @Override
  public String explosion() {
    return "BOOOOOM";
  }
}

