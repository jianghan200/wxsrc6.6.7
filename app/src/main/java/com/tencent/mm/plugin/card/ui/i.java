package com.tencent.mm.plugin.card.ui;

import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.kernel.e;
import com.tencent.mm.plugin.card.a.b;
import com.tencent.mm.plugin.card.a.c;
import com.tencent.mm.plugin.card.a.g;
import com.tencent.mm.plugin.card.b.k;
import com.tencent.mm.plugin.card.b.k.a;
import com.tencent.mm.plugin.card.d.m;
import com.tencent.mm.plugin.card.model.am;
import com.tencent.mm.storage.aa.a;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.MMActivity;

public final class i
  implements k.a
{
  MMActivity gKS;
  boolean hAu = false;
  View hFD;
  TextView hFE;
  ImageView hFF;
  View hFG;
  TextView hFH;
  ImageView hFI;
  View hyK;
  
  public i(MMActivity paramMMActivity, View paramView)
  {
    this.gKS = paramMMActivity;
    this.hyK = paramView;
  }
  
  public final void a(com.tencent.mm.plugin.card.model.g paramg)
  {
    ayP();
  }
  
  public final void auM() {}
  
  final void ayP()
  {
    int i = am.axm().huN;
    if ((i > 0) && (this.hAu))
    {
      String str1 = (String)com.tencent.mm.kernel.g.Ei().DT().get(aa.a.sPW, "");
      String str2 = (String)com.tencent.mm.kernel.g.Ei().DT().get(aa.a.sPX, "");
      int j = this.gKS.getResources().getDimensionPixelOffset(a.b.card_index_newmsg_logo_height);
      if (!TextUtils.isEmpty(str2))
      {
        m.a(this.hFF, str2, j, a.c.card_msg_inform, true);
        if (TextUtils.isEmpty(str1)) {
          break label180;
        }
        this.hFE.setText(str1);
        label106:
        this.hFD.setVisibility(0);
        if (this.hFG != null)
        {
          if (TextUtils.isEmpty(str2)) {
            break label211;
          }
          m.a(this.hFI, str2, j, a.c.card_msg_inform, true);
          label143:
          if (TextUtils.isEmpty(str1)) {
            break label224;
          }
          this.hFH.setText(str1);
          label158:
          this.hFG.setVisibility(0);
        }
      }
    }
    label180:
    label211:
    label224:
    do
    {
      return;
      this.hFF.setImageResource(a.c.card_msg_inform);
      break;
      this.hFE.setText(this.gKS.getString(a.g.card_index_new_msg, new Object[] { Integer.valueOf(i) }));
      break label106;
      this.hFI.setImageResource(a.c.card_msg_inform);
      break label143;
      this.hFH.setText(this.gKS.getString(a.g.card_index_new_msg, new Object[] { Integer.valueOf(i) }));
      break label158;
      this.hFD.setVisibility(8);
    } while (this.hFG == null);
    this.hFG.setVisibility(8);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/card/ui/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */