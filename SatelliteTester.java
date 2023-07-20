class SatelliteTester{

public static void main(String[] book){
Satellite satellite=new Satellite();
satellite.name="Hubble Space Telescope";
satellite.type="Space Telescope";
satellite.country="United States (NASA)";
satellite.tolaunch();

System.out.println(satellite.name +"  "+ satellite.type +"   "+ satellite.country +"" );

Satellite satellite1=new Satellite();
satellite1.name="International Space Station (ISS)";
satellite1.type="Space Station";
satellite1.country="Collaboration between multiple space agencies";

System.out.println(satellite1.name +"  "+ satellite1.type +"   "+ satellite1.country +"" );

Satellite satellite2=new Satellite();
satellite2.name="GPS Block II";
satellite2.type="Navigation satellite";
satellite2.country="United States (US Space Force)";

System.out.println(satellite2.name +"  "+ satellite2.type +"   "+ satellite2.country +"");

Satellite satellite3=new Satellite();
satellite3.name="Galileo";
satellite3.type="Navigation satellite";
satellite3.country="USA";

System.out.println(satellite3.name +"  "+ satellite3.type +"   "+ satellite3.country +"" );

Satellite satellite4=new Satellite();
satellite4.name="harry potter";
satellite4.type="Navigation satellite";
satellite4.country="European Union";

System.out.println(satellite4.name +"  "+ satellite4.type +"   "+ satellite4.country + "");



Satellite satellite5=new Satellite();
satellite5.name="IRIDIUM";
satellite5.type="Communication satellite";
satellite5.country="United States";

System.out.println(satellite5.name +"  "+ satellite5.type +"   "+ satellite5.country +"" );

Satellite satellite6=new Satellite();
satellite6.name="GOES ";
satellite6.type="Weather satellite";
satellite6.country="United States";

System.out.println(satellite6.name +"  "+ satellite6.type +"   "+ satellite6.country +"" );

Satellite satellite7=new Satellite();
satellite7.name="Landsat";
satellite7.type="Earth Observation satellite";
satellite7.country="United States";

System.out.println(satellite7.name +"  "+ satellite7.type +"   "+ satellite7.country + "");

Satellite satellite8=new Satellite();
satellite8.name="Sentinel-2";
satellite8.type="Earth Observation satellite";
satellite8.country="European Union";

System.out.println(satellite8.name +"  "+ satellite8.type +"   "+ satellite8.country +"" );

Satellite satellite9=new Satellite();
satellite9.name="INSAT";
satellite9.type="Communication and Weather satellite";
satellite9.country="India (ISRO - Indian Space Research Organisation)";

System.out.println(satellite9.name +"  "+ satellite9.type +"   "+ satellite9.country +"" );
}




}