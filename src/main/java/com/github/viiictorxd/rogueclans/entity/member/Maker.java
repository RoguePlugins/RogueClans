package com.github.viiictorxd.rogueclans.entity.member;

import com.github.viiictorxd.rogueclans.entity.clan.Request;

public class Maker {

    private Step step;
    private String tag;
    private String name;

    public Maker() {
        step = Step.NAME;
    }

    public Request set(String str) {
        switch (step) {
            case NAME: {
                if (str.length() > 16) {
                    return Request.INVALID;
                }
                break;
            }
            case TAG:
                break;
            case CONFIRM:
                break;
        }
        return null;
    }
}
