package com.example.android.justjava1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import java.text.NumberFormat ;
/**
 * This app displays an order form to order coffee.
 */
public class MainActivity2 extends AppCompatActivity {

     int q = 2 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        int price = calculatePrice() ;
        String priceMessage = "Name: Arpan\n" + "Quantity: " + q + "\n" + "Cost: " + price + "\n" + "Thank You" ;
        displayMessage(priceMessage);
    }

    public void increment(View view){
        q = q + 1 ;
        display(q) ;
    }
    public void decrement(View view){
        q = q - 1 ;
        display(q);
    }
    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }



    private void displayMessage(String message) {
        TextView orderSummaryTextView = (TextView) findViewById(R.id.order_summary_text_view);
        orderSummaryTextView.setText(message);
    }
    private int calculatePrice()
    {
        int price = q*5 ;
        return price ;
    }
}