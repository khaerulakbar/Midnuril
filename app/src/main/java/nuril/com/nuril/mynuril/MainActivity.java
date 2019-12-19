package nuril.com.nuril.mynuril;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button nstep;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nstep = (Button) findViewById(R.id.step1);

        nstep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent istep = new Intent(getApplicationContext(), Main2Activity.class);
                startActivity(istep);
                finish();
            }
        });
    }
}
