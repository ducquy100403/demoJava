package danhba;

public class DanhBa {
    private String Address;
    private String PhoneNumber;
    public DanhBa(String Address, String PhoneNumber)
    {
        this.Address = Address;
        this.PhoneNumber = PhoneNumber;
    }
    public String getAddress()
    {
        return Address;
    }

    public String getPhoneNumber()
    {
        return PhoneNumber;
    }

    public void setAddress(String Address)
    {
        this.Address = Address;
    }

    public void setPhoneNumber(String PhoneNumber)
    {
        this.PhoneNumber = PhoneNumber;
    }

    @Override
    public String toString()
    {
        return String.format("%30s %15s", Address, PhoneNumber);
    }
    public static DanhBa input()
    {
        System.out.print("Ten: ");
        new java.util.Scanner(System.in).nextLine();
        String Address = new java.util.Scanner(System.in).nextLine();
        System.out.print("So dien thoai: ");
        String PhoneNumber = new java.util.Scanner(System.in).nextLine();
        return new DanhBa(Address, PhoneNumber);
    }
}
