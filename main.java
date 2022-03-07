import java.util.*;
import java.lang.System;

public class main extends Thread{
    public static int threadInput = 0;
    public static boolean runningLake;
    public static boolean mixedCorrectly;
    public static void main(String[] args){
        boolean[] stageCompletion = {false, false, false, false};

        Scanner nines = new Scanner(System.in);
        System.out.println("(Press enter to progress story)");
        System.out.println("This week is not an ordinary week. You got fed up with in-person school, and this week you will finally put into action your master plan for returning to remote learning.");
        nines.nextLine();
        System.out.println("You heard that Washington Hospital recently admitted a patient with an oddly contagious but benign COVID variant. This variant will be the foundation of your scheme.");
        nines.nextLine();
        System.out.println("If you infect everyone at MSJ with a new strain of COVID-19, we will have to be sent home, and your hands will be perfectly clean as long as no one gets hurt right?");
        nines.nextLine();
        System.out.println("With your extensive puzzle solving, chemistry, and biology skills along with your ingenuity, you will travel around Fremont gathering materials and save everyone from in-person schooling once and for all!");
        nines.nextLine();
        System.out.println("Your first stop will naturally be Washington Hospital. You HAVE to take a closer look at that COVID sample.");
        
        stageCompletion[0] = hospital();

        System.out.println("You need some materials to modify the sample with, and what better place to visit than Pacific Commons. But first to get a ride...");
        nines.nextLine();

        stageCompletion[1] = pacificCommons();

        System.out.println("Lucky lucky, you found some money in the glove compartment and buy some greasy slices of Costco pizza along with your favorite milk tea with agar boba.");
        nines.nextLine();
        System.out.println("You remind yourself that you cannot eat all of your tasty goods, and instead head over to your next location.");
        nines.nextLine();

        runningLake = true;
        main thread = new main();
        thread.start();
        // had to circumvent code blocking by scanner while waiting for input somehow :/

        stageCompletion[2] = lakeElizabeth();

        System.out.println("After obtaining all the ingredients you need for your novel virus. You head over to MSJH and sneak into a chemistry classroom. You also obtained a few pieces of equipment from the neighboring biology lab.");
        nines.nextLine();
        System.out.println("All you need to do now is get started.");

        stageCompletion[3] = chemLab();

        if (stageCompletion[0] && stageCompletion[1] && stageCompletion[2] && stageCompletion[3]){
            System.out.println("Your mind overflows with possibilities of how best to spread your virus. The zoom meetings and asynchronous periods are almost within reach.");
            System.out.println("Your first step will be: \n1. Infecting the school lab rats with the virus and lettign them loose\n2. Contaminating the school plumbing system with the virus\n3. Infecting the teachers first");
            nines.nextLine();
            System.out.println("Devise and execute your cunning, genius plan in Disease Corp 2, coming soon!!!");
        }
    }

    public static boolean hospital(){
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

        System.out.println("You remember from the newspaper the name of the doctor responsible for the special patient and quickly find and enter her office.");
        nines.nextLine();
        System.out.println("It seems she keeps all her items stored on this shelf.");

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
                            System.out.println("You pull out the sample of COVID-19 and put carefully store it away on your person.");
                            System.out.println("Time to move on to the next location!");
                            enterCombo = false;
                            runHospital = false;
                            return true;
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
        return false;
    }

    public static boolean pacificCommons() {
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
                                        System.out.println("Congrats! You got the right combo!");
                                        steeringColor.show(true);
                                        tryGear = false;
                                        steeringWheel.show(false);
                                        roundOn = false;
                                        booleanPlay = false;
                                        return true;
                                    }
                                    else {
                                        System.out.println("Unfortunately, that's incorrect. Would you like to try again? (Y/N");
                                        String tryAgain = scan.nextLine();
                                        if (tryAgain.equals("Y")) {
                                            tryGear = true;
                                        }
                                        else {
                                            tryGear = false;
                                            return false;
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
        }
        return false;
    }

