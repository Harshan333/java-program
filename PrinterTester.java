class PrinterTester{

public static void main(String[] args){
Printer printer =new Printer();
printer.brandName = "HP ";
printer.type = "Inkjet ";
printer.price=21510;
printer.toPrint();

System.out.println(printer.brandName +"  "+ printer.type +"  "+ printer.price +"  ");

Printer printer1 = new Printer();
printer1.brandName ="Canon";
printer1.type="Laser ";
printer1.price=12525;
printer1.toPrint();

System.out.println(printer1.brandName+"  "+ printer1.type +"  "+ printer1.price +"  ");

Printer printer2 = new Printer();
printer2.brandName ="Epson";
printer2.type="Inkjet ";
printer2.price=58715;
printer2.toPrint();

System.out.println(printer2.brandName+"  "+ printer2.type +"  "+ printer2.price +"  ");

Printer printer3 = new Printer();
printer3.brandName ="Samsung";
printer3.type="Laser ";
printer3.price=1755;
printer3.toPrint();

System.out.println(printer3.brandName+"  "+ printer3.type +"  "+ printer3.price +"  ");

Printer printer4 = new Printer();
printer4.brandName ="Lexmark";
printer4.type="Inkjet ";
printer4.price=75215;
printer4.toPrint();

System.out.println(printer4.brandName+"  "+ printer4.type +"  "+ printer4.price +"  ");

Printer printer5 = new Printer();
printer5.brandName ="Ricoh";
printer5.type="Inkjet ";
printer5.price=78515;
printer5.toPrint();

System.out.println(printer5.brandName+"  "+ printer5.type +"  "+ printer5.price +"  ");

Printer printer6 = new Printer();
printer6.brandName ="Kyocera";
printer6.type="EcoTank ";
printer6.price=8915;
printer6.toPrint();

System.out.println(printer6.brandName+"  "+ printer6.type +"  "+ printer6.price +"  ");

Printer printer7 = new Printer();
printer7.brandName ="Brother";
printer7.type="EcoTank ";
printer7.price=8515;
printer7.toPrint();

System.out.println(printer7.brandName+"  "+ printer7.type +"  "+ printer7.price +"  ");

Printer printer8 = new Printer();
printer8.brandName ="Xerox";
printer8.type="Laser ";
printer8.price=6515;
printer8.toPrint();

System.out.println(printer8.brandName+"  "+ printer8.type +"  "+ printer8.price +"  ");

Printer printer9 = new Printer();
printer9.brandName ="Dell ";
printer9.type="EcoTank ";
printer9.price=4515;
printer9.toPrint();

System.out.println(printer9.brandName+"  "+ printer9.type +"  "+ printer9.price +"  ");



}
}