/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gladusmath;

import gladusutil.Components.HashMap;
import static gladusutil.GladusUtil.*;

/**
 *
 * @author csqueiroz
 */
public class BasicMath {

    public static Object resultCalculation(String function, HashMap values) {
        switch (function.toUpperCase()) {
            case "SOMAR" : {
                return resultCalculationOperator("+",values);
            }
            case "SUBTRAIR": {
                return resultCalculationOperator("-",values);
            }
            case "DIVIDIR": {
                return resultCalculationOperator("/",values);
            }
            case "MULTIPLICAR": {
                return resultCalculationOperator("*",values);
            }
        }
        return null;
    }

    public static Object resultCalculationOperator(String function, HashMap values) {
        switch (function.toUpperCase()) {
            case "+": {
                return plus(values.get("VALUE1"), values.get("VALUE2"));
            }
            case "-": {
                return subtract(values.get("VALUE1"), values.get("VALUE2"));
            }
            case "/": {
                return divide(values.get("VALUE1"), values.get("VALUE2"));
            }
            case "*": {
                return multiply(values.get("VALUE1"), values.get("VALUE2"));
            }
        }
        return null;
    }

    public static Object resultCalculationOperator(String function, Object value1, Object value2) {
        HashMap hm = new gladusutil.Components.HashMap();
        hm.put("VALUE1", value1);
        hm.put("VALUE2", value2);

        return resultCalculationOperator(function, hm);
    }

    private static Object plus(Object o1, Object o2) {
        if (o1 instanceof Float) {
            if (o2 instanceof Float) {
                return getFloat(o1) + getFloat(o2);
            } else if (o2 instanceof Double) {
                return getFloat(o1) + getDouble(o2);
            } else if (o2 instanceof Integer) {
                return getFloat(o1) + getInteger(o2);
            } else if (!o2.toString().contains(".")) {
                return getFloat(o1) + getInteger(o2);
            } else if (o2.toString().contains(".")) {
                return getFloat(o1) + getFloat(o2);
            }
        } else if (o1 instanceof Double) {
            if (o2 instanceof Float) {
                return getDouble(o1) + getFloat(o2);
            } else if (o2 instanceof Double) {
                return getDouble(o1) + getDouble(o2);
            } else if (o2 instanceof Integer) {
                return getDouble(o1) + getInteger(o2);
            } else if (!o2.toString().contains(".")) {
                return getDouble(o1) + getInteger(o2);
            } else if (o2.toString().contains(".")) {
                return getDouble(o1) + getFloat(o2);
            }
        } else if (o1 instanceof Integer) {
            if (o2 instanceof Float) {
                return getInteger(o1) + getFloat(o2);
            } else if (o2 instanceof Double) {
                return getInteger(o1) + getDouble(o2);
            } else if (o2 instanceof Integer) {
                return getInteger(o1) + getInteger(o2);
            } else if (!o2.toString().contains(".")) {
                return getInteger(o1) + getInteger(o2);
            } else if (o2.toString().contains(".")) {
                return getInteger(o1) + getFloat(o2);
            }
        } else if (!o1.toString().contains(".")) {
            if (o2 instanceof Float) {
                return getInteger(o1) + getFloat(o2);
            } else if (o2 instanceof Double) {
                return getInteger(o1) + getDouble(o2);
            } else if (o2 instanceof Integer) {
                return getInteger(o1) + getInteger(o2);
            } else if (!o2.toString().contains(".")) {
                return getInteger(o1) + getInteger(o2);
            } else if (o2.toString().contains(".")) {
                return getInteger(o1) + getFloat(o2);
            }
        } else if (o1.toString().contains(".")) {
            if (o2 instanceof Float) {
                return getFloat(o1) + getFloat(o2);
            } else if (o2 instanceof Double) {
                return getFloat(o1) + getDouble(o2);
            } else if (o2 instanceof Integer) {
                return getFloat(o1) + getInteger(o2);
            } else if (!o2.toString().contains(".")) {
                return getFloat(o1) + getInteger(o2);
            } else if (o2.toString().contains(".")) {
                return getFloat(o1) + getFloat(o2);
            }
        }
        return null;
    }

    private static Object subtract(Object o1, Object o2) {
        if (o1 instanceof Float) {
            if (o2 instanceof Float) {
                return getFloat(o1) - getFloat(o2);
            } else if (o2 instanceof Double) {
                return getFloat(o1) - getDouble(o2);
            } else if (o2 instanceof Integer) {
                return getFloat(o1) - getInteger(o2);
            } else if (!o2.toString().contains(".")) {
                return getFloat(o1) - getInteger(o2);
            } else if (o2.toString().contains(".")) {
                return getFloat(o1) - getFloat(o2);
            }
        } else if (o1 instanceof Double) {
            if (o2 instanceof Float) {
                return getDouble(o1) - getFloat(o2);
            } else if (o2 instanceof Double) {
                return getDouble(o1) - getDouble(o2);
            } else if (o2 instanceof Integer) {
                return getDouble(o1) - getInteger(o2);
            } else if (!o2.toString().contains(".")) {
                return getDouble(o1) - getInteger(o2);
            } else if (o2.toString().contains(".")) {
                return getDouble(o1) - getFloat(o2);
            }
        } else if (o1 instanceof Integer) {
            if (o2 instanceof Float) {
                return getInteger(o1) - getFloat(o2);
            } else if (o2 instanceof Double) {
                return getInteger(o1) - getDouble(o2);
            } else if (o2 instanceof Integer) {
                return getInteger(o1) - getInteger(o2);
            } else if (!o2.toString().contains(".")) {
                return getInteger(o1) - getInteger(o2);
            } else if (o2.toString().contains(".")) {
                return getInteger(o1) - getFloat(o2);
            }
        } else if (!o1.toString().contains(".")) {
            if (o2 instanceof Float) {
                return getInteger(o1) - getFloat(o2);
            } else if (o2 instanceof Double) {
                return getInteger(o1) - getDouble(o2);
            } else if (o2 instanceof Integer) {
                return getInteger(o1) - getInteger(o2);
            } else if (!o2.toString().contains(".")) {
                return getInteger(o1) - getInteger(o2);
            } else if (o2.toString().contains(".")) {
                return getInteger(o1) - getFloat(o2);
            }
        } else if (o1.toString().contains(".")) {
            if (o2 instanceof Float) {
                return getFloat(o1) - getFloat(o2);
            } else if (o2 instanceof Double) {
                return getFloat(o1) - getDouble(o2);
            } else if (o2 instanceof Integer) {
                return getFloat(o1) - getInteger(o2);
            } else if (!o2.toString().contains(".")) {
                return getFloat(o1) - getInteger(o2);
            } else if (o2.toString().contains(".")) {
                return getFloat(o1) - getFloat(o2);
            }
        }
        return null;
    }

    private static Object divide(Object o1, Object o2) {
        return (getDouble(o1) / getDouble(o2));
//        if (o1 instanceof Float) {
//            if (o2 instanceof Float) {
//                return getFloat(o1) / getFloat(o2);
//            } else if (o2 instanceof Double) {
//                return getFloat(o1) / getDouble(o2);
//            } else if (o2 instanceof Integer) {
//                return getFloat(o1) / getInteger(o2);
//            } else if (!o2.toString().contains(".")) {
//                return getFloat(o1) / getInteger(o2);
//            } else if (o2.toString().contains(".")) {
//                return getFloat(o1) / getFloat(o2);
//            }
//        } else if (o1 instanceof Double) {
//            if (o2 instanceof Float) {
//                return getDouble(o1) / getFloat(o2);
//            } else if (o2 instanceof Double) {
//                return getDouble(o1) / getDouble(o2);
//            } else if (o2 instanceof Integer) {
//                return getDouble(o1) / getInteger(o2);
//            } else if (!o2.toString().contains(".")) {
//                return getDouble(o1) / getInteger(o2);
//            } else if (o2.toString().contains(".")) {
//                return getDouble(o1) / getFloat(o2);
//            }
//        } else if (o1 instanceof Integer) {
//            if (o2 instanceof Float) {
//                return getInteger(o1) / getFloat(o2);
//            } else if (o2 instanceof Double) {
//                return getInteger(o1) / getDouble(o2);
//            } else if (o2 instanceof Integer) {
//                return getInteger(o1) / getInteger(o2);
//            } else if (!o2.toString().contains(".")) {
//                return getInteger(o1) / getInteger(o2);
//            } else if (o2.toString().contains(".")) {
//                return getInteger(o1) / getFloat(o2);
//            }
//        } else if (!o1.toString().contains(".")) {
//            if (o2 instanceof Float) {
//                return getInteger(o1) / getFloat(o2);
//            } else if (o2 instanceof Double) {
//                return getInteger(o1) / getDouble(o2);
//            } else if (o2 instanceof Integer) {
//                return getInteger(o1) / getInteger(o2);
//            } else if (!o2.toString().contains(".")) {
//                return getInteger(o1) / getInteger(o2);
//            } else if (o2.toString().contains(".")) {
//                return getInteger(o1) / getFloat(o2);
//            }
//        } else if (o1.toString().contains(".")) {
//            if (o2 instanceof Float) {
//                return getFloat(o1) / getFloat(o2);
//            } else if (o2 instanceof Double) {
//                return getFloat(o1) / getDouble(o2);
//            } else if (o2 instanceof Integer) {
//                return getFloat(o1) / getInteger(o2);
//            } else if (!o2.toString().contains(".")) {
//                return getFloat(o1) / getInteger(o2);
//            } else if (o2.toString().contains(".")) {
//                return getFloat(o1) / getFloat(o2);
//            }
//        }
//        return null;
    }

