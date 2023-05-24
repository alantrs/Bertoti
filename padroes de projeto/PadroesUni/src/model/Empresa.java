package src.model;

import java.util.ArrayList;
import java.util.List;

import src.view.Observer;

public class Empresa implements Subject {

    private List<Empregado> empregados;
    private List<Departamento> departamentos;
    private List<Observer> observers;
    private static Empresa instance;

    private Empresa() {
        empregados = new ArrayList<>();
        departamentos = new ArrayList<>();
        observers = new ArrayList<>();
    }

    public static Empresa getInstance() {
        if (instance == null) {
            instance = new Empresa();
        }

        return instance;
    }

    public Empregado getEmpregado(String nome) {
        for (Empregado empregado : empregados) {
            if (empregado.getNome().equals(nome)) {
                return empregado;
            }
        }
        return null;
    }

    public Empregado getEmpregadoDepartamento(String nomeDepartamento) {
        for (Empregado empregado : empregados) {
            if (empregado.getDepartamento() != null && empregado.getDepartamento().getNome().equals(nomeDepartamento)) {
                return empregado;
            }
        }
        return null;
    }

    public void addEmpregado(Empregado empregado) {
        empregados.add(empregado);
    }

    public void addDepartamento(Departamento departamento) {
        departamentos.add(departamento);
    }

    public void setEmpregadoDepartamento(String empregadoNome, Integer departamentoId) {
        Empregado empregado = getEmpregado(empregadoNome);
        Departamento departamento = getDepartamento(departamentoId);

        if (empregado != null && departamento != null) {
            empregado.setDepartamento(departamento);
            notifyObservers(empregadoNome, departamentoId);
        }
    }

    public Departamento getDepartamento(Integer id) {
        for (Departamento departamento : departamentos) {
            Integer departamentoId = departamento.getId();
            if (departamentoId != null && departamentoId.equals(id)) {
                return departamento;
            }
        }
        return null;
    }


    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers(String empregadoNome, Integer departamentoId) {
        for (Observer observer : observers) {
            observer.update(empregadoNome, departamentoId);
        }
    }
}
