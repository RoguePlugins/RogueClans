package com.github.viiictorxd.rogueclans.entity.clan;

public class Counter {

    private int memberCount;
    private int gladiatorCount;
    private int pvpCount;

    public Counter() {
        this(0, 0, 0);
    }

    public Counter(int memberCount, int gladiatorCount, int pvpCount) {
        this.memberCount = memberCount;
        this.gladiatorCount = gladiatorCount;
        this.pvpCount = pvpCount;
    }

    public int getMemberCount() {
        return memberCount;
    }

    public void setMemberCount(int memberCount) {
        this.memberCount = memberCount;
    }

    public int getGladiatorCount() {
        return gladiatorCount;
    }

    public void setGladiatorCount(int gladiatorCount) {
        this.gladiatorCount = gladiatorCount;
    }

    public int getPvpCount() {
        return pvpCount;
    }

    public void setPvpCount(int pvpCount) {
        this.pvpCount = pvpCount;
    }
}
