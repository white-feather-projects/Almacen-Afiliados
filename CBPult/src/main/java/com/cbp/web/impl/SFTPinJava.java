package com.cbp.web.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;
import com.jcraft.jsch.SftpException;

public class SFTPinJava {
public static void main(String[] args) throws IOException {
        
        /*Below we have declared and defined the SFTP HOST, PORT, USER 
                   and Local private key from where you will make connection */
        String SFTPHOST = "18.217.219.68";
        int    SFTPPORT = 22;
        String SFTPUSER = "bitnami";
        // this file can be id_rsa or id_dsa based on which algorithm is used to create the key
        //String privateKey = "/home/kodehelp/.ssh/id_rsa"; 
        String privateKey = "c:\\MyFiles\\DEVELOPFINANPLUS.PPK"; 
        String SFTPWORKINGDIR = "/home/confPropertiesCBP/";
        //String SFTPWORKINGDIR = "c:\\MyFiles\\";
        
        JSch jSch = new JSch();
        Session     session     = null;
        Channel     channel     = null;
        ChannelSftp channelSftp = null;
        try {
            jSch.addIdentity(privateKey);
            System.out.println("Private Key Added.");
            session = jSch.getSession(SFTPUSER,SFTPHOST,SFTPPORT);
            System.out.println("session created.");
            
            java.util.Properties config = new java.util.Properties();
            config.put("StrictHostKeyChecking", "no");
            session.setConfig(config);
         
            session.connect();
            channel = session.openChannel("sftp");
           
            channel.connect();
            System.out.println("shell channel connected....");
            
            
            channelSftp = (ChannelSftp)channel;
            channelSftp.cd(SFTPWORKINGDIR);
            
            /*Bajar un archivo*/
            //channelSftp.get("/home/confPropertiesCBP/configuracion.properties","c:\\MyFiles\\configuracion.properties");
            /*fin*/

            
            /*Subir archivo*/
            try {
                String fsrc = "c:\\MyFiles\\subida.txt", fdest = "/home/confPropertiesCBP/subida.txt";
                channelSftp.put(fsrc, fdest);
                System.out.println("File Uploaded");
               
            } catch (Exception e) {  e.printStackTrace();    
            
            }
            /*fin*/
            
            /* leer un archivo*/
         /*   InputStream stream = channelSftp.get("/home/confPropertiesCBP/subida.txt");
            try {
                BufferedReader br = new BufferedReader(new InputStreamReader(stream));
                String line;
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                }

            } catch (IOException io) {
                System.out.println("Exception occurred during reading file from SFTP server due to " + io.getMessage());
                io.getMessage();

            } catch (Exception e) {
                System.out.println("Exception occurred during reading file from SFTP server due to " + e.getMessage());
                e.getMessage();

            }
            /*fin*/

            System.out.println("Changed the directory...");
        } catch (JSchException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SftpException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally{
            if(channelSftp!=null){
                channelSftp.disconnect();
                channelSftp.exit();
            }
            if(channel!=null) channel.disconnect();
            
            if(session!=null) session.disconnect();
        }
    }

}