package com.tencent.mm.plugin.record.ui.b;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.plugin.record.ui.a.b;
import com.tencent.mm.plugin.record.ui.h.b;
import com.tencent.mm.pluginsdk.ui.d.j;
import com.tencent.mm.protocal.c.vx;

public final class d
  implements h.b
{
  Context context;
  int hpr;
  int hps;
  
  public d(Context paramContext)
  {
    this.context = paramContext;
  }
  
  public final void a(View paramView, int paramInt, b paramb)
  {
    TextView localTextView = (TextView)paramView.findViewById(R.h.record_listitem_content);
    localTextView.setText(paramb.bOz.desc);
    j.g(localTextView, 1);
    localTextView.setOnLongClickListener(new d.1(this, paramb));
    paramView.setOnTouchListener(new d.2(this));
  }
  
  public final void destroy()
  {
    this.context = null;
  }
  
  public final View eb(Context paramContext)
  {
    return View.inflate(paramContext, R.i.record_listitem_text, null);
  }
  
  public final void pause() {}
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/record/ui/b/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */