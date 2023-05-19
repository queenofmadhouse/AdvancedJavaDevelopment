package org.example.generics.FourthExample;

import java.util.ArrayList;
import java.util.List;

public class ClothingSite {

    public static void main(String[] args) {
        JacketItem jacketItem = new JacketItem();
        checkoutItems(jacketItem);

        JeansItem jeansItem = new JeansItem();
        checkoutItems(jeansItem);

        List<ClothingItems> clothingItemsList = new ArrayList<>();
        clothingItemsList.add(jacketItem);
        clothingItemsList.add(jeansItem);

        checkoutAllItems(clothingItemsList);
    }

    /*
    In this method we put any object, that extends ClothingItem
    and then we call System.out.println for creating description of name and price of this item
     */
    private static void checkoutItems(ClothingItems item) {
        System.out.println("Item purchased: " + item.getName() + " , price: " + item.getPrice());
    }

    /*
    In this method we put list of any objects, that extends ClothingItems
    and then we call foreach for this list. In the body of foreach we call checkoutItems method
    for each element
     */
    private static void checkoutAllItems(List<ClothingItems> clothingItems) {
        for(ClothingItems clothingItem : clothingItems) {
            checkoutItems(clothingItem);
        }
    }
}
