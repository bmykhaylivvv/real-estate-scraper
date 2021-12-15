package scraper;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        String url = "https://www.newhomesource.com/specdetail/130-victoria-peak-loop-dripping-springs-tx-78620/2108550";

        Scraper cacheScraper = new CacheScraper();
        Home home = cacheScraper.scrape(url);
        System.out.println(home);
    }
}
