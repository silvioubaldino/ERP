package com.ControleDeEstoque.model.entity.drink_type;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DrinkType {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idDrinkType;

	private String drinkType;

	public DrinkType(String drinkType) {
		super();
		this.drinkType = drinkType;
	}

	public DrinkType() {
		// TODO Auto-generated constructor stub
	}
}
