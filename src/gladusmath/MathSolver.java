/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gladusmath;

import SQLUtil.MySqlConnect;
import gladusutil.Components.HashMap;
import java.util.ArrayList;

/**
 *
 * @author csqueiroz
 */
public class MathSolver {

    /*private String function;

    public Object solveSimpleFunction(String instruction) {
        Object retorno = null;
        int plusOperator = instruction.indexOf("+");
        int subtrationOperator = instruction.indexOf("-");
        int dividerOperator = instruction.indexOf("/");
        int multiplyOperator = instruction.indexOf("*");
        int posOperator = 0;
        if (plusOperator > 0) {
            posOperator = plusOperator;
        } else if (subtrationOperator > 0) {
            posOperator = subtrationOperator;
        } else if (dividerOperator > 0) {
            posOperator = dividerOperator;
        } else if (multiplyOperator > 0) {
            posOperator = multiplyOperator;
        }
        if (posOperator > 0) {
            HashMap hm = GladusUtil.getValueNumeric(posOperator, instruction, true);
            HashMap hm2 = GladusUtil.getValueNumeric(posOperator, instruction, false);

            if (hm.size() > 1 && hm2.size() > 1) {
                Object value1 = hm2.get("VALUE");
                Object value2 = hm.get("VALUE");
                if (plusOperator > 0) {
                    retorno = BasicMath.resultCalculationOperator("+", value1, value2).toString();
                } else if (subtrationOperator > 0) {
                    retorno = BasicMath.resultCalculationOperator("-", value1, value2).toString();
                } else if (dividerOperator > 0) {
                    retorno = BasicMath.resultCalculationOperator("/", value1, value2).toString();
                } else if (multiplyOperator > 0) {
                    retorno = BasicMath.resultCalculationOperator("*", value1, value2).toString();
                }
            }
        } else {
            System.out.println("Operador inválido");
        }

        return retorno;
    }

    public String solveMultiSimpleFunction(String instruction) {
        System.out.println(instruction);
        String retorno = "";
        int plusOperator = instruction.indexOf("+");
        int subtrationOperator = instruction.indexOf("-");
        int dividerOperator = instruction.indexOf("/");
        int multiplyOperator = instruction.indexOf("*");
        int posOperator = 0;

        if (multiplyOperator < dividerOperator
                && multiplyOperator > 0) {
            posOperator = multiplyOperator;
        } else if (dividerOperator < multiplyOperator
                && dividerOperator > 0) {
            posOperator = dividerOperator;
        } else if (subtrationOperator < plusOperator
                && subtrationOperator > 0
                && multiplyOperator < 0
                && dividerOperator < 0) {
            posOperator = subtrationOperator;
        } else if (plusOperator < subtrationOperator
                && plusOperator > 0
                && multiplyOperator < 0
                && dividerOperator < 0) {
            posOperator = plusOperator;
        }

        if (posOperator <= 0) {
            if (dividerOperator > 0) {
                posOperator = dividerOperator;
            } else if (multiplyOperator > 0) {
                posOperator = multiplyOperator;
            } else if (plusOperator > 0) {
                posOperator = plusOperator;
            } else if (subtrationOperator > 0) {
                posOperator = subtrationOperator;
            }
        }

        if (posOperator > 0) {
            HashMap hm = GladusUtil.getValueNumeric(posOperator, instruction, true);
            HashMap hm2 = GladusUtil.getValueNumeric(posOperator, instruction, false);

            if (hm.size() > 1 && hm2.size() > 1) {
                int inicialPos = hm2.getValueAsInt("LAST_POS");
                int finalPos = hm.getValueAsInt("LAST_POS");
                if (hm.getValueAsInt("LAST_POS") + 1 == instruction.length()) {
                    finalPos++;
                }
                if (hm2.getValueAsInt("LAST_POS") > 0) {
                    inicialPos++;
                }
                retorno = solveSimpleFunction(instruction.substring(inicialPos, finalPos)).toString();
//                
//                Object value1 = hm.get("VALUE");
//                Object value2 = hm2.get("VALUE");
//                if (plusOperator > 0) {
//                    retorno = BasicMath.resultCalculationOperator("+", value1, value2).toString();
//                } else if (subtrationOperator > 0) {
//                    retorno = BasicMath.resultCalculationOperator("-", value1, value2).toString();
//                } else if (dividerOperator > 0) {
//                    retorno = BasicMath.resultCalculationOperator("/", value1, value2).toString();
//                } else if (multiplyOperator > 0) {
//                    retorno = BasicMath.resultCalculationOperator("*", value1, value2).toString();
//                }
                if (hm2.getValueAsInt("LAST_POS") > 0) {
                    retorno = instruction.substring(0, hm2.getValueAsInt("LAST_POS") + 1) + retorno;
                }

                if (hm.getValueAsInt("LAST_POS") < instruction.length() - 1) {
                    retorno = retorno + instruction.substring(hm.getValueAsInt("LAST_POS"), instruction.length());
                }
            }
        } else {
            System.out.println("Operador inválido");
        }

        if (retorno.contains(
                "+")
                || retorno.contains("-")
                || retorno.contains("/")
                || retorno.contains("*")) {
            retorno = solveMultiSimpleFunction(retorno);
        }

        return retorno;
    }*/

    public String solveInstruction(String function) {
        String cmd = "SELECT " + function + " RESULTADO FROM DUAL";
        ArrayList<HashMap> retorno = MySqlConnect.getInstance().executaConsultaPadrao(cmd, false);

        return retorno.get(0).getValueAsString("RESULTADO");
    }
}
