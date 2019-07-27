package tech.marzoog.universityapp;

import android.content.Context;
import android.os.AsyncTask;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

public class BackgroundTask extends AsyncTask<String, String, String> {
    Context context;
    BackgroundTask(Context context){
        this.context = context;
    }

    @Override
    protected String doInBackground(String... strings) {

        String fullName = strings[0];
        String userId = strings[1];
        String email = strings[2];
        String password = strings[3];




        //TODO: change the url
        String regURL = "http://10.0.0.2/UniversityApp/Signup.php";

        try{
            URL url = new URL(regURL);

            try{
                HttpURLConnection httpURLConnection = (HttpURLConnection)url.openConnection();
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setDoInput(true);
                System.out.printf("print1: %s, %s, %s, %s", fullName, userId, email, password);
                OutputStream outputStream = httpURLConnection.getOutputStream();
                System.out.println("Test");
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, "UTF-8");
                BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
                String insertData = URLEncoder.encode("Name", "UTF-8")+"="+URLEncoder.encode(fullName, "UTF-8")+
                        "&"+URLEncoder.encode("ID", "UTF-8")+"="+URLEncoder.encode(userId, "UTF-8")+
                        "&"+URLEncoder.encode("Email", "UTF-8")+"="+URLEncoder.encode(email, "UTF-8")+
                        "&"+URLEncoder.encode("Password", "UTF-8")+"="+URLEncoder.encode(password, "UTF-8");
                bufferedWriter.write(insertData);
                bufferedWriter.flush();
                bufferedWriter.close();
                InputStream inputStream = httpURLConnection.getInputStream();
                InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "ISO-8859-1");
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                String result = "";
                String line = "";
                StringBuilder stringBuilder = new StringBuilder();
                while ((line=bufferedReader.readLine())!=null){
                    stringBuilder.append(line).append("\n");
                }
                result = stringBuilder.toString();
                bufferedReader.close();
                inputStream.close();
                httpURLConnection.disconnect();
                return result;
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }


        return null;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }

    @Override
    protected void onPostExecute(String s) {
        Toast.makeText(context, s, Toast.LENGTH_LONG).show();
        //super.onPostExecute(s);
    }
}
