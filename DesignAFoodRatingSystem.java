
// LeetCode
// Problem Link : https://leetcode.com/problems/design-a-food-rating-system/


import java.util.HashMap;
import java.util.TreeSet;

class DesignAFoodRatingSystem {
    HashMap<String, TreeSet<Food>> hm;
    HashMap<String, Food> cat;
    public DesignAFoodRatingSystem(String[] foods, String[] cuisines, int[] ratings) {
        hm = new HashMap<>();
        cat = new HashMap<>();
        for(int i = 0; i < foods.length; i++){
            hm.putIfAbsent(cuisines[i], new TreeSet<>((a,b) -> b.rating == a.rating ? a.food.compareTo(b.food) : b.rating - a.rating));
            hm.get(cuisines[i]).add(new Food(ratings[i], cuisines[i], foods[i]));
            cat.put(foods[i], new Food(ratings[i], cuisines[i], foods[i]));
        }
    }
    
    public void changeRating(String food, int newRating) {
        Food tempFood = cat.get(food);
        cat.remove(food);
        hm.get(tempFood.cuisine).remove(tempFood);
        Food newFood = new Food(newRating, tempFood.cuisine, food);
        hm.get(newFood.cuisine).add(newFood);
        cat.put(food, newFood);
    }
    
    public String highestRated(String cuisine) {
         return hm.get(cuisine).first().food;
    }

    class Food{
        int rating;
        String cuisine;
        String food;

        public Food(int rating, String cuisine, String food){
            this.rating = rating;
            this.cuisine = cuisine;
            this.food = food;
        }
    }
}
