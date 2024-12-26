package br.com.gabriel;

import br.com.gabriel.dao.ClientMapDAO;
import br.com.gabriel.dao.IClientDAO;
import br.com.gabriel.domain.Client;

import javax.swing.*;

public class App {
    private static IClientDAO iClientDAO;

    public static void main(String[] args) {
        iClientDAO = new ClientMapDAO();

        String option = JOptionPane.showInputDialog(null,
                "Choose 1 para cadastro, 2 para consultar, 3 para excluir, 4 para alterar ou 5 para sair",
                "Choose", JOptionPane.INFORMATION_MESSAGE);

        while (!isValidOption(option)) {
            if ("".equals(option)) {
                exit();
            }
            option = JOptionPane.showInputDialog(null,
                    "Invalid option! Choose 1 para cadastro, 2 para consultar, 3 para excluir, 4 para alterar ou 5 para sair",
                    "Error", JOptionPane.INFORMATION_MESSAGE);
        }

        while (isValidOption(option)) {
            if (isExitOption(option)) {
                exit();
            } else if (isRegisterOption(option)) {
                String data = JOptionPane.showInputDialog(null,
                        "Write client data separated by commas. Example: Name, CPF, Cellphone, Street, Number, City, and State.",
                        "Register", JOptionPane.INFORMATION_MESSAGE);
                register(data);
            } else if(isConsultOption(option)) {
                String data = JOptionPane.showInputDialog(null,
                        "Write the CPF",
                        "Consult", JOptionPane.INFORMATION_MESSAGE);

                consult(data);
            } else if(isRemoveOption(option)) {
                String data = JOptionPane.showInputDialog(null,
                        "Write the CPF",
                        "Remove", JOptionPane.INFORMATION_MESSAGE);

                remove(data);
            } else if(isUpdateOption(option)) {
                String data = JOptionPane.showInputDialog(null,
                        "Write client data separated by commas. Example: Name, CPF, Cellphone, Street, Number, City, and State.",
                        "Update", JOptionPane.INFORMATION_MESSAGE);
                update(data);
            }

            option = JOptionPane.showInputDialog(null,
                    "Choose 1 para cadastro, 2 para consultar, 3 para excluir, 4 para alterar ou 5 para sair",
                    "Choose", JOptionPane.INFORMATION_MESSAGE);

        }
    }

    private static void update(String data) {
        String[] dataSeparated = data.split(",");
        Client client = new Client(dataSeparated[0],dataSeparated[1],dataSeparated[2],dataSeparated[3],dataSeparated[4],dataSeparated[5],dataSeparated[6]);
        iClientDAO.change(client);
        JOptionPane.showMessageDialog(null, "Client update sucessfuly: ", "Sucess",JOptionPane.INFORMATION_MESSAGE);
    }

    private static void remove(String data) {
        Client client = iClientDAO.remove(Long.parseLong(data));
        if (client != null) {
            JOptionPane.showMessageDialog(null, "Client exclusion sucessfuly: ", "Sucess",JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Client not finded: ", "Error",JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private static void consult(String data) {
        Client client = iClientDAO.find(Long.parseLong(data));
        if (client != null) {
            JOptionPane.showMessageDialog(null, "Client finded: " + client.toString(), "Sucess",JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Client not finded: ", "Error",JOptionPane.INFORMATION_MESSAGE);
        }

    }

    private static void register(String data) {
        String[] dataSeparated = data.split(","); // Vai separar por virgulas
        Client client = new Client(dataSeparated[0],dataSeparated[1],dataSeparated[2],dataSeparated[3],dataSeparated[4],dataSeparated[5],dataSeparated[6]);
        Boolean isRegistered = iClientDAO.register(client);
        if (isRegistered) {
            JOptionPane.showMessageDialog(null,
                    "Client registered sucesssfuly.",
                    "Sucess", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null,
                    "Client already registered.",
                    "Sucess", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private static boolean isValidOption(String option) {
        if ("1".equals(option) || "2".equals(option) || "3".equals(option) || "4".equals(option) || "5".equals(option)) {
            return true;
        }
        return false;
    }

    private static boolean isRegisterOption(String option) {
        if ("1".equals(option)) {
            return true;
        }

        return false;
    }

    private static boolean isConsultOption(String option) {
        if ("2".equals(option)) {
            return true;
        }
        return false;
    }

    private static boolean isRemoveOption(String option) {
        if ("3".equals(option)) {
            return true;
        }

        return false;
    }

    private static boolean isUpdateOption(String option) {
        if ("4".equals(option)) {
            return true;
        }

        return false;
    }

    private static boolean isExitOption(String option) {
        if ("5".equals(option)) {
            return true;
        }

        return false;
    }

    private static void exit(){
        JOptionPane.showMessageDialog(null,
                "See you later!",
                "Exit", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
