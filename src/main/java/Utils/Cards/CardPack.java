package Utils.Cards;

import java.util.TreeMap;

/**
 * Created by IntelliJ IDEA.
 * User: bsankar
 * Date: 3/1/12
 */
public class CardPack {
    private TreeMap<String, Card> pack;

    private CardPack() {
    }

    public TreeMap<String, Card> GetPack() {
        if (pack == null) {
            pack = new TreeMap<String, Card>();
            for (CardSuit suit : CardSuit.values()) {
                for (CardValue value : CardValue.values()) {
                    pack.put(String.valueOf(value.GetSymbol()) + String.valueOf(suit.GetSymbol()),
                            new Card(value, suit));
                }
            }
        }
        return pack;
    }

    public class Card {
        private CardValue value;
        private CardSuit suit;

        private Card(CardValue value, CardSuit suit) {
            this.value = value;
            this.suit = suit;
        }

        public CardValue GetCardValue(){
            return this.value;
        }

        public CardSuit GetCardSuit(){
            return this.suit;
        }
    }
}
