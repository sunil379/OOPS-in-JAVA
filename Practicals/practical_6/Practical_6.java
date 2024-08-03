package practical_6;

public class Practical_6 {
    // Parent class
    public static class ReadingMaterial {
        private String title;
        private double price;

        public ReadingMaterial(String title, double price) {
            this.title = title;
            this.price = price;
        }

        // Getters and setters
        public String getTitle() { return title; }
        public void setTitle(String title) { this.title = title; }
        public double getPrice() { return price; }
        public void setPrice(double price) { this.price = price; }
    }

    // Child class: Book
    public static class Book extends ReadingMaterial {
        private String isbn;

        public Book(String title, double price, String isbn) {
            super(title, price);
            this.isbn = isbn;
        }

        // Getter and setter
        public String getIsbn() { return isbn; }
        public void setIsbn(String isbn) { this.isbn = isbn; }
    }

    // Child class: Magazine
    public static class Magazine extends ReadingMaterial {
        private String monthOfIssue;

        public Magazine(String title, double price, String monthOfIssue) {
            super(title, price);
            this.monthOfIssue = monthOfIssue;
        }

        // Getter and setter
        public String getMonthOfIssue() { return monthOfIssue; }
        public void setMonthOfIssue(String monthOfIssue) { this.monthOfIssue = monthOfIssue; }
    }

    // Child class: CD
    public static class CD extends ReadingMaterial {
        private int durationInMinutes;

        public CD(String title, double price, int durationInMinutes) {
            super(title, price);
            this.durationInMinutes = durationInMinutes;
        }

        // Getter and setter
        public int getDurationInMinutes() { return durationInMinutes; }
        public void setDurationInMinutes(int durationInMinutes) { this.durationInMinutes = durationInMinutes; }
    }

    public static void main(String[] args) {
        // Example usage
        Book book = new Book("Java Programming", 29.99, "978-0134685991");
        Magazine magazine = new Magazine("National Geographic", 9.99, "June 2022");
        CD cd = new CD("Audio Book: The Great Gatsby", 14.99, 180);

        System.out.println("Book: " + book.getTitle() + ", ISBN: " + book.getIsbn());
        System.out.println("Magazine: " + magazine.getTitle() + ", Month: " + magazine.getMonthOfIssue());
        System.out.println("CD: " + cd.getTitle() + ", Duration: " + cd.getDurationInMinutes() + " minutes");
    }

}
