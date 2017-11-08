import javax.swing.*;
import java.awt.event.*;

import java.awt.GridBagLayout;
import java.util.LinkedList;


public class Simulation3Nodes extends Simulation {

    public Simulation3Nodes(LinkedList<Node> nodesList) {
      super(nodesList);
      System.out.println("sim 3 selected");
    }

    public void constructNodesPanel() {
      for (Node node : nodesList) {
        addNodeToPanel(node);
        System.out.println("node "+node.id+ " added");
      }
    }

}
