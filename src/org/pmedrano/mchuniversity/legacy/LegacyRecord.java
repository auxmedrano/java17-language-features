package org.pmedrano.mchuniversity.legacy;

public class LegacyRecord {

    private final int start;
    private final int end;


    public LegacyRecord(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public int getStart() {
        return start;
    }

    public int getEnd() {
        return end;
    }

    @Override
    public String toString() {
        return "LegacyRange[start=" + this.start + ", end=" + this.end+"]";
    }
}
