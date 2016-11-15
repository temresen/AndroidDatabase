package getcode.yemeksepeti;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AdminPage extends Activity
{

    public void onCreate(Bundle savedInstanceState)

    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.admin);
        Button button = (Button) findViewById(R.id.button);
        Button button1 = (Button) findViewById(R.id.button2);
        Button button2 = (Button) findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view)
            {
                Intent restaurant = new Intent(AdminPage.this, getcode.yemeksepeti.AdminRest.class);
                AdminPage.this.startActivity(restaurant);
            }
        });


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent food = new Intent(AdminPage.this, getcode.yemeksepeti.AdminFood.class);
                AdminPage.this.startActivity(food);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent customer = new Intent(AdminPage.this, getcode.yemeksepeti.Customers.class);
                AdminPage.this.startActivity(customer);
            }
        });
    }
}









