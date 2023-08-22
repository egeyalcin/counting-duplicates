package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(duplicateCount("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZReturnsTwentySix"));
    }

    public static int duplicateCount(String text) {
        text = text.toLowerCase();
        String keep = "";
        String check = "";
        char[] array = text.toCharArray();
        int count = 0;
        for(int i = 0; i < array.length;i++) {
            if(keep.contains(Character.toString(array[i])) && !check.contains(Character.toString(array[i]))) {
                check+= Character.toString(array[i]);
                count++;
            }else {
                keep+=Character.toString(array[i]);
            }

        }
        return count;
    }
}