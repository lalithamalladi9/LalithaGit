package interdemo;

public class Vendor implements PersonalDetails,EducationDetails{

@Override
public void acceptName() {
	System.out.println("Vendor name details ");
	System.out.println("salary is "+PersonalDetails.salary);
}

@Override
public void acceptAddress() {
	System.out.println("Vendor address");
}

@Override
public void acceptMobile() {
// TODO Auto-generated method stub

}

@Override
public void gradDetails() {
	System.out.println("Vendor grad details ");
}

@Override
public void postGradDetails() {
// TODO Auto-generated method stub

}



}