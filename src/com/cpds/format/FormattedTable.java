/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cpds.format;

/**
 *
 * @author dml
 */
public class FormattedTable
{
    static void line() {
        System.out.println("-----------------------------------------------------------------");
    }

    static void printHeader() 
    {
        System.out.printf("%-15s \t %s \t %s \t %s \n",
                         "Player", "Matches", "Goals", "Goals per match");
    }
    
    static void printRow(String player, int matches, int goals) 
    {
        System.out.printf("%-15s \t %5d \t\t %d \t\t %.1f \n",
                          player, matches, goals, ((float)goals/(float)matches));
    }
    
    static void row(String player, int matches, int goals)
    {
        /*System.out.printf("%-15s \t %5d \t\t %d \t\t %.1f \n",
                         player,matches, goals, ((float)goals/(float)matches));*/
        
        //System.out.printf(null,player,matches, goals, ((float)goals/(float)matches));
    }

    public static void main(String[] str) 
    {
        FormattedTable.line();
        FormattedTable.printHeader();
        FormattedTable.line();
        row("David", 100, 122);
        FormattedTable.printRow("Demando", 100, 122);
        FormattedTable.printRow("Mushi", 80, 100);
        FormattedTable.printRow("Peale", 150, 180);
        FormattedTable.line();
    }

}
