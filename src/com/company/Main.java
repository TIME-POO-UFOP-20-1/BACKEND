package com.company;

import com.models.files;
import com.socket.Server;
import com.models.Usuario;

import java.io.IOException;
import java.util.*;


public class Main {
    private static final Server server = new Server();
    private static final files name = new files();
    private static List<Usuario> users = new ArrayList<>();
    private static final String userPath = "src/com/files/users.bin";
    private static final String employeesPath = "src/com/files/employees.bin";
    private static final String appointmentsPath = "src/com/files/appointments.bin";

    public static void main(String[] args) throws InterruptedException {
        checkAndCreate();
        server.createAndConect(3000);
        run();
        server.stop();
        System.out.print("\nFIM DA EXECUÇÃO\n");
    }

    private static void run() throws InterruptedException {
        boolean controle = true;
        do {
            server.getMessageFromClient();
            String operation = server.getMessage();
            if (operation != null) {
                if (!operation.equals("close")) {

                    if (operation.equals("cadastro")) {
                        handleCadrasto();
                    }

                    if (operation.equals("login")) {
                        handleLogin();
                    }

                    if (operation.equals("userList")) {
                        handleUserList();
                    }

                }else{
                    controle = false;
                }
            }
        }while(controle);
    }

    private static void handleCadrasto() throws InterruptedException {
        Thread.sleep(1000);
        server.getMessageFromClient();
        String usuario = server.getMessage();
        Thread.sleep(1000);
        server.getMessageFromClient();
        String senha = server.getMessage();
        Usuario user = new Usuario(usuario, senha, 'G');
        users = ( List<Usuario>) name.getRecord(userPath);
        boolean controle = true;
        for (Usuario x : users){
            if (x.getUsuario().equals(usuario)) {
                controle = false;
                break;
            }
        }
        if (controle) {
            users.add(user);
            try {
                name.setRecord(users, userPath);
                server.sendConfirmation(true);
                System.out.println("Usuario cadastrado com sucesso!");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else{
            server.sendConfirmation(false);
            System.out.println("Usuario já existe!");
        }
    }

    private static void handleUserList(){
        users = ( List<Usuario>) name.getRecord(userPath);
        List<String> userList = new ArrayList<>();
        for (Usuario x : users){
            userList.add(x.getUsuario());
        }
        server.sendObject(userList);
    }

    private static void handleLogin() throws InterruptedException {
        Thread.sleep(1000);
        server.getMessageFromClient();
        String usuario = server.getMessage();
        Thread.sleep(1000);
        server.getMessageFromClient();
        String senha = server.getMessage();
        Usuario user;
        users = ( List<Usuario>) name.getRecord(userPath);
        boolean controle = false;
        for (Usuario x : users){
            if (x.getUsuario().equals(usuario)) {
                if (x.getSenha().equals(senha)) {
                    user = x;
                    controle = true;
                    break;
                }
            }
        }
        if (controle) {
            server.sendConfirmation(true);
            System.out.println("Usuario autenticado!");
        }else{
            server.sendConfirmation(false);
            System.out.println("Usuario não autenticado!");
        }
    }

    private static void checkAndCreate(){
        if (!name.existe(userPath)){
            name.create(userPath);
            Usuario admin = new Usuario("admin", "admin", 'A');
            users.add(admin);
            try {
                name.setRecord(users, userPath);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        if (!name.existe(employeesPath)){
            name.create(employeesPath);
        }

        if (!name.existe(appointmentsPath)){
            name.create(appointmentsPath);
        }
    }


}
