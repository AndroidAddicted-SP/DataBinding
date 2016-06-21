package dominando.addicted.android.databinding;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

import dominando.addicted.android.databinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    Usuario usuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        usuario = new Usuario("Leo", "Turbiani");
        binding.setUsuario(usuario);
        binding.setTratador(new TratadorMagico());

        EditText edtNome = (EditText) findViewById(R.id.edtNome);
        edtNome.addTextChangedListener(new AoMudarTexto(R.id.edtNome));

        EditText edtSobreNome = (EditText) findViewById(R.id.edtSobreNome);
        edtSobreNome.addTextChangedListener(new AoMudarTexto(R.id.edtSobreNome));
    }

    class AoMudarTexto implements TextWatcher{
        private int id;

        public AoMudarTexto(int id){
            this.id = id;
        }

        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            switch (id){
                case R.id.edtNome:
                    usuario.setNome(charSequence.toString());
                    break;
                case R.id.edtSobreNome:
                    usuario.setSobrenome(charSequence.toString());
                    break;
            }
        }

        @Override
        public void afterTextChanged(Editable editable) {

        }
    }
}
