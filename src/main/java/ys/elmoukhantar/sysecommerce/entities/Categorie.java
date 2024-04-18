package ys.elmoukhantar.sysecommerce.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.Collection;

@Entity
@NoArgsConstructor @AllArgsConstructor @Getter @Setter @ToString
public class Categorie {
    @Id

    private String ref;
    private String type;
    @OneToMany(mappedBy = "categorie")
    private Collection<Product> product;
}
