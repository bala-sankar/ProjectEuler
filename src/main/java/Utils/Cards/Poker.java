package Utils.Cards;

import java.util.*;

/**
 * Created by IntelliJ IDEA.
 * User: bsankar
 * Date: 3/2/12
 */
public class Poker {

    public static TreeMap<PokerHandRank, CardValue> GetPokerHand(ArrayList<CardPack.Card> cards) {
        //HashMap<PokerHandRank, CardValue> pokerHand = new TreeMap<PokerHandRank, CardValue>();

        //Poker hand should be equal to Five
        if (cards.size() != 5) return null;
        //To get pairs/kind
        HashMap<CardValue, Integer> kindCount = new HashMap<CardValue, Integer>();
        HashSet<CardValue> values = new HashSet<CardValue>();
        HashSet<CardSuit> suits = new HashSet<CardSuit>();
        boolean isFlush = false;
        for (CardPack.Card card : cards) {
            CardValue cardVal = card.GetCardValue();
            suits.add(card.GetCardSuit());
            values.add(cardVal);

            if(kindCount.containsKey(cardVal)){
                kindCount.put(cardVal, kindCount.get(cardVal) + 1);
            } else {
                kindCount.put(cardVal, 1);
            }
        }
        /*boolean isSequentialValues = CardValue.is
        int rank = 5;
        for (int value : highCards.descendingSet()) {
            pokerHand.put(PokerHandRank.GetByRank(rank), CardValue.GetCardValueByValue(value));
            rank--;
        }*/


        return null;
    }

    public enum PokerHandRank {
        FIFTH_HIGHEST(1),
        FOURTH_HIGHEST(2),
        THIRD_HIGHEST(3),
        SECOND_HIGHEST(4),
        HIGHEST_CARD(5),
        ONE_PAIR(6),
        TWO_PAIR(7),
        THREE_KIND(8),
        STRAIGHT(9),
        FLUSH(10),
        FULL_HOUSE(11),
        FOUR_KIND(12),
        STRAIGHT_FLUSH(13),
        ROYAL_FLUSH(14);

        private final int rank;

        private PokerHandRank(int rank) {
            this.rank = rank;
        }

        public static PokerHandRank GetByRank(int rank) {
            switch (rank) {
                case 1:
                    return FIFTH_HIGHEST;
                case 2:
                    return FOURTH_HIGHEST;
                case 3:
                    return THIRD_HIGHEST;
                case 4:
                    return SECOND_HIGHEST;
                case 5:
                    return HIGHEST_CARD;
            }
            return null;
        }
    }
}


