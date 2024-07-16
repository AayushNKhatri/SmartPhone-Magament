package SmartphoneInventory;

public class SmartphoneInventoryModel {
    private String modelCode;
    private int ram;
    private float display;
    private int price;
    private int storage;

    private String name;


    public SmartphoneInventoryModel(String modelCode, int ram, float display, int price, int storage, String name)
    {
        this.modelCode = modelCode;
        this.ram = ram;
        this.display = display;
        this.price = price;
        this.storage = storage;
        this.name = name;
    }
    public void setModelCode(String modelCode)
    {
        this.modelCode = modelCode;
    }
    public String getModelCode()
    {
        return modelCode;
    }
    public void setRam(int ram)
    {
        this.ram = ram;
    }
    public  int getRam()
    {
        return ram;
    }
    public void setDisplay(float display)
    {
        this.display = display;
    }
    public float getDisplay()
    {
        return display;
    }
    public void setPrice(int price)
    {
        this.price = price;
    }
    public int getPrice()
    {
        return price;
    }
    public void setStorage(int storage)
    {
        this.storage = storage;
    }
    public int getStorage()
    {
        return storage;
    }
    public void setName(String name)
    {
        this.name= name;
    }
    public String getName()
    {
        return name;
    }

}
