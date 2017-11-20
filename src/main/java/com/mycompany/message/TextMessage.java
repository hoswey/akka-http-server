package com.mycompany.message;

import akka.http.javadsl.model.ws.BinaryMessage;
import akka.http.javadsl.model.ws.Message;

/**
 * @author hoswey
 */
public class TextMessage extends Message {

  @Override
  public boolean isText() {
    return false;
  }

  @Override
  public akka.http.javadsl.model.ws.TextMessage asTextMessage() {
    return null;
  }

  @Override
  public BinaryMessage asBinaryMessage() {
    return null;
  }

  @Override
  public akka.http.scaladsl.model.ws.Message asScala() {
    return null;
  }
}
