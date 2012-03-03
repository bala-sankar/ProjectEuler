package Utils.Cards;

import java.util.HashSet;

/**
 * Created by IntelliJ IDEA.
 * User: bsankar
 * Date: 3/1/12
 */
public class CardUtil {
    public static CardPack.Card GetHighestCard(HashSet<CardPack.Card> cards) {
        CardPack.Card highestCard = null;
        int maxValue = 0;
        for(CardPack.Card card : cards){
            int cardValue = card.GetCardValue().GetValue();
            if(maxValue < cardValue ){
                maxValue  = cardValue;
                highestCard = card;
            }
        }
        return highestCard;
    }
}
