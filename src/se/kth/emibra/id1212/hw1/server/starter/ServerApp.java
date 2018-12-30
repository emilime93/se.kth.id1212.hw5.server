package se.kth.emibra.id1212.hw1.server.starter;

import se.kth.emibra.id1212.hw1.server.controller.ServerController;

/**
 * Starts up the server.
 */
public class ServerApp {

    private static final int SERVER_PORT = 54321;

    /**
     * Starts the server on specified port.
     * @param args
     */
    public static void main(String[] args) {
        final int port = args.length > 0 ? Integer.parseInt(args[0]) : SERVER_PORT;
        System.out.printf("Starting server on port %d\n", port);
        new ServerController(port);
    }

}