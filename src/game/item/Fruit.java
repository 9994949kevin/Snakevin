package game.item;

public class Fruit implements Item {
	
	private String name = "Fruit";
	private String description = "Food of snake, usually with growth in body and recover in HP";
	private Integer toughness = TOUGH_EATABLE;
	private Integer scoreChange = 10;
	private Double hpChange = 10.;

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getDescription() {
		return description;
	}

	@Override
	public Integer getToughness() {
		return toughness;
	}

	@Override
	public Integer getScoreChange() {
		return scoreChange;
	}

	@Override
	public Double getHPChange() {
		return hpChange;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setToughness(Integer toughness) {
		this.toughness = toughness;
	}

	public void setScoreChange(Integer scoreChange) {
		this.scoreChange = scoreChange;
	}

	public void setHpChange(Double hpChange) {
		this.hpChange = hpChange;
	}

}
