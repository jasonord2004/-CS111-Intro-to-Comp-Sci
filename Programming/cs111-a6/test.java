public class test{
    public static void main (String[] args){
        int numberOfDays = 31;
        double drywetProbability = 0.22;
        double wetwetProbability = 0.76;
        int[] forecast = new int [numberOfDays];   
        double firstDay = StdRandom.uniform();
        if (firstDay < 0.5){
            forecast[0] = 1;
        }
            else{
            forecast[0] = 2;
        }
        System.out.println(0 + " " + forecast[0]);
        for (int i = 1; i < forecast.length; i++){
            double days = StdRandom.uniform();
            if (forecast[i-1] == 1){
                if (days < wetwetProbability){
                    forecast[i] = 1;
                }
                else{
                    forecast[i] = 2;
                }
            }

            if(forecast[i-1] == 2){
                if (days < drywetProbability){
                    forecast[i] = 1;
                }
                else{
                    forecast[i] = 2;
                }
            }
        System.out.println(i+1 + " " + forecast[i]);
        }
        
        
    }
}