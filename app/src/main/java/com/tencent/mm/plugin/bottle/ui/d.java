package com.tencent.mm.plugin.bottle.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;

public final class d
  extends Toast
{
  Context context;
  private TextView ePz;
  private View view;
  
  public d(Context paramContext)
  {
    super(paramContext);
    this.context = paramContext;
    this.view = ((LayoutInflater)paramContext.getSystemService("layout_inflater")).inflate(R.i.bottle_toast, null);
    this.ePz = ((TextView)this.view.findViewById(R.h.bottle_toast_text));
    setGravity(17, 0, 0);
    setDuration(0);
    setView(this.view);
  }
  
  public final void setText(int paramInt)
  {
    setText(this.context.getString(paramInt));
  }
  
  public final void setText(CharSequence paramCharSequence)
  {
    this.ePz.setText(paramCharSequence);
  }
  
  public final void show()
  {
    super.show();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/bottle/ui/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */