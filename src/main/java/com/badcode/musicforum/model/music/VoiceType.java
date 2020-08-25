package com.badcode.musicforum.model.music;

public enum VoiceType {
    SOPRANO(Gender.FEMALE),
    MEZZO_SOPRANO(Gender.FEMALE),
    CONTRALTO(Gender.FEMALE),
    COUNTERTENOR(Gender.MALE),
    TENOR(Gender.MALE),
    BARITONE(Gender.MALE),
    BASS(Gender.MALE);

    private Gender gender;

    VoiceType(Gender gender) {
        this.gender = gender;
    }

    VoiceType() {

    }

    public static VoiceType getNearestVoiceType(Gender gender) {
        if (Gender.MALE.equals(gender)) {
            return COUNTERTENOR;
        } else {
            return CONTRALTO;
        }
    }

    public Gender getGender() {
        return gender;
    }
}
