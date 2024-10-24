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
public class Bevanda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;
    @Column
    private double prezzo;
    private int calorie;



    public Bevanda(String nome, double prezzo, int calorie) {
        this.nome = nome;
        this.prezzo = prezzo;
        this.calorie = calorie;
    }




    @Override
    public String toString() {
        return nome + ", prezzo: " + prezzo + "€" + ", calorie: " + calorie;
    }
}

