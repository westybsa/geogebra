package org.geogebra.common.kernel.algos;

import org.geogebra.common.kernel.kernelND.GeoElementND;
import org.geogebra.common.kernel.prover.polynomial.Variable;

public class BotanaCircle {
	private Variable[] botanaVars;

	public Variable[] getBotanaVars(GeoElementND P, GeoElementND M) {
		if (botanaVars == null) {
			Variable[] circle1vars, centerVars;
			circle1vars = ((SymbolicParametersBotanaAlgo) P).getBotanaVars(P);
			centerVars = ((SymbolicParametersBotanaAlgo) M).getBotanaVars(M);

			botanaVars = new Variable[4];
			// Center:
			botanaVars[0] = centerVars[0];
			botanaVars[1] = centerVars[1];
			// Point on the circle:
			botanaVars[2] = circle1vars[0];
			botanaVars[3] = circle1vars[1];
		}
		return botanaVars;
	}
}
