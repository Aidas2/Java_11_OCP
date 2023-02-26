package collectionsgenerics;

import java.util.*;

class Stock implements Comparator<Stock> {

    String ticker;
    double price;

    public Stock() {
    }

    public Stock(String ticker, double price) {
        this.ticker = ticker;
        this.price = price;
    }

    public int compare(Stock s1, Stock s2) {
        return s1.ticker.compareTo(s2.ticker);
    }

    public String toString() {
        return ticker + ":" + price;
    }
}

public class PQ_93 {

    public static void main(String[] args) {
        List<Stock> portfolio = Arrays.asList(
                new Stock("MSFT", 74),
                new Stock("GOOGL", 952));

        Collections.sort(portfolio, new Stock());

        System.out.print(portfolio);
    }
}
