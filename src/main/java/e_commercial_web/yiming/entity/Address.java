package e_commercial_web.yiming.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.OneToOne;


import lombok.*;


/**
 * @author yiming
 */
@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String street;

    private String city;

    private String state;

    private String zip;

    private String country;

    @OneToOne(mappedBy = "address")
    private User user;

}
