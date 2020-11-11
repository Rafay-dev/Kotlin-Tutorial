package main.kotlin.CheezyCodeOOP.ObjectDeclaration;

import CheezyCodeOOP.ObjectDeclaration.ObjectInsideClass;

class JavaExample4 {
    public static void main(String[]args){
        // We cannot call the method 'h()' from 'companion object' with className reference here
        // because this method will not be treated as 'static' in our Java class

        // So we have to initialize '@JvmStatic' above this methods to make them 'Java static'

        ObjectInsideClass.h();

    }
}