package wacc.tree.nodes;

import wacc.tree.Node;

public class BoolNode implements Node {

    private final boolean b;

    public BoolNode(boolean b) {
        this.b = b;
    }

    @Override
    public void generate() {

    }
}