package scraper;

import java.sql.SQLException;

public interface Scraper {
    Home scrape(String url) throws SQLException;
}