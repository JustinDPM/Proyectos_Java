public class Calculator{

    public static void main(String[] args) {

        if (args.length != 3) {
            System.out.println("Uso: java Calculator operando1 operador operando2");
            System.exit(1);
        }

        int op1 = 0;
        int op2 = 0;

        try {
            op1 = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            System.out.println("Entrada incorrecta: " + args[0]);
            System.exit(1);
        }

        try {
            op2 = Integer.parseInt(args[2]);
        } catch (NumberFormatException e) {
            System.out.println("Entrada incorrecta: " + args[2]);
            System.exit(1);
        }

        int result = 0;

        switch (args[1].charAt(0)) {
            case '+':
                result = op1 + op2;
                break;
            case '-':
                result = op1 - op2;
                break;
            case '*':
                result = op1 * op2;
                break;
            case '/':
                result = op1 / op2;
                break;
            default:
                System.out.println("Operador no válido.");
                System.exit(1);
        }

        System.out.println(op1 + " " + args[1] + " " + op2 + " = " + result);
    }
}
