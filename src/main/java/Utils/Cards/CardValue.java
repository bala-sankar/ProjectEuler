package Utils.Cards;

/**
 * Created by IntelliJ IDEA.
 * User: bsankar
 * Date: 3/1/12
 */
public enum CardValue {
    TWO(2, '2'),
    THREE(3, '3'),
    FOUR(4, '4'),
    FIVE(5, '5'),
    SIX(6, '6'),
    SEVEN(7, '7'),
    EIGHT(8, '8'),
    NINE(9, '9'),
    TEN(10, 'T'),
    JACK(11, 'J'),
    QUEEN(12, 'Q'),
    KING(13, 'K'),
    ACE(14, 'A');

    private final int value;
    private final char symbol ;

    private CardValue(int value, char symbol) {
        this.value = value;
        this.symbol = symbol;
    }

    public char GetSymbol(){
        return this.symbol;
    }

    public int GetValue(){
        return this.value;
    }

    public static CardValue GetCardValueByValue(int value) {
        switch (value) {
            case 2:
                return TWO;
            case 3:
                return THREE;
            case 4:
                return FOUR;
            case 5:
                return FIVE;
            case 6:
                return SIX;
            case 7:
                return SEVEN;
            case 8:
                return EIGHT;
            case 9:
                return NINE;
            case 10:
                return TEN;
            case 11:
                return JACK;
            case 12:
                return QUEEN;
            case 13:
                return KING;
            case 14:
                return ACE;
        }
        return null;
    }

    /*public static boolean isSequentialCardValues(HashSet<CardValue> values){
        if(values.size() < 5) return false;
    }
*/
}
