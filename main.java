import java.util.*;
public class main  {
    public static void main(String[] args){
        hospital();
        pacificCommons();
    }

    public static void hospital(){
        Scanner nines = new Scanner(System.in);

        Image pill = new Image("pill bottle.png");
        Image bear = new Image("teddy bear.png");
        Image masks = new Image("masks.png");
        Image cylinder = new Image("graduated cylinder.png");
        Image sanitizer = new Image("hand sanitizer.png");
        Image hospitalShelf = new Image("hospital shelf.png");
        Image syrup = new Image("syrup bottle.png");
        Image mug = new Image("#1 Mug.png");
        Image ointment = new Image("ointment.png");
        Image safe = new Image("safe.png");
        Image bag = new Image("paper bag.png");

        boolean runHospital = true;
        boolean enterCombo = true;
        boolean rightCombo = true;
        String guess;
        int slotCount = 1;
        hospitalShelf.show(true);

        int input;
        int input2;

        while (runHospital){
            System.out.println("Select an object to view");
            input = nines.nextInt();
            nines.nextLine();

            if (input == 1){
                System.out.println("A pill bottle:\nFull of yellow tablets with an odd perscription.");
                pill.show(true);
            }
            else if (input == 2){
                System.out.println("A box of masks:\nSingle-use, surgical mask with three layers.");
                masks.show(true);
            }
            else if (input == 3){
                System.out.println("A bottle of hand sanitizer:\nPurell advanced hand sanitizer 70% alcohol.");
                sanitizer.show(true);
            }
            else if (input == 4){
                System.out.println("A teddy bear:\nSlightly worn, well-loved.");
                bear.show(true);
            }
            else if (input == 5){
                System.out.println("A graduated cylinder:\nSeems to contain a viscous yellow liquid.");
                cylinder.show(true);
            }
            else if (input == 6){
                System.out.println("A plastic bottle:\nYou shake it. It is empty.");
                syrup.show(true);
            }
            else if (input == 7){
                System.out.println("A tube of ointment:\n9 oz large size tube.");
                ointment.show(true);
            }
            else if (input == 8){
                System.out.println("A mug:\nSays #1 boss. The coffee is still warm.");
                mug.show(true);
            }
            else if (input == 9){
                System.out.println("Pharmacy bag:\nNote says \"FOR PICKUP\"\nPerscription:\n1. Pills\n2. Ointment\n3. Cough Syrup");
                bag.show(true);
            }
            else if (input == 10){
                System.out.println("Locked cabinet:\nWhat you're looking for might be in this safe. Its door has three slots and is covered with drawings of shapes.");
                safe.show(true);
                System.out.println("Input code? Y/N");
                while(enterCombo){
                    String enter = nines.nextLine();
                    if (enter.equals("Y")){
                        while(slotCount <= 3){
                            System.out.println("Slot " + slotCount + ": ___");
                            guess = nines.nextLine();
                            if ((slotCount == 1 && (!guess.equals("triangle") && !guess.equals("trigon")))
                                || (slotCount == 2 && (!guess.equals("nonagon") && !guess.equals("enneagon") && !guess.equals("9-gon")))
                                || (slotCount == 3 && (!guess.equals("hexadecagon") && !guess.equals("hexakaidecagon") && !guess.equals("16-gon")))){
                                rightCombo = false;
                            }
                            slotCount++;
                        }
                        if (rightCombo){
                            System.out.println("Success! The safe door swings open.");
                            System.out.println("You pull out a vial containing a highly virulent sample of COVID-19 and put carefully store it away on your person. ");
                            System.out.println("Time to move on to the next location!");
                            enterCombo = false;
                            runHospital = false;
                        }
                        else{
                            System.out.println("The door doesn't budge.\nTry again? Y/N");
                        }
                        slotCount = 1;
                        rightCombo = true;
                    }
                    else{
                        enterCombo = false;
                    }
                }
            }

            System.out.println("Press 1 to exit");
            input2 = nines.nextInt();
            nines.nextLine();

            if (input2 == 1){
                input = 0;
                bear.show(false);
                pill.show(false);
                cylinder.show(false);
                sanitizer.show(false);
                masks.show(false);
                syrup.show(false);
                ointment.show(false);
                mug.show(false);
                bag.show(false);
                safe.show(false);
            }
        }
    }

