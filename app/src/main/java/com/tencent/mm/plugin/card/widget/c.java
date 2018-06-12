package com.tencent.mm.plugin.card.widget;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.tencent.mm.plugin.card.a.d;
import com.tencent.mm.plugin.card.base.b;
import com.tencent.mm.protocal.c.lf;
import com.tencent.mm.protocal.c.pr;
import java.util.LinkedList;

public final class c
  extends a
{
  protected TextView hJm;
  protected TextView hJn;
  
  public c(Context paramContext)
  {
    super(paramContext);
  }
  
  protected final void aAa()
  {
    pr localpr;
    if ((this.htQ.awm().rnG != null) && (this.htQ.awm().rnG.size() > 0))
    {
      localpr = (pr)this.htQ.awm().rnG.get(0);
      if (this.hJd != null) {
        this.hJd.setText(localpr.title);
      }
      if (this.hJm != null)
      {
        if (TextUtils.isEmpty(localpr.huX)) {
          break label128;
        }
        this.hJm.setText(localpr.huX);
      }
    }
    for (;;)
    {
      if (this.hJn != null)
      {
        if (TextUtils.isEmpty(localpr.huY)) {
          break;
        }
        this.hJn.setText(localpr.huY);
      }
      return;
      label128:
      this.hJm.setVisibility(8);
    }
    this.hJn.setVisibility(8);
  }
  
  protected final void azZ()
  {
    this.hJn = ((TextView)azY().findViewById(a.d.card_aux_title));
    this.hJm = ((TextView)azY().findViewById(a.d.card_sub_title));
  }
  
  public final void v(boolean paramBoolean1, boolean paramBoolean2) {}
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/card/widget/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */