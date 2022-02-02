public class Blackjack {

  public int parseCard(String card) {
    int valor;
    switch (card) {
      case "ace":
        {
          valor = 11;
          break;
        }
      case "two":
        {
          valor = 2;
          break;
        }
      case "three":
        {
          valor = 3;
          break;
        }
      case "four":
        {
          valor = 4;
          break;
        }
      case "five":
        {
          valor = 5;
          break;
        }
      case "six":
        {
          valor = 6;
          break;
        }
      case "seven":
        {
          valor = 7;
          break;
        }
      case "eight":
        {
          valor = 8;
          break;
        }
      case "nine":
        {
          valor = 9;
          break;
        }
      case "ten":
        {
          valor = 10;
          break;
        }
      case "jack":
        {
          valor = 10;
          break;
        }
      case "queen":
        {
          valor = 10;
          break;
        }
      case "king":
        {
          valor = 10;
          break;
        }
      default:
        {
          valor = 0;
          break;
        }
    }
    return valor;
  }

  public boolean isBlackjack(String card1, String card2) {
    int blackjack = 21;
    return (parseCard(card1) + parseCard(card2)) == blackjack;
  }

  public String largeHand(boolean isBlackjack, int dealerScore) {
    String resultado = "P";

    if (isBlackjack) {
      if (dealerScore < 10) {
        resultado = "W";
      } else {
        resultado = "S";
      }
    }

    return resultado;
  }

  public String smallHand(int handScore, int dealerScore) {
    String resultado = "";

    if (
      handScore >= 17 ||
      (handScore >= 12 && handScore <= 16 && dealerScore <= 6)
    ) {
      resultado = "S";
    } else if (
      handScore <= 11 ||
      (handScore >= 12 && handScore <= 16 && dealerScore >= 7)
    ) {
      resultado = "H";
    }

    return resultado;
  }

  // FirstTurn returns the semi-optimal decision for the first turn, given the cards of the player and the dealer.
  // This function is already implemented and does not need to be edited. It pulls the other functions together in a
  // complete decision tree for the first turn.
  public String firstTurn(String card1, String card2, String dealerCard) {
    int handScore = parseCard(card1) + parseCard(card2);
    int dealerScore = parseCard(dealerCard);

    if (20 < handScore) {
      return largeHand(isBlackjack(card1, card2), dealerScore);
    } else {
      return smallHand(handScore, dealerScore);
    }
  }
}
