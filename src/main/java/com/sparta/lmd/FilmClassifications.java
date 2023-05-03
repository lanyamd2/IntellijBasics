package com.sparta.lmd;

public class FilmClassifications {
    public static void main(String[] args) {
        System.out.println(availableClassifications(12));
    }
    public static String availableClassifications(int ageOfViewer)
    {
        String result ;

        if(ageOfViewer>0 && ageOfViewer<12){//8
            result = "U & PG films are available.";
        }
        else if (ageOfViewer >= 12 && ageOfViewer<15)//12
        {
            result = "U, PG, 12A & 12 films are available.";
        }
        else if (ageOfViewer >= 15 && ageOfViewer<18)
        {
            result = "U, PG, 12A, 12 & 15 films are available.";
        }
        else
        {
            result = "All films are available.";
        }
        return result;
    }
}
