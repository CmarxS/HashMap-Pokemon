package br.com.fiap.main;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class PokemonHashMap {
    public static void main(String[] args) {
        HashMap<String, String> pokemon = new HashMap<>();
        do {
            try {
                String nome, tipo;
                do {
                    nome = JOptionPane.showInputDialog("Digite o nome de um pokemon ou digite \"FIM\" para encerrar");
                    if (!nome.equalsIgnoreCase("FIM")) {
                        tipo = JOptionPane.showInputDialog("Digite o tipo deste pokemon").toUpperCase();
                        if (pokemon.containsKey(nome)) {
                            JOptionPane.showMessageDialog(null, "Pokemon já cadastrado");
                        } else {
                            pokemon.put(nome, tipo);
                        }
                    }
                }while (!nome.equalsIgnoreCase("FIM")) ;
                    String escolha = JOptionPane.showInputDialog("Digite o tipo de um Pokemon").toUpperCase();
                    String resultado = "Pokemons do tipo " + escolha + ":\n";
                    if (pokemon.containsValue(escolha)) {
                        for (String key : pokemon.keySet()) {
                            if (pokemon.get(key).equals(escolha)) {
                                resultado += "\n " + key;
                            }

                        }
                    } else {
                        resultado = "Pokemon não encontrado";
                    }
                    JOptionPane.showMessageDialog(null, resultado);
                } catch(Exception e){
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }

            }
            while (JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Atenção", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0)
                ;
            JOptionPane.showMessageDialog(null, "Fim de Programa!");
            ;
        }
    }
