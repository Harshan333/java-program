class Amazonprime{

static String kannadamovies[]={"kgf","tagaru","villain"};

static String telugumovies[]={"evaru","rrr","bahubali"};

static String tamilmovies[]={"ps1","ps2","surya","vikram"};

static String malayalammovies[]={"accident","forensic","posaru"};

static String hindimovies[]={"koli","bhramatra","war"};

public static void main(String amazonprime[]){
System.out.println("main started");
getkannadamovies();
gettelugumovies();
gettamilmovies();
getmalayalammovies();
gethindimovies();
System.out.println("main ended");
}
public static void getkannadamovies(){
for(String kannadamovie:kannadamovies){
System.out.println(kannadamovie);
}
}
public static void gettelugumovies(){
for(String telugumovie: telugumovies){
System.out.println( telugumovie);
}
}
public static void gettamilmovies(){
for(String  tamilmovie:  tamilmovies){
System.out.println(  tamilmovie);
}
}
 public static void getmalayalammovies (){
for(String malayalammovie: malayalammovies){
System.out.println( malayalammovie);
}
 }
public static void gethindimovies(){
for(String hindimovie:hindimovies){
System.out.println( hindimovie);
}
}










}