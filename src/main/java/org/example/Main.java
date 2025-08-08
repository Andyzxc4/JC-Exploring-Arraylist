package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        /*
        Prediction:
            The output will first confirm that the list is empty (true). After adding three tasks,
             it will display the list contents — ["Secure the perimeter", "Establish communication",
             "Report status"] — and show that the number of tasks is 3.

        Observation:
            Is the list empty initially? true
            Current tasks: [Secure the perimeter, Establish communication, Report status]
            Number of tasks: 3
         */
        ArrayList<String> missionTasks = new ArrayList<>();

        System.out.println("Is the list empty initially? " + missionTasks.isEmpty());

        missionTasks.add("Secure the perimeter");
        missionTasks.add("Establish communication");
        missionTasks.add("Report status");

        System.out.println("Current tasks: " + missionTasks);
        System.out.println("Number of tasks: " + missionTasks.size());


        /*
        Prediction:
            The output will show the item at index 1 as Map. The list before modification will be
            [Compass, Map, Radio]. After replacing the first item (Compass) with GPS, the list will be
            [GPS, Map, Radio].

        Observation:
            Item at index 1: Map
            List before modification: [Compass, Map, Radio]
            List after modification: [GPS, Map, Radio]
         */
        ArrayList<String> equipment = new ArrayList<>();
        equipment.add("Compass");
        equipment.add("Map");
        equipment.add("Radio");

        String secondItem = equipment.get(1);
        System.out.println(" ");
        System.out.println("Item at index 1: " + secondItem);

        System.out.println("List before modification: " + equipment);

        equipment.set(0, "GPS");

        System.out.println("List after modification: " + equipment);


        /*
        Prediction:
            The output will show the list after insertion as [Primary Objective, Secondary Objective, Tertiary Objective].
            Removing the item at index 2 will display Removed objective: Tertiary Objective and leave the list as
            [Primary Objective, Secondary Objective]. After removing "Primary Objective" by object, the final list
            will be [Secondary Objective].

        Observation:
            List after insertion: [Primary Objective, Secondary Objective, Tertiary Objective]
            Removed objective: Tertiary Objective
            List after removing by index: [Primary Objective, Secondary Objective]
            List after removing by object: [Secondary Objective]
         */
        System.out.println(" ");
        ArrayList<String> objectives = new ArrayList<>();
        objectives.add("Primary Objective");
        objectives.add("Tertiary Objective");

        objectives.add(1, "Secondary Objective");
        System.out.println("List after insertion: " + objectives);

        String removedObjective = objectives.remove(2);
        System.out.println("Removed objective: " + removedObjective);
        System.out.println("List after removing by index: " + objectives);

        objectives.remove("Primary Objective");
        System.out.println("List after removing by object: " + objectives);


        /*
        Prediction:
            The output will indicate that the ArrayList contains "Bravo" by returning true from the contains() method.
            The indexOf() method will return 2 for "Charlie" since it is located at the third position (zero-based indexing).
            For "Delta", which is not present in the list, indexOf() will return -1, signaling that the element is absent.

        Observation:
            Does the list contain 'Bravo'? true
            Index of 'Charlie': 2
            Index of 'Delta': -1
         */
        System.out.println(" ");
        ArrayList<String> waypoints = new ArrayList<>();
        waypoints.add("Alpha");
        waypoints.add("Bravo");
        waypoints.add("Charlie");

        boolean hasBravo = waypoints.contains("Bravo");
        System.out.println("Does the list contain 'Bravo'? " + hasBravo);

        int indexOfCharlie = waypoints.indexOf("Charlie");
        System.out.println("Index of 'Charlie': " + indexOfCharlie);

        int indexOfDelta = waypoints.indexOf("Delta");
        System.out.println("Index of 'Delta': " + indexOfDelta);


       /*
        Prediction:
            The output will first display each squad role using an enhanced for-loop, iterating directly over the elements
            without indexing. It will then display the same roles using a standard for-loop, where each iteration retrieves
            the element by its index using get(i), showing both the index and the role.

        Observation:
            --- Using an Enhanced For-Loop ---
            Role: Leader
            Role: Medic
            Role: Engineer
            Role: Scout

            --- Using a Standard For-Loop with index ---
            Role at index 0: Leader
            Role at index 1: Medic
            Role at index 2: Engineer
            Role at index 3: Scout
         */
        ArrayList<String> squad = new ArrayList<>();
        squad.add("Leader");
        squad.add("Medic");
        squad.add("Engineer");
        squad.add("Scout");

        System.out.println(" ");
        System.out.println("--- Using an Enhanced For-Loop ---");
        for (String role : squad) {
            System.out.println("Role: " + role);
        }

        System.out.println("\n--- Using a Standard For-Loop with index ---");
        for (int i = 0; i < squad.size(); i++) {
            System.out.println("Role at index " + i + ": " + squad.get(i));
        }


        /*
        Prediction:
            The output will show that the `ArrayList` initially contains two intel entries, with a size of `2`,
            and will print their contents. After calling `clear()`, the size becomes `0`, `isEmpty()` returns `true`,
            and the list prints as `[]`, indicating it is now empty.

        Observation:
            Intel count before mission: 2
            Intel list: [Enemy position: Sector 4, Weakness: Power generator]

            Intel count after mission: 0
            Is the intel list empty now? true
            Intel list: []
         */
        System.out.println(" ");
        ArrayList<String> intel = new ArrayList<>();
        intel.add("Enemy position: Sector 4");
        intel.add("Weakness: Power generator");

        System.out.println("Intel count before mission: " + intel.size());
        System.out.println("Intel list: " + intel);

        intel.clear();

        System.out.println("\nIntel count after mission: " + intel.size());
        System.out.println("Is the intel list empty now? " + intel.isEmpty());
        System.out.println("Intel list: " + intel);

    }
}