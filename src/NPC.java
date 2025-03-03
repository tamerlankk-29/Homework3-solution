public class NPC implements CloneableGameEntity{
    private String name;
    private String role;

    public NPC(String name, String role) {
        this.name = name;
        this.role = role;
    }
    public CloneableGameEntity cloneEntity() {
        return new NPC(name, role);
    }
    public String toString() {
        return name + " (" + role + ")";
    }
}