package com.pguardiola.morpheustest;


public final class Evil {

  static {
    String shoulNotAppear = "---This message should NOT appear";
    System.out.println(shoulNotAppear);
  }

  public Evil(){
    String shouldAppear = "---Evil created";
    System.out.println(shouldAppear);
  }
}
