package by.epam.student.dobrov.mod4.Classes9;

class Book {
    private int id;
    private String bookName;
    private String author;
    private String productionOfPublishing;
    private int yearOfPublishing;
    private int quantityOfPages;
    private double price;
    private String bindingType;

    public Book(int id, String bookName, String author, String productionOfPublishing, int yearOfPublishing, int quantityOfPages, double price, String bindingType) {
        this.id = id;
        this.bookName = bookName;
        this.author = author;
        this.productionOfPublishing = productionOfPublishing;
        this.yearOfPublishing = yearOfPublishing;
        this.quantityOfPages = quantityOfPages;
        this.price = price;
        this.bindingType = bindingType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getProductionOfPublishing() {
        return productionOfPublishing;
    }

    public void setProductionOfPublishing(String productionOfPublishing) {
        this.productionOfPublishing = productionOfPublishing;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    public int getQuantityOfPages() {
        return quantityOfPages;
    }

    public void setQuantityOfPages(int quantityOfPages) {
        this.quantityOfPages = quantityOfPages;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBindingType() {
        return bindingType;
    }

    public void setBindingType(String bindingType) {
        this.bindingType = bindingType;
    }

    @Override
    public String toString() {
        return String.format("Book{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                ", productionOfPublishing='" + productionOfPublishing + '\'' +
                ", yearOfPublishing=" + yearOfPublishing +
                ", quantityOfPages=" + quantityOfPages +
                ", price=" + price +
                ", bindingType='" + bindingType + '\'' +
                '}');

    }

    public boolean checkAuthor(String author) {
        if (author.compareTo(this.author) == 0) {
            return true;
        }
        return false;
    }

    public boolean checkProductionOfPublishing(String productionOfPublishing) {
        if (productionOfPublishing.compareTo(this.productionOfPublishing) == 0) {
            return true;
        }
        return false;
    }

    public boolean checkYearOfPublishing(int yearOfPublishing) {
        if (yearOfPublishing < this.yearOfPublishing) {
            return true;
        }
        return false;
    }
}
