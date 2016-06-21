package dominando.addicted.android.databinding;

import android.util.Log;
import android.view.View;

/**
 * Created by turbiani on 20/06/16.
 */
public class TratadorMagico {
    public boolean longClick(View v){
        Log.d("NGVL", "LongClick!");
        return true;
    }

    public boolean click(View v){
        Log.d("NGVL", "Click!");
        return true;
    }
}
