package pe.edu.i202224763.cl1_jpa_data_Alatrista_Jose.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Country {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private String code;
    private String Name;

    @Enumerated(EnumType.STRING)
    @Column(name = "Continent")
    private Continent Continent;

    private String Region;
    private double SurfaceArea;
    private double IndepYear;
    private int Population;
    private double LifeExpectancy;
    private double GNP;
    private double GNPOld;
    private String LocalName;
    private String GovernmentForm;
    private String HeadOfState;
    private int Capital;
    private String Code2;

    @OneToMany(mappedBy = "CountryCode", cascade = {CascadeType.PERSIST, CascadeType.REMOVE}, orphanRemoval = true)
    private List<city> citys;

    @OneToMany(mappedBy = "CountryCode", cascade = {CascadeType.PERSIST, CascadeType.REMOVE}, orphanRemoval = true)
    private List<countrylanguage> countrylanguages;
}
