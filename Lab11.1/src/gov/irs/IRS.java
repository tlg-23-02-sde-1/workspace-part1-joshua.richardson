/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */
 
package gov.irs;

import com.hr.personnel.Employee;

import java.util.Collection;

/**
 * The IRS maintains a collection of TaxPayers and collects taxes from them.
 *
 * Note the interface type TaxPayer, used throughout the class.
 */
public class IRS {
    // what types of objects can this array contain?

    private Collection<TaxPayer> payers;
    private int currentIndex = 0;  // for dealing with the array


    
    // helper method to add a TaxPayer to the array
    // what types of objects can be passed to this method?
    public void register(TaxPayer payer) {
        payers.add(payer);
    }

    public void collectTaxes(){
        for (TaxPayer taxee : payers){
            //added in 9.2
            double deduction = taxee.getStandardDeduction();
            System.out.println("Tax payer's deduction is: " + deduction);

            // In-class work with fileReturn()
//            payers[i].fileReturn();
            taxee.payTaxes();

            System.out.println();
        }
    }
}