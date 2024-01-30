public class Lefties 
{
    public static void main(String[] args)
    {
        int countTrials = 0;
        for(int trials = 1; trials <= 100; trials++)
        {
            int numLefties = 0;
            for(int people = 1; people <= 20; people++)
            {
                int lefty = (int)(Math.random()*10 + 1);
                if (lefty == 8); //8 means left-handed
                {
                    numLefties = numLefties + 1;
                }
            }
            if (numLefties >= 2)
            {
                countTrials = countTrials + 1;
            }
        }
        System.out.println(countTrials + " groups had 2 or more lefties");
    }
}