    public static boolean lakeElizabeth(){
        double nToSecs = 0.000000001;
        double currentTime;

        Image og2 = new Image("2PARK Original.jpg");
        Image og3 = new Image("3PARK Original.jpg");
        Image dogChase4 = new Image("4Park Dog Chase.jpg");
        Image dropBread5 = new Image("5PARK DROP BREAD.jpg");
        Image distributeBread6 = new Image("6Distribute bread.jpg");
        Image gooseEat7 = new Image("7Park Goose eat bread.jpg");
        Image getEgg8 = new Image("8Park get egg.jgp");
        Image og = new Image("Original_.jpg");
        Image bothLeave = new Image("Guy and dog leave.jpg");
        Image deathByGeese = new Image("Goose attack.jpg");
        Image fishermanLeaves = new Image("Fisherman leaves.jpg");
        Image fishermanFrisbee = new Image("Fisherman frisbee leaves.jpg");
        Image benchGuy = new Image("Bench guy leaves.jpg");
        Image catEat = new Image("Cat is eaten.jpg");

        boolean runLake = true;
        boolean reset = false;
        boolean resetFirst = true;
        double stage = 0;
        Image x = og;
        x.show(true);
        threadInput = 0;

        double timeFishFrisbee = 0;
        double timeDogChase = 0;
        double timeTossBread = 0;
        double timeReset = 0;

        Scanner nines = new Scanner(System.in);

        System.out.println("Your next destination is Lake Elizabeth. Enter anything to start your adventure!");
        nines.nextLine();

        long start = System.nanoTime();

        System.out.println("It's a sunny day out in the park, and you are looking for more materials to aid your quest in developing a new virus.");
        System.out.println("You already have a covid sample from the hospital and some ingredients from Pacific Commons.");
        System.out.println("Perhaps you need some material to incubate your virus with.");
        System.out.println();

        while(runLake){
            currentTime = nToSecs*(System.nanoTime() - start);

            if (!reset){
                if (currentTime > 25){
                    System.out.println("You took too long. While you busy were figuring out how to get to the egg, you didn't notice that the egg had disappeared.");
                    reset = true;
                }
                else if (currentTime - timeTossBread > 3 && stage == 6){
                    System.out.println("The geese all flock to the bread.");
                    x.show(false);
                    x = gooseEat7;
                    stage = 7;
                }
                else if (currentTime - timeDogChase > 1 && stage == 4){
                    System.out.println("The french guy is startled and drops his baguette. What a tragedy...");
                    x.show(false);
                    x = dropBread5;
                    stage = 5;
                }
                else if (currentTime - timeFishFrisbee > 3 && stage == 2){
                    System.out.println("The fisherman successfully retrieved the frisbee");
                    x.show(false);
                    x = og3;
                    stage = 3;
                    threadInput = 0;
                }
                else if (currentTime > 10 && stage == 0){
                    System.out.println("The fisherman catches a fish! He seems to be in good mood. You have an idea of how to get goose nest, but you need his help.");
                    stage = 1;
                    x.show(false);
                    x = og2;
                }
            }

            if (!reset){
                if (threadInput != 0){
                    x.show(false);

                    if (threadInput == 1){
                        if (stage < 4){
                            x = bothLeave;
                            System.out.println("The french guy gets offended that you tried to steal his baguette and leaves with his dog. How will you lure away the geese now?");
                            reset = true;
                        }
                        else if (stage == 4){
                            System.out.println("The french guy ran off to get his dog. You couldn't catch up to him.");
                        }
                        else if (stage == 5){
                            System.out.println("While the french guy is distracted, you pick up the dropped baguette. When you see that he is gone, you tear it up and toss the pieces all around you.");
                            timeTossBread = currentTime;
                            stage = 6;
                            x = distributeBread6;
                        }
                    }
                    else if (threadInput == 2){
                        if (stage < 7){
                            x = deathByGeese;
                            System.out.println("You have incured the wrath of the geese. You are incapacitated before you could obtain the egg.");
                            reset = true;
                        }
                        else{
                            System.out.println("This is your chance! You sprint to the abandoned nest, grab the egg, and hightail it out of the park.");
                            System.out.println("Congrats! You can move on to your next location.");
                            x = getEgg8;
                            runningLake = false;
                            return true;
                        }
                    }
                    else if (threadInput == 3){
                        if (stage == 0){
                            x = fishermanLeaves;
                            System.out.println("You disturbed the poor fisherman. He just wanted to catch a fish. I wonder what else he could grab with the fishing pole.");
                            reset = true;
                        }
                        else if (stage == 1){
                            System.out.println("You ask the fisherman to fish the frisbee from the tree. He happily complies.");
                            timeFishFrisbee = currentTime;
                            stage = 2;
                        }
                        else if (stage == 2){
                            x = fishermanFrisbee;
                            System.out.println("You nagged the fisherman too much before he could retrieve the frisbee, and he leaves.");
                            reset = true;
                        }
                        else if (stage == 3){
                            System.out.println("The fisherman gives you the frisbee, and you throw it across the park.");
                            System.out.println("The dog chases after the frisbee.");
                            timeDogChase = currentTime;
                            stage = 4;
                            x = dogChase4;
                        }
                    }
                    else if (threadInput == 4){
                        x = benchGuy;
                        System.out.println("You disturbed this guy's sunbathing. You leave out of embarrassment.");
                        reset = true;
                    }
                    else if (threadInput == 5 && stage < 4){
                        x = catEat;
                        System.out.println("Oh no, the dog caught the cat you scared out of the tree. Maybe you should have left it alone.You run from PETA.");
                        reset = true;
                    }
                    threadInput = 0;
                }
                x.show(true);
            }

            if (reset){
                if (resetFirst){
                    timeReset = currentTime;
                    System.out.println("You have failed. Try again!");
                    resetFirst = false;
                }

                if (currentTime - timeReset > 3){
                    x.show(false);
                    lakeElizabeth();
                }
            }
        }
        return false;
    }

