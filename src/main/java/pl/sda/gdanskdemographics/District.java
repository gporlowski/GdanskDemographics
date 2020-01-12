package pl.sda.gdanskdemographics;

public class District {
    private String districtName;
    private String sex;
    private Integer ageUnderEighteen;
    private Integer ageFromEighteenToFiftyNine;
    private Integer ageFromSixtyToSixtyFour;
    private Integer ageOverSixtyFour;

    public District(String districtName,
                    String sex,
                    Integer ageUnderEighteen,
                    Integer ageFromEighteenToFiftyNine,
                    Integer ageFromSixtyToSixtyFour,
                    Integer ageOverSixtyFour) {
        this.districtName = districtName;
        this.sex = sex;
        this.ageUnderEighteen = ageUnderEighteen;
        this.ageFromEighteenToFiftyNine = ageFromEighteenToFiftyNine;
        this.ageFromSixtyToSixtyFour = ageFromSixtyToSixtyFour;
        this.ageOverSixtyFour = ageOverSixtyFour;
    }
}
