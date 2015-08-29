package demo.listfragment.br.com.listfragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Luiz Henrique on 8/28/2015.
 */
public class TextFragment extends Fragment {

    TextView txtMessage;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_text, container, false);

        txtMessage = (TextView) view.findViewById(R.id.txt_msg);

        return view;
    }

    public void setText(String text) {
        txtMessage.setText(text);
    }
}