    private static Object multiply(Object o1, Object o2) {
        if (o1 instanceof Float) {
            if (o2 instanceof Float) {
                return getFloat(o1) * getFloat(o2);
            } else if (o2 instanceof Double) {
                return getFloat(o1) * getDouble(o2);
            } else if (o2 instanceof Integer) {
                return getFloat(o1) * getInteger(o2);
            } else if (!o2.toString().contains(".")) {
                return getFloat(o1) * getInteger(o2);
            } else if (o2.toString().contains(".")) {
                return getFloat(o1) * getFloat(o2);
            }
        } else if (o1 instanceof Double) {
            if (o2 instanceof Float) {
                return getDouble(o1) * getFloat(o2);
            } else if (o2 instanceof Double) {
                return getDouble(o1) * getDouble(o2);
            } else if (o2 instanceof Integer) {
                return getDouble(o1) * getInteger(o2);
            } else if (!o2.toString().contains(".")) {
                return getDouble(o1) * getInteger(o2);
            } else if (o2.toString().contains(".")) {
                return getDouble(o1) * getFloat(o2);
            }
        } else if (o1 instanceof Integer) {
            if (o2 instanceof Float) {
                return getInteger(o1) * getFloat(o2);
            } else if (o2 instanceof Double) {
                return getInteger(o1) * getDouble(o2);
            } else if (o2 instanceof Integer) {
                return getInteger(o1) * getInteger(o2);
            } else if (!o2.toString().contains(".")) {
                return getInteger(o1) * getInteger(o2);
            } else if (o2.toString().contains(".")) {
                return getInteger(o1) * getFloat(o2);
            }
        } else if (!o1.toString().contains(".")) {
            if (o2 instanceof Float) {
                return getInteger(o1) * getFloat(o2);
            } else if (o2 instanceof Double) {
                return getInteger(o1) * getDouble(o2);
            } else if (o2 instanceof Integer) {
                return getInteger(o1) * getInteger(o2);
            } else if (!o2.toString().contains(".")) {
                return getInteger(o1) * getInteger(o2);
            } else if (o2.toString().contains(".")) {
                return getInteger(o1) * getFloat(o2);
            }
        } else if (o1.toString().contains(".")) {
            if (o2 instanceof Float) {
                return getFloat(o1) * getFloat(o2);
            } else if (o2 instanceof Double) {
                return getFloat(o1) * getDouble(o2);
            } else if (o2 instanceof Integer) {
                return getFloat(o1) * getInteger(o2);
            } else if (!o2.toString().contains(".")) {
                return getFloat(o1) * getInteger(o2);
            } else if (o2.toString().contains(".")) {
                return getFloat(o1) * getFloat(o2);
            }
        }
        return null;
    }

}
