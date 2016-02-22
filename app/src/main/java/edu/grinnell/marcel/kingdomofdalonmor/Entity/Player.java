package edu.grinnell.marcel.kingdomofdalonmor.Entity;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Marcel on 2/21/2016.
 */
public class Player implements Parcelable {

    private int constitution;
    private int agility;
    private int strength;
    private int life;
    private int energy;
    private int level;
    private int experience;

    public Player(){
        this.constitution = 1;
        this.agility = 1;
        this.strength = 1;
        this.life = 100;
        this.energy = 100;
        this.level = 1;
        this.experience = 0;
    }

    public void levelUp(){
        this.level += 1;
    }

    protected Player(Parcel in) {
        constitution = in.readInt();
        agility = in.readInt();
        strength = in.readInt();
        life = in.readInt();
        energy = in.readInt();
        level = in.readInt();
        experience = in.readInt();
    }

    public static final Creator<Player> CREATOR = new Creator<Player>() {
        @Override
        public Player createFromParcel(Parcel in) {
            return new Player(in);
        }

        @Override
        public Player[] newArray(int size) {
            return new Player[size];
        }
    };

    public String[] toStringArray(){
        String[] variables = {
                "Level: "+this.level,
                "Experience: "+this.experience,
                "Constitution: "+this.constitution,
                "Agility: "+this.agility,
                "Strength: "+this.strength,
                "Life: "+this.life,
                "Energy: "+this.energy
        };
        return variables;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(constitution);
        dest.writeInt(agility);
        dest.writeInt(strength);
        dest.writeInt(life);
        dest.writeInt(energy);
        dest.writeInt(level);
        dest.writeInt(experience);
    }
}
