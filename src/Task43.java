public class Task43 {
    public static void main(String[] args) {

        Patient patient1=new Patient();
        Patient patient2=new Patient(true);
        Patient patient3=new Patient("Ivan",35);
        //Patient patient4=new Patient();
        //Patient patient5=new Patient();
        System.out.println("Patient \""+patient1.name + "\" Age="+patient1.age);
        System.out.println(patient2.name + patient2.age + patient2.ill);
        System.out.println(patient3.name + patient3.age + patient3.ill);
        //System.out.println();
        //for (int i = 1; i < 3; i++) {
          //  System.out.println(patient+i);

        searchName("Ivan");




        }
    public void searchName(String name) {
        //if (name==patient1.name)
        this.name=name;
    }


}

