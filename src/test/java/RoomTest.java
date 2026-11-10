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

