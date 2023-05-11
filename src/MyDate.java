public class MyDate {
    private  int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return day +"/" + month + "/" + year;
    }
    // написать метод который сравнивает даты какая из них раньше а какая позже
}
