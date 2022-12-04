package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/* 4*. Каталог товаров книжного магазина сохранен в виде двумерного списка List<ArrayList<String>> так,
 что на 0й позиции каждого внутреннего списка содержится название жанра,
  а на остальных позициях - названия книг. Напишите метод для заполнения данной структуры.
 */
public class Main {
    public static void main(String[] args) {
        List<ArrayList<String>> books = new ArrayList<>();
        fillArray(books);
        for (ArrayList book: books) {
            System.out.print(book.get(0) + ":");
            for (int i = 1; i < book.size(); i++) {
                System.out.print(String.format(" %s, ", book.get(i)));
            }
            System.out.println();
        }
    }
    public static void fillArray(List<ArrayList<String>> books){
        Scanner scan = new Scanner(System.in);
        while (true){
            System.out.println("Введите название жанра. end - закончить ввод.");
            String genreName = scan.nextLine();
            if (genreName.equals("end")){
                break;
            }else{
                ArrayList<String> genre = new ArrayList<>();
                genre.add(genreName);
                while (true) {
                    System.out.println("Введите название книги. end - закончить ввод");
                    String bookName = scan.nextLine();
                    if (bookName.equals("end")) {
                        break;
                    } else {
                        genre.add(bookName);
                    }
                }
                books.add(genre);
            }
        }
        scan.close();
    }
}