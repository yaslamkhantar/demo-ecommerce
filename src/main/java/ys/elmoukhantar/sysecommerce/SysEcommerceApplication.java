package ys.elmoukhantar.sysecommerce;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import ys.elmoukhantar.sysecommerce.entities.Categorie;
import ys.elmoukhantar.sysecommerce.entities.Product;
import ys.elmoukhantar.sysecommerce.repo.Categoriesdto;
import ys.elmoukhantar.sysecommerce.repo.Productdto;

import java.util.List;
import java.util.stream.Stream;

@SpringBootApplication
public class SysEcommerceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SysEcommerceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(Categoriesdto categoriesdto, Productdto productdto){
            return args -> {
                categoriesdto.save(new Categorie("mop","pharmacie",null));
                categoriesdto.save(new Categorie("kop","alimentaire",null));
                categoriesdto.save(new Categorie("ppa","vetement",null));
                String[] tab=new String[4];
                tab[0]="PRODUCT1";
                tab[1]="PRODUCT2";
                tab[2]="PRODUCT3";
                int ii=0;

             Categorie categorie1=categoriesdto.findByRef("mop");
                Categorie categorie2=categoriesdto.findByRef("kop");
                Categorie categorie3=categoriesdto.findByRef("ppa");

                productdto.save(new Product(null,"XXX",30,categorie1));
                productdto.save(new Product(null,"AAA",50,categorie2));
                productdto.save(new Product(null,"PRO2",65,categorie3));



               // Categorie categorie1=categoriesdto.findAll().get(0);
            //    System.out.println("les valeurs est "+categorie1.toString());
              /*  categoriesdto.findAll().forEach(ee->{
                    Stream.of("PRODUCT1","PRODUCT2","PRODUCT3").forEach(r->{
                        Product a=new Product();
                        a.setIdentifiant(null);
                        a.setName(r.toString());
                        a.setQuantity(20);
                        a.setCategorie(ee);
                        productdto.save(a);

                    });


                });*/








            };
    }

}
