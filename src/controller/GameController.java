package controller;

import model.Node;

import java.sql.SQLOutput;
import java.util.Map;
import java.util.Scanner;

public class GameController {
    public static final int firstStep = 0;
    Map<Integer, Node> nodes;

    public void init () {

    }

    /**
     *
     * @param node
     */
    public void showNode (Node node) {
        System.out.println(node.getMessage());
        System.out.println(node.getQuestion());
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int option = Integer.parseInt(line);
        Node nodeChild = this.nodes.get(option);
        this.showNode(nodeChild);
    }
}
