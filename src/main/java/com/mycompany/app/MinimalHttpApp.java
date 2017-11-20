package com.mycompany.app;

import akka.http.javadsl.server.HttpApp;
import akka.http.javadsl.server.Route;

/**
 * Hello world!
 */
public class MinimalHttpApp extends HttpApp {

  public static void main(String[] args) throws Exception {

    HttpApp httpApp = new MinimalHttpApp();
    httpApp.startServer("0.0.0.0", 8080);
  }

  @Override
  protected Route routes() {
    return path("hello", () ->
      get(() ->
        complete("<h1>Say hello to akka-http</h1>")
      )
    );
  }
}


