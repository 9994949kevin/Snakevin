package game.item;

public interface Item {
	public static final int TOUGH_EMPTY = 0;
	public static final int TOUGH_EATABLE = 1;
	public static final int TOUGH_EAT_TWICE = 2;
	public static final int TOUGH_SNAKE     = 10000;
	public static final int TOUGH_OBSTRUCTION = 20000;
	
	public String getName();
	public String getDescription();
	public Integer getToughness();
	public Integer getScoreChange();
	public Double getHPChange();
}
