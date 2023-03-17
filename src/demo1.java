public class demo1 {
    static void display(int a){
        System.out.println("The value is "+a);
    }
    static void display(double a){
        System.out.println("The value is "+a);
    }
    static void display(int a , int b){
        System.out.println("The value is "+a + " " + b) ;;
    }
    public static void main(String[] args) {
        display(1);
        display(1,4);
        Language l1 = new Language();
        Language l2 = new Language("Something");
        l1.getLanguage();
        l2.getLanguage();
    }
}
class Language{
    String language;
    Language(){
        this.language = "English";
    }
    Language(String s){
        this.language = "Hindi";
    }

    public void getLanguage() {
        System.out.println(language);
    }
}