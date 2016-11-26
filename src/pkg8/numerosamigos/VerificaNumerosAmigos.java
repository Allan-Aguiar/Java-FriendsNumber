package pkg8.numerosamigos;

import javax.swing.JOptionPane;

public class VerificaNumerosAmigos {

    static void verificador() {

        int i, z = 0;

        String entrada;

        entrada = JOptionPane.showInputDialog("Entre com 1º número");
        int x = Integer.parseInt(entrada);

        entrada = JOptionPane.showInputDialog("Entre com 2º número");
        int y = Integer.parseInt(entrada);

        for (i = 1; i < x; i++) {
            if (x % i == 0) {
                z = z + i;
            }
        }

        if (z == y) {
            z = 0;
            for (i = 1; i < y; i++) {
                if (y % i == 0) {
                    z = z + i;
                }
            }

            if (z == x) {
                JOptionPane.showMessageDialog(null, x + " é amigo de " + y);
            } else {
                JOptionPane.showMessageDialog(null, x + " não é amigo de " + y);
            }
        } else {
            JOptionPane.showMessageDialog(null, x + " não é amigo de " + y);
        }
    }
}
