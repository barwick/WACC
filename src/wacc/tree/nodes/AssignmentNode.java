package wacc.tree.nodes;

import wacc.tree.nodeSupers.Node;
import wacc.tree.nodeSupers.StatNode;
import wacc.util.ProgramCode;
import wacc.util.Reg;
import wacc.util.RegHandler;
import wacc.util.StackHandler;

public class AssignmentNode extends StatNode {

	@Override
	public Reg generate() {
		//TODO other LHSs
		RegHandler.descend();
		Node lhs = children.get(0);
		Reg ret = children.get(1).generate();
		
		String strInstr = "STR ";
		if (nodeType.getSize() == 1) {
			strInstr = "STRB ";
		}
		
		if (lhs instanceof IdentNode) {
			String ident = ((IdentNode) lhs).getIdent();
			ProgramCode.add(strInstr + ret + ", " + StackHandler.get(ident));
		} else {
			Reg target = lhs.generate();
			ProgramCode.add("STR " + ret + ", " + target.memory());
		}
		
		RegHandler.ascend();
		return null;
	}

}
