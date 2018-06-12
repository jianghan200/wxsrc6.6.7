package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.bp.a;
import com.tencent.mm.plugin.game.f.d;
import com.tencent.mm.plugin.game.f.f;
import com.tencent.mm.plugin.game.model.f;
import com.tencent.mm.plugin.game.model.n;
import com.tencent.mm.plugin.game.widget.TextProgressBar;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;

public final class g
  extends m
{
  public g(Context paramContext)
  {
    super(paramContext);
    this.jZR = f.f.game_center_list_item;
  }
  
  protected final void a(com.tencent.mm.plugin.game.model.d paramd, m.b paramb) {}
  
  protected final void a(com.tencent.mm.plugin.game.model.d paramd, m.b paramb, int paramInt)
  {
    paramb.kac.setText(paramd.position);
    Bitmap localBitmap = DI(paramd.field_appId);
    if ((localBitmap != null) && (!localBitmap.isRecycled()))
    {
      paramb.kad.setImageBitmap(localBitmap);
      paramb.jZe.setText(paramd.field_appName);
      if (!bi.oW(paramd.jLc)) {
        break label226;
      }
      paramb.kag.setVisibility(8);
      label86:
      if (bi.cX(paramd.jLm)) {
        break label248;
      }
      paramb.kae.setVisibility(0);
      paramb.kae.setText((CharSequence)paramd.jLm.get(0));
    }
    for (;;)
    {
      paramb.kai.setTextSize(this.jWv);
      paramb.kah.setOnClickListener(this.jXl);
      paramb.kai.setOnClickListener(this.jXl);
      paramb.kah.setTag(paramd);
      paramb.kai.setTag(paramd);
      this.jWA.a(paramb.kai, paramb.kah, paramd, (n)this.jZW.get(paramd.field_appId));
      paramb.kaj.setData(paramd.jLk);
      return;
      paramb.kad.setImageResource(f.d.game_default_icon);
      break;
      label226:
      paramb.kag.setVisibility(0);
      paramb.kag.setText(paramd.jLc);
      break label86;
      label248:
      if (!bi.oW(paramd.jLp))
      {
        paramb.kae.setVisibility(0);
        paramb.kae.setText(paramd.jLp);
      }
      try
      {
        paramb.kae.setBackgroundDrawable(f.cm(Color.parseColor(paramd.jLq), a.fromDPToPix(this.mContext, 10)));
      }
      catch (IllegalArgumentException localIllegalArgumentException)
      {
        x.e("MicroMsg.GameCenterListAdapter", localIllegalArgumentException.getMessage());
        paramb.kae.setVisibility(8);
      }
      catch (Exception localException)
      {
        for (;;)
        {
          x.e("MicroMsg.GameCenterListAdapter", localException.getMessage());
        }
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/game/ui/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */