package it.uniba.dib.sms22245.tasks.login;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;

import it.uniba.dib.sms22245.R;

public class LoginRecoverPasswordFragment extends AppCompatActivity {
    private EditText emailEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recoverpassword);

        emailEditText = findViewById(R.id.emailEditText);

        Button sendButton = findViewById(R.id.sendButton);
        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseAuth auth = FirebaseAuth.getInstance();
                String emailAddress = emailEditText.getText().toString();

                auth.sendPasswordResetEmail(emailAddress)
                        .addOnCompleteListener(task -> {
                            if (task.isSuccessful()) {
                                // La richiesta di recupero password è stata inviata con successo
                                Toast.makeText(LoginRecoverPasswordFragment.this,
                                        "Email di recupero password inviata",
                                        Toast.LENGTH_SHORT).show();
                            } else {
                                // Si è verificato un errore durante l'invio della richiesta di recupero password
                                Toast.makeText(LoginRecoverPasswordFragment.this,
                                        "Errore durante l'invio della email di recupero password",
                                        Toast.LENGTH_SHORT).show();
                            }
                        });
            }
        });
    }
}

