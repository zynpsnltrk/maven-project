package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }
  /**
  *@param soneone the name of a person
  *@return grreting string
  **/
  final public String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}
