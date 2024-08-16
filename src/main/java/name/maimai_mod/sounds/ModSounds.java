package name.maimai_mod.sounds;

import name.maimai_mod.Maimai_Mod;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModSounds {

    public static final SoundEvent maimaiSound = registerSoundEvent("maimaisound");
    public static final SoundEvent maimai_start = registerSoundEvent("maimai_start");

    public static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(Maimai_Mod.MOD_ID, name);
        SoundEvent soundEvent = new SoundEvent(id);
        Registry.register(Registry.SOUND_EVENT, id, soundEvent);
        return soundEvent;
    }

    public static void registerSounds() {
        // This method can be used to trigger the registration process, if needed.
    }
}
