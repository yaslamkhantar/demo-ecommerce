package ys.elmoukhantar.sysecommerce.entities;

import jakarta.persistence.*;
import lombok.*;


@Entity
@NoArgsConstructor @AllArgsConstructor @Getter @Setter @ToString
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long identifiant;
    private String name;
    private int quantity;
   @ManyToOne
    private Categorie categorie;
}
