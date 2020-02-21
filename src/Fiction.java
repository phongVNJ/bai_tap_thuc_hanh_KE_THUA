public class Fiction extends book {
    public String category;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Fiction(String bookcode, String name, int price, String author, String category) {
        super(bookcode, name, price, author);
        this.category = category;
    }


}
