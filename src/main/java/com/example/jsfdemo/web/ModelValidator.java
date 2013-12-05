package com.example.jsfdemo.web;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator("modelValidator")
public class ModelValidator implements Validator {
	
	@Override
	public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
		String model = value.toString();
		if(model.length()<5){
			FacesMessage fm = new FacesMessage("Model musi mieć co najmniej 5 znaków");
			throw new ValidatorException(fm);
		}
	}
}
