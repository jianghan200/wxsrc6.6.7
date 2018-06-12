package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.plugin.game.f.e;
import com.tencent.mm.sdk.platformtools.bi;

public class GameBestSellingTitle
  extends LinearLayout
{
  public GameBestSellingTitle(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public void setText(String paramString)
  {
    if (bi.oW(paramString))
    {
      setVisibility(8);
      return;
    }
    setVisibility(0);
    ((TextView)findViewById(f.e.game_best_selling_item_title)).setText(paramString);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/game/ui/GameBestSellingTitle.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */