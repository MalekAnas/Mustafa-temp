package com.black_lemon;

import java.util.ArrayList;

public class PrepareData {


   // classes
   public static ClassLevel classLevel1 = new ClassLevel(1, "first");
    public static  ClassLevel classLevel2= new ClassLevel(2, "second");
    public static ClassLevel classLevel3 = new ClassLevel(3, "third");
    public static  ClassLevel classLevel4 = new ClassLevel(4, "fourth");


    //students
    public static Student student = new Student(  1 , "Mustafa 1", "Akkad 1", "mustafa1@mail.com", classLevel3, "male");
    public static Student student1 = new Student(  2 , "Mustafa 2", "Akkad 2", "mustafa2@mail.com", classLevel3 , "male1");
    public static Student student2 = new Student(  3 , "Mustafa 3", "Akkad 3" , "mustafa3@mail.com", classLevel1 , "male2");
    public static Student student3 = new Student(  4 , "Mustafa 4", "Akkad 4", "mustaf4a@mail.com", classLevel2 , "male1");
    public static Student student4 = new Student(  5 , "Mustafa 5", "Akkad 5", "mustafa5@mail.com", classLevel3 , "male2");
    public static Student student5 = new Student(  6 , "Mustafa 6", "Akkad 6", "mustafa6@mail.com", classLevel1 , "male1");
    public static Student student6 = new Student(  7 , "Mustafa 7", "Akkad 7", "mustafa7@mail.com", classLevel4 , "male2");
    public static Student student7 = new Student(  8 , "Mustafa 8", "Akkad 8", "mustafa8@mail.com", classLevel2 , "male3");



    //books
    public static Book book1 = new Book(1, "Author1", "bookName1", "english", "MusPublisher1", "2010", 99.99, 451, new ArrayList<>(), false);
    public static Book book2 = new Book(2, "Author2", "bookName1", "french", "MusPublisher1", "2011", 99.99, 451,  new ArrayList<>() ,false);
    public static Book book3 = new Book(3, "Author3", "bookName1", "german", "MusPublisher2", "2002", 99.99, 451,  new ArrayList<>() , false);
    public static Book book4 = new Book(4, "Author4", "bookName1", "swedish", "MusPublisher2", "2020", 99.99, 451, new ArrayList<>() , false);
    public static Book book5 = new Book(5, "Author5", "bookName1", "spanish", "MusPublisher3", "2014", 99.99, 451,  new ArrayList<>() , false);
    public static  Book book6 = new Book(6, "Author6", "bookName1", "english", "MusPublisher3", "2017", 99.99, 451,  new ArrayList<>() , false);


    //Tablets

    public static Tablet tablet =new Tablet(1, "apple" ,"pro11", 999.99, 45, new ArrayList<>(), false);
    public static Tablet tablet1 =new Tablet(2, "samsung" ,"s10", 888.99, 90, new ArrayList<>(), false);
    public static  Tablet tablet2 =new Tablet(3, "nokia" ,"3310", 99.99, 25, new ArrayList<>(), false);










}
