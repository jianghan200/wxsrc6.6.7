package com.tencent.mm.plugin.fav.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.model.q;
import com.tencent.mm.plugin.fav.a.b;
import com.tencent.mm.plugin.fav.a.g;
import com.tencent.mm.plugin.fav.ui.m.e;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.d.j;
import com.tencent.mm.protocal.c.wl;
import com.tencent.mm.protocal.c.wr;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public class FavDetailTitleView
  extends LinearLayout
{
  private ImageView eCl;
  private TextView eCm;
  
  public FavDetailTitleView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public final void D(g paramg)
  {
    if ((paramg == null) || (paramg.field_favProto == null)) {
      return;
    }
    if ((14 == paramg.field_type) && (!bi.oW(paramg.field_favProto.title)))
    {
      paramg = paramg.field_favProto.title;
      this.eCl.setVisibility(8);
    }
    for (;;)
    {
      paramg = j.a(getContext(), paramg, this.eCm.getTextSize());
      this.eCm.setText(paramg);
      return;
      this.eCl.setVisibility(0);
      wr localwr = paramg.field_favProto.rBG;
      if ((localwr != null) && (!bi.oW(localwr.rBh)))
      {
        str1 = b.Bc(localwr.rBh);
        String str2;
        if (q.GF().equals(localwr.bSS))
        {
          str2 = b.gU(localwr.toUser);
          paramg = str1;
          if (!bi.aG(str2, "").equals(localwr.toUser)) {
            paramg = str1 + " - " + str2;
          }
        }
        for (;;)
        {
          x.v("MicroMsg.FavDetailTitleView", "display name, source from[%s] to[%s]", new Object[] { localwr.bSS, localwr.toUser });
          a.b.a(this.eCl, localwr.rBh);
          break;
          str2 = b.gU(localwr.bSS);
          paramg = str1;
          if (!bi.aG(str2, "").equals(localwr.bSS)) {
            paramg = str1 + " - " + str2;
          }
        }
      }
      x.v("MicroMsg.FavDetailTitleView", "display name, from item info user[%s]", new Object[] { paramg.field_fromUser });
      String str1 = b.gU(paramg.field_fromUser);
      a.b.a(this.eCl, paramg.field_fromUser);
      paramg = str1;
    }
  }
  
  protected void onFinishInflate()
  {
    super.onFinishInflate();
    this.eCl = ((ImageView)findViewById(m.e.avatar_iv));
    this.eCm = ((TextView)findViewById(m.e.title_tv));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/fav/ui/widget/FavDetailTitleView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */