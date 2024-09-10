package TEC.dk.RedDwarfAPI;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class RedDwarfProduct {

    @Id
    @GeneratedValue
    int Id;
    String Name;
    String Description;
    String Quote;
    int SeriesNumber;
    Double Price;
    String Image;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        this.Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        this.Description = description;
    }

    public String getQuote() {
        return Quote;
    }

    public void setQuote(String quote) {
        this.Quote = quote;
    }

    public int getSeriesNumber() {
        return SeriesNumber;
    }

    public void setSeriesNumber(int seriesNumber) {
        this.SeriesNumber = seriesNumber;
    }

    public Double getPrice() {
        return Price;
    }

    public void setPrice(Double price) {
        this.Price = price;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        this.Image = image;
    }
}
