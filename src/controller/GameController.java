package controller;

import model.Node;

import java.util.HashMap;
import java.util.Scanner;

public class GameController {
    /**
     * Default step (first step to be executed
     */
    public static final int firstStep = 0;
    /**
     * Collection to index an integer (number) to a node
     */
    HashMap<Integer, Node> nodes;

    /**
     * Init nodes and execute first step
     */
    public void init () {
        /*
         * Initialize collection
         */
        this.nodes = new HashMap<Integer, Node>();

        /*
         * Create node 0
         */
        Node node0 = new Node();
        node0.setId(0);
        node0.setMessage("Welcome to this little sweet house! what do you want to do?");
        node0.setQuestion("[1] Thanks!\n[2] I don't want to be here :(");
        node0.setOptionA(1);
        node0.setOptionB(2);

        /*
         * Add node 0 to collection with key 0
         */
        this.nodes.put(0, node0);

        /*
         * Create node 1
         */
        Node node1 = new Node();
        node1.setId(1);
        node1.setMessage("You're welcome.");
        node1.setQuestion("");

        /*
         * Add node 1 to collection with key 1
         */
        this.nodes.put(1, node1);

        /*
         * Create node 2
         */
        Node node2 = new Node();
        node2.setId(2);
        node2.setMessage("Me either.");
        node2.setQuestion("");

        /*
         * Add node 2 to collection with key 2
         */
        this.nodes.put(2, node2);

        /*
         * Call show node recursive method with first step (0)
         */
        this.showNode(this.nodes.get(GameController.firstStep));
    }

    /**
     *
     * @param node
     */
    public void showNode (Node node) {
        /*
         * Show message and question
         */
        System.out.println(node.getMessage());
        System.out.println(node.getQuestion());
        /*
         * Read reply from user and storage on "line" var
         */
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        /*
         * Parse line to a number
         */
        int option = Integer.parseInt(line);
        /*
         * Get node belonged with that id
         */
        Node nodeChild = this.nodes.get(option);
        /*
         * Execute node
         */
        this.showNode(nodeChild);
    }
}
