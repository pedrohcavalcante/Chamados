package com.example.pedro.chamados;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;

public class ExitDialog extends DialogFragment implements DialogInterface.OnClickListener {
    private ExitListener listener;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if(!(context instanceof ExitListener)){
            throw new RuntimeException("Não é instância de ExitListener");
        }

        listener = (ExitListener) context;
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder saidaDialog = new AlertDialog.Builder(getActivity());

        saidaDialog.setTitle("Deseja Sair?");
        saidaDialog.setPositiveButton("Sim", this);
        saidaDialog.setNegativeButton("Não", this);

        return saidaDialog.create();
    }



    @Override
    public void onClick(DialogInterface dialog, int which) {
        if (which == DialogInterface.BUTTON_POSITIVE && listener == null){
            listener.onExit();
        }
    }

    public interface ExitListener{
        public void onExit();
    }
}
