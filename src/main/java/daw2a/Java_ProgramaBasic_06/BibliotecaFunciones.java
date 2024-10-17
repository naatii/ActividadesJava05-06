package daw2a.Java_ProgramaBasic_06;

public class BibliotecaFunciones {
    public static boolean esCapicua(int num) {
        return num == voltea(num);
    }

    public static boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int siguientePrimo(int num) {
        num++;
        while (!esPrimo(num)) {
            num++;
        }
        return num;
    }

    public static int potencia(int base, int exponente) {
        int resultado = 1;
        for (int i = 0; i < exponente; i++) {
            resultado *= base;
        }
        return resultado;
    }

    public static int digitos(int num) {
        return String.valueOf(num).length();
    }

    public static int voltea(int num) {
        int volteado = 0;
        while (num > 0) {
            volteado = volteado * 10 + num % 10;
            num /= 10;
        }
        return volteado;
    }

    public static int digitoN(int num, int n) {
        String numStr = String.valueOf(num);
        if (n >= 0 && n < numStr.length()) {
            return Character.getNumericValue(numStr.charAt(n));
        }
        return -1;  // Si n está fuera de rango
    }

    public static int posicionDeDigito(int num, int digito) {
        String numStr = String.valueOf(num);
        return numStr.indexOf(String.valueOf(digito));
    }

    public static int quitaPorDetras(int num, int n) {
        return num / potencia(10, n);
    }

    public static int quitaPorDelante(int num, int n) {
        String numStr = String.valueOf(num);
        if (n >= numStr.length()) {
            return 0;
        }
        return Integer.parseInt(numStr.substring(n));
    }

    public static int pegaPorDetras(int num, int digito) {
        return num * 10 + digito;
    }

    public static int pegaPorDelante(int num, int digito) {
        String numStr = String.valueOf(num);
        return Integer.parseInt(digito + numStr);
    }

    public static int trozoDeNumero(int num, int inicio, int fin) {
        String numStr = String.valueOf(num);
        if (inicio < 0 || fin >= numStr.length() || inicio > fin) {
            return -1;
        }
        return Integer.parseInt(numStr.substring(inicio, fin + 1));
    }

    public static int juntaNumeros(int num1, int num2) {
        String num2Str = String.valueOf(num2);
        return Integer.parseInt(num1 + num2Str);
    }
}
