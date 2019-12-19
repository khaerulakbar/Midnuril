package nuril.com.nuril.mynuril;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    private Button nstep2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        nstep2 = (Button) findViewById(R.id.step2);

        nstep2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent istep2 = new Intent(getApplicationContext(), Main3Activity.class);
                startActivity(istep2);
                finish();
            }
        });
    }
}
