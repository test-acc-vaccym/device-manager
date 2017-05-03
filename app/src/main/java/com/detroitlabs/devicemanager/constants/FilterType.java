package com.detroitlabs.devicemanager.constants;

public enum FilterType {
    PLATFORM,
    VERSION,
    SCREEN_SIZE,
    SCREEN_RESOLUTION;



    @Override
    public String toString() {
        return super.toString().toLowerCase();
    }
}
