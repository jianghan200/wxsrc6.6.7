package com.tencent.mm.plugin.label.ui;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.R.h;
import com.tencent.mm.ui.widget.MMTextView;

public final class c
{
  TextView hrM;
  MMTextView kCe;
  LinearLayout kCf;
  
  public c(View paramView)
  {
    this.kCe = ((MMTextView)paramView.findViewById(R.h.label_item_title));
    this.hrM = ((TextView)paramView.findViewById(R.h.label_item_count));
    this.kCf = ((LinearLayout)paramView.findViewById(R.h.label_item_container));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/label/ui/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */