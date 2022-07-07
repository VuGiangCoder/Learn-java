package com.javacore.method;

public enum Season {
    SPRING("Mua Xuan"), SUMMER("Mua Ha"), FALL("Mua Thu"), WINTER("Mua Dong");

    private String seasonNameVN;

    Season(String name) {
        seasonNameVN = name;
    }

    public String getSeasonNameVN() {
        return seasonNameVN;
    }
}
