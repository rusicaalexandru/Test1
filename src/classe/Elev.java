package classe;


public class Elev{
    protected String  name;
    protected String  lastName;
    protected String gender;
    protected int age;
    protected int id;

    public Elev(){

    }
    public Elev(int id, String name, String lastName, String gender, int age){
        this();
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;

    }
    /*public Elev(int id,String name){
        this(id);
        this.name = name;
    }
    public Elev(int id, String name, String gender){
        this(id);
        this.gender = gender;
    }*/



    public int getId(){
        return this.id;
    }
}
/*
    public Elev(){
//        Scanner name = new Scanner(System.in);
        */
/*name = "Rusica";
        lastName = "Alexandru";
        gender = "Male";
        age = 20;
        id = 3;*//*

    }*/
