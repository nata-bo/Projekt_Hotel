public class Booking {
    private Person client;
    private Room room;
    private MyDate start;
    private MyDate end;

    public Booking(Person client, Room room, MyDate start, MyDate end) {
        this.client = client;
        this.room = room;
        this.start = start;
        this.end = end;
    }

    public MyDate getStart() {
        return start;
    }

    public MyDate getEnd() {
        return end;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "client=" + client +
                ", room=" + room +
                ", start=" + start +
                ", end=" + end +
                '}';
    }
      // написать метод, который сравнивает какая дата была быстрее
    public String getEarlyDate(MyDate start,MyDate end) {
        if (start.getYear() < end.getYear()) {
            return start + " - эта дата была быстрее";
        } else if (start.getYear() > end.getYear()) {
            return end + " - эта дата была быстрее";
        }
        if (start.getMonth() < end.getMonth()) {
            return start + " - эта дата была быстрее";
        } else if (start.getMonth() > end.getMonth()) {
            return end + " - эта дата была быстрее";
        }
        if (start.getDay() < end.getDay()) {
            return start + " - эта дата была быстрее";
        } else if (start.getDay() > end.getDay()) {
            return end + " - эта дата была быстрее";
        }
        return "Даты одинаковые";
    }

}

