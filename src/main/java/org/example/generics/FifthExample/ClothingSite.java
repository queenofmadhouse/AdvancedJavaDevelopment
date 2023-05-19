package org.example.generics.FifthExample;

import java.util.ArrayList;
import java.util.List;

/*
In this example we used some code from fourth example
and demonstrate works wildcards in generic programming
 */
public class ClothingSite {

    public static void main(String[] args) {
        JacketItem jacketItem1 = new JacketItem();
        JacketItem jacketItem2 = new JacketItem();


        List<JacketItem> clothingItemsList = new ArrayList<>();
        clothingItemsList.add(jacketItem1);
        clothingItemsList.add(jacketItem2);

        checkoutAllItems(clothingItemsList);
    }

    private static void checkoutItems(ClothingItems item) {
        System.out.println("Item purchased: " + item.getName() + " , price: " + item.getPrice());
    }

    /*
    Now we declare that input can be a list of objects, that extends ClothingItems
    (in fourth example we declare, that it must be list of row ClothingItems =>
    it can be list of any child's of ClothingItems. In this example we can put List<JacketItem> ,
    List<JeansItem> , etc.
    It can be useful if you want to use list of items of child-objects, that extends ClothingItems)

     */
    private static void checkoutAllItems(List<? extends ClothingItems> clothingItems) {
        for(ClothingItems clothingItem : clothingItems) {
            checkoutItems(clothingItem);
        }
    }
}
