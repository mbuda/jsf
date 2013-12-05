package com.example.jsfdemo.web;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.model.ListDataModel;
import javax.faces.validator.ValidatorException;
import javax.inject.Inject;
import javax.inject.Named;

import com.example.jsfdemo.domain.Komputer;
import com.example.jsfdemo.service.KomputerManager;

@SessionScoped
@Named("kompBean")
public class KompFormBean implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Komputer komp = new Komputer();
	
	private ListDataModel<Komputer> kompy = new ListDataModel<Komputer>();
	
	@Inject
	private KomputerManager km;
	
	
	public Komputer getKomputer(){
		return komp;
	}
	
	public void setKomputer(Komputer komp){
		this.komp=komp;
	}
	
	public ListDataModel<Komputer> getAllKomp(){
		kompy.setWrappedData(km.getAllKomp());
		return kompy;
	}
	
	// Actions
	public String addKomp(){
		km.addKomputer(komp);
		return "db";
	}
	
	public String deleteKomp() {
		Komputer kompDoUsuniecia=kompy.getRowData();
		km.deleteKomp(kompDoUsuniecia);
		return null;
	}
	
	public ListDataModel<Komputer> getKompByModel(){
		kompy.setWrappedData(km.getKompByModel(komp));
		return kompy;
	}
	
	//Validators
	
	//unikalny model
	public void uniqueModel(FacesContext context, UIComponent component, Object value) {
		String model = (String) value;
		
		for(Komputer komp: km.getAllKomp()) {
			if(komp.getModel().equalsIgnoreCase(model)) {
				FacesMessage message = new FacesMessage(
						"Ten model już istnieje w bazie. Modele muszą być unikalne");
				message.setSeverity(FacesMessage.SEVERITY_ERROR);
				throw new ValidatorException(message);
			}
		}
	}
	
	
}
