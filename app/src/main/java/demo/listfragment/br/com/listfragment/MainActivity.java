package demo.listfragment.br.com.listfragment;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.text.NumberFormat;
import java.util.Locale;

public class MainActivity extends Activity implements AlimentosFragment.OnItemClickedChanged {


    private TextFragment textFragment;
    private static final NumberFormat nf = NumberFormat.getNumberInstance(new Locale("pt", "BR"));

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textFragment = (TextFragment) getFragmentManager().findFragmentById(R.id.frag_text);
    }


    @Override
    public void onClick(Alimento alimento) {
        textFragment.setText(alimento.getNome() + " - R$" + nf.format(alimento.getPreco()));
    }
}
