package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View.OnClickListener;
import com.tencent.mm.plugin.game.e.c;
import com.tencent.mm.plugin.game.model.s;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public abstract class b
  implements View.OnClickListener
{
  protected int iMc;
  protected int jNv;
  protected Context mContext;
  
  public b(Context paramContext)
  {
    this.mContext = paramContext;
    this.iMc = 1301;
    if (paramContext == null) {
      throw new IllegalArgumentException("context is null.");
    }
  }
  
  protected static int a(Context paramContext, s params)
  {
    if (params == null)
    {
      x.e("MicroMsg.GameMessageOnClickListener", "game message is null.");
      return 0;
    }
    if (!bi.oW(params.field_appId))
    {
      Bundle localBundle = new Bundle();
      localBundle.putCharSequence("game_app_id", params.field_appId);
      localBundle.putInt("game_report_from_scene", 1301);
      return c.b(paramContext, params.field_appId, null, localBundle);
    }
    x.e("MicroMsg.GameMessageOnClickListener", "message type : " + params.field_msgType + " ,message.field_appId is null.");
    return 0;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/ui/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */