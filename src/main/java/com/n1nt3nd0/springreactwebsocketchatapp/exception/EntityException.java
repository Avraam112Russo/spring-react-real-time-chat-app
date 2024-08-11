package com.n1nt3nd0.springreactwebsocketchatapp.exception;

public class EntityException extends RuntimeException {
  public EntityException() {
    super("Entity not found in db");
  }

  public EntityException(String message, Throwable cause) {
    super(message, cause);
  }

  public EntityException(String message) {
    super(message);
  }
}
