class HondaCity{
    static long price = 10;
    int a,b;
    static double OnRoadPrice(String city)
    {
        switch (city)
        {
            case "Delhi":
                System.out.print("Price of Honda City in Delhi is : ");
                return price + price*0.1;
            case "Mumbai":
                System.out.print("Price of Honda City in Mumbai is : ");
                return price + price*0.09;
        }
        return price;
    }
}
public class _095_StaticMember_VariableAndMethod {
    public static void main(String[] args) {
        System.out.println(HondaCity.OnRoadPrice("Mumbai"));
        System.out.println(HondaCity.OnRoadPrice("Delhi"));

        HondaCity h1 = new HondaCity();
        HondaCity h2 = new HondaCity();

        System.out.println("Ex Showroom price of Honda City is : "+HondaCity.price);

        h1.price=20;
        System.out.println(h1.price);
        System.out.println(h2.price);
    }
}
