public class Tz {

    private String name = "Greenwich Mean Time";
    private String abbreviation = "GMT";
    private String militaryDesignation = "Zulu";

    public boolean tzExists(int toBeChecked) {
        switch (toBeChecked) {
            case -12:
                setName("International Date Line West");
                setAbbreviation("IDLW");
                setMilitaryDesignation("Yankee");
                return true;
            case -11:
                setName("Nome Time");
                setAbbreviation("NT");
                setMilitaryDesignation("X-ray");
                return true;
            case -10:
                setName("Hawaii Standard Time");
                setAbbreviation("HST");
                setMilitaryDesignation("Whiskey");
                return true;
            case -9:
                setName("Alaska Standard Time");
                setAbbreviation("AKST");
                setMilitaryDesignation("Victor");
                return true;
            case -8:
                setName("Pacific Standard Time");
                setAbbreviation("PST");
                setMilitaryDesignation("Uniform");
                return true;
            case -7:
                setName("Mountain Standard Time");
                setAbbreviation("MST");
                setMilitaryDesignation("Tango");
                return true;
            case -6:
                setName("Central Standard Time");
                setAbbreviation("CST");
                setMilitaryDesignation("Sierra");
                return true;
            case -5:
                setName("Eastern Standard Time");
                setAbbreviation("EST");
                setMilitaryDesignation("Romeo");
                return true;
            case -4:
                setName("Atlantic Standard Time");
                setAbbreviation("AST");
                setMilitaryDesignation("Quebec");
                return true;
            case -3:
                setName("Argentina Time");
                setAbbreviation("ART");
                setMilitaryDesignation("Papa");
                return true;
            case -2:
                setName("Azores Time");
                setAbbreviation("AT");
                setMilitaryDesignation("Oscar");
                return true;
            case -1:
                setName("West Africa Time");
                setAbbreviation("WAT");
                setMilitaryDesignation("November");
                return true;
            case 0:
                return true;
            case 1:
                setName("Central European Time");
                setAbbreviation("CET");
                setMilitaryDesignation("Alpha");
                return true;
            case 2:
                setName("Eastern European Time");
                setAbbreviation("EET");
                setMilitaryDesignation("Bravo");
                return true;
            case 3:
                setName("Moscow Time");
                setAbbreviation("MSK");
                setMilitaryDesignation("Charlie");
                return true;
            case 4:
                setName("Armenia Time");
                setAbbreviation("AMT");
                setMilitaryDesignation("Delta");
                return true;
            case 5:
                setName("Pakistan Standard Time");
                setAbbreviation("PKT");
                setMilitaryDesignation("Echo");
                return true;
            case 6:
                setName("Omsk Time");
                setAbbreviation("OMSK");
                setMilitaryDesignation("Foxtrot");
                return true;
            case 7:
                setName("Kranoyask Time");
                setAbbreviation("KRAT");
                setMilitaryDesignation("Golf");
                return true;
            case 8:
                setName("China Standard Time");
                setAbbreviation("CSTA");
                setMilitaryDesignation("Hotel");
                return true;
            case 9:
                setName("Japan Standard Time");
                setAbbreviation("JST");
                setMilitaryDesignation("India");
                return true;
            case 10:
                setName("Eastern Australia Standard Time");
                setAbbreviation("AEST");
                setMilitaryDesignation("Kilo");
                return true;
            case 11:
                setName("Sakhalin Time");
                setAbbreviation("SAKT");
                setMilitaryDesignation("Lima");
                return true;
            case 12:
                setName("New Zealand Standard Time");
                setAbbreviation("NZST");
                setMilitaryDesignation("Mike");
                return true;
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getMilitaryDesignation() {
        return militaryDesignation;
    }

    public void setMilitaryDesignation(String militaryDesignation) {
        this.militaryDesignation = militaryDesignation;
    }
}
