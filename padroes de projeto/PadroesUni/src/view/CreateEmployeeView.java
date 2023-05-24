package src.view;

import src.controller.Controller;
import src.controller.DepartamentoController;
import src.controller.EmpregadoController;
import src.model.Departamento;
import src.model.Empregado;
import src.model.Empresa;


public class CreateEmployeeView implements Observer {
    private Controller<Empregado> empregadoController = new EmpregadoController();
    private Controller<Departamento> departmentoController = new DepartamentoController();

    public CreateEmployeeView() {
        Empresa.getInstance().registerObserver(this);
    }

    public void createDepartamento(String nome) {
        Departamento departamento = new Departamento();
        departamento.setNome(nome);
        departamento = departmentoController.create(departamento);
    }


    public void createEmployee(String nome) {
        Empregado empregado = new Empregado();
        empregado.setNome(nome);
        empregado = empregadoController.create(empregado);
    }

    @Override
    public void update(String empregadoNome, Integer departamentoId) {
        System.out.println("Empregado: " + empregadoNome+ " foi inserido no departamento" + departamentoId);
    }
}

