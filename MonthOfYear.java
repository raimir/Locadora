package util;

public enum MonthOfYear {
    JAN_PT_BR("Janeiro"),FEV_PT_BR("Fevereiro"),
    MAR_PT_BR("Março"), ABR_PT_BR("Abril"),
    MAI_PT_BR("Maio"), JUN_PT_BR("Junho"),
    JUL_PT_BR("Julho"), AGO_PT_BR("Agosto"),
    SET_PT_BR("Setembro"), OUT_PT_BR("Outubro"),
    NOV_PT_BR("Novembro"), DEZ_PT_BR("Dezembro");

    private String monthOfYear;

    MonthOfYear(String value) {
        monthOfYear = value;
    }

    public String getDescription() {
        return monthOfYear;
    }

    /**
     *
     * @param month - number of the month
     * @return return a string with description of the month
     */
    public static String getMonth_PT_BR(int month) {
        switch (month) {
            case 1:
                return JAN_PT_BR.getDescription();
            case 2:
                return FEV_PT_BR.getDescription();
            case 3:
                return MAR_PT_BR.getDescription();
            case 4:
                return ABR_PT_BR.getDescription();
            case 5:
                return MAI_PT_BR.getDescription();
            case 6:
                return JUN_PT_BR.getDescription();
            case 7:
                return JUL_PT_BR.getDescription();
            case 8:
                return AGO_PT_BR.getDescription();
            case 9:
                return SET_PT_BR.getDescription();
            case 10:
                return OUT_PT_BR.getDescription();
            case 11:
                return NOV_PT_BR.getDescription();
            case 12:
                return DEZ_PT_BR.getDescription();
            default:
                return "";
        }
    }
}
