package com.example.loanmanagement.CustomeAdapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.loanmanagement.Model.Loan;
import com.example.loanmanagement.R;

import java.util.List;

public class UserLoanAdapter extends ArrayAdapter<Loan> {
    Context context;
    List<Loan> loanList;

    public UserLoanAdapter(Context context, List<Loan> loanList) {
        super(context, R.layout.custome_user_installment, loanList);
        this.context = context;
        this.loanList = loanList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(R.layout.custome_loan, parent, false);
        TextView name = convertView.findViewById(R.id.username);
        TextView tvcategory=convertView.findViewById(R.id.category);
        TextView tvloanAmount=convertView.findViewById(R.id.loanAmount);

        String fName = loanList.get(position).getFirstName();
        String lName = loanList.get(position).getLastName();
        String fullname = fName + " " + lName;

        String category =loanList.get(position).getCategory();
        String loanAmount =loanList.get(position).getLoanAmount().toString();
        name.setText(fullname);
        tvcategory.setText("Category: "+category);
        tvloanAmount.setText("Amonunt: "+loanAmount);
        return convertView;
    }
}
