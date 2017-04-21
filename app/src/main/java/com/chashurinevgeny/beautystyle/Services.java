package com.chashurinevgeny.beautystyle;

/**
 * Created by Chashurin Evgeny on 21.04.2017.
 */

public class Services {

    private int name;
    private int description;
    private int imageResourceId;

    public Services(int name, int description, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    public int getName() {
        return name;
    }

    public int getDescription() {
        return description;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    static final Services[] hairs = {
            new Services(R.string.classic_hair, R.string.classic_hair_desc, R.drawable.classic_hair),
            new Services(R.string.sport_hair, R.string.sport_hair_desc, R.drawable.sport_hair),
            new Services(R.string.celebrity_hair, R.string.celebrity_hair_desc, R.drawable.celebrity_hair)
    };

    static final Services[] nails = {
            new Services(R.string.classic_manicure, R.string.classic_manicure_desc, R.drawable.kl_man),
            new Services(R.string.hardware_manicure, R.string.hardware_manicure_desc, R.drawable.ap_man),
            new Services(R.string.hardware_pedicure, R.string.hardware_pedicure_desc, R.drawable.ap_ped)
    };
}
