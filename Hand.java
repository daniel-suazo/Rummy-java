import javax.swing.*;
// import java.util.Collections.

public class Hand implements Comparable<Hand> {
    public DefaultListModel<Card> hand;

    public Hand() {
        this.hand = new DefaultListModel<>();
    }

    public void addCard(Card card) {
        hand.addElement(card);
    }

    public Card getCard(int index) {
        return hand.get(index);
    }

    public Card removeCard(Card card) {
        Card c = card;
        hand.removeElement(card);
        return c;

    }

    public void removeObj(Object obj) {
        hand.removeElement(obj);
    }

    public Card removeCard(int index) {
        return hand.remove(index);
    }

    public int getNumberOfCards() {
        return hand.size();
    }

    public void sort() {

        int n = hand.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (hand.get(j).compareTo(hand.get(j + 1)) > 0) {

                    Card temp = hand.get(j);
                    hand.set(j, hand.get(j + 1));
                    hand.set(j + 1, temp);
                }
            }

        }
        System.out.println(this.toString());
        // System.out.println();

    }

    public boolean containsCard(Card card) {
        return hand.contains(card);
    }

    public int findCard(Card card) {
        return hand.indexOf(card);
    }

    public int cardRank(int index) {
        return Card.getRankIndex(hand.get(index).getRank());
    }

    public boolean GameOver() {
        return hand.isEmpty();
    }

    public Card[] findSet() {

        for (int i = 0; i < hand.size(); i++) {
            for (int j = i + 1; j < hand.size(); j++) {
                if (j + 1 < hand.size()) {
                    if ((this.cardRank(i) == this.cardRank(j)) && (this.cardRank(i) == this.cardRank(j + 1))) {
                        Card[] cardSet = new Card[3];
                        cardSet[0] = hand.get(i);
                        cardSet[1] = hand.get(j);
                        cardSet[2] = hand.get(j + 1);

                        if (j + 2 < hand.size()) {
                            if (this.cardRank(i) == this.cardRank(j + 2)) {
                                cardSet = new Card[4];
                                cardSet[0] = hand.get(i);
                                cardSet[1] = hand.get(j);
                                cardSet[2] = hand.get(j + 1);
                                cardSet[3] = hand.get(j + 2);

                                return cardSet;
                            }
                        }
                        return cardSet;
                    }
                }
            }
        }
        return null;

    }

    public int compareTo(Hand otherHand) {
        Card P1, P2;
        int pointsP1 = 0, pointsP2 = 0;
        for (int i = 0; i < hand.size(); i++) {
            P1 = hand.get(i);
            pointsP1 = pointsP1 + Card.getRankIndex(P1.getRank());
        }
        for (int i = 0; i < otherHand.Sizeof(); i++) {
            P2 = otherHand.getCard(i);
            pointsP2 = pointsP2 + Card.getRankIndex(P2.getRank());
        }
        System.out.println(pointsP1 - pointsP2);
        return pointsP1 - pointsP2;

    }

    public String toString() {
        Card c;
        String cards = "";

        for (int i = 0; i < hand.size(); i++) {
            c = hand.get(i);
            cards = cards + c.getRank() + c.getSuit() + ", ";
        }
        return cards.substring(0, cards.length() - 2);
    }

    public int Sizeof() {
        return hand.size();
    }

}