package dto;

public class Category {
	/** カテゴリーID */
	private final String categoryid;

	/** カテゴリー */
	private final String categoryname;

	public Category(String categoryid, String categoryname) {
		this.categoryid = categoryid;
		this.categoryname = categoryname;
	}

	public String getCategoryid() {
		return categoryid;
	}

	public String getCategoryname() {
		return categoryname;
	}
}
