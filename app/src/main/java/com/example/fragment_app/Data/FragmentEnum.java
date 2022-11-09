package com.example.fragment_app.Data;

public enum FragmentEnum {
    FM_1("Fragment1"),
    FM_2("Fragment2"),
    FM_3("Fragment3"),
    FM_4("Fragment4"),
    FM_5("Fragment5"),
    FM_6("Fragment6"),
    FM_7("Fragment7"),
    FM_8("Fragment8"),
    ;

    private final String text;

    FragmentEnum(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
