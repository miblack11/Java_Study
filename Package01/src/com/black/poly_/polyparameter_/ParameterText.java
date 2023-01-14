package com.black.poly_.polyparameter_;

public class ParameterText {
    public static void main(String[] args) {
        Staff black = new Staff("black", 111111);
        Manager mike = new Manager("mike", 101010, 222000);
        ParameterText parameterText = new ParameterText();
        parameterText.showEmpAnnual(black);
        parameterText.testWork(black);
        parameterText.showEmpAnnual(mike);
        parameterText.testWork(mike);
    }
    public void showEmpAnnual(Employee e){
        System.out.println(e.getAnnual());
    }
    public void testWork( Employee employee){
        if(employee instanceof Staff ){
            ((Staff) employee).work();
        }else if (employee instanceof Manager){
            ((Manager) employee).manage();
        }else{

        }
    }
}
