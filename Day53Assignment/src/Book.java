public class Book {
    private String title;
    private int numofpages;
    private int year;

    public Book(String bookname, int pages, int pubyear) {
        title = bookname;
        numofpages = pages;
        year = pubyear;
    }

    public Book() {

    }

    public Book(String bookname1, int pages1) {
        this.title = bookname1;
        this.numofpages = pages1;

    }

    public Book (int pages2, int pubyear1){
            this.numofpages = pages2;
            this.year = pubyear1;
            }

    public String getName() {
        return title;
    }

    public int getpages() {
        return numofpages;
    }

    public int getpubyear() {
        return year;
    }

    public String toString() {
        String s;
        s = getName() + " , " + getpages() + " , " + getpubyear();
        return s;
    }
}
