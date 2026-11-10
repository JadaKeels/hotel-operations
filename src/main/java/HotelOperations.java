public class HotelOperations {
    public class Hotel {

        private String name;
        private int numberOfSuites;
        private int numberOfRooms;
        private int bookedSuites;
        private int bookedBasicRooms;

        public Hotel(String name,
                     int numberOfSuites,
                     int numberOfRooms) {

            this.name = name;
            this.numberOfSuites = numberOfSuites;
            this.numberOfRooms = numberOfRooms;
            this.bookedSuites = 0;
            this.bookedBasicRooms = 0;
        }

        public String getName() {
            return name;
        }

        public int getNumberOfSuites() {
            return numberOfSuites;
        }

        public int getNumberOfRooms() {
            return numberOfRooms;
        }

        public int getBookedSuites() {
            return bookedSuites;
        }

        public int getBookedBasicRooms() {
            return bookedBasicRooms;
        }
    }
