package com.backend.clase.service;

import com.backend.clase.dao.IDao;
import com.backend.clase.entity.Medicamento;

import java.util.List;

public class MedicamentoService {
    //capa de logica de negocio que interactua con la capa dao, pero desconoce los detalles de la implementacion de la misma
    private IDao<Medicamento> medicamentoIDao;

    public MedicamentoService(IDao<Medicamento> medicamentoIDao) {
        this.medicamentoIDao = medicamentoIDao;
    }

    public Medicamento guardarMedicamento(Medicamento medicamento) {
        return medicamentoIDao.guardar(medicamento);
    }

    public Medicamento buscarMedicamentoPorId(int id) {
        return medicamentoIDao.buscarPorId(id);
    }

    public List<Medicamento> listarTodosLosMedicamentos() {
        return medicamentoIDao.listarTodos();
    }

}
