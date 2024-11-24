package pe.edu.I20221997.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Countrylanguage {

    private String CountryCode;
    @Id
    private String Language;
    private String IsOfficial;
    private Integer Percentage;

    public Countrylanguage() {
    }

    public Countrylanguage(String countryCode, String language, String isOfficial, Integer percentage) {
        CountryCode = countryCode;
        Language = language;
        IsOfficial = isOfficial;
        Percentage = percentage;
    }

    @Override
    public String toString() {
        return "Countrylanguage{" +
                "CountryCode='" + CountryCode + '\'' +
                ", Language='" + Language + '\'' +
                ", IsOfficial='" + IsOfficial + '\'' +
                ", Percentage=" + Percentage +
                '}';
    }

    public String getCountryCode() {
        return CountryCode;
    }

    public void setCountryCode(String countryCode) {
        CountryCode = countryCode;
    }

    public String getLanguage() {
        return Language;
    }

    public void setLanguage(String language) {
        Language = language;
    }

    public String getIsOfficial() {
        return IsOfficial;
    }

    public void setIsOfficial(String isOfficial) {
        IsOfficial = isOfficial;
    }

    public Integer getPercentage() {
        return Percentage;
    }

    public void setPercentage(Integer percentage) {
        Percentage = percentage;
    }
}
