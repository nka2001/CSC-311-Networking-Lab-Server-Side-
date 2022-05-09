/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.networkinglab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author soblab
 */
public class Main {

    public static void main(String[] args) {

        try {
            ServerSocket svsc = new ServerSocket(100);

            Socket clientSide = svsc.accept();

            InputStream input = clientSide.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));
            String data;
            data = reader.readLine();

            OutputStream output = clientSide.getOutputStream();
            PrintWriter writer = new PrintWriter(output, true);
            writer.println("Hello from the Server!");
            
            
            
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
