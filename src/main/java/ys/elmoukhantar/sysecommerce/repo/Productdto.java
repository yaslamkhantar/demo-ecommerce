package ys.elmoukhantar.sysecommerce.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ys.elmoukhantar.sysecommerce.entities.Product;

public interface Productdto extends JpaRepository<Product,String> {
}
