package epicode.E4W5.entities;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table
@Setter
@Getter
@NoArgsConstructor
public class Topping {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String nome;
    @Column
    private double prezzo;

    public Topping(String nome, double prezzo) {
        this.nome = nome;
        this.prezzo = prezzo;
    }


    @Override
    public String toString() {
        return nome +
                ", prezzo: " + prezzo +
                "€"
                ;
    }
}

