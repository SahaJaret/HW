package HW.minMax;

public class MinMaxValues {
    public static void main(String[] args) {
        if (args.length == 0) {
            printMinMaxValues(byte.class);
            printMinMaxValues(short.class);
            printMinMaxValues(char.class);
            printMinMaxValues(int.class);
            printMinMaxValues(long.class);
            printMinMaxValues(float.class);
            printMinMaxValues(double.class);
        } else {
            for (String arg : args) {
                switch (arg.toLowerCase()) {
                    case "byte":
                        printMinMaxValues(byte.class);
                        break;
                    case "short":
                        printMinMaxValues(short.class);
                        break;
                    case "char":
                        printMinMaxValues(char.class);
                        break;
                    case "int":
                        printMinMaxValues(int.class);
                        break;
                    case "long":
                        printMinMaxValues(long.class);
                        break;
                    case "float":
                        printMinMaxValues(float.class);
                        break;
                    case "double":
                        printMinMaxValues(double.class);
                        break;
                    default:
                        System.out.println("Неверный тип: " + arg);
                }
            }
        }
    }

    private static void printMinMaxValues(Class<?> type) {
        if (type == byte.class) {
            System.out.println("byte: Минимальное значение = " + Byte.MIN_VALUE + ", Максимальное значение = " + Byte.MAX_VALUE);
        } else if (type == short.class) {
            System.out.println("short: Минимальное значение = " + Short.MIN_VALUE + ", Максимальное значение = " + Short.MAX_VALUE);
        } else if (type == char.class) {
            System.out.println("char: Минимальное значение = " + (int) Character.MIN_VALUE + ", Максимальное значение = " + (int) Character.MAX_VALUE);
        } else if (type == int.class) {
            System.out.println("int: Минимальное значение = " + Integer.MIN_VALUE + ", Максимальное значение = " + Integer.MAX_VALUE);
        } else if (type == long.class) {
            System.out.println("long: Минимальное значение = " + Long.MIN_VALUE + ", Максимальное значение = " + Long.MAX_VALUE);
        } else if (type == float.class) {
            System.out.println("float: Минимальное значение = " + Float.MIN_VALUE + ", Максимальное значение = " + Float.MAX_VALUE);
        } else if (type == double.class) {
            System.out.println("double: Минимальное значение = " + Double.MIN_VALUE + ", Максимальное значение = " + Double.MAX_VALUE);
        }
    }
}