    public static boolean chemLab(){
        Scanner console = new Scanner(System.in);
        System.out.println("Let's get mixing!");
        console.nextLine();
        System.out.println("Add in the ingredients in the correct order and mix it correctly. NOTE: It must be correct or else you will have a more deadly virus on your hands. Enter 7 if you want to finish up the sample.");
        System.out.print("1. Put the COVID sample into the centrifuge\n2. Fully mix the COVID sample\n3. Place the COVID sample into the incubator\n");
        System.out.println("4. Place the COVID sample into the goose egg\n5. Mix the COVID sample with Agar Boba\n6. Add pizza grease into the COVID sample\n7. Finish the COVID sample");
        boolean centri = false;
        boolean mixed = false;
        boolean incubated = false;
        boolean goose = false;
        boolean mixedAgar = false;
        boolean grease = false;
        int button = 0;
        int i = 0;
        int[] choice = new int[6];
        
        while (true) {
            System.out.println("Add in the ingredients in the correct order and mix it correctly. NOTE: It must be correct or else you will have a more deadly virus on your hands. Enter 7 if you want to finish up the sample.");
            System.out.print("1. Put the COVID sample into the centrifuge\n2. Fully mix the COVID sample\n3. Place the COVID sample into the incubator\n");
            System.out.println("4. Place the COVID sample into the goose egg\n5. Mix the COVID sample with Agar Boba\n6. Add pizza grease into the COVID sample\n7. Finish the COVID sample");
            int input = console.nextInt();
            if (input == 1) {
                if (centri) {
                    System.out.println("You already did that!");
                } else {
                    centri = true;
                    choice[i] = input;
                }
            } else if (input == 2) {
                if (mixed) {
                    System.out.println("You already did that!");
                } else {
                    mixed = true;
                    choice[i] = input;
                }
            } else if (input == 3) {
                if (incubated) {
                    System.out.println("You already did that!");
                } else if (goose) {
                    System.out.println("You: Wow, there's so many buttons. Which one should I press?");
                    System.out.println("1. 5x || 2. 10x || 3. 15x");
                    button = console.nextInt();
                    incubated = true;
                    choice[i] = input;
                } else {
                    System.out.println("You need to put the sample in a container!");
                }
            } else if (input == 4) {
                if (goose) {
                    System.out.println("You already did that!");
                } else {
                    goose = true;
                    choice[i] = input;
                }
            } else if (input == 5) {
                if (mixedAgar) {
                    System.out.println("You already did that!");
                } else {
                    mixedAgar = true;
                    choice[i] = input;
                }
            } else if (input == 6) {
                if (grease) {
                    System.out.println("You already did that!");
                } else {
                    grease = true;
                    choice[i] = input;
                }
            } else {
                for (int j = 0; j < choice.length; j++) {
                    if (choice[0] == 6) {
                        if (choice[1] == 1) {
                            if (choice[2] == 5) {
                                if (choice[3] == 4) {
                                    if (choice[4] == 3 && button == 2) {
                                        if (choice[5] == 2) {
                                            mixedCorrectly = true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                System.out.println("Success! You take out the vial containing an ultra virulent, highly nonlethal variant of COVID-19.");
                return true; 
            }
            i++;
        }
    }
    public void run(){
        Scanner nines = new Scanner(System.in);
        while(runningLake){
            try{
                if (nines.hasNext()){
                    threadInput = nines.nextInt();
                    nines.nextLine();
                }
                else{
                    threadInput = 0;
                }
            }
            catch (Exception e){
            }

        }
    }
}