import java.util.List;

public class Dungeon {
    private String name;
    private List<Room> rooms;
    private List<NPC> npcs;

    public Dungeon(String name, List<Room> rooms, List<NPC> npcs) {
        this.name = name;
        this.rooms = rooms;
        this.npcs = npcs;
    }

    public void displayInfo() {
        System.out.println("Dungeon Name: " + name);

        System.out.println("Rooms: " + rooms.size());
        for (Room room : rooms) {
            System.out.println(" - " + room);
        }

        System.out.println("NPCs: " + npcs.size());
        for (NPC npc : npcs) {
            System.out.println(" - " + npc);
        }
    }
}
