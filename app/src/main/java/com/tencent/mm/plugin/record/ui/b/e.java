package com.tencent.mm.plugin.record.ui.b;

import android.content.Context;
import android.view.View;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.g.a.fz;
import com.tencent.mm.g.a.fz.b;
import com.tencent.mm.modelvoice.q;
import com.tencent.mm.plugin.fav.a.g;
import com.tencent.mm.plugin.record.b.m;
import com.tencent.mm.plugin.record.b.m.a;
import com.tencent.mm.plugin.record.ui.RecordVoiceBaseView;
import com.tencent.mm.plugin.record.ui.h.b;
import com.tencent.mm.protocal.c.vx;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Iterator;
import java.util.List;

public final class e
  implements h.b
{
  RecordVoiceBaseView mtK;
  private m mts = new m();
  
  public final void a(View paramView, int paramInt, com.tencent.mm.plugin.record.ui.a.b paramb)
  {
    Object localObject = paramView.findViewById(R.h.empty_voice);
    this.mtK = ((RecordVoiceBaseView)paramView.findViewById(R.h.voice_player));
    if (paramb.bjS == 0)
    {
      this.mtK.setVisibility(8);
      ((View)localObject).setVisibility(0);
    }
    while (paramb.bjS != 1) {
      return;
    }
    ((View)localObject).setVisibility(8);
    this.mtK.setVisibility(0);
    paramView = com.tencent.mm.plugin.record.b.b.a(paramb);
    fz localfz = new fz();
    localfz.bOL.type = 17;
    localfz.bOL.bON = paramb.bOz;
    a.sFg.m(localfz);
    paramInt = localfz.bOM.ret;
    if (!com.tencent.mm.a.e.cn(paramView))
    {
      if (!bi.oW(paramb.bOz.rzo)) {
        break label238;
      }
      ((View)localObject).setVisibility(0);
      this.mtK.setVisibility(8);
    }
    for (;;)
    {
      localObject = this.mtK;
      int i = paramb.bOz.duration;
      ((RecordVoiceBaseView)localObject).path = bi.aG(paramView, "");
      ((RecordVoiceBaseView)localObject).bOS = paramInt;
      if (((RecordVoiceBaseView)localObject).duration == i) {
        break;
      }
      ((RecordVoiceBaseView)localObject).duration = i;
      ((RecordVoiceBaseView)localObject).setText((int)q.bD(i) + "''");
      return;
      label238:
      x.d("MicroMsg.VoiceViewWrapper", "restart voice %s, url %s", new Object[] { Long.valueOf(paramb.msw.field_localId), paramb.bOz.rzo });
      localObject = new fz();
      ((fz)localObject).bOL.type = 16;
      ((fz)localObject).bOL.bJA = paramb.msw.field_localId;
      a.sFg.m((com.tencent.mm.sdk.b.b)localObject);
    }
  }
  
  public final void destroy()
  {
    m localm = this.mts;
    localm.stopPlay();
    localm.aux();
    m.hlW = null;
    localm.cWy.clear();
  }
  
  public final View eb(Context paramContext)
  {
    paramContext = View.inflate(paramContext, R.i.record_listitem_voice, null);
    ((RecordVoiceBaseView)paramContext.findViewById(R.h.voice_player)).setVoiceHelper(this.mts);
    return paramContext;
  }
  
  public final void pause()
  {
    if ((this.mts != null) && (this.mts.cWy.size() > 0))
    {
      Iterator localIterator = this.mts.cWy.iterator();
      while (localIterator.hasNext()) {
        ((m.a)localIterator.next()).onFinish();
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/record/ui/b/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */