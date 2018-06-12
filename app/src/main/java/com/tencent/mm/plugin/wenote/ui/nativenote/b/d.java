package com.tencent.mm.plugin.wenote.ui.nativenote.b;

import android.content.Context;
import android.text.format.DateFormat;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.R.h;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.wenote.model.a.b;
import com.tencent.mm.plugin.wenote.model.nativenote.manager.k;

public final class d
  extends a
{
  private TextView qvg;
  private View qvh;
  public LinearLayout qvi;
  
  public d(View paramView, k paramk)
  {
    super(paramView, paramk);
    this.qvi = ((LinearLayout)paramView.findViewById(R.h.note_header_ll));
    this.qvi.setVisibility(0);
    this.qvg = ((TextView)paramView.findViewById(R.h.note_header_tips));
    this.qvh = paramView.findViewById(R.h.note_header_split_line);
  }
  
  public final void a(b paramb, int paramInt1, int paramInt2)
  {
    if (paramb.getType() != -3) {}
    do
    {
      return;
      if (this.qtF.qrC == 3)
      {
        this.qvi.setVisibility(8);
        return;
      }
      this.qvi.setVisibility(0);
      paramb = (com.tencent.mm.plugin.wenote.model.a.d)paramb;
    } while (paramb.qoS <= 0L);
    Object localObject = this.qvg.getContext();
    long l = paramb.qoS;
    if (l < 3600000L) {}
    for (paramb = "";; paramb = DateFormat.format(((Context)localObject).getString(R.l.favorite_longdate), l))
    {
      localObject = this.qvg.getContext().getString(R.l.note_edit_time);
      paramb = (String)localObject + " " + paramb;
      this.qvg.setText(paramb);
      return;
    }
  }
  
  public final int caZ()
  {
    return -3;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/wenote/ui/nativenote/b/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */