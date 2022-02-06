

import java.util.*;

class patient1
{
    String name,illness,treatment;

    public patient1(String name, String illness, String treatment, int billAmount, String doctorName, String medicineName1) {
        this.name = name;
        this.illness = illness;
        this.treatment = treatment;
        this.billAmount = billAmount;
        this.doctorName = doctorName;
        this.medicineName1 = medicineName1;
    }

    int  billAmount;
    String doctorName;

    public String getDoctorName() {
        return doctorName;
    }

    @Override
    public String toString() {
        return "patient1{" +
                "name='" + name + '\'' +
                ", illness='" + illness + '\'' +
                ", treatment='" + treatment + '\'' +
                ", billAmount=" + billAmount +
                ", doctorName='" + doctorName + '\'' +
                ", medicineName1='" + medicineName1 + '\'' +
                '}';
    }

    public String getMedicineName1() {
        return medicineName1;
    }

    public void setMedicineName1(String medicineName1) {
        this.medicineName1 = medicineName1;
    }

    public patient1(String medicineName1) {
        this.medicineName1 = medicineName1;
    }

    String medicineName1;


    public patient1(String name, String illness, String treatment, int billAmount, String medicineName1) {
        this.name = name;
        this.illness = illness;
        this.treatment = treatment;
        this.billAmount = billAmount;
        this.medicineName1 = medicineName1;
    }

    public patient1(String name, String illness, String treatment, int billAmount) {
        this.name = name;
        this.illness = illness;
        this.treatment = treatment;
        this.billAmount = billAmount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIllness() {
        return illness;
    }

    public void setIllness(String illness) {
        this.illness = illness;
    }

    public String getTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }

    public int getBillAmount() {
        return billAmount;
    }

    public void setBillAmount(int billAmount) {
        this.billAmount = billAmount;
    }

}

class Doctor1
{
    String Name,Specialist;
    int InTime,OutTime;

    public Doctor1(String name, String specialist, int inTime, int outTime) {
        this.Name = name;
        this.Specialist = specialist;
        this.InTime = inTime;
        this.OutTime = outTime;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSpecialist() {
        return Specialist;
    }

    public void setSpecialist(String specialist) {
        Specialist = specialist;
    }

    public int getInTime() {
        return InTime;
    }

    public void setInTime(int inTime) {
        InTime = inTime;
    }

    public int getOutTime() {
        return OutTime;
    }

    public void setOutTime(int outTime) {
        OutTime = outTime;
    }

    @Override
    public String toString() {
        return " Doctor1{" +
                " Name='" + Name + '\'' +
                ", Specialist='" + Specialist + '\'' +
                ", InTime=" + InTime +
                ", OutTime=  " + OutTime +
                '}';
    }
}



public class HospitalArray {

    public static void main(String args[]) {

        List<patient1> c = new ArrayList<patient1>();
        List<Doctor1> d = new ArrayList<Doctor1>();
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);

        int choice=1;
        while(choice==1){
            System.out.println("  ");
            System.out.print(" 1.Patient Section");
            System.out.println(" 2.Doctor Section");
            System.out.print(" Enter Your Choice : ");
            choice = s.nextInt();
            switch (choice) {
                case 1:
                    int ch;


                    int s2 = 1;
                    while (s2 == 1) {
                        System.out.print(" 1.Add Entry(Insert) ");
                        System.out.print(" 2.Existing Patient List(Read) ");
                        System.out.println(" 3. Enter more Details ");
                        System.out.print(" Enter Your Choice : ");
                        ch = s.nextInt();
                        switch (ch) {
                            case 1:

                                System.out.print(" Name - ");
                                String name = s1.nextLine();
                                System.out.print(" Illness - ");
                                String illness = s1.nextLine();
                                System.out.print(" Treatment - ");
                                String treatment = s1.nextLine();
                                System.out.print(" Bill Amount - ");
                                int billAmount = s.nextInt();

                                c.add(new patient1(name, illness, treatment, billAmount));

                                break;

                            case 2:
                                System.out.println("----------Displaying Patient Data----------");
                                System.out.println(" ");
                                Iterator<patient1> i = c.iterator();
                                while (i.hasNext()) {
                                    patient1 e = i.next();
                                    System.out.println(e);
                                }
                                System.out.println(" ");
                                System.out.println("--------------End of the Data---------------");
                                break;

                            case 3:
                                System.out.println("-------Enter more Details--------");
                                System.out.println(" ");
                                System.out.println("Medicine Name");
                                String medicineName=s1.nextLine();
                                System.out.println("Doctor Name");
                                String doctorName=s1.nextLine();
                               // c.add(new patient1());
                                break;



                        }

                        System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                        s2 = s.nextInt();
                    }


                    break;


                case 2:

                    int ch1;
                    int s3 = 1;
                    while (s3 == 1) {
                        System.out.print(" 1.Add Entry(Insert) ");
                        System.out.println(" 2.Existing Doctor List(Read) ");
                        System.out.print(" Enter Your Choice : ");
                        ch1 = s.nextInt();
                        switch (ch1) {
                            case 1:

                                System.out.print(" Doctor Name - ");
                                String name = s1.nextLine();
                                System.out.print(" Specialist - ");
                                String specialist = s1.nextLine();
                                System.out.print(" In time - ");
                                int inTime = s.nextInt();
                                System.out.print(" Out Time - ");
                                int outTime = s.nextInt();

                                d.add(new Doctor1(name, specialist, inTime, outTime));

                                break;

                            case 2:
                                System.out.println("----------Displaying Doctor Data----------");
                                System.out.println(" ");
                                Iterator<Doctor1> i = d.iterator();
                                while (i.hasNext()) {
                                    Doctor1 e = i.next();
                                    System.out.println(e);
                                }
                                System.out.println(" ");
                                System.out.println("--------------End of the Data---------------");
                                break;


                        }
                        System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                        s3 = s.nextInt();
                    }


                    break;
            }

        }

        //00p-


    }
}

