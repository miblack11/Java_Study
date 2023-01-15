package com.black.homework.homework08;

public class HomeWork08 {
    public static void main(String[] args) {
        Student student = new Student("小明", '男', 10, 22200216);
        System.out.println(student.play());
        Person person = new Teacher("老黑", '男', 44, 12);
        System.out.println(person.play());
        Person personarr[] = new Person[4];
        personarr[0] = new Student("jack", '女', 7, 33443);
        personarr[1] = new Student("kun", '男', 10, 332211);
        personarr[2] = new Teacher("mike", '男', 63, 20);
        personarr[3] = new Teacher("emol", '女', 71, 10);
        Person temp = null;
        for (int i = 0; i < personarr.length - 1; i++) {
            for (int j = 0; j < personarr.length - 1 - i; j++) {
                if (personarr[j].getAge() < personarr[j + 1].getAge()) {
                    temp = personarr[j];
                    personarr[j] = personarr[j + 1];
                    personarr[j + 1] = temp;
                }

            }
        }

        for (int i = 0; i < personarr.length; i++) {
            System.out.println(personarr[i].printInfo());
        }
        for (int i = 0; i < personarr.length; i++) {
            new HomeWork08().text(personarr[i]);
        }
    }
    public void text(Person p){
        if ( p instanceof Student){
            ((Student) p).study();
        }
        if ( p instanceof Teacher){
            ((Teacher) p).teach();
        }

    }

}
