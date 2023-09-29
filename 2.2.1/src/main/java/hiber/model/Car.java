package hiber.model;

import javax.persistence.*;

@Entity
@Table(name = "cars")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private long id;
    @Column(name = "model")
    private String model;
    @Column(name = "series")
    private String series;
    public Car(String model, String series) {
        this.model = model;
        this.series = series;
    }
    @OneToOne(mappedBy = "car")
    private User owner;
    public Car() {
    }

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getSeries() {
        return series;
    }
    public void setSeries(String series) {
        this.series = series;
    }

    @Override
    public String toString() {
        return  model + " " + series ;
    }
}
