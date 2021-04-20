package com.models;

import java.io.*;

public class files {
    private ObjectOutputStream output;
    private ObjectInputStream input;

    public boolean existe(String path){
        File name = new File(path);
        return name.exists();
    }

    public void create(String path){
        try {
            output = new ObjectOutputStream(new FileOutputStream(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
        closeFile();
    }

    public void setRecord(Object objeto, String path) throws IOException {
        try {
            output = new ObjectOutputStream(new FileOutputStream(path));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        output.writeObject(objeto);
        closeFile();
    }

    public void closeFile() {
        if (output != null) {
            try {
                output.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (input != null){
            try {
                input.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public Object getRecord(String path){
        Object obj = null;
        try {
            FileInputStream fileIn = new FileInputStream(path);
            input = new ObjectInputStream(fileIn);
            try {
                obj = input.readObject();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            closeFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return obj;
    }
}
