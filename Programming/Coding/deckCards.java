public class deckCards
{
    public static void main (String[] args)
    {
        String[] value = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J","Q", "K", "A"};
        String[] suit = {"Heart", "Diamond", "Club", "Spade"};
        String[] deck = new String[52];

        for (int v = 0; v < 13; v++)
        {
            for (int s = 0; s < 4; s++)
            {
                deck[v + s*13] = value[v] + suit[s];
            }
        }

        int N = Integer.parseInt(args[0]);
        for (int d = 0; d < N; d++)
        {
            int r = (int) (Math.random()*52);
            System.out.println(deck[r]);
        }
    }
}