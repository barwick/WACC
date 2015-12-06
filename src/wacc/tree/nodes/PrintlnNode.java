package wacc.tree.nodes;

import wacc.tree.nodeSupers.StatNode;
import wacc.util.PrintCode;
import wacc.util.ProgramCode;
import wacc.util.Reg;
import wacc.util.Type;

public class PrintlnNode extends StatNode {

	@Override
	public Reg generate() {
		if (children.get(0) != null) {
			Reg ret = children.get(0).generate();
			ProgramCode.add("MOV r0, " + ret);
			String dataLabel = PrintCode.addPrintData(nodeType);
			if (nodeType == Type.CHAR) {
				ProgramCode.add("BL putchar");
			} else {
				ProgramCode.add("BL p_print_" + nodeType);
				PrintCode.addPrint(nodeType, dataLabel);
			}
			dataLabel = PrintCode.addPrintData(Type.NULL);
			PrintCode.addPrint(Type.NULL, dataLabel);
			ProgramCode.add("BL p_print_ln");
		}
		return null;
	}

}
