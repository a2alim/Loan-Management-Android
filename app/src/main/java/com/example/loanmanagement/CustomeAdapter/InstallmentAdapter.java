package com.example.loanmanagement.CustomeAdapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.loanmanagement.Model.Installment;
import com.example.loanmanagement.R;

import java.util.List;

public class InstallmentAdapter extends ArrayAdapter<Installment> {
    Context context;
    List<Installment> installmentList;

    public InstallmentAdapter(Context context, List<Installment> installmentList) {
        super(context, R.layout.custome_user_installment, installmentList);
        this.context = context;
        this.installmentList = installmentList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(R.layout.custome_user_installment, parent, false);

        TextView username = convertView.findViewById(R.id.username);
        TextView tvpaidAmount = convertView.findViewById(R.id.paidAmt);
        TextView tvpaybleAmount = convertView.findViewById(R.id.payableAmt);

        String user= installmentList.get(position).getUsername();
        String paid = installmentList.get(position).getTotalPaid().toString();
        String payble = installmentList.get(position).getTotalPayable().toString();
        Log.d("paid", payble);
        username.setText(user);
        tvpaidAmount.setText("Total Paid: "+paid);
        tvpaybleAmount.setText("Total Payable: "+payble);

        return convertView;
    }
}
