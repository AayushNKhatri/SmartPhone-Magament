package SmartphoneInventory;


import java.util.ArrayList;
import java.util.Scanner;

public class StoreController {
    static void addNewProduct(ArrayList<SmartphoneInventoryModel> data) { //adds new product
        //taking modelCode
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Model Code:");
        String modelCode = input.nextLine();
        for (SmartphoneInventoryModel smartphone : data) {          //checking if modelCode exist or not
            if (smartphone.getModelCode().equals(modelCode)) {
                System.out.println("Model Code already exists.");
                return;
            }
        }


        // collecting the data
        System.out.println("Enter the Name:");
        String name = input.nextLine();
        System.out.println("Enter the Ram:");
        int ram = input.nextInt();
        System.out.println("Enter the display:");
        float display = input.nextFloat();
        System.out.println("Enter the price:");
        int price = input.nextInt();
        System.out.println("Enter the Storage:");
        int storage = input.nextInt();

        // adding the data to array list
        SmartphoneInventoryModel Smartphone = new SmartphoneInventoryModel(modelCode,ram, display, price, storage, name);
        data.add(Smartphone);
        System.out.println("New mobile added successfully.");



    }
    static void updateProduct(ArrayList<SmartphoneInventoryModel> data) //Update the product
    {
        Scanner inputUpdate = new Scanner(System.in);
        System.out.println("Enter the Model Code:");
        String modelCode = inputUpdate.nextLine();
        for(SmartphoneInventoryModel smartphone : data)
        {
            if(smartphone.getModelCode().equals(modelCode))
            {
                System.out.println("Enter the detail for update");
                System.out.println("Enter the name:");
                smartphone.setName(inputUpdate.nextLine());
                System.out.println("Enter the Ram");
                smartphone.setRam(inputUpdate.nextInt());
                System.out.println("Enter the display:");
                smartphone.setDisplay(inputUpdate.nextFloat());
                System.out.println("Enter the Price:");
                smartphone.setPrice(inputUpdate.nextInt());
                System.out.println("Enter the Storage");
                smartphone.setStorage(inputUpdate.nextInt());

                return;
            }

        }
    System.out.println("Enter The correct model code");


    }
    static void deleteProduct(ArrayList<SmartphoneInventoryModel> data) //delete the product
    {
        Scanner inputDelete = new Scanner(System.in);
        System.out.println("Enter the model number:");
        String modelCode = inputDelete.nextLine();
        for(SmartphoneInventoryModel smartphone : data)
        {
            if(smartphone.getModelCode().equals(modelCode))
            {
                data.remove(smartphone);
                System.out.println("The Mobile Model Number is deleted");
            }
            else
            {
                System.out.println("Model Number not found.");
            }
        }
    }
    static void showInfo(ArrayList<SmartphoneInventoryModel> data)
    {
        Scanner info = new Scanner(System.in);
        System.out.println("Enter the model number you want to see info of:");
        String modelCode = info.nextLine();
        for (SmartphoneInventoryModel smartphone : data) {
            if (smartphone.getModelCode().equals(modelCode))
            {
                System.out.println("Model Number: " + smartphone.getModelCode());
                System.out.println("Name:" + smartphone.getName());
                System.out.println("Ram:" + smartphone.getRam());
                System.out.println("Display:" + smartphone.getDisplay());
                System.out.println("Price:" + smartphone.getPrice());
                System.out.println("Storage:" + smartphone.getStorage());
            }

        }
    }
}
