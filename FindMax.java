package org.example;

public class FindMax{



        public static void main(String[] args) {

            Integer num1 = new Integer(15);
            Integer num2 = new Integer(13);
            Integer num3 = new Integer(17);
            FindMax object = new FindMax();
            System.out.println( object.findMax(num1, num2, num3));


        }

        public Integer findMax(Integer num1, Integer num2, Integer num3) {
            if(num1.compareTo(num2)>0) {
                if(num1.compareTo(num3)>0) {
                    return num1;
                }
                else return num3;
            }
            else if(num2.compareTo(num3)>0) {
                return num2;
            }
            else {
                return num3;
            }
        }
    }

