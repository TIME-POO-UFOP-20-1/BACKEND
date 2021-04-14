package com.company;

import com.socket.Server;

public class Main {
    public static void main(String[] args) {
        String operation = null;
        Server server = new Server();
        server.createAndConect(3000);
        do {
            server.getMessageFromClient();
            operation = server.getMessage();
            if (operation != null) {
                System.out.print(operation);
                if (operation != "close") {
                    operation = null;
                }
            }
        }while(operation != "close");
        server.stop();
        System.out.print("\nFIM DA EXECUÇÃO\n");
    }
}