    public static void pacificCommons() {
        Scanner scan = new Scanner(System.in);
        Image parkingLot = new Image("Parking Lot.png");
        Image dashboard = new Image("1Dashboard.png");
        Image car1 = new Image("Car 1.png");
        Image car2 = new Image("Car 2.png");
        Image car3 = new Image("Car 3.png");
        Image gear = new Image("gear.png");
        Image gear1 = new Image("gear1.png");
        Image gear2 = new Image("gear2.png");
        Image gear3 = new Image("gear3.png");
        Image gearFinished = new Image("gear finished.png");
        Image checklist = new Image("checklist.png");
        Image mirror = new Image("mirror.png");
        Image key = new Image("key.png");
        Image steeringWheel = new Image("steering wheel.png");
        Image vent = new Image("vent.png");
        Image parkingBrake = new Image("parking brake.png");
        Image steeringColor = new Image("steering color.png");
        
        boolean roundOn = true;
        int input;
        int input2;
        int input3;

        parkingLot.show(true);
        while (roundOn) {
            System.out.println("Select a car to view (1 for left, 2 for center, 3 for right");
            input = scan.nextInt();
            scan.nextLine();
            // boolean cars = true;
            // while (cars) {
                if (input == 1){
                    System.out.println("Interesting ... a random yellow car.");
                    car1.show(true);
                    System.out.println("Do you want to enter the car? (Y/N)");
                    String enter = scan.nextLine();
                    if (enter.equals("Y")) {
                        dashboard.show(true);
                        boolean booleanPlay = true;
                        while (booleanPlay) {
                            System.out.println("Select an object to view");
                            input3 = scan.nextInt();
                            scan.nextLine();

                            if (input3 == 1){
                                gear.show(true);
                                System.out.println("The car gear ... would you like to try moving it 3 times? (Y/N)");
                                String move = scan.nextLine();
                                if (move.equals("Y")) {
                                    boolean tryGear = true;
                                    while (tryGear) {
                                        System.out.println("Enter your first number");
                                        int first = scan.nextInt();
                                        scan.nextLine();
                                        if (first == 1) {
                                            gear1.show(true);
                                            gear2.show(false);
                                            gear3.show(false);
                                        }
                                        else if (first == 2) {
                                            gear2.show(true);
                                            gear1.show(false);
                                            gear3.show(false);
                                        }
                                        else if (first == 3) {
                                            gear3.show(true);
                                            gear2.show(false);
                                            gear1.show(false);
                                        }
                                        System.out.println("Enter your second number");
                                        int second = scan.nextInt();
                                        scan.nextLine();
                                        if (second == 1) {
                                            gear1.show(true);
                                            gear2.show(false);
                                            gear3.show(false);
                                        }
                                        else if (second == 2) {
                                            gear2.show(true);
                                            gear1.show(false);
                                            gear3.show(false);
                                        }
                                        else if (second == 3) {
                                            gear3.show(true);
                                            gear2.show(false);
                                            gear1.show(false);
                                        }
                                        System.out.println("Enter your third number");
                                        int third = scan.nextInt();
                                        scan.nextLine();
                                        if (third == 1) {
                                            gear1.show(true);
                                            gear2.show(false);
                                            gear3.show(false);
                                        }
                                        else if (third == 2) {
                                            gear2.show(true);
                                            gear1.show(false);
                                            gear3.show(false);
                                        }
                                        else if (third == 3) {
                                            gear3.show(true);
                                            gear2.show(false);
                                            gear1.show(false);
                                        }
                                        if (first == 2 && second == 1 && third == 3) {
                                            System.out.println("Congrats! You got the right combo!");
                                            gearFinished.show(true);
                                            tryGear = false;
                                            gear.show(false);
                                        }
                                        else {
                                            System.out.println("Unfortunately, that's incorrect. Would you like to try again? (Y/N");
                                            String tryAgain = scan.nextLine();
                                            if (tryAgain.equals("Y")) {
                                                tryGear = true;
                                            }
                                            else {
                                                tryGear = false;
                                                gear.show(false);
                                            }
                                        }
                                    }
                                }
                            }
                            else if (input3 == 2){
                                System.out.println("Wow! A checklist... how interesting");
                                checklist.show(true);
                            }
                            else if (input3 == 3) {
                                System.out.println("A very unique-looking rearview mirror .... hmmm");
                                mirror.show(true);
                            }
                            else if (input3 == 4) {
                                System.out.println("A keyhole with a keychain hanging from it! Super cool!");
                                key.show(true);
                            }
                            else if (input3 == 5) {
                                System.out.println("Gotta use the steering wheel in order to drive! Also a very interesting color-combo lock... Would you like to try your hand at the color combo? (Y/N)");
                                steeringWheel.show(true);
                                String move = scan.nextLine();
                                if (move.equals("Y")) {
                                    boolean tryGear = true;
                                    while (tryGear) {
                                        System.out.println("Enter your first color (all lowercase letters)");
                                        String first = scan.nextLine();
                                        System.out.println("Enter your second color (all lowercase letters)");
                                        String second = scan.nextLine();
                                        System.out.println("Enter your third color (all lowercase letters)");
                                        String third = scan.nextLine();

                                        if (first.equals("green") && second.equals("purple") && third.equals("red")) {
                                            System.out.println("Congrats! You got the right combo and can move on to the next location!");
                                            steeringColor.show(true);
                                            tryGear = false;
                                            steeringWheel.show(false);
                                            roundOn = false;
                                            booleanPlay = false;
                                        }
                                        else {
                                            System.out.println("Unfortunately, that's incorrect. Would you like to try again? (Y/N");
                                            String tryAgain = scan.nextLine();
                                            if (tryAgain.equals("Y")) {
                                                tryGear = true;
                                            }
                                            else {
                                                tryGear = false;
                                            }
                                        }
                                    }
                                }
                            }
                            else if (input3 == 6) {
                                System.out.println("A vent. haha imposter");
                                vent.show(true);
                            }
                            else if (input3 == 7) {
                                System.out.println("A very boring-looking parking brake");
                                parkingBrake.show(true);
                            }

                            System.out.println("Press 1 to exit");
                            input2 = scan.nextInt();
                            scan.nextLine();

                            if (input2 == 1){
                                input = 0;
                                gear.show(false);
                                gear1.show(false);
                                gear2.show(false);
                                gear3.show(false);
                                gearFinished.show(false);
                                checklist.show(false);
                                mirror.show(false);
                                steeringWheel.show(false);
                                steeringColor.show(false);
                                key.show(false);
                                vent.show(false);
                                parkingBrake.show(false);
                            }
                        }
                    }
                }
                else if (input == 2){
                    System.out.println("A random green car???");
                    car2.show(true);
                }
                else if (input == 3) {
                    System.out.println("Woooo a police car ... rip why u trying to break into police car...");
                    car3.show(true);
                }

                System.out.println("Press 1 to exit");
                input2 = scan.nextInt();
                scan.nextLine();

                if (input2 == 1){
                    input = 0;
                    car1.show(false);
                    car2.show(false);
                    car3.show(false);
                }
            // }
        }
    }
}