package com.strands.spf;

/**
 * <p>
 * Single instance in a multi threading environment
 * </p>
 * 
 * @author strands
 * 
 */
public class SingleInstance {

  private static SingleInstance instance = null;

  private SingleInstance() {

  }

  public static SingleInstance getInstance() {
    if (instance == null) {
      createInstance();
    }
    return instance;
  }

  private synchronized static void createInstance() {
    if (instance == null) {
      instance = new SingleInstance();
    }
  }

  public static void main(String[] args) {
    SingleInstance singleInstance = getInstance();
  }
}
