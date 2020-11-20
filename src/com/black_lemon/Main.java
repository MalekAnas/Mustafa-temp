package com.black_lemon;

import java.util.ArrayList;

public class Main {


    //Tasks
    //
    //

    /*
    * Students have  properties :
    * firstName,
    * lastName,
    * email,
    * classLevel
    * gender
    *
    *
    *
    * */

    /*Book properties:
    * author
    * name
    * id
    * language
    * numberOfPages
    * priceValue
    * publisher
    * publishYear
    * notes
    *
    * functions:
    *
    * openBook()
    * isBorrowed()
    * notesWhenReturn()
    * checkWhenReturn()
    *
    *
    * */

    /*Tablet properties:
    *
    * manufacturer
    * model
    * serialNumber
    * batteryLevel
    * notesWhenReturn
    * priceValue
    *
    *functions:
    *
    * isPoweredOn();
    * isBorrowed();
    * isCharged();
    * charge();
    * checkWhenReturn();
    *
    *
    * */


    public static void main(String[] args) {
	// write your code here


        Library library = new Library();
        //new students array for this library
        ArrayList<Student> studentsInLibrary = new ArrayList<>();
        ArrayList<Book> booksInLibrary = new ArrayList<>();
        ArrayList<Tablet> tabletsInLibrary = new ArrayList<>();

        //set the created arraylist to library registered students and fill it
        library.setRegisteredStudents(fillStudentsArray(studentsInLibrary));
        library.setBooksBank(fillBooksArray(booksInLibrary));
        library.setTabletsBank(fillTabletsArray(tabletsInLibrary));


        System.out.println(!false);






















//        //Debugging
//        for ( Student student1 : library.getRegisteredStudents()   ) {
//
//
//            System.out.println(student1.toString());
//        }
//
//
//        for ( Book book : library.getBooksBank()   ) {
//
//
//            System.out.println(book.toString());
//        }
//
//        System.out.println("***********************************");
//
//        for ( Tablet tablet : library.getTabletsBank()   ) {
//
//
//            System.out.println(tablet.toString());
//        }



        LibraryManager libraryManager =new LibraryManager();








        //pass the library to its manager
        libraryManager.setTheLibrary(library);

    }



    //fill array list with students
    public static ArrayList<Student> fillStudentsArray(ArrayList<Student> studentArrayList){

        studentArrayList.add(PrepareData.student);
        studentArrayList.add(PrepareData.student1);
        studentArrayList.add(PrepareData.student2);
        studentArrayList.add(PrepareData.student3);
        studentArrayList.add(PrepareData.student4);
        studentArrayList.add(PrepareData.student5);
        studentArrayList.add(PrepareData.student6);
        studentArrayList.add(PrepareData.student7);

        return studentArrayList;



    }
    //fill array list with students
    public static ArrayList<Book> fillBooksArray(ArrayList<Book> bookArrayList){

        bookArrayList.add(PrepareData.book1);
        bookArrayList.add(PrepareData.book2);
        bookArrayList.add(PrepareData.book3);
        bookArrayList.add(PrepareData.book4);
        bookArrayList.add(PrepareData.book5);
        bookArrayList.add(PrepareData.book6);


        return bookArrayList;



    } //fill array list with students
    public static ArrayList<Tablet> fillTabletsArray(ArrayList<Tablet> tabletArrayList){

        tabletArrayList.add(PrepareData.tablet);
        tabletArrayList.add(PrepareData.tablet1);
        tabletArrayList.add(PrepareData.tablet2);


        return tabletArrayList;



    }
}
