package me.test.totenproject;

import org.bukkit.Location;

public class Toten {

    private String Id;
    private String Name;
    private long Life;
    private Location location;

    public Toten(String Id, String Name, long Life, Location location) {
        this.Id = Id;
        this.Name = Name;
        this.Life = Life;
        this.location = location;
    }

    public String getId() {
        return Id;
    }

    public String getName() {
        return Name;
    }

    public long getLife() {
        return Life;
    }

    public Location getLocation() {
        return location;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setLife(long Life) {
        this.Life = Life;
    }

    public void setLocation(Location location) {
        this.location = location;

    }




}
