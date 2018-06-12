package com.tencent.mm.plugin.wenote.ui.nativenote.b;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.R.h;
import com.tencent.mm.plugin.wenote.model.a.b;
import com.tencent.mm.plugin.wenote.model.nativenote.manager.k;

public final class i
  extends h
{
  private ImageView qvG;
  private TextView qvH;
  
  public i(View paramView, k paramk)
  {
    super(paramView, paramk);
    this.qvq.setVisibility(8);
    this.bOA.setVisibility(8);
    this.eRj.setVisibility(8);
    this.qvq.setOnClickListener(null);
    this.qvG = ((ImageView)paramView.findViewById(R.h.note_reminder_iv));
    this.qvH = ((TextView)paramView.findViewById(R.h.note_reminder_tv));
  }
  
  public final void a(b paramb, int paramInt1, int paramInt2)
  {
    super.a(paramb, paramInt1, paramInt2);
    if (paramb.getType() != -4) {
      return;
    }
    this.qvx.setVisibility(0);
  }
  
  public final int caZ()
  {
    return -4;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/wenote/ui/nativenote/b/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */