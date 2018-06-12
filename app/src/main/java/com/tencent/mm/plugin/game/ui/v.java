package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.plugin.game.e.c;
import com.tencent.mm.plugin.game.model.an;
import com.tencent.mm.plugin.game.model.s;
import com.tencent.mm.plugin.game.model.s.h;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.LinkedList;

public final class v
  implements View.OnClickListener
{
  private int fdx;
  private int jNv;
  private int kcP;
  private Context mContext;
  private int mPosition;
  
  public v(Context paramContext)
  {
    this.mContext = paramContext;
    this.fdx = 13;
  }
  
  public final void cI(int paramInt1, int paramInt2)
  {
    this.jNv = paramInt1;
    this.kcP = 1301;
    this.mPosition = paramInt2;
  }
  
  public final void onClick(View paramView)
  {
    if (paramView.getTag() == null) {}
    do
    {
      do
      {
        do
        {
          return;
          if (!(paramView.getTag() instanceof s)) {
            break;
          }
          paramView = (s)paramView.getTag();
        } while (bi.cX(paramView.jMr));
        String str = ((s.h)paramView.jMr.get(0)).jNq;
        if (!bi.oW(str))
        {
          i = c.an(this.mContext, str);
          an.a(this.mContext, this.fdx, this.kcP, this.mPosition, i, 0, paramView.field_appId, this.jNv, paramView.field_msgType, paramView.field_gameMsgId, paramView.jNb, null);
          return;
        }
        x.e("MicroMsg.GameURLClickListener", "message's jumpurl is null");
        return;
      } while (!(paramView.getTag() instanceof String));
      paramView = (String)paramView.getTag();
    } while (bi.oW(paramView));
    int i = c.an(this.mContext, paramView);
    an.a(this.mContext, this.fdx, this.kcP, this.mPosition, i, this.jNv, null);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/game/ui/v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */