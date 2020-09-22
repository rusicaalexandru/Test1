package classe;


public class Elev{
    protected String  name;
    protected String  lastName;
    protected char gender;
    protected int age;
    protected int id;

    public Elev(){
    }

    public Elev(int id, String name, String lastName, char gender, int age){
        this(); // ??
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
    }

    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public String getLastName(){
        return this.lastName;
    }
    public char getGender(){
        return this.gender;
    }
<<<<<<< Updated upstream

    public int getId(){
        return this.id;
    }
}


  /*public Elev(int id,String name){
=======
    public int getAge(){
        return this.age;
    }

    /*public Elev(int id,String name){
>>>>>>> Stashed changes
        this(id);
        this.name = name;
    }
    public Elev(int id, String name, String gender){
        this(id);
        this.gender = gender;
    }*/

<<<<<<< Updated upstream

=======
}
>>>>>>> Stashed changes
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
