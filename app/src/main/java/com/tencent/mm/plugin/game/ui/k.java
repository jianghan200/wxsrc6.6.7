package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.mm.g.c.p;
import com.tencent.mm.plugin.game.d.bw;
import com.tencent.mm.plugin.game.e.c;
import com.tencent.mm.plugin.game.model.an;
import com.tencent.mm.plugin.game.model.d;
import com.tencent.mm.pluginsdk.model.app.g;
import com.tencent.mm.pluginsdk.model.app.q;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class k
  implements View.OnClickListener, AdapterView.OnItemClickListener
{
  protected int jNv = 0;
  
  private void a(Context paramContext, d paramd)
  {
    int i = 0;
    if (paramd.type == 1) {
      i = c.an(paramContext, paramd.jLe);
    }
    for (;;)
    {
      an.a(paramContext, paramd.scene, paramd.bYq, paramd.position, i, paramd.field_appId, this.jNv, paramd.bHF, paramd.jLt);
      return;
      if (paramd.type == 0) {
        if ((paramd.aTx()) && (!bi.oW(paramd.jLx.jOU)) && (!g.a(paramContext, paramd)))
        {
          i = c.an(paramContext, paramd.jLx.jOU);
        }
        else
        {
          if ((bi.oW(paramd.cmK)) || (paramd.cmN != 4)) {
            break;
          }
          x.i("MicroMsg.GameItemClickListener", "Download via Google Play");
          q.bi(paramContext, paramd.cmK);
          i = 25;
        }
      }
    }
    Bundle localBundle = new Bundle();
    localBundle.putCharSequence("game_app_id", paramd.field_appId);
    if (paramd.bYq == 1601) {
      localBundle.putInt("game_report_from_scene", this.jNv);
    }
    for (;;)
    {
      i = c.b(paramContext, paramd.field_appId, paramd.jLe, localBundle);
      break;
      localBundle.putInt("game_report_from_scene", paramd.bYq);
    }
  }
  
  public final void onClick(View paramView)
  {
    if ((paramView.getTag() == null) || (!(paramView.getTag() instanceof d))) {
      return;
    }
    d locald = (d)paramView.getTag();
    a(paramView.getContext(), locald);
  }
  
  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    paramAdapterView = paramAdapterView.getAdapter().getItem(paramInt);
    if ((paramAdapterView == null) || (!(paramAdapterView instanceof d))) {}
    do
    {
      return;
      paramAdapterView = (d)paramAdapterView;
    } while (bi.oW(paramAdapterView.field_appId));
    a(paramView.getContext(), paramAdapterView);
  }
  
  public final void setSourceScene(int paramInt)
  {
    this.jNv = paramInt;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/game/ui/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */