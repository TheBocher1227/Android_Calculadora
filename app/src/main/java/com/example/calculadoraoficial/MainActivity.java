package com.example.calculadoraoficial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView resultTextView;
    float number1=0.0f;
    float number2= 0.0f;
    String operation ="";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultTextView=findViewById(R.id.resultTextView);
    }



    public void Escribirpunto(View view){
        Float number1=Float.parseFloat(resultTextView.getText().toString());
        if (number1==0.0f){
            resultTextView.setText(".");
        }
        else {
            resultTextView.setText(resultTextView.getText() + ".");
        }
    }


    public void Escribir1(View view) {
       Float number1=Float.parseFloat(resultTextView.getText().toString());
        if (number1==0.0f){
            resultTextView.setText("1");
        }
        else {
            resultTextView.setText(resultTextView.getText() + "1");
        }
    }


    public void Escribir2(View view) {
        Float number1=Float.parseFloat(resultTextView.getText().toString());
        if (number1==0.0f){
            resultTextView.setText("2");
        }
        else {
            resultTextView.setText(resultTextView.getText() + "2");
        }
    }

    public void Escribir3(View view) {
        Float number1=Float.parseFloat(resultTextView.getText().toString());
        if (number1==0.0f){
            resultTextView.setText("3");
        }
        else {
            resultTextView.setText(resultTextView.getText() + "3");
        }
    }


    public void Escribir4(View view) {
        Float number1=Float.parseFloat(resultTextView.getText().toString());
        if (number1==0.0f){
            resultTextView.setText("4");
        }
        else {
            resultTextView.setText(resultTextView.getText() + "4");
        }
    }

    public void Escribir5(View view) {
        Float number1=Float.parseFloat(resultTextView.getText().toString());
        if (number1==0.0f){
            resultTextView.setText("5");
        }
        else {
            resultTextView.setText(resultTextView.getText() + "5");
        }
    }

    public void Escribir6(View view) {
        Float number1=Float.parseFloat(resultTextView.getText().toString());
        if (number1==0.0f){
            resultTextView.setText("6");
        }
        else {
            resultTextView.setText(resultTextView.getText() + "6");
        }
    }

    public void Escribir7(View view) {
        Float number1=Float.parseFloat(resultTextView.getText().toString());
        if (number1==0.0f){
            resultTextView.setText("7");
        }
        else {
            resultTextView.setText(resultTextView.getText() + "7");
        }
    }


    public void Escribir8(View view) {
        Float number1=Float.parseFloat(resultTextView.getText().toString());
        if (number1==0.0f){
            resultTextView.setText("8");
        }
        else {
            resultTextView.setText(resultTextView.getText() + "8");
        }
    }


    public void Escribir9(View view) {
        Float number1=Float.parseFloat(resultTextView.getText().toString());
        if (number1==0.0f){
            resultTextView.setText("9");
        }
        else {
            resultTextView.setText(resultTextView.getText() + "9");
        }
    }


    public void Escribir0(View view) {
        Float number1=Float.parseFloat(resultTextView.getText().toString());
        if (number1==0.0f){
            resultTextView.setText("0");
        }
        else {
            resultTextView.setText(resultTextView.getText() + "0");
        }
    }


    public void clear(View view) {
        resultTextView.setText("0");
        float number1=0.0f;
        float number2=0.0f;
        operation="";
    }


    public void Suma(View view ){
number1=Float.parseFloat(resultTextView.getText().toString());
operation="+";
        resultTextView.setText("0");

    }

    public void Dividir(View view ){
        number1=Float.parseFloat(resultTextView.getText().toString());
        operation="/";
        resultTextView.setText("0");

    }

    public void Multiplicar(View view ){
        number1=Float.parseFloat(resultTextView.getText().toString());
        operation="*";
        resultTextView.setText("0");

    }

    public void Restar(View view ){
        number1=Float.parseFloat(resultTextView.getText().toString());
        operation="-";
        resultTextView.setText("0");

    }
public void Igual(View view){
    number2=Float.parseFloat(resultTextView.getText().toString());
    if (operation.equals("/")){
    if (number2==0.0f){
        resultTextView.setText("0");
        Toast.makeText(this, "Operacion no Valida",Toast.LENGTH_LONG).show();
    }
    else {
        float result = number1 / number2;
        resultTextView.setText(result+"");
    }
    }

    if (operation.equals("+")){
        if (number2==0.0f){
            resultTextView.setText("0");
            Toast.makeText(this, "Operacion no Valida",Toast.LENGTH_LONG).show();
        }
        else {
            float result = number1 + number2;
            resultTextView.setText(result+"");
        }
    }


    if (operation.equals("-")){
        if (number2==0.0f){
            resultTextView.setText("0");
            Toast.makeText(this, "Operacion no Valida",Toast.LENGTH_LONG).show();
        }
        else {
            float result = number1 - number2;
            resultTextView.setText(result+"");
        }
    }



    if (operation.equals("*")){
        if (number2==0.0f){
            resultTextView.setText("0");
            Toast.makeText(this, "Operacion no Valida",Toast.LENGTH_LONG).show();
        }
        else {
            float result = number1 * number2;
            resultTextView.setText(result+"");
        }
    }




}


}



















