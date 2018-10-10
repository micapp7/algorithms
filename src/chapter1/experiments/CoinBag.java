package chapter1.experiments;

import chapter1.bag.Bag;

public class CoinBag {
    public static void main(String[] args) {
        Bag<String> coinBag = new Bag<>();

        coinBag.add("1c");
        coinBag.add("1c");
        coinBag.add("5c");
        coinBag.add("25c");
        coinBag.add("10c");

        for(String item : coinBag) {
            System.out.println(item);
        }
    }
}
