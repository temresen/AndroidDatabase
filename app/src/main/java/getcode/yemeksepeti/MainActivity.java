package getcode.yemeksepeti;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends Activity {
   private Button rest, admin, orders;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.anasayfa);
        rest = (Button) findViewById(R.id.rest);
        admin = (Button) findViewById(R.id.admin);
        orders = (Button) findViewById(R.id.orders);

        rest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent restaurant = new Intent(MainActivity.this, getcode.yemeksepeti.Restaurant.class);
                MainActivity.this.startActivity(restaurant);
            }
        });

        admin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent admin = new Intent(MainActivity.this, getcode.yemeksepeti.AdminPage.class);
                MainActivity.this.startActivity(admin);
            }
        });

        orders.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent order = new Intent(MainActivity.this, getcode.yemeksepeti.Orders.class);
                MainActivity.this.startActivity(order);
            }
        });

    }
}
