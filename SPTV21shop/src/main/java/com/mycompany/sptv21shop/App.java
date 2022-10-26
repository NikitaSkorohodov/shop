/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sptv21shop;
import Enyity.Obuv;
import Enyity.Product;
import java.util.Scanner;
/**
 *
 * @author NikitaSkr
 */
public class App {
    private Product[] products;

    public App() {
        products=new Product[0];
    }
    
    @SuppressWarnings("empty-statement")
   public void run(){
        Scanner scanner = new Scanner(System.in);
        boolean repeat = true;
        
        do{
            System.out.println("Задачи: ");
            System.out.println("0. Закончить программу");
            System.out.println("1. Добавить книгу");
            System.out.println("2. Добавить читателя");
            System.out.println("3. Выдать книгу");
            System.out.println("4. Вернуть книгу");
            System.out.print("Выберите задачу: ");
            int task = scanner.nextInt();
            scanner.nextLine();
            switch (task) {
                case 0:
                    repeat = false;
                    break;
                case 1:
                    System.out.println("1. Добавить книгу");
                    System.out.print("Введите название книги: ");
                    String prodName = scanner.nextLine();
                    System.out.println("add book quantity ");
                    String quantity= scanner.nextLine();
                    
                    Product product = createBook(prodName, new Integer(quantity));
                    Product[] newProducts= new Product[this.products.length+1];
                    newProducts[newProducts.length-1] =product;
                    this.products= newProducts;
                    break;

                case 2:
                    
                    for (int i = 0; i < products.length; i++) {
                        System.out.print(i+1+". "+products[i].getProdName()+". ");
                    }
                            
                    break;
            }}while(repeat);}
   public Product createBook(String prodName,int quantity){
        Product product = new Product();
        product.setProdName(prodName);
        product.setQuantity(quantity);
        return product;

    /**
     *
     * @param product
     * @return
     */
   
            }}
