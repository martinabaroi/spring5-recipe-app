package guru.springframework.domain;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Ingredient {
	

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private BigDecimal amount;
    
    @ManyToOne			//many ingredients can have in one recipe
    private Recipe recipe; //this name "recipe" have to write in Recipe entity mappedBy = " "

    
    @OneToOne(fetch = FetchType.EAGER)   //unidirectional relationship from ingredient to Unit of messure. //so no need of ingredienr properties in unit of messure enity
    private UnitOfMeasure unitOfMeasure;

    
    
    public Ingredient() {
		super();
	}
    
	public Ingredient(String description, BigDecimal amount, UnitOfMeasure unitOfMeasure) {
		this.description = description;
		this.amount = amount;
		this.unitOfMeasure = unitOfMeasure;
	}

	public Ingredient(String description, BigDecimal amount, UnitOfMeasure unitOfMeasure ,Recipe recipe ) {
    	this.description = description;
    	this.amount = amount;
    	this.recipe = recipe;
    	this.unitOfMeasure = unitOfMeasure;
    }
    
    
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public BigDecimal getAmount() {
		return amount;
	}


	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}


	public Recipe getRecipe() {
		return recipe;
	}


	public void setRecipe(Recipe recipe) {
		this.recipe = recipe;
	}

	public UnitOfMeasure getUnitOfMessure() {
		return unitOfMeasure;
	}


	public void setUnitOfMessure(UnitOfMeasure unitOfMessure) {
		this.unitOfMeasure = unitOfMessure;
	}

    
    
    
}
