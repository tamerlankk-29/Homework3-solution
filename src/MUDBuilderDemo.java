public class MUDBuilderDemo {
    public static void main(String[] args) {
        SimpleDungeonBuilder builder = new SimpleDungeonBuilder();
        Dungeon dungeon = builder.setDungeonName("Dark Cave")
                .addRoom(new Room("Entrance Hall", "A dark and cold hall."))
                .addNPC(new NPC("Goblin", "A sneaky goblin"))
                .build();
        dungeon.displayInfo();

        // Клонирование комнаты
        Room originalRoom = new Room("Treasure Room", "Filled with gold");
        Room clonedRoom = (Room) originalRoom.cloneEntity();
        System.out.println("Cloned Room: " + clonedRoom);
    }
}