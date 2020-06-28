package com.company.devices;


import java.net.MalformedURLException;
import java.net.URL;

public class Phone extends Device {
//    String producer;
//    String model;
    Double screenSize;
    String system;

    private static final String DEFAULT_APP_PROTOCOL = "HTTPS";
    private static final String DEFAULT_APP_SERVER = "127.0.0.1";
    private static final int DEFAULT_PORT_NUMBER = 8080;

    public Phone(String model, double weight, String producer, Integer productionYear, Integer price, Double screenSize, String system) {
        super(model, weight, producer, productionYear, price);
        this.screenSize = screenSize;
        this.system = system;
    }

    public void turnOn() {
        System.out.println("Hello kitty");
    }
    public String toString() {
        return screenSize + " " + model + " " + system;
    }

    public void installAnApp(String name) throws Exception{
        System.out.println("instalowanie aplikacji na podstawie nazwy");

        if (name.equals("")) {
            throw new Exception("aplikacja musi mieć nazwę");
        }

        this.installAnApp(name, "latest");
    }

    public void installAnApp(String name, String version) throws Exception {
        System.out.println("instalowanie aplikacji na podstawie nazwy i wersji");
        //URL url = new URL(DEFAULT_APP_PROTOCOL, DEFAULT_APP_SERVER, DEFAULT_PORT_NUMBER, name + "-" + version);
        //this.installAnApp(url);
        if (version.equals("")) {
            throw new Exception("aplikacja musi mieć wersję");
        }
        this.installAnApp(name, version, DEFAULT_APP_SERVER);
    }

    public void installAnApp(String name, String version, String address) throws MalformedURLException{
        System.out.println("instalowanie aplikacji na podstawie nazwy, wersji oraz adresu url");
        URL url = new URL(DEFAULT_APP_PROTOCOL, address, DEFAULT_PORT_NUMBER, name + "-" + version);
        this.installAnApp(url);

    }

    public void installAnApp(String[] names) throws Exception{
        System.out.println("instalowanie aplikacji na podstawie listy nazw");
        if (names.length == 0) {
            throw new Exception("nie znaleziono aplikacji do zainstalowania");
        }
        for (String name : names) {
            this.installAnApp(name);
        }
    }

    public void installAnApp(URL url){
        System.out.println("instalowanie aplikacji na podstawie url");

        System.out.println("poprawnie zainstalowano " + url.getFile() + " z serwera " + url.getHost());
    }


/*
    public void installAnApp(String[] names) throws Exception {
        System.out.println("instalowanie aplikacji na podstawie tablicy nazw");
        if (names.length == 0) {
            throw new Exception("nie podano żadnych plikacji");
        }
        for (String name : names) {
            this.installAnApp(name);
        }
    }


    public void installAnApp(String name, String version) throws MalformedURLException {
        System.out.println("instalowanie aplikacji na podstawie nazwy i wersji");
        URL url = new URL(DEFAULT_APP_PROTOCOL, DEFAULT_APP_SERVER, DEFAULT_PORT_NUMBER, name + "-" + version);
        this.installAnApp(url);
    }

    public void installAnApp(URL url) {
        System.out.println("instalowanie aplikacji na podstawie url");
        //walidacje
        //sprawdzenie płatności
        //połączenie z serwerem
        //sprawdzenie miejsca na dysku
        //pobranie pliku
        //walidacja pliku
        //unzip
        //instalacja
        //komunikacja błędów do użytkownika
        //dodanie ikony
        System.out.println("poprawnie zainstalowano " + url.getFile() + " z serwera " + url.getHost());
    }
    */
}
