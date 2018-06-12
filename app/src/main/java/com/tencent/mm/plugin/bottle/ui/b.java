package com.tencent.mm.plugin.bottle.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.m;
import com.tencent.mm.ui.base.i;

public final class b
  extends i
{
  TextView ePz;
  private Button hlf;
  private View view;
  
  public b(Context paramContext)
  {
    super(paramContext, R.m.noBgDialog);
    this.view = ((LayoutInflater)paramContext.getSystemService("layout_inflater")).inflate(R.i.bottle_dialog, null);
    setContentView(this.view, new ViewGroup.LayoutParams(-2, -2));
    this.ePz = ((TextView)this.view.findViewById(R.h.bottle_dialog_text));
    this.hlf = ((Button)this.view.findViewById(R.h.bottle_dialog_button));
    this.hlf.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        b.this.dismiss();
      }
    });
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/bottle/ui/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */