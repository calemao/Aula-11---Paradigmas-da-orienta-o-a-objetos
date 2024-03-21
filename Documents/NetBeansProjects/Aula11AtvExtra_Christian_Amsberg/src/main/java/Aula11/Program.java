/*
 * Copyright (C) 2024 Christian Amsberg Janner <janner.chris15@outlook.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package Aula11;

/**
 *
 * @author Christian Amsberg Janner <janner.chris15@outlook.com>
@date 20/03/2024
@brief Class Program
public class Program
* **/
import java.util.ArrayList;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in); // Inicializa um scanner para entrada de dados
        
        ArrayList <Vehicle> veiculos = new ArrayList<>(); // Cria uma lista para armazenar quantidades indefinidas de veículos cadastrados.
        
        while (true) { // loop que mantem o menu até o usuário escolher sair.
            System.out.println();
            System.out.println("Selecione a ação:");
            System.out.println("1 - Cadastrar veículo");
            System.out.println("2 - Editar veículo");
            System.out.println("3 - Excluir veículo");
            System.out.println("4 - Sair"); //menu de opções

            int opcao = scanner.nextInt(); // Lê a opção escolhida pelo usuário 
            
            switch (opcao) { // Realiza ações de acordo com a opção escolhida
            
            case 1:
                cadastrarVeiculo(scanner, veiculos); // Chama o método para cadastrar um novo veículo
                break;
            case 2:
                editarVeiculo(scanner, veiculos); // Chama o método para editar um veículo
                break;
            case 3:
                excluirVeiculo(scanner, veiculos); // Chama o método para excluir um veículo
                break;
            case 4:
                return; // Encerra o programa
            default:
                System.out.println("Opção inválida."); // Mensagem de erro para opção inválida
               
        }
        }      
}
    
    private static void cadastrarVeiculo(Scanner scanner, ArrayList <Vehicle> veiculos) { // Método para cadastrar novo veículo
  
        System.out.println();
        System.out.println("Selecione o tipo de veículo:");
        System.out.println("1 - Caminhão");
        System.out.println("2 - Ônibus"); // Menu de seleção de ônibus e caminhão
        int tipo = scanner.nextInt(); // Lê o tipo de veículo escolhido pelo usuário
        
        System.out.println();
        System.out.println("Insira a placa do veículo: ");
        String placa = scanner.next(); // Lê a placa do veículo
        System.out.println("Insira o ano do veículo: ");
        int ano = scanner.nextInt(); // Lê o ano do veículo
        
       switch (tipo) { // Realiza ações de acordo com o tipo de veículo escolhido
           
           case 1:
            System.out.println("Digite a quantidade de eixos:");
            int eixos = scanner.nextInt(); // Lê a quantidade de eixos do caminhão
            veiculos.add(new Truck(placa, ano, eixos)); // Adiciona as informações do veículo à lista de veículos 
            System.out.println("Cadastro concluído."); // Mensagem de conclusão do cadastro
            break; // Cadastra caminhão com sua quantidade de eixos 
           case 2:
            System.out.println("Digite o número de assentos:");
            int assentos = scanner.nextInt(); // Lê o número de assentos do ônibus
            veiculos.add(new Bus(placa, ano, assentos)); // Adiciona as informações do veículo à lista de veículos 
            System.out.println("Cadastro concluído."); // Mensagem de conclusão do cadastro
            break; // Cadastra ônibus com sua quantidade de assentos
           default:
            System.out.println("Opção inválida."); // Mensagem de erro para opção inválida
        }
    }
    
    private static void editarVeiculo(Scanner scanner, ArrayList <Vehicle> veiculos) { // Método para editar veículos
        
        System.out.println();
        System.out.println("Insira a placa do veículo que deseja editar: ");
        String placa = scanner.next(); // Lê a placa do veículo que o usuário deseja editar
        
    for (Vehicle veiculo : veiculos) { // Itera sobre a lista de veículos
            if (veiculo.getPlate().equals(placa)) { // Verifica se o veículo está presente na lista de veículos
                System.out.println("Digite o novo ano do veículo:");
                int novoAno = scanner.nextInt(); // Lê o novo ano do veículo
                veiculo.setYear(novoAno); // Atualiza o ano do veículo
                System.out.println("Veículo editado."); // Mensagem de conclusão da edição
                return;
            }
        }
    
        System.out.println("Veículo não localizado."); // Mensagem de erro se o veículo não for encontrado na lista
    
    }
    
    private static void excluirVeiculo(Scanner scanner, ArrayList <Vehicle> veiculos) { // Método para excluir veículos
        
        System.out.println();
        System.out.println("Insira a placa do veículo que deseja excluir: ");
        String placa = scanner.next(); // Lê a placa do veículo que o usuário deseja excluir
        
        for (int i = 0; i < veiculos.size(); i++) { // Itera sobre a lista de veículos
            Vehicle veiculo = veiculos.get(i);
            if (veiculo.getPlate().equals(placa)) { // Verifica se o veículo está presente na lista de veículos
                veiculos.remove(i); // Remove o veículo da lista
                System.out.println("Veículo excluído com sucesso!"); // Mensagem de confirmação de exclusão
                return;
        
    }
    
        }
        
        System.out.println("Veículo não encontrado."); // Mensagem de erro se o veículo não for encontrado na lista
        
    }
}
