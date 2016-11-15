package getcode.yemeksepeti;

import android.app.Activity;
import android.os.Bundle;
import android.os.StrictMode;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class AdminRest extends Activity
{

    StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();

    public void onCreate(Bundle savedInstanceState)

    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.adminrest);
        Button button = (Button) findViewById(R.id.add);
        Button button1 = (Button) findViewById(R.id.delete);
        button.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view)
            {

                String result = null;
                InputStream is = null;
                EditText editText = (EditText)findViewById(R.id.editText);
                String v1 = editText.getText().toString();
                EditText editText1 = (EditText)findViewById(R.id.editText2);
                String v2 = editText1.getText().toString();
                EditText editText2 = (EditText)findViewById(R.id.editText3);
                String v3 = editText2.getText().toString();
                EditText editText3 = (EditText)findViewById(R.id.editText4);
                String v4 = editText.getText().toString();
                EditText editText4 = (EditText)findViewById(R.id.editText5);
                String v5 = editText1.getText().toString();
                EditText editText5 = (EditText)findViewById(R.id.editText6);
                String v6 = editText2.getText().toString();
                EditText editText6 = (EditText)findViewById(R.id.editText7);
                String v7 = editText.getText().toString();
                EditText editText7 = (EditText)findViewById(R.id.editText8);
                String v8 = editText1.getText().toString();
                EditText editText8 = (EditText)findViewById(R.id.editText9);
                String v9 = editText2.getText().toString();
                ArrayList<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>();

                nameValuePairs.add(new BasicNameValuePair("R_ID",v1));
                nameValuePairs.add(new BasicNameValuePair("R_NAME",v2));
                nameValuePairs.add(new BasicNameValuePair("R_OWNER",v3));
                nameValuePairs.add(new BasicNameValuePair("R_PHONE",v4));
                nameValuePairs.add(new BasicNameValuePair("R_RATING",v5));
                nameValuePairs.add(new BasicNameValuePair("R_LOCATION",v6));
                nameValuePairs.add(new BasicNameValuePair("R_TYPE",v7));
                nameValuePairs.add(new BasicNameValuePair("R_RADIUS",v8));
                nameValuePairs.add(new BasicNameValuePair("R_ADRESS",v9));

                StrictMode.setThreadPolicy(policy);



                try{
                    HttpClient httpclient = new DefaultHttpClient();
                    HttpPost httppost = new HttpPost("http://ghyazilim.me/addrest.php");
                    httppost.setEntity(new UrlEncodedFormEntity(nameValuePairs));
                    HttpResponse response = httpclient.execute(httppost);
                    HttpEntity entity = response.getEntity();
                    is = entity.getContent();

                    Log.e("log_tag", "connection success ");
                    Toast.makeText(getApplicationContext(), "ADDED", Toast.LENGTH_SHORT).show();
                }


                catch(Exception e)
                {
                    Log.e("log_tag", "Error in http connection "+e.toString());
                    Toast.makeText(getApplicationContext(), "Connection fail",                                        Toast.LENGTH_SHORT).show();

                }
                //convert response to string
                try{
                    BufferedReader reader = new BufferedReader(new InputStreamReader(is,"iso-8859-1"),8);
                    StringBuilder sb = new StringBuilder();
                    String line = null;
                    while ((line = reader.readLine()) != null)
                    {

                    }
                    is.close();

                    result=sb.toString();
                }
                catch(Exception e)
                {
                    Log.e("log_tag", "Error converting result "+e.toString());
                }


                try{

                    JSONObject json_data = new JSONObject(result);

                    CharSequence w= (CharSequence) json_data.get("re");

                    Toast.makeText(getApplicationContext(), w, Toast.LENGTH_SHORT).show();


                }
                catch(JSONException e)
                {
                    Log.e("log_tag", "Error parsing data "+e.toString());
                    Toast.makeText(getApplicationContext(), "JsonArray fail", Toast.LENGTH_SHORT).show();
                }



            }
        });




        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String result = null;
                InputStream is = null;



                EditText editText = (EditText)findViewById(R.id.editText);
                String v1 = editText.getText().toString();
                EditText editText1 = (EditText)findViewById(R.id.editText2);
                String v2 = editText1.getText().toString();
                EditText editText2 = (EditText)findViewById(R.id.editText3);
                String v3 = editText2.getText().toString();
                EditText editText3 = (EditText)findViewById(R.id.editText4);
                String v4 = editText3.getText().toString();
                EditText editText4 = (EditText)findViewById(R.id.editText5);
                String v5 = editText4.getText().toString();
                EditText editText5 = (EditText)findViewById(R.id.editText6);
                String v6 = editText5.getText().toString();
                EditText editText6 = (EditText)findViewById(R.id.editText7);
                String v7 = editText6.getText().toString();
                EditText editText7 = (EditText)findViewById(R.id.editText8);
                String v8 = editText7.getText().toString();
                EditText editText8 = (EditText)findViewById(R.id.editText9);
                String v9 = editText8.getText().toString();


                ArrayList<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>();

                nameValuePairs.add(new BasicNameValuePair("R_ID",v1));
                nameValuePairs.add(new BasicNameValuePair("R_NAME",v2));
                nameValuePairs.add(new BasicNameValuePair("R_OWNER",v3));
                nameValuePairs.add(new BasicNameValuePair("R_PHONE",v4));
                nameValuePairs.add(new BasicNameValuePair("R_RATING",v5));
                nameValuePairs.add(new BasicNameValuePair("R_LOCATION",v6));
                nameValuePairs.add(new BasicNameValuePair("R_TYPE",v7));
                nameValuePairs.add(new BasicNameValuePair("R_RADIUS",v8));
                nameValuePairs.add(new BasicNameValuePair("R_ADRESS",v9));


                StrictMode.setThreadPolicy(policy);

                //http post
                try
                {
                    HttpClient httpclient = new DefaultHttpClient();
                    HttpPost httppost = new HttpPost("http://ghyazilim.me/deleterest.php");
                    httppost.setEntity(new UrlEncodedFormEntity(nameValuePairs));
                    HttpResponse response = httpclient.execute(httppost);
                    HttpEntity entity = response.getEntity();
                    is = entity.getContent();

                    Log.e("log_tag", "connection success ");
                    Toast.makeText(getApplicationContext(), "DELETED", Toast.LENGTH_SHORT).show();
                }
                catch(Exception e)
                {
                    Log.e("log_tag", "Error in http connection "+e.toString());
                    Toast.makeText(getApplicationContext(), "Connection fail", Toast.LENGTH_SHORT).show();

                }
                //convert response to string
                try
                {
                    BufferedReader reader = new BufferedReader(new InputStreamReader(is,"iso-8859-1"),8);
                    StringBuilder sb = new StringBuilder();
                    String line = null;
                    while ((line = reader.readLine()) != null) {
                        sb.append(line + "\n");

                    }
                    is.close();

                    result=sb.toString();
                }
                catch(Exception e)
                {
                    Log.e("log_tag", "Error converting result "+e.toString());

                }



                //parse json data
                try
                {

                    JSONObject json_data = new JSONObject(result);


                    CharSequence w= (CharSequence) json_data.get("re");

                    Toast.makeText(getApplicationContext(), w, Toast.LENGTH_SHORT).show();

                }
                catch(JSONException e)
                {
                    Log.e("log_tag", "Error parsing data "+e.toString());
                    //Toast.makeText(getApplicationContext(), "JsonArray fail", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}









