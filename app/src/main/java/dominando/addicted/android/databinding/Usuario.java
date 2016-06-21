package dominando.addicted.android.databinding;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

/**
 * Created by turbiani on 20/06/16.
 */
public class Usuario extends BaseObservable {
    private String nome;
    private String sobrenome;

    public Usuario(String nome, String sobrenome){
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    @Bindable
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
        notifyPropertyChanged(
            dominando.addicted.android.databinding.BR.nome
        );
    }

    @Bindable
    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
        notifyPropertyChanged(
                dominando.addicted.android.databinding.BR.sobrenome
        );
    }
}
