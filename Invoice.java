public class Invoice {
    private final String ID;
    private static long count = 1;
    private String name;
    private String company;
    double unitPrice;

    void setName(String name)
    {
        this.name = name;
    }
    void setCompany(String company)
    {
        this.company = company;
    }
    void setUnitPrice(double unitPrice)
    {
        this.unitPrice = unitPrice;
    }
    public Invoice(String name, String company, double unitPrice)
    {
        ID = String.format("00168%d",count++);
        setName(name);
        setCompany(company);
        setUnitPrice(unitPrice);
    }
    public String getID()
    {
        return ID;
    }
    public String getName()
    {
        return name;
    }
    public String getCompany()
    {
        return company;
    }




}
