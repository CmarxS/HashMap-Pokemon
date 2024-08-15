package br.com.fiap.main;

import javax.swing.*;
import java.util.*;

public class SorteioHashSet {
    public static void main(String[] args) {
        HashSet<Integer> numerosSorteados = new HashSet<Integer>();
        Random random = new Random();
        do {
            JOptionPane.showMessageDialog(null, "Confira o resultado do sorteio da loteria", "Loteria Premiada", JOptionPane.WARNING_MESSAGE);
            while (numerosSorteados.size() < 6){
                int numero = random.nextInt(59) + 1;
                numerosSorteados.add(numero);
            }
            List<Integer> resultadoSorteio = new ArrayList<Integer>(numerosSorteados);
            Collections.sort(resultadoSorteio);
            JOptionPane.showMessageDialog(null, "Os números sorteados são: \n" + resultadoSorteio);
            numerosSorteados.clear();
        } while (JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Atenção", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE) == 0);
        JOptionPane.showMessageDialog(null, "Fim de programa!");
    }
}
