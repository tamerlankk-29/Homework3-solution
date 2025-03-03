public class Room implements CloneableGameEntity {
    private String name;
    private String description;

    public Room(String name, String description) {
        this.name = name;
        this.description = description;
    }
    public CloneableGameEntity cloneEntity() {
        return new Room(name, description);
    }
    public String toString() {
        return name + " - " + description;
    }
}