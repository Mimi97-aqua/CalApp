package com.example.calapp;;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class HelloController {

    Float firstOperand = 0f; //// the f here tells the compiler to treat 0 as a single precision floating point number
    int operation = -1;


    @FXML
    private Button clear;

    @FXML
    private Button delete;

    @FXML
    private Button division;

    @FXML
    private Button eight;

    @FXML
    private Button equals;

    @FXML
    private Button five;

    @FXML
    private Button four;

    @FXML
    private Button minus;

    @FXML
    private Button modulo;

    @FXML
    private Button multiplication;

    @FXML
    private Button nine;

    @FXML
    private Button one;

    @FXML
    private Button plus;

    @FXML
    private Button point;

    @FXML
    private Button seven;

    @FXML
    private Button six;

    @FXML
    private TextField display;

    @FXML
    private TextField display2;

    @FXML
    private Button three;

    @FXML
    private Button two;

    @FXML
    private Button zero;

    @FXML
    private void onDeleteButtonPressed(ActionEvent event){
        if(event.getSource() == delete)
        {
            if(!display.getText().isEmpty())
                display.setText(display.getText().substring(0,display.getText().length()-1));
        }
    }

    @FXML
    void onButtonClick(ActionEvent event) {
        if (event.getSource() == one) { //if button pressed is one
            display.setText(display.getText() + "1"); //display number 1//
            display2.setText(display.getText());
        } else if (event.getSource() == two) {
            display.setText(display.getText() + "2");
            display2.setText(display.getText());
        } else if (event.getSource() == three) {
            display.setText(display.getText() + "3");
            display2.setText(display.getText());
        } else if (event.getSource() == four) {
            display.setText(display.getText() + "4");
            display2.setText(display.getText());
        } else if (event.getSource() == five) {
            display.setText(display.getText() + "5");
            display2.setText(display.getText());
        } else if (event.getSource() == six) {
            display.setText(display.getText() + "6");
            display2.setText(display.getText());
        } else if (event.getSource() == seven) {
            display.setText(display.getText() + "7");
            display2.setText(display.getText());
        } else if (event.getSource() == eight) {
            display.setText(display.getText() + "8");
            display2.setText(display.getText());
        } else if (event.getSource() == nine) {
            display.setText(display.getText() + "9");
            display2.setText(display.getText());
        } else if (event.getSource() == zero) {
            display.setText(display.getText() + "0");
        } else if (event.getSource() == clear) {
            display.setText(" ");
        } else if (event.getSource() == point) {
            display.setText(display.getText() + ".");
            display2.setText(display.getText());
        } else if (event.getSource() == plus) {
            firstOperand = Float.parseFloat(display.getText()); //takes a string from the text field and passes it to the data variable
            operation = 1; //addition
            display.setText("");
            display2.setText(display2.getText() + "+");
//            display2.setText(firstOperand + " + " );
        } else if (event.getSource() == minus) {
            firstOperand = Float.parseFloat(display.getText());
            operation = 2; //subtraction
            display.setText("");
            display2.setText(display2.getText() + "-");
//            display2.setText(firstOperand + " - " );
        } else if (event.getSource() == multiplication) {
            firstOperand = Float.parseFloat(display.getText());
            operation = 3;//multiplication
            display.setText("");
            display2.setText(display2.getText() + "*");
//            display2.setText(firstOperand + " * " );
        } else if (event.getSource() == division) {
            firstOperand = Float.parseFloat(display.getText());
            operation = 4; //division
            display.setText("");
            display2.setText(display2.getText() + "/");
//            display2.setText(firstOperand + " / " );
        } else if (event.getSource() == modulo) {
            firstOperand = Float.parseFloat(display.getText());
            operation = 5; //modulo
            display.setText("");
            display2.setText(display2.getText() + "mod");
//            display2.setText(firstOperand + " mod " );
            //display.setText(display.getText() + "mod");
        }else if (event.getSource() == equals) {
            Float secondOperand = Float.parseFloat(display.getText());
            switch (operation) {
                case 1: //addition
                    Float ans = firstOperand + secondOperand;
                    display.setText(String.valueOf(ans));
                    break;

                case 2: //subtraction
                    ans = firstOperand - secondOperand;
                    display.setText(String.valueOf(ans));
                    break;

                case 3: //multiplication
                    ans = firstOperand * secondOperand;
                    display.setText(String.valueOf(ans));
                    break;

                case 4: //division
                    //second operand here may be 0, so we use a try-catch method for handling exceptions
                    //try catch statement ie java throws an exception
                    try {
                        ans = firstOperand / secondOperand;
                        display.setText(String.valueOf(ans));
                        break;
                    } catch (Exception e) {
                        display.setText("Error");
                    }

                case 5: //modulo
                    int div = (int) (firstOperand / secondOperand);
                    ans = firstOperand - (div *  secondOperand);
                    display.setText(String.valueOf(ans));
            }
        }
    }
}






