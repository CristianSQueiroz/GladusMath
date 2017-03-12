/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gladusmath;

import static gladusutil.GladusUtil.*;
import java.util.HashMap;

/**
 *
 * @author csqueiroz
 */
public class BasicMath {

    public static Object resultCalculation(String function, HashMap values) {
        switch (function.toUpperCase()) {
            case "SOMAR": {
                return plus(values.get("VALUE1"), values.get("VALUE2"));
            }
            case "SUBTRAIR": {
                return subtract(values.get("VALUE2"),values.get("VALUE1"));
            }
            case "DIVIDIR": {
                return divide(values.get("VALUE1"), values.get("VALUE2"));
            }
            case "MULTIPLICAR": {
                return multiply(values.get("VALUE1"), values.get("VALUE2"));
            }
        }
        return null;
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
        if (o1 instanceof Float) {
            if (o2 instanceof Float) {
                return getFloat(o1) / getFloat(o2);
            } else if (o2 instanceof Double) {
                return getFloat(o1) / getDouble(o2);
            } else if (o2 instanceof Integer) {
                return getFloat(o1) / getInteger(o2);
            } else if (!o2.toString().contains(".")) {
                return getFloat(o1) / getInteger(o2);
            } else if (o2.toString().contains(".")) {
                return getFloat(o1) / getFloat(o2);
            }
        } else if (o1 instanceof Double) {
            if (o2 instanceof Float) {
                return getDouble(o1) / getFloat(o2);
            } else if (o2 instanceof Double) {
                return getDouble(o1) / getDouble(o2);
            } else if (o2 instanceof Integer) {
                return getDouble(o1) / getInteger(o2);
            } else if (!o2.toString().contains(".")) {
                return getDouble(o1) / getInteger(o2);
            } else if (o2.toString().contains(".")) {
                return getDouble(o1) / getFloat(o2);
            }
        } else if (o1 instanceof Integer) {
            if (o2 instanceof Float) {
                return getInteger(o1) / getFloat(o2);
            } else if (o2 instanceof Double) {
                return getInteger(o1) / getDouble(o2);
            } else if (o2 instanceof Integer) {
                return getInteger(o1) / getInteger(o2);
            } else if (!o2.toString().contains(".")) {
                return getInteger(o1) / getInteger(o2);
            } else if (o2.toString().contains(".")) {
                return getInteger(o1) / getFloat(o2);
            }
        } else if (!o1.toString().contains(".")) {
            if (o2 instanceof Float) {
                return getInteger(o1) / getFloat(o2);
            } else if (o2 instanceof Double) {
                return getInteger(o1) / getDouble(o2);
            } else if (o2 instanceof Integer) {
                return getInteger(o1) / getInteger(o2);
            } else if (!o2.toString().contains(".")) {
                return getInteger(o1) / getInteger(o2);
            } else if (o2.toString().contains(".")) {
                return getInteger(o1) / getFloat(o2);
            }
        } else if (o1.toString().contains(".")) {
            if (o2 instanceof Float) {
                return getFloat(o1) / getFloat(o2);
            } else if (o2 instanceof Double) {
                return getFloat(o1) / getDouble(o2);
            } else if (o2 instanceof Integer) {
                return getFloat(o1) / getInteger(o2);
            } else if (!o2.toString().contains(".")) {
                return getFloat(o1) / getInteger(o2);
            } else if (o2.toString().contains(".")) {
                return getFloat(o1) / getFloat(o2);
            }
        }
        return null;
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
