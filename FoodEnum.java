enum Food {tacos, wings, burritos, burgers}
public class FoodEnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Food food1 = Food.tacos;
		System.out.println(food1);
		Food food2 = Food.wings;
		System.out.println(food2);
		Food food3 = Food.burritos;
		System.out.println(food3);
		Food food4 = Food.burgers;
		System.out.println(food4);
		System.out.println(food1.ordinal());
		System.out.println(food2.ordinal());
		System.out.println(food3.ordinal());
		System.out.println(food4.ordinal());
	}

}
