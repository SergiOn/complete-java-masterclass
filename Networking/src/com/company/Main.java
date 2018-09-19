package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;

public class Main {

    public static void main(String[] args) {
        try {
            URL url = new URL("http://example.org");
            URLConnection urlConnection = url.openConnection();
            urlConnection.setDoOutput(true);
            urlConnection.connect();

            BufferedReader inputStream = new BufferedReader(
                    new InputStreamReader(urlConnection.getInputStream()));

            String line = "";
            while(line != null) {
                line = inputStream.readLine();
                System.out.println(line);
            }
            inputStream.close();

        } catch(MalformedURLException e) {
            System.out.println("Malformed URL: " + e.getMessage());
        } catch(IOException e) {
            System.out.println("IOException: " + e.getMessage());
        }

//        try {
////            URI uri = new URI("http://username:password@myserver.com:5000/catalogue/phones?os=android#samsung");
//            URI baseUri = new URI("http://username:password@myserver.com:5000");
//            URI uri = new URI("/catalogue/phones?os=android#samsung");
//            URI resolvedUri = baseUri.resolve(uri);
//
//            URL url = resolvedUri.toURL();
//            System.out.println("URL = " + url);
////            URI uri = new URI("hello");
//
////            System.out.println("Scheme = " + uri.getScheme());
////            System.out.println("Scheme-specific part = " + uri.getSchemeSpecificPart());
////            System.out.println("Authority = " + uri.getAuthority());
////            System.out.println("User info = " + uri.getUserInfo());
////            System.out.println("Host = " + uri.getHost());
////            System.out.println("Port = " + uri.getPort());
////            System.out.println("Path = " + uri.getPath());
////            System.out.println("Query = " + uri.getQuery());
////            System.out.println("Fragment = " + uri.getFragment());
//
//        } catch(URISyntaxException e) {
//            System.out.println("URI Bad Syntax: " + e.getMessage());
//        } catch(MalformedURLException e) {
//            System.out.println("URL Malformed: " + e.getMessage());
//        }
    }
}
