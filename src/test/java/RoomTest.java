import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RoomTest {

    @Test
    void checkIn_ShouldOccupyAndDirtyRoom() {
        Room room = new Room(2, 100.00, false, false);

        room.checkIn();

        assertTrue(room.isOccupied());
        assertTrue(room.isDirty());
    }

    @Test
    void checkIn_WhenOccupied_ShouldRemainOccupied() {
        Room room = new Room(2, 100.00, true, false);

        room.checkIn();

        assertTrue(room.isOccupied());
    }

    @Test
    void checkIn_WhenDirty_ShouldNotOccupyRoom() {
        Room room = new Room(2, 100.00, false, true);

        room.checkIn();

        assertFalse(room.isOccupied());
    }

    @Test
    void checkOut_ShouldVacateRoom() {
        Room room = new Room(2, 100.00, true, true);

        room.checkOut();

        assertFalse(room.isOccupied());
    }

    @Test
    void cleanRoom_ShouldCleanDirtyRoom() {
        Room room = new Room(2, 100.00, false, true);

        room.cleanRoom();

        assertFalse(room.isDirty());
    }

    @Test
    void cleanRoom_WhenOccupied_ShouldRemainDirty() {
        Room room = new Room(2, 100.00, true, true);

        room.cleanRoom();

        assertTrue(room.isDirty());
    }