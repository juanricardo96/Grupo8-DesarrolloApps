package com.example.sprint2;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.List;

public class Login extends AppCompatActivity {

    final static String TAG = "Logs de Firebase";
    FirebaseFirestore db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        db = FirebaseFirestore.getInstance();

        EditText user = (EditText) findViewById(R.id.textUser);
        EditText password = (EditText) findViewById(R.id.editPassword);
        Button botonCalcular = (Button) findViewById(R.id.boton_login);

        botonCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String User = new String(user.getText().toString());
                String Password = new String(password.getText().toString());
                LecturaBD(User,Password);
                Intent i = new Intent(Login.this, MainActivity.class);
                startActivity(i);
            }
        });
    }

    private void LecturaBD(String user, String password){
        db.collection("users").get().addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
            @Override
            public void onComplete(@NonNull Task<QuerySnapshot> task) {
                if(task.isSuccessful()){
                    List<DocumentSnapshot> documentos = task.getResult().getDocuments();
                    int cantidad = documentos.size();
                    for (int i = 0; i<cantidad; i++) {
                        Log.d(TAG, "Documento Recibido, id: " + documentos.get(i).getData());
                        Log.d("User", user);
                        Log.d("Password", password);
                    }

                }
            }
        });
    }
}
