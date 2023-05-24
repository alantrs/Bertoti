package src.controller;

import src.model.Empresa;
import src.model.Departamento;

public class DepartamentoController implements Controller<Departamento> {

    private Integer departamentoId = 0;

    @Override
    public Departamento create(Departamento departamento) {
        departamento.setId(++departamentoId);
        Empresa.getInstance().addDepartamento(departamento);
        return departamento;
    }
    @Override
    public Departamento search(Integer id) {
        return Empresa.getInstance().getDepartamento(id);
    }
    public Departamento searchByName(String nome) {
        return null;
    }
}
