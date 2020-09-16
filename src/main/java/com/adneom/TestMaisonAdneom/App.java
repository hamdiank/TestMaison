package com.adneom.TestMaisonAdneom;

import java.util.Arrays;

import com.adneom.TestMaisonAdneom.exceptions.OperationsExceptions;
import com.adneom.TestMaisonAdneom.operations.Operations;


public class App 
{
    public static void main( String[] args ) throws OperationsExceptions
    {
    System.out.println(Operations.partition(Arrays.asList(1,2,3),1 ));	
    }
}
