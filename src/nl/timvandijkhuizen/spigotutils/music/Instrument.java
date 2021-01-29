package nl.timvandijkhuizen.spigotutils.music;

import org.bukkit.Sound;

public class Instrument {

    public static Sound getInstrument(byte instrument) {
        switch (instrument) {
            case 0:
                return Sound.BLOCK_NOTE_BLOCK_HARP;
            case 1:
                return Sound.BLOCK_NOTE_BLOCK_BASS;
            case 2:
                return Sound.BLOCK_NOTE_BLOCK_BASEDRUM;
            case 3:
                return Sound.BLOCK_NOTE_BLOCK_SNARE;
            case 4:
                return Sound.BLOCK_NOTE_BLOCK_HAT;
            case 5:
                return Sound.BLOCK_NOTE_BLOCK_PLING;
            default:
                return Sound.BLOCK_NOTE_BLOCK_HARP;
        }
    }

    public static org.bukkit.Instrument getBukkitInstrument(byte instrument) {
        switch (instrument) {
            case 0:
                return org.bukkit.Instrument.PIANO;
            case 1:
                return org.bukkit.Instrument.BASS_GUITAR;
            case 2:
                return org.bukkit.Instrument.BASS_DRUM;
            case 3:
                return org.bukkit.Instrument.SNARE_DRUM;
            case 4:
                return org.bukkit.Instrument.STICKS;
            
            default:
                return org.bukkit.Instrument.PIANO;
        }
    }
   
}
