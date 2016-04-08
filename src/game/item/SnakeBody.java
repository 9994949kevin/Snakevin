package game.item;

public class SnakeBody implements Item {
	
	private String name = "SnakeBody";
	private String description = "Body of snake";
	private Integer toughness = TOUGH_SNAKE;
	private Integer scoreChange = 0;
	private Double HPChange = 0.;
	public SnakeBody previous;
	public SnakeBody next;
	
	public SnakeBody(SnakeBody previous, SnakeBody next){
		this.previous = previous;
		this.next = next;
	}
	
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
		return HPChange;
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

	public void setHPChange(Double hPChange) {
		HPChange = hPChange;
	}

}
