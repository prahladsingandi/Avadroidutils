package always.keeplearning.androidutils;

import static android.view.View.GONE;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class AvaAlertDialog {

    private static final String strOK = "OK";
    private static final String strYes = "Yes";
    private static final String strNo = "No";
    private static final String strAlert = "Alert!";
    private static Dialog dialog;
    private static TextInputEditText editText;

    public static void showOKAlertDialog(Context context, String message, boolean isCancelable, View.OnClickListener btnOnClick) {

        TextView tTitle, tMessage;
        Button btnCancel, btnOK;


        dialog = new Dialog(context, R.style.df_dialog);
        dialog.setContentView(R.layout.alert_dialog_layout);
        tTitle = dialog.findViewById(R.id.title);
        tMessage = dialog.findViewById(R.id.message);
        btnCancel = dialog.findViewById(R.id.btnYes);
        btnOK = dialog.findViewById(R.id.btnNo);
        btnCancel.setVisibility(GONE);
        btnOK.setText(strOK);
        dialog.setCancelable(isCancelable);
        tTitle.setText(strAlert);
        tMessage.setText(message);

        btnOK.setOnClickListener(btnOnClick);
        dialog.show();
    }

    public static void dismissDialog() {
        dialog.dismiss();
    }

    public static void showYesNoAlert(Context context, String message, View.OnClickListener onYesClicked, View.OnClickListener onNoClicked) {

        TextView tTitle, tMessage;
        Button btnCancel, btnOK;


        dialog = new Dialog(context, R.style.df_dialog);
        dialog.setContentView(R.layout.alert_dialog_layout);
        tTitle = dialog.findViewById(R.id.title);
        tMessage = dialog.findViewById(R.id.message);
        btnCancel = dialog.findViewById(R.id.btnYes);
        btnOK = dialog.findViewById(R.id.btnNo);
        btnCancel.setText(strNo);
        btnOK.setText(strYes);
//        editText.setVisibility(GONE);
        tTitle.setText(strAlert);
        tMessage.setText(message);

        btnCancel.setOnClickListener(onNoClicked);
        btnOK.setOnClickListener(onYesClicked);
        dialog.setCancelable(true);
        dialog.show();
    }

    public static void showInputAlert(Context context, String message, View.OnClickListener onYesClicked, View.OnClickListener onNoClicked) {

        TextView tTitle, tMessage;
        Button btnCancel, btnOK;

        dialog = new Dialog(context, R.style.df_dialog);
        dialog.setContentView(R.layout.alert_dialog_layout);
        tTitle = dialog.findViewById(R.id.title);
        tMessage = dialog.findViewById(R.id.message);
        TextInputLayout etl = dialog.findViewById(R.id.etl);
        etl.setVisibility(View.VISIBLE);
        editText = dialog.findViewById(R.id.editText);
        btnCancel = dialog.findViewById(R.id.btnYes);
        btnOK = dialog.findViewById(R.id.btnNo);
        btnCancel.setText(strNo);
        btnOK.setText(strYes);

        tTitle.setText(strAlert);
        tMessage.setText(message);

        btnCancel.setOnClickListener(onNoClicked);
        btnOK.setOnClickListener(onYesClicked);
        dialog.setCancelable(false);
        dialog.show();

    }

}
