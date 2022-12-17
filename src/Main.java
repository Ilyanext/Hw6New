public class Main {
    public static void main(String[] args) {
        //task1
        int PostponeSalary =15_000;
        int total = 0;
        int month = 0;
        while (total < 2_459_000) {
            month= month+1;
            total=total+PostponeSalary;
            System.out.println(" Месяц " + month + ", сумма накоплений равна " + total + " рублей.");}

        /* task2 */
        int oneTen=0;
        while (oneTen<10) {
            oneTen=oneTen+1;
            System.out.print(oneTen + " ");
        }
        System.out.println();
        for (; oneTen >0; oneTen--) {
            System.out.print(oneTen + " ");
        }
        System.out.println();
        //task3
        int populationSize= 12_000_000;
        int birthRateYear = populationSize/1000*17;
        int deathYaer = populationSize/1000*8;
        int totalPopulation =0;
        int year = 0;
        while (year<10) {
            year=year+1;
            populationSize=populationSize+(birthRateYear-deathYaer)*year;
            System.out.println("Год " +year+ ", численность населения составляет " +populationSize);
        }
//task4 - task5
        int postSalary2=15_000;
        float totalSalary = 0;
        int month2=0;
        while (totalSalary<=12_000_000) {
            month2=month2+1;
            totalSalary=totalSalary+postSalary2;
            totalSalary=totalSalary+totalSalary*7/100;
            if (month2%6==0){
                System.out.println("Месяц " +month2+ ", сумма накопления "+ totalSalary);}
        }
//task6
        System.out.println();
        int sixMonth = 9*12;
        int chek =0;
        int totalSalary2 = 0;
        while (chek<=sixMonth) {
            chek= chek+1;
            totalSalary2=totalSalary2+postSalary2;
            totalSalary2=totalSalary2+postSalary2*7/100;
            if (chek %6 ==0) {
                System.out.println(" Месяц " +chek+ ", сумма накоплений равна "+totalSalary2);
            }
        }
        System.out.println();
//task7
        int friday = 3;
        int chet = 1;
        while (chet<=31) {
            if (chet == friday) {
                System.out.println("Сегодня пятница, " +chet+ "-е число. Необходимо подготовить отчет.");}
            else if (chet==friday+7) {
                System.out.println("Сегодня пятница, " +chet+ "-е число. Необходимо подготовить отчет.");
            } else if (chet==friday+14) {
                System.out.println("Сегодня пятница, " +chet+ "-е число. Необходимо подготовить отчет.");
            } else if (chet==friday+21) {
                System.out.println("Сегодня пятница, " +chet+ "-е число. Необходимо подготовить отчет.");
            } else if (chet==friday+28) {
                System.out.println("Сегодня пятница, " +chet+ "-е число. Необходимо подготовить отчет.");
            }
            chet=chet+1;
        }
        System.out.println();
//task8
        int comet = 79;
        int yearComet = 1;
        while (yearComet<=2122) {
            if (yearComet>=1822 && yearComet%79==0) {
                System.out.println(yearComet);}
            yearComet=yearComet+1;
        }
    }
}


