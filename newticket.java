import java.util.Scanner;

public class newticket {
    public static void main(String [] agrs) {
        Scanner my = new Scanner(System.in);
        System.out.println("welcome to myshow tickects");
        System.out.println("1 :Amigos" + "\n2 :Waltair Veerayya" + "\n3 :Writer Padmabhushan");
        System.out.print("select moive :");
        String Moive_name = my.nextLine();

        String Ther_name;
        if (((Moive_name.equals("Amigos")) || (Moive_name.equals("1"))) ||
                (((Moive_name.equals("Waltair Veerayya")) || (Moive_name.equals("2")))) ||
                ((Moive_name.equals("Writer Padmabhushan")) || (Moive_name.equals("3")))) {


            if ((Moive_name.equals("Amigos")) || (Moive_name.equals("1"))) {
                System.out.println("your selected Amigos Moive");
                System.out.println("1 :Inox Ncs Mall" + "\n2 :Sri Leela Mahal A/c DTS" + "\n3 :Sri Srinivasa Mahal A/c Dolby");
                System.out.print("Select  a theratre :");
                Ther_name = my.nextLine();
                if ((Ther_name.equals("Inox Ncs Mall")) || (Ther_name.equals("1"))) {

                    System.out.println("your selected Inox Ncs Mall theatre");
                } else if ((Ther_name.equals("Sri Leela Mahal A/c DTS")) || (Ther_name.equals("2"))) {
                    System.out.println("your selected Sri Leela Mahal A/c DTS theatre");
                } else if ((Ther_name.equals("Sri Srinivasa Mahal A/c Dolby")) || (Ther_name.equals("3"))) {

                    System.out.println("your selected Sri Srinivasa Mahal A/c Dolby theatre");
                } else {
                    System.out.println("your selected theatre is not they");
                }
            }
            if ((Moive_name.equals("Waltair Veerayya")) || (Moive_name.equals("2"))) {
                System.out.println("you selected Waltair verrayya Moive");
                System.out.println("1 :Inox Ncs Mall" + "\n2 :Ncs AC 4K Dolby Atmos" + "\n3 :Sri Venkateswara A/c Dolby Dts");
                System.out.print("Select  a theratre :");
                Ther_name = my.nextLine();

                if ((Ther_name.equals("Inox Ncs Mall")) || (Ther_name.equals("1"))) {
                    System.out.println("your selected Inox Ncs Mall theatre");
                } else if ((Ther_name.equals("Ncs AC 4K Dolby Atmos")) || (Ther_name.equals("2"))) {
                    System.out.println("your selected Ncs AC 4K Dolby Atmos theatre");
                } else if ((Ther_name.equals("Sri Venkateswara A/c Dolby Dts theatre")) || (Ther_name.equals("3"))) {
                    System.out.println("your selected Sri Venkateswara A/c Dolby Dts theatre");
                } else {
                    System.out.println("your selected theatre is not they");
                }
            }
            if ((Moive_name.equals("Writer Padmabhushan")) || (Moive_name.equals("3"))) {

                System.out.println("you selected Writer Padmabhushan Moive");
                System.out.println("1 :Inox Ncs Mall");
                System.out.print("Select  a theratre :");
                Ther_name = my.nextLine();
                if ((Ther_name.equals("Inox Ncs Mall")) || (Ther_name.equals("1"))) {

                    System.out.println("your selected Inox Ncs Mall theatre");
                } else {
                    System.out.println("your selected theatre is not they");
                }
            }


            System.out.print("Enter you Name :");
            String name = my.nextLine();
            char chose = 'y';
            while (chose == 'y') {
                System.out.println("Max 4 tickects book at a time");
                System.out.print("how many tickects do you want :");
                int a = my.nextInt();
                int b = 112;
                double Igst = 12.60;
                double d = a * Igst;
                int c = a * b;
                double total = c + d;
                if (a <= 5) {
                    System.out.println("Ticket Amount :" + c);
                    System.out.println("Gst Amount per tickect :" + Igst);
                    System.out.println("Toatl Amount :" + total);
                    System.out.print("pay the Toatl Amount : ");


                } else if (a >= 6) {
                    System.out.println("your trying to book more than 4 ticktes ...! At a time you can book 4 ticktes only...");
                }
                double pay = my.nextDouble();
                if (total == pay) {
                    System.out.println("your payment is succesfull" + " " + name + " " + "your" + " " + a + " " + "tickets are booked");
                } else if (total <= pay) {
                    System.out.println("your are paying more than total Amount...! And your Total Amount :" + total);
                } else if (total >= pay) {
                    System.out.println("Your balance is less then Total Amount...! And your Total Amount :" + total);

                }
                System.out.print("If you want to book Again tickects press Y Else N ");
                char y = my.next().charAt(0);
                chose = y;
                if (y == 'N') {
                    break;
                }
            }
        }
        else{
            System.out.println("your select moive is not they...! please select correct moive...!");
        }


        }
    }


