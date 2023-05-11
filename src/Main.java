public class Main {
    public static void main(String[] args) {

        Room r1 = new Room(1,2,RoomCategory.STANDARD);
        Room r2 = new Room(2,4,RoomCategory.LUX);
        Room r3 = new Room(3,2,RoomCategory.SUITE);
        Room r4 = new Room(4,3,RoomCategory.FAMILY);
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);

        Booking booking = new Booking(
                new Person("Nick","Nicolson"),r1,
                new MyDate(11,5,2023),
                new MyDate(15,5,2023)
        );

        BookingProcessing bookingProcessing = new BookingProcessing();
        bookingProcessing.add(booking);
        System.out.println(bookingProcessing);

        bookingProcessing.add(new Person("Ann","Virt"),r2,
                new MyDate(11,5,2023),
                new MyDate(15,5,2023));
        System.out.println(bookingProcessing);


        System.out.println(booking.getEarlyDate(new MyDate(15,5,2023),new MyDate(15,5,2023)));

    }
}