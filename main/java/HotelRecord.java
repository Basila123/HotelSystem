
        import java.util.HashMap;
        import java.util.Scanner;
        import java.util.regex.Matcher;
        import java.util.regex.Pattern;
public class HotelRecord {
    public static void main(String[] args){

        System.out.println("Welcome to the Hotel BOOK");
        HashMap<Integer,Hotel> hotelBook = new HashMap<>();

        Hotel lakewood = new Hotel();
        Hotel ridgewood=new Hotel();
        Hotel bridgewood=new Hotel();

        hotelBook.put(1,lakewood);
        hotelBook.put(2,ridgewood);
        hotelBook.put(3,bridgewood);

    }
}

class Hotel {
    String employee,customerType,phoneNo,email,name ;
    public void setHotel(String name) {
        this.name = name;
    }


    public void setName(String employee) {
        this.employee = employee;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }



    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public void setEmployee(String phoneNo){
        this.phoneNo=phoneNo;
    }

    public void setContactInfo() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Hotel name");
        name=sc.nextLine();
        System.out.println("Enter Employee name");
        employee= sc.next();
        System.out.println("Enter phone number");
        phoneNo=sc.next();
        System.out.println("Enter email ");
        email=sc.next();

    }
    public boolean isFirstName(String name) {
        Pattern pattern = Pattern.compile("^[A-Z][a-z]{2,}");
        Matcher matcher = pattern.matcher(name);
        if (matcher.matches()) {
            return true;
        } else
            return false;
    }
    public void displayContactInfo() {
        System.out.print(name +" "+employee+" "+phoneNo+" "+email);
    }

}