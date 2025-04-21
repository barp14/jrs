package com.joaobarp.erp.controller;

import java.io.Serializable;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;

import com.joaobarp.erp.model.Empresa;
import com.joaobarp.erp.repository.Empresas;
import javax.inject.Named;

@Named
@ViewScoped
public class GestaoEmpresasBean implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Inject
	private Empresas empresas;
	
	private List<Empresa> listaEmpresas;
	
	public void todasEmpresas() {
		listaEmpresas = empresas.todas();
	}
	
	public List<Empresa> getListaEmpresas() {
		return listaEmpresas;
	}
	
}
