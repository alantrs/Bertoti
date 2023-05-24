package src.controller;

import src.model.Empregado;
import src.model.Empresa;

public class EmpregadoController implements Controller<Empregado> {

    @Override
    public Empregado create(Empregado empregado) {
        Empresa.getInstance().addEmpregado(empregado);
        return empregado;
    }
    public Empregado searchByName(String nome) {
        return Empresa.getInstance().getEmpregado(nome);
    }

    public Empregado search(Integer id) {
        return null;
    }
}

