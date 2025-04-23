package pl.danielrudzinski.swiftparsingproject.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Swift {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String bankName;
    private String address;
    private String countryISO2;
    private String countryName;
    private boolean isHeadquarter;

    @ManyToOne
    @JoinColumn(name = "headquarter_swift_code")
    private Swift headquarter;

    @OneToMany(mappedBy = "headquarter", cascade = CascadeType.ALL)
    private List<Swift> branches;
}
