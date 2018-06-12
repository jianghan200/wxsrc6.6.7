package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.view.View;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.game.model.an;
import com.tencent.mm.plugin.game.model.s;
import com.tencent.mm.plugin.game.model.w;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class p
  extends b
{
  public p(Context paramContext, int paramInt)
  {
    super(paramContext);
    this.jNv = paramInt;
  }
  
  public final void onClick(View paramView)
  {
    paramView = paramView.getTag();
    if (paramView == null)
    {
      x.e("MicroMsg.GameMessageOnClickListener", "Tag is null.");
      paramView = null;
      if (paramView != null) {
        break label84;
      }
      x.e("MicroMsg.GameMessageContentClickListener", "The game message is null.");
    }
    label84:
    do
    {
      do
      {
        return;
        if (!(paramView instanceof Long))
        {
          x.e("MicroMsg.GameMessageOnClickListener", "The tag of action listener is not instance of Long");
          paramView = null;
          break;
        }
        paramView = ((com.tencent.mm.plugin.game.a.c)g.l(com.tencent.mm.plugin.game.a.c.class)).aSj().dH(((Long)paramView).longValue());
        if (paramView != null) {
          paramView.aTW();
        }
        break;
        switch (paramView.field_msgType)
        {
        case 7: 
        case 8: 
        case 9: 
        default: 
          i = a(this.mContext, paramView);
          an.a(this.mContext, 13, 1301, 3, i, 0, paramView.field_appId, this.jNv, paramView.field_msgType, paramView.field_gameMsgId, paramView.jNb, null);
          return;
        case 10: 
        case 11: 
          if (!bi.oW(paramView.jMj))
          {
            i = com.tencent.mm.plugin.game.e.c.an(this.mContext, paramView.jMj);
            an.a(this.mContext, 13, 1301, 3, i, 0, paramView.field_appId, this.jNv, paramView.field_msgType, paramView.field_gameMsgId, paramView.jNb, null);
            return;
          }
          i = a(this.mContext, paramView);
          an.a(this.mContext, 13, 1301, 3, i, 0, paramView.field_appId, this.jNv, paramView.field_msgType, paramView.field_gameMsgId, paramView.jNb, null);
          return;
        }
      } while (bi.oW(paramView.jML));
      i = com.tencent.mm.plugin.game.e.c.an(this.mContext, paramView.jML);
      an.a(this.mContext, 13, 1301, 3, i, 0, paramView.field_appId, this.jNv, paramView.field_msgType, paramView.field_gameMsgId, paramView.jNb, null);
      return;
    } while (bi.oW(paramView.jMO));
    int i = com.tencent.mm.plugin.game.e.c.an(this.mContext, paramView.jMO);
    an.a(this.mContext, 13, 1301, 3, i, 0, paramView.field_appId, this.jNv, paramView.field_msgType, paramView.field_gameMsgId, paramView.jNb, null);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/game/ui/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */