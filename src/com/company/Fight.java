package com.company;

public interface Fight {
  public String punch();
  public String kick();
  public String shoot();
  public String slap();

  public default String drive(){
    return "drive a mile";
  }

}
