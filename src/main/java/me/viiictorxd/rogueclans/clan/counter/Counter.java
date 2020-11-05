package me.viiictorxd.rogueclans.clan.counter;

public class Counter {

    private int memberCount;
    private int battleCount;
    private int gladiatorCount;

    public Counter() {
        this(0, 0, 0);
    }

    public Counter(int memberCount, int battleCount, int gladiatorCount) {
        this.memberCount = memberCount;
        this.battleCount = battleCount;
        this.gladiatorCount = gladiatorCount;
    }

    public int getMemberCount() {
        return memberCount;
    }

    public void setMemberCount(int memberCount) {
        this.memberCount = memberCount;
    }

    public int getBattleCount() {
        return battleCount;
    }

    public void setBattleCount(int battleCount) {
        this.battleCount = battleCount;
    }

    public int getGladiatorCount() {
        return gladiatorCount;
    }

    public void setGladiatorCount(int gladiatorCount) {
        this.gladiatorCount = gladiatorCount;
    }
}
