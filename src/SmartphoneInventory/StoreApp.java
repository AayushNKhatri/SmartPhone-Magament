package SmartphoneInventory;
import java.util.ArrayList;
import java.util.Scanner;
public class StoreApp {
    private static ArrayList<SmartphoneInventoryModel> data = new ArrayList<>();
    private static Scanner input = new Scanner(System.in);
    public static void main(String [] args)
    {
        boolean exit = false;
        while(!exit)
        {
            System.out.println("1.Add new product");
            System.out.println("2.Update product");
            System.out.println("3.Show Info of product ");
            System.out.println("4.Delete the product");
            System.out.println("5.Exit");
            System.out.println("Enter the choice ->");
            int choice = input.nextInt();

            switch (choice)
            {
                case 1:
                    StoreController.addNewProduct(data);
                    break;
                case 2:
                    StoreController.updateProduct(data);
                    break;
                case 3:
                    StoreController.showInfo(data);
                    break;
                case 4:
                    StoreController.deleteProduct(data);
                    break;
                case 5:
                    exit = true;
                    System.out.println("Exiting the menu");
                    break;
                default:
                    System.out.println("Enter the correct choices");
            }
        }
    }
}
