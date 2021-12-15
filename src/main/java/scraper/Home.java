package scraper;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor @ToString @Getter
public class Home {
    private int price;
    private double beds;
    private double bathes;
    private double garages;
}