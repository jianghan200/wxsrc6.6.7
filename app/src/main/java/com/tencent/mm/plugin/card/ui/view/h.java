package com.tencent.mm.plugin.card.ui.view;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.mm.plugin.card.a.d;
import com.tencent.mm.plugin.card.base.b;
import com.tencent.mm.plugin.card.d.c;
import com.tencent.mm.plugin.card.d.l;
import com.tencent.mm.plugin.card.d.m;
import com.tencent.mm.protocal.c.lf;
import com.tencent.mm.protocal.c.pr;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.ui.MMActivity;

public abstract class h
  implements ab
{
  protected MMActivity gKS;
  protected g hHC;
  
  public h(g paramg, MMActivity paramMMActivity)
  {
    this.hHC = paramg;
    this.gKS = paramMMActivity;
  }
  
  public abstract boolean azJ();
  
  public abstract boolean azK();
  
  public void c(ViewGroup paramViewGroup, b paramb)
  {
    Object localObject1;
    Object localObject2;
    if (azJ())
    {
      localObject1 = (TextView)paramViewGroup.findViewById(a.d.code_text);
      localObject2 = this.hHC.code;
      if ((!paramb.awg()) && ((bi.oW((String)localObject2)) || (((String)localObject2).length() > 40))) {
        break label304;
      }
      ((TextView)localObject1).setText(m.yd((String)localObject2));
      if (paramb.awb())
      {
        ((TextView)localObject1).setVisibility(0);
        ((TextView)localObject1).setOnLongClickListener(new h.1(this, paramb));
        this.hHC.d(c.hID);
      }
    }
    else if (azK())
    {
      localObject1 = (RelativeLayout)paramViewGroup.findViewById(a.d.code_jump_layout);
      if ((paramb == null) || (paramb.awm() == null) || (paramb.awm().rok == null) || (bi.oW(paramb.awm().rok.title))) {
        break label326;
      }
      paramViewGroup.findViewById(a.d.code_divider_line).setVisibility(8);
      ((RelativeLayout)localObject1).setVisibility(0);
      localObject2 = paramb.awm().rok;
      TextView localTextView = (TextView)paramViewGroup.findViewById(a.d.code_jump_title);
      localTextView.setText(((pr)localObject2).title);
      String str = paramb.awm().dxh;
      if (!bi.oW(str)) {
        localTextView.setTextColor(l.xV(str));
      }
      paramViewGroup = (TextView)paramViewGroup.findViewById(a.d.code_jump_second_title);
      localObject2 = ((pr)localObject2).huY;
      if (TextUtils.isEmpty((CharSequence)localObject2)) {
        break label313;
      }
      if (paramViewGroup != null)
      {
        paramViewGroup.setText((CharSequence)localObject2);
        paramViewGroup.setVisibility(0);
      }
    }
    for (;;)
    {
      ((RelativeLayout)localObject1).setOnClickListener(new h.2(this, paramb));
      return;
      ((TextView)localObject1).setVisibility(8);
      break;
      label304:
      ((TextView)localObject1).setVisibility(8);
      break;
      label313:
      if (paramViewGroup != null) {
        paramViewGroup.setVisibility(8);
      }
    }
    label326:
    ((RelativeLayout)localObject1).setVisibility(8);
  }
  
  public void g(ViewGroup paramViewGroup) {}
  
  public boolean i(b paramb)
  {
    return true;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/card/ui/view/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */