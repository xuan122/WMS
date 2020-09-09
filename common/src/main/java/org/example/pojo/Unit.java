package org.example.pojo;

public class Unit implements java.io.Serializable{
    private int unitId;
    private String unitCode;
    private String unitName;
    private String unitRemarke;

    public int getUnitId() {
        return unitId;
    }

    public void setUnitId(int unitId) {
        this.unitId = unitId;
    }

    public String getUnitCode() {
        return unitCode;
    }

    public void setUnitCode(String unitCode) {
        this.unitCode = unitCode;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public String getUnitRemarke() {
        return unitRemarke;
    }

    public void setUnitRemarke(String unitRemarke) {
        this.unitRemarke = unitRemarke;
    }
}
