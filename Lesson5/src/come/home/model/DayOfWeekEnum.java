package come.home.model;

public enum DayOfWeekEnum {
    MONDAY(""),
    TUESDAY(""),
    WEDNESDAY(""),
    THURSDAY(""),
    FRIDAY(""),
    SATURDAY(""),
    SUNDAY("");

    private String localization;

    DayOfWeekEnum(String localization) {
        this.localization = localization;

    }
    public String getLocalization(){
        return  localization;
    }
}
