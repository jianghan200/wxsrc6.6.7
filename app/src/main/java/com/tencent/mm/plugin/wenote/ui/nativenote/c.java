package com.tencent.mm.plugin.wenote.ui.nativenote;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import com.tencent.mm.R.g;
import com.tencent.mm.R.l;
import com.tencent.mm.bg.d;
import com.tencent.mm.modelcontrol.VideoTransPara;
import com.tencent.mm.plugin.fav.a.an;
import com.tencent.mm.plugin.mmsight.SightParams;
import com.tencent.mm.plugin.wenote.model.a.g;
import com.tencent.mm.plugin.wenote.model.nativenote.spans.t;
import com.tencent.mm.plugin.wenote.model.nativenote.spans.u;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.x;

public final class c
  implements com.tencent.mm.plugin.wenote.model.b.a, com.tencent.mm.plugin.wenote.model.nativenote.b.b
{
  View eZZ;
  String qoA = "";
  ImageButton quH;
  LinearLayout quI;
  ImageButton quJ;
  ImageButton quK;
  ImageButton quL;
  ImageButton quM;
  LinearLayout quN;
  LinearLayout quO;
  LinearLayout quP;
  LinearLayout quQ;
  LinearLayout quR;
  public boolean quS = false;
  c quT = this;
  boolean quU = false;
  boolean quV = false;
  boolean quW = false;
  boolean quX = false;
  
  public final void a(com.tencent.mm.plugin.wenote.model.nativenote.b.a parama)
  {
    this.quM.setImageResource(R.g.wenote_voice_button);
    if (!this.quS) {}
    int k;
    do
    {
      Object localObject;
      int i;
      int j;
      com.tencent.mm.plugin.wenote.model.a.b localb;
      do
      {
        return;
        this.quS = false;
        localObject = com.tencent.mm.plugin.wenote.model.k.bZe();
        if ((((com.tencent.mm.plugin.wenote.model.k)localObject).hnt) && (!((com.tencent.mm.plugin.wenote.model.k)localObject).hnu)) {
          ((com.tencent.mm.plugin.wenote.model.k)localObject).aMn();
        }
        localObject = com.tencent.mm.plugin.wenote.model.k.bZe();
        if (com.tencent.mm.a.e.cn(((com.tencent.mm.plugin.wenote.model.k)localObject).path)) {}
        for (localObject = ((com.tencent.mm.plugin.wenote.model.k)localObject).path;; localObject = "")
        {
          i = (int)com.tencent.mm.plugin.wenote.model.k.bZe().duration;
          j = (int)com.tencent.mm.bb.a.bD(i);
          k = com.tencent.mm.plugin.wenote.model.nativenote.manager.c.bZD().bZI();
          localb = com.tencent.mm.plugin.wenote.model.nativenote.manager.c.bZD().Bv(k);
          if (com.tencent.mm.a.e.cn((String)localObject)) {
            break;
          }
          x.e("MicroMsg.WNNoteFootPannel", "voicePath not exist, remove data from datalist and ui");
          com.tencent.mm.plugin.wenote.model.nativenote.manager.c.bZD().ab(k, false);
          if (parama != null) {
            parama.Bq(k);
          }
          parama = new com.tencent.mm.plugin.wenote.model.a.h();
          parama.content = "";
          parama.qoH = true;
          parama.qoN = false;
          com.tencent.mm.plugin.wenote.model.nativenote.manager.c.bZD().a(k, parama);
          com.tencent.mm.plugin.wenote.model.nativenote.manager.c.bZD().er(k - 1, k + 1);
          return;
        }
      } while ((k == -1) || (localb == null) || (localb.getType() != 4));
      ((com.tencent.mm.plugin.wenote.model.a.k)localb).qoV = Boolean.valueOf(false);
      ((com.tencent.mm.plugin.wenote.model.a.k)localb).type = 4;
      ((com.tencent.mm.plugin.wenote.model.a.k)localb).qpd = true;
      ((com.tencent.mm.plugin.wenote.model.a.k)localb).qpt = "";
      ((com.tencent.mm.plugin.wenote.model.a.k)localb).length = i;
      ((com.tencent.mm.plugin.wenote.model.a.k)localb).qps = com.tencent.mm.bb.a.v(ad.getContext(), j).toString();
      ((com.tencent.mm.plugin.wenote.model.a.k)localb).fTs = (an.aLQ() + "/fav_fileicon_recording.png");
      ((com.tencent.mm.plugin.wenote.model.a.k)localb).bVd = ((String)localObject);
      parama = com.tencent.mm.plugin.wenote.model.nativenote.manager.c.bZD();
    } while (parama.qpR == null);
    parama.qpR.Bo(k);
  }
  
  public final void bZj()
  {
    a(null);
  }
  
  public final void bZk()
  {
    com.tencent.mm.ui.base.h.a(this.quM.getContext(), this.quM.getContext().getString(R.l.note_record_stop_request), "", true, new c.3(this), new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt) {}
    });
  }
  
  public final void ks(boolean paramBoolean)
  {
    this.quU = paramBoolean;
    this.quN.setPressed(paramBoolean);
  }
  
  public final void kt(boolean paramBoolean)
  {
    this.quV = paramBoolean;
    this.quO.setPressed(paramBoolean);
  }
  
  public final void ku(boolean paramBoolean)
  {
    this.quW = paramBoolean;
    this.quP.setPressed(paramBoolean);
  }
  
  public final void kv(boolean paramBoolean)
  {
    this.quX = paramBoolean;
    this.quR.setPressed(paramBoolean);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/wenote/ui/nativenote/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */