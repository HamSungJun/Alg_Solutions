package Baekjoon.Lev_14;

import java.io.*;
import java.util.*;

public class Solution_10814 {

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in), 8192);

        List<Person> personList = new ArrayList<>();
        int N = Integer.parseInt(br.readLine());
        int joinCounter = 1;

        while (N-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            personList.add(new Person(age, name, joinCounter++));
        }

        Collections.sort(personList, new Comparator<Person>() {

            @Override
            public int compare(Person person_1, Person person_2) {

                int age_1 = person_1.getAge();
                int age_2 = person_2.getAge();

                if (age_1 > age_2) {
                    return 1;
                } else if (age_1 < age_2) {
                    return -1;
                }

                int joinOrder_1 = person_1.getJoinOrder();
                int joinOrder_2 = person_2.getJoinOrder();

                if (joinOrder_1 > joinOrder_2) {
                    return 1;
                } else if (joinOrder_1 < joinOrder_2) {
                    return -1;
                }

                return 0;

            }

        });

        for (int i = 0; i < personList.size(); i++) {
            Person nextPerson = personList.get(i);
            bw.write("" + nextPerson.getAge() + " " + nextPerson.getName());
            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();

    }

}
