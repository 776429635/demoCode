/**
 * Project Name:Demo
 * File Name:One.java
 * Package Name:Test
 * Date:2017��12��28������9:46:54
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package Test;

import java.util.Scanner;

/**
 * Description: <br/>
 * Date: 2017��12��28�� ����9:46:54 <br/>
 * 
 * @author l
 * @version
 * @see
 */
public class One {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("��������������:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("����������Ҫ���㷨,����+,��,*,/");

        String c = scanner.next();
        if (c.equals("+")) {

            System.out.println(a + b);
        }
            if (c == "-") {
                System.out.println(a - b);
            }
            if (c == "*") {
                System.out.println(a * b);
            }
            if (c == "/") {
                System.out.println(a / b);
            }
        
        scanner.close();
    }

}
