// ECPC is a programming contest where college teams compete under supervision of their coaches
public class ECPC
{
    public static void main(String[] args)
    {
        Contestant c1 = new Contestant("Yassin","ASU",20,"M","BugBusters","C++");
        c1.printInfo();
        c1.setProgLang("Python");
        System.out.println("");
        c1.printInfo();

        System.out.println("------------------------------------------------------------");

        Coach co1 = new Coach("Ahmed","ASU",23,"M",2,"BugBusters");
        co1.printInfo();
        System.out.println("");
        System.out.println(co1.getTeamSupervised());
        co1.setYears_of_experience(3);
        co1.setTeamSupervised("Error 404");
        System.out.println("");
        co1.printInfo();

    }
}

class Person
{
    private String name;
    private String uniName;
    private String gender;
    private int age;


    Person(String name,String uniName,int age,String gender)
    {
        this.name = name;
        this.uniName = uniName;
        this.age = age;
        this.gender = gender;

    }



    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setUniName(String uniName) {
        this.uniName = uniName;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getUniName() {
        return uniName;
    }

    public int getAge() {
        return age;
    }

    public void printInfo()
    {
        System.out.println("Name: "+ this.name+"\nAge: " + this.age+"\nGender: " + this.gender+"\nUniversity: " + this.uniName);
    }

}

class Contestant extends Person
{
    private String teamName;
    private String progLang;

    Contestant(String name,String uniName,int age,String gender, String teamName,String progLang )
    {
        super(name,uniName,age,gender);
        this.teamName = teamName;
        this.progLang = progLang;

    }

    public void setProgLang(String progLang) {
        this.progLang = progLang;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamName() {
        return this.teamName;
    }

    public String getProgLang() {
        return progLang;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Team name: " + this.teamName + "\nPreferred languange: " + this.progLang);
    }
}

class Coach extends Person
{
    private int years_of_experience;
    private String teamSupervised;

    Coach(String name,String uniName,int age,String gender, int years_of_experience, String teamSupervised)
    {
        super(name,uniName,age,gender);
        this.years_of_experience = years_of_experience;
        this.teamSupervised = teamSupervised;
    }

    public void setTeamSupervised(String teamSupervised) {
        this.teamSupervised = teamSupervised;
    }

    public void setYears_of_experience(int years_of_experience) {
        this.years_of_experience = years_of_experience;
    }

    public int getYears_of_experience() {
        return years_of_experience;
    }

    public String getTeamSupervised() {
        return teamSupervised;
    }

    @Override
    public void printInfo()
    {
        super.printInfo();
        System.out.println("Years of experience: " + this.years_of_experience + "\nTeam Supervised: " + this.teamSupervised);
    }
}
