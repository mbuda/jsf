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
		
		FacesMessage message = new FacesMessage();
		message.setSummary("Model musi mieć co najmniej 5 liter");
		message.setSeverity(FacesMessage.SEVERITY_ERROR);
		
		if(model.length()<5){
			throw new ValidatorException(message);
		}
	
}
}
