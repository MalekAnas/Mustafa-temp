package com.black_lemon;

import java.util.ArrayList;
import java.util.Hashtable;

public class Library {

    private ArrayList<Student> registeredStudents = new ArrayList<>();
    private ArrayList<Tablet> tabletsBank = new ArrayList<>();
    private ArrayList<Book> booksBank = new ArrayList<>();

    private Hashtable<Student, Book> bookBorrowings = new Hashtable<>();
    private Hashtable<Student, Tablet> tabletBorrowings = new Hashtable<>();


    public Library() {
    }

    public Library(ArrayList<Student> registeredStudents, ArrayList<Tablet> tabletsBank, ArrayList<Book> booksBank, Hashtable<Student, Book> bookBorrowings, Hashtable<Student, Tablet> tabletBorrowings) {
        this.registeredStudents = registeredStudents;
        this.tabletsBank = tabletsBank;
        this.booksBank = booksBank;
        this.bookBorrowings = bookBorrowings;
        this.tabletBorrowings = tabletBorrowings;
    }



    //add new student to registeredStudents
    public void registerStudent(Student student){
        if  (isStudentExist(student)) {
            System.out.println("Student is already exist!");
        }
        else {
            registeredStudents.add(student);
        }
    }


    //remove student from registeredStudents
    private void removeStudentById(short id){

        for ( Student student : this.registeredStudents){

            if (student.getId() == id)
                this.registeredStudents.remove(student);
            else
                System.out.println("student not found!");
        }


    }


    //check if student is exist to avoid adding same student twice to registered students
    private boolean isStudentExist(Student student) {

        boolean exists = false;
        for ( Student stu  : this.registeredStudents) {
            if (stu.getId() == student.getId()){
                exists = true;
            }
            else
                exists = false;

        }
       return exists;
    }


    public void borrowBook(Student student, Book book){


        if (isBookAvailable(book)&& isStudentExist(student)){

            book.setBorrowed(true);
            bookBorrowings.put(student, book);
        }

    }


    private boolean isBookAvailable(Book book) {

        boolean avialable= false;

        for ( Book myBook: this.booksBank ) {


                                                          //!   //true
            if ((book.getId() == myBook.getId()) && !book.isBorrowed()){

                avialable = true;
            }
            else
                avialable= false;

        }
        return avialable;
    }


    //Getters and setters


    public ArrayList<Student> getRegisteredStudents() {
        return registeredStudents;
    }

    public void setRegisteredStudents(ArrayList<Student> registeredStudents) {
        this.registeredStudents = registeredStudents;
    }

    public ArrayList<Tablet> getTabletsBank() {
        return tabletsBank;
    }

    public void setTabletsBank(ArrayList<Tablet> tabletsBank) {
        this.tabletsBank = tabletsBank;
    }

    public ArrayList<Book> getBooksBank() {
        return booksBank;
    }

    public void setBooksBank(ArrayList<Book> booksBank) {
        this.booksBank = booksBank;
    }

    public Hashtable<Student, Book> getBookBorrowings() {
        return bookBorrowings;
    }

    public void setBookBorrowings(Hashtable<Student, Book> bookBorrowings) {
        this.bookBorrowings = bookBorrowings;
    }

    public Hashtable<Student, Tablet> getTabletBorrowings() {
        return tabletBorrowings;
    }

    public void setTabletBorrowings(Hashtable<Student, Tablet> tabletBorrowings) {
        this.tabletBorrowings = tabletBorrowings;
    }



    //Run git config --global user.email "you@example.com" git config --global user.name "Your Name" to set your account's default identity. Omit --global to set the identity only in this repository. unable to auto-detect email address (got 'black-lemon@archlinux.(none)')
}
