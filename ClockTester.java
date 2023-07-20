class ClockTester{

public static void main(String[] args){
Clock clock =new Clock();
clock.brandName = "Seiko ";
clock.type = "Analog, ";
clock.price=2310;
clock.forTime();

System.out.println(clock.brandName +"  "+ clock.type +"  "+ clock.price +"  ");

Clock clock1 = new Clock();
clock1.brandName ="Howard ";
clock1.type="Digital, ";
clock1.price=1355;
clock1.forTime();

System.out.println(clock1.brandName+"  "+ clock1.type +"  "+ clock1.price +"  ");

Clock clock2 = new Clock();
clock2.brandName ="Bulova , ";
clock2.type="Analog, ";
clock2.price=4515;
clock2.forTime();

System.out.println(clock2.brandName+"  "+ clock2.type +"  "+ clock2.price +"  ");

Clock clock3 = new Clock();
clock3.brandName ="Citizen ";
clock3.type="Analog, ";
clock3.price=1500;
clock3.forTime();

System.out.println(clock3.brandName+"  "+ clock3.type +"  "+ clock3.price +"  ");

Clock clock4 = new Clock();
clock4.brandName ="Hermle ";
clock4.type="Mantel";
clock4.price=2315;
clock4.forTime();

System.out.println(clock4.brandName+"  "+ clock4.type +"  "+ clock4.price +"  ");

Clock clock5 = new Clock();
clock5.brandName ="Timex ";
clock5.type="Analog, ";
clock5.price=1565;
clock5.forTime();

System.out.println(clock5.brandName+"  "+ clock5.type +"  "+ clock5.price +"  ");

Clock clock6 = new Clock();
clock6.brandName ="Braun ";
clock6.type="Mantel";
clock6.price=3215;
clock6.forTime();

System.out.println(clock6.brandName+"  "+ clock6.type +"  "+ clock6.price +"  ");

Clock clock7 = new Clock();
clock7.brandName ="Junghans ";
clock7.type="Digital, ";
clock7.price=5615;
clock7.forTime();

System.out.println(clock7.brandName+"  "+ clock7.type +"  "+ clock7.price +"  ");

Clock clock8 = new Clock();
clock8.brandName ="Rhythm ";
clock8.type="Digital, ";
clock8.price=3615;
clock8.forTime();

System.out.println(clock8.brandName+"  "+ clock8.type +"  "+ clock8.price +"  ");

Clock clock9 = new Clock();
clock9.brandName ="Kieninger  ";
clock9.type="Mantel";
clock9.price=3515;
clock9.forTime();

System.out.println(clock9.brandName+"  "+ clock9.type +"  "+ clock9.price +"  ");



}
}