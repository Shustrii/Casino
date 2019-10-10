public class LastVegas {
    public static void main(String[] args) {
        int stake=Integer.parseInt(args[0]);
        int goal=Integer.parseInt(args[1]);
        int trails=Integer.parseInt(args[2]);

        int wins = 0;
        for (int t = 0; t < trails; t++){
                int cash = stake;
                String star2 = "*";
                for (int i = 0; i <stake;i++){
                    star2 = star2 + "*";
                }
                System.out.println(star2+stake);
                while(cash > 0 && cash < goal) {
                    String star = "";
                    if (Math.random() < 0.5)
                    {
                        cash++;
                    for (int i=0;i < cash;i++){
                        star=star+"*";
                    }
                    System.out.println(star + cash);
                }
                    else
                        {
                        cash--;
                            for (int i=0;cash > i;i++){
                                star=star+"*";
                            }
                            System.out.println(star + cash);
                        }

                }
                if (cash == goal)
                    wins++;
        }


        System.out.println(wins + " wins of "+trails);
    }
}
