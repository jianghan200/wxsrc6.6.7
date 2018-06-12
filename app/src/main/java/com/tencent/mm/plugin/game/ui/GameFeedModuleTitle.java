package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.plugin.game.f.e;
import com.tencent.mm.plugin.game.model.e;
import com.tencent.mm.sdk.platformtools.bi;

public class GameFeedModuleTitle
  extends LinearLayout
{
  private TextView gsY;
  
  public GameFeedModuleTitle(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  protected void onFinishInflate()
  {
    super.onFinishInflate();
    this.gsY = ((TextView)findViewById(f.e.game_feed_title));
  }
  
  public void setData(e parame)
  {
    if ((parame == null) || (bi.oW(parame.jLy)))
    {
      setVisibility(8);
      return;
    }
    setVisibility(0);
    this.gsY.setText(parame.jLy);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/game/ui/GameFeedModuleTitle.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */