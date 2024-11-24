package pe.edu.I20221997.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.Year;

@Entity
public class Country {

    @Id
    private Integer Code;
    private String Name;
    private String Continent;
    private String Region;
    private Integer SurfaceArea;
    private Year IndepYear;
    private Integer Population;
    private Integer LifeExpectancy;
    private Integer GNP;
    private Integer GNPOld;
    private String LocalName;
    private String GovernmentForm;
    private String HeadOfState;
    private Integer Capital;
    private String Code2;

    public Country() {
    }

    public Country(Integer code, String name, String continent, String region, Integer surfaceArea, Year indepYear, Integer population, Integer lifeExpectancy, Integer GNP, Integer GNPOld, String localName, String governmentForm, String headOfState, Integer capital, String code2) {
        Code = code;
        Name = name;
        Continent = continent;
        Region = region;
        SurfaceArea = surfaceArea;
        IndepYear = indepYear;
        Population = population;
        LifeExpectancy = lifeExpectancy;
        this.GNP = GNP;
        this.GNPOld = GNPOld;
        LocalName = localName;
        GovernmentForm = governmentForm;
        HeadOfState = headOfState;
        Capital = capital;
        Code2 = code2;
    }

    @Override
    public String toString() {
        return "Country{" +
                "Code=" + Code +
                ", Name='" + Name + '\'' +
                ", Continent='" + Continent + '\'' +
                ", Region='" + Region + '\'' +
                ", SurfaceArea=" + SurfaceArea +
                ", IndepYear=" + IndepYear +
                ", Population=" + Population +
                ", LifeExpectancy=" + LifeExpectancy +
                ", GNP=" + GNP +
                ", GNPOld=" + GNPOld +
                ", LocalName='" + LocalName + '\'' +
                ", GovernmentForm='" + GovernmentForm + '\'' +
                ", HeadOfState='" + HeadOfState + '\'' +
                ", Capital=" + Capital +
                ", Code2='" + Code2 + '\'' +
                '}';
    }

    public Integer getCode() {
        return Code;
    }

    public void setCode(Integer code) {
        Code = code;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getContinent() {
        return Continent;
    }

    public void setContinent(String continent) {
        Continent = continent;
    }

    public String getRegion() {
        return Region;
    }

    public void setRegion(String region) {
        Region = region;
    }

    public Integer getSurfaceArea() {
        return SurfaceArea;
    }

    public void setSurfaceArea(Integer surfaceArea) {
        SurfaceArea = surfaceArea;
    }

    public Year getIndepYear() {
        return IndepYear;
    }

    public void setIndepYear(Year indepYear) {
        IndepYear = indepYear;
    }

    public Integer getPopulation() {
        return Population;
    }

    public void setPopulation(Integer population) {
        Population = population;
    }

    public Integer getLifeExpectancy() {
        return LifeExpectancy;
    }

    public void setLifeExpectancy(Integer lifeExpectancy) {
        LifeExpectancy = lifeExpectancy;
    }

    public Integer getGNP() {
        return GNP;
    }

    public void setGNP(Integer GNP) {
        this.GNP = GNP;
    }

    public Integer getGNPOld() {
        return GNPOld;
    }

    public void setGNPOld(Integer GNPOld) {
        this.GNPOld = GNPOld;
    }

    public String getLocalName() {
        return LocalName;
    }

    public void setLocalName(String localName) {
        LocalName = localName;
    }

    public String getGovernmentForm() {
        return GovernmentForm;
    }

    public void setGovernmentForm(String governmentForm) {
        GovernmentForm = governmentForm;
    }

    public String getHeadOfState() {
        return HeadOfState;
    }

    public void setHeadOfState(String headOfState) {
        HeadOfState = headOfState;
    }

    public Integer getCapital() {
        return Capital;
    }

    public void setCapital(Integer capital) {
        Capital = capital;
    }

    public String getCode2() {
        return Code2;
    }

    public void setCode2(String code2) {
        Code2 = code2;
    }
}
