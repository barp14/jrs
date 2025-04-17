package com.joaobarp.erp.controller;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
// import javax.inject.Named; tava retornando null mas talvez tenha que voltar no futuro

import com.joaobarp.erp.model.Empresa;
import com.joaobarp.erp.model.TipoEmpresa;

@ManagedBean
@ViewScoped
public class GestaoEmpresasBean implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Empresa empresa = new Empresa();
	
	public Empresa getEmpresa() {
		return empresa;
	}
	
	public TipoEmpresa[] getTiposEmpresa() {
		return TipoEmpresa.values();
	}
	
	public void salvar() {
		System.out.printf("Razão social: %s \nNome fantasia: %s \nTipo: %s", empresa.getRazaoSocial(), empresa.getNomeFantasia(), empresa.getTipo());
	}
}
