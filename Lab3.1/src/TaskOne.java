import java.util.Scanner;
import java.util.Arrays;

public class TaskOne {
    public static void main(String[] args) {
        Abiturient[] abiturients= new Abiturient[3];
        abiturients[0] = new Abiturient(0,"Леонов","Михаил", "Максимович", "Рязань", "79209740740",new int[]{2,4,4,4});
        abiturients[1] = new Abiturient(1, "Макаров", "Олег", "Саныч", "Рязань", "990011", new int[] {2,5,5,5});
        abiturients[2] = new Abiturient(2, "a","a","a","a","a",new int[] {2,5,5,5});
        /*abiturients[3] = new Abiturient();
        abiturients[4] = new Abiturient();*/
        for (int i=0; i<=abiturients.length-1;i++){
            abiturients[i].displayAllInfo();
        }

        System.out.println("Абитуриенты с неудволетворительными оценками");
        for (Abiturient ab: abiturients){
            for (int i:ab.getRating()){
                if (i==2){
                    System.out.println("ID: "+ab.getId()+" Фамилия: "+ab.getSurname());
                    break;
                }
            }
        }



    }
    /*создадим класс абитуриенты*/
    static class Abiturient{
        private int id;//id
        private String surname;//фамилия
        private String name;// имя
        private String patronymic;// отчество
        private String adress;//адрес
        private String phone;//телефон
        private int[] rating; //оценки


        //id
        public int getId(){
            return this.id;
        }
        public void setId(int id){
            this.id=id;
        }

        //surname - фамилия
        public String getSurname() {
            return this.surname;
        }
        public void setSurname(String surname){
            this.surname=surname;
        }

        // name - имя
        public String getName(){
            return this.name;
        }
        public void setName(String name) {
            this.name = name;
        }

        //patronymic - отчество
        public String getPatronymic(){
            return this.patronymic;
        }
        public void setPatronymic(String patronymic) {
            this.patronymic = patronymic;
        }

        //adress
        public String getAdress() {
            return this.adress;
        }
        public void setAdress(String adress) {
            this.adress = adress;
        }

        //phone
        public String getPhone(){
            return this.phone;
        }
        public void setPhone(String phone){
            this.phone = phone;
        }

        //rating
        public int[] getRating(){
            return this.rating;
        }
        public void setRating(int[] rating){
            this.rating = rating;
        }

        public void displayAllInfo(){
            System.out.println("______________________________");
            System.out.println("Абитуриент ID:        "+this.id);
            System.out.println("Фамилия абитуриента:  "+this.surname );
            System.out.println("Имя абитуриента:      "+this.name);
            System.out.println("Отчество абитуриента: "+this.patronymic);
            System.out.println("Адрес абитуриента:    "+this.adress);
            System.out.println("Телефон абитуриента:  "+this.phone);
            System.out.print  ("Оценки абитуриента:   ");
            for (int i=0; i<=this.rating.length-1;i++){
                System.out.print(this.rating[i]+" ");
            }
            System.out.println();
            System.out.println("______________________________");

        }

        // полный конcтруктор абитуриента
        Abiturient(int id, String surname,String name,String patronymic,String adress,String phone, int[] rating){
            this.id = id;
            this.surname=surname;
            this.name=name;
            this.patronymic=patronymic;
            this.adress=adress;
            this.phone=phone;
            this.rating=rating;
        }
    }
}
