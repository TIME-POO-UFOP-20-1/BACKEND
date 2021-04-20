package com.company;

import com.models.files;
import com.socket.Server;
import com.models.usuario;

import java.io.IOException;

public class Main {
    static Server server = new Server();
    static files name = new files();

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
        usuario user = new usuario(usuario, senha);
        //user.setChave();
        try {
            name.setRecord(user, "users.bin");
        } catch (IOException e) {
            e.printStackTrace();
        }
        user = (com.models.usuario) name.getRecord("users.bin");
        System.out.print(user.getUsuario());
        System.out.print(user.getSenha());
    }

    private static void handleLogin() throws InterruptedException {
        Thread.sleep(1000);
        server.getMessageFromClient();
        String usuario = server.getMessage();
        Thread.sleep(1000);
        server.getMessageFromClient();
        String senha = server.getMessage();
        usuario user = new usuario(usuario, senha);
        user.setChave(usuario);
    }

    private static void checkAndCreate(){
        if (!name.existe("users.bin")){
            name.create("users.bin");
        }

        if (!name.existe("employees.bin")){
            name.create("employees.bin");
        }

        if (!name.existe("appointments.bin")){
            name.create("appointments.bin");
        }
    }
}
