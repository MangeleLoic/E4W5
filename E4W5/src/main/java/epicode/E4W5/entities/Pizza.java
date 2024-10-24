package epicode.E4W5.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table
@Setter
@Getter
@NoArgsConstructor
public class Pizza {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;
    @Column
    private double prezzo;
    private int calorie;

    @ElementCollection
    private List<String> toppings;


    public Pizza(String nome, double prezzo, int calorie, List<String> toppings) {
        this.nome = nome;
        this.prezzo = prezzo;
        this.calorie = calorie;
        this.toppings = toppings;
    }




    public void addTopping(String topping) {
        this.toppings.add(topping);
    }

    @Override
    public String toString() {
        return "Pizza " + nome +
                ", prezzo: " + prezzo +
                "€, toppings: " + toppings +
                ", calorie: " + calorie;
    }
}
