package dto;

public class food {
	
	private String foodid;
	private String category_id;
	private String foodkana;
	private String foodname;
	private int foodprice;
	private String comment;
	private String foodpath;
	
	
public String getFoodpath() {
		return foodpath;
	}

	public void setFoodpath(String foodpath) {
		this.foodpath = foodpath;
	}

public food() {}
	
	public food(String foodid, String category_id,String foodkana, String foodname,int foodprice, String comment, String foodpath) {
		this.setFoodid(foodid);
		this.setCategory_id(category_id);
		this.setFoodkana(foodkana);
		this.setFoodname(foodname);
		this.setFoodprice(foodprice);
		this.setComment(comment);
		this.setFoodpath(foodpath);
	}
	
	
	
	
	public String getFoodid() {
		return foodid;
	}
	public void setFoodid(String foodid) {
		this.foodid = foodid;
	}
	public String getCategory_id() {
		return category_id;
	}
	public void setCategory_id(String category_id) {
		this.category_id = category_id;
	}
	public String getFoodkana() {
		return foodkana;
	}
	public void setFoodkana(String foodkana) {
		this.foodkana = foodkana;
	}
	public String getFoodname() {
		return foodname;
	}
	public void setFoodname(String foodname) {
		this.foodname = foodname;
	}
	public int getFoodprice() {
		return foodprice;
	}
	public void setFoodprice(int foodprice) {
		this.foodprice = foodprice;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}


	

}