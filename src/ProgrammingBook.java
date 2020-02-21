public class ProgrammingBook extends book {
    public String Language ;
    public String Framwork;

    public ProgrammingBook(String bookcode, String name, int price, String author,String Language) {
        super(bookcode, name, price, author);
        this.Language = Language;
    }

    public String getLanguage() {
        return Language;
    }

    public void setLanguage(String language) {
        Language = language;
    }

    public String getFramwork() {
        return Framwork;
    }

    public void setFramwork(String framwork) {
        Framwork = framwork;
    }

}
