package src;

import src.model.Departamento;
import src.model.Empregado;
import src.model.Empresa;
import src.view.Observer;

public class App {
    public static void main(String[] args) {
        // Criação de uma instância de Empresa
        Empresa empresa = Empresa.getInstance();

        // Criando alguns departamentos
        Departamento departamento1 = new Departamento();
        departamento1.setNome("Vendas");
        empresa.addDepartamento(departamento1);

        Departamento departamento2 = new Departamento();
        departamento2.setNome("RH");
        empresa.addDepartamento(departamento2);

        // Criando alguns empregados
        Empregado empregado1 = new Empregado();
        empregado1.setNome("João");
        empresa.addEmpregado(empregado1);

        Empregado empregado2 = new Empregado();
        empregado2.setNome("Maria");
        empresa.addEmpregado(empregado2);

        // Definindo empregados para os departamentos
        if (empregado1.getNome() != null && departamento1.getId() != null) {
            empresa.setEmpregadoDepartamento(empregado1.getNome(), departamento1.getId());
        }
        if (empregado2.getNome() != null && departamento2.getId() != null) {
            empresa.setEmpregadoDepartamento(empregado2.getNome(), departamento2.getId());
        }

        // Registrando um observador
        Observer observer = new Observer() {
            @Override
            public void update(String empregadoNome, Integer departamentoId) {
                System.out.println("Atualização recebida - Empregado: " + empregadoNome + " | Departamento: " + departamentoId);
            }
        };
        empresa.registerObserver(observer);

        // Testando a notificação de observadores
        empresa.setEmpregadoDepartamento(empregado1.getNome(), departamento2.getId());

        // Realizando uma busca
        Empregado empregadoEncontrado = empresa.getEmpregado(empregado2.getNome());

        if (empregadoEncontrado != null) {
            System.out.println("Empregado encontrado: " + empregadoEncontrado.getNome());
        } else {
            System.out.println("Nenhum empregado encontrado com o ID especificado.");
        }

    }
}
