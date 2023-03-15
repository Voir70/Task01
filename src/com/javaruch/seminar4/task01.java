package com.javaruch.seminar4;

// 1) Замерьте время, за которое в ArrayList добавятся 100000 элементов.
// 2) Замерьте время, за которое в LinkedList добавятся 100000 элементов.
//  Сравните с предыдущим.
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class task01 {

    public static void main(String[] args) throws IOException {

//          ArrayList<Integer> arr = new ArrayList();
//          long time = System.currentTimeMillis();
//          for (int i=0;  i<=100000; i++){
//             arr.add(i);


//          }
//          long time2 = System.currentTimeMillis();
//          int result = (int)(time2 - time);
//          System.out.println("Time is for ArrayList: " + result + "ms.");

//          LinkedList<Integer> list = new LinkedList();
//          long timeList = System.currentTimeMillis();
//          for (int i=0;  i<=100000; i++){
//             list.add(i);


//          }
//          long timeList2 = System.currentTimeMillis();
//          long resultList = timeList2 - timeList;
//          System.out.println("Time is for LinkedList: " + resultList + "ms.");
//     }

// }

//           ArrayList<Integer> arr = new ArrayList();
//           long time = System.currentTimeMillis();
//           for (int i = 0; i <= 1000000; i++) {
//              arr.add(0, i);

//           }
//           long time2 = System.currentTimeMillis();
//           int result = (int)(time2 - time);

//           System.out.println("Time for ArrayList: " + result + "ms.");

//           LinkedList<Integer> list = new LinkedList<>();
//           long timeList = System.currentTimeMillis();

//           for (int i = 0; i <= 1000000; i++) {
//              list.add(0, i);

//           }

//           long timeList2 = System.currentTimeMillis();
//           long resultList = timeList2 - timeList;

//           System.out.println("Time is for LinkedList: " + resultList + "ms.");
//     }
// }

//Реализовать консольное приложение, которое:

// 1. Принимает от пользователя строку


// 2. сохранить text в связный список.
// 3. Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.

// ввод asd
// [asd]
// ввод fdhg
// [asd, fdhg]
// ввод fvgh
// [asd, fdhg, fvgh]
// print~1
// вывод fdhg
// [asd, fvgh]

//            Scanner scan_line = new Scanner(System.in);
//            LinkedList<String> arr_list = new LinkedList<>();
//
//            while (true) {
//                System.out.println(arr_list);
//                System.out.print("Введите текст: ");
//                String text = scan_line.next();
//                if (text.contains("print~")) {
//                    int remove_idx = Integer.parseInt(text.split("~")[1]);
//                    try {
//                        System.out.println(arr_list.get(remove_idx));
//                        arr_list.remove(remove_idx);
//                    } catch (IndexOutOfBoundsException e) {
//                        System.out.println(e.getMessage());
//                    }
//                }
//                else {
//                    arr_list.add(text);
//                }
//            }
//
//        }
//}

//Реализовать консольное приложение, которое:
//        1. Принимает от пользователя и “запоминает” строки.
//        2. Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.

//        Scanner scan_line = new Scanner(System.in);
//        Stack<String> arr_list = new Stack<>();
//        String text = "";
//        while (!text.contains("print")) {
//            System.out.println(arr_list);
//            System.out.print("Введите текст: ");
//            text = scan_line.next();
//            if (text.contains("print")) {
//                while (!arr_list.isEmpty())
//                    System.out.print(arr_list.pop());
//            } else {
//                arr_list.push(text);
//            }
//        }
//    }
//}


        BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
        String tempIn = "";

        Deque<String> list1 = new LinkedList<>();
        for (int i = 0; ; i++) {
            tempIn = reader1.readLine();
            if (tempIn.equals("print")) {
                while (!list1.isEmpty()) {
                    System.out.println(list1.pollLast());
                }
                break;
            } else list1.add(tempIn);
        }
    }
}

//outString.append((full[0][1]).replace("\"", "")); чтоб убрать кавычки,к этой задаче не относится