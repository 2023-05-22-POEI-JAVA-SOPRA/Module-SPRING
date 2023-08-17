package tp.planete.entity;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

public class Planete {
	
	
    private Integer id;
    
    @NotNull
    @NotEmpty
    @Size(min = 1, max = 20)
    private String name;
    
    @Positive
    @Max(value = 1500000)
    private Integer diameter;
    

    private float density;
    
    @NotNull
    @Size(min = 1, max = 10)
    private String mainCompo;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getDiameter() {
		return diameter;
	}

	public void setDiameter(Integer diameter) {
		this.diameter = diameter;
	}

	public float getDensity() {
		return density;
	}

	public void setDensity(float density) {
		this.density = density;
	}

	public String getMainCompo() {
		return mainCompo;
	}

	public void setMainCompo(String mainCompo) {
		this.mainCompo = mainCompo;
	}
	
	
	
	
}
