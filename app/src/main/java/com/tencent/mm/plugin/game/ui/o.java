package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.tencent.mm.plugin.game.e.c;
import com.tencent.mm.plugin.game.model.an;
import com.tencent.mm.plugin.game.model.s;
import com.tencent.mm.sdk.platformtools.bi;

public final class o
  extends b
{
  public o(Context paramContext, int paramInt)
  {
    super(paramContext);
    this.jNv = paramInt;
  }
  
  public final void onClick(View paramView)
  {
    if (!(paramView.getTag() instanceof s)) {}
    do
    {
      return;
      paramView = (s)paramView.getTag();
      switch (paramView.field_msgType)
      {
      default: 
        Bundle localBundle = new Bundle();
        localBundle.putCharSequence("game_app_id", paramView.field_appId);
        localBundle.putInt("game_report_from_scene", 1301);
        i = c.b(this.mContext, paramView.field_appId, null, localBundle);
        an.a(this.mContext, 13, 1301, 5, i, 0, paramView.field_appId, this.jNv, paramView.field_msgType, paramView.field_gameMsgId, paramView.jNb, null);
        return;
      }
    } while (bi.oW(paramView.jMq));
    int i = c.an(this.mContext, paramView.jMq);
    an.a(this.mContext, 13, 1301, 5, i, 0, paramView.field_appId, this.jNv, paramView.field_msgType, paramView.field_gameMsgId, paramView.jNb, null);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/game/ui/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */