package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.plugin.game.d.w;
import com.tencent.mm.plugin.game.f.e;
import com.tencent.mm.plugin.game.widget.GameSmallAvatarList;
import com.tencent.mm.sdk.platformtools.bi;

public class GameFeedSocialInfoView
  extends LinearLayout
{
  private TextView hVS;
  private LinearLayout jYt;
  private GameSmallAvatarList jYu;
  private TextView jYv;
  private LinearLayout jYw;
  
  public GameFeedSocialInfoView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  protected void onFinishInflate()
  {
    super.onFinishInflate();
    this.jYt = ((LinearLayout)findViewById(f.e.avatar_layout));
    this.jYu = ((GameSmallAvatarList)findViewById(f.e.avatar_list));
    this.jYv = ((TextView)findViewById(f.e.avatar_desc));
    this.jYw = ((LinearLayout)findViewById(f.e.desc));
    this.hVS = ((TextView)findViewById(f.e.desc_text));
  }
  
  public void setData(w paramw)
  {
    if ((!bi.cX(paramw.jQg)) || (paramw.jQh != null))
    {
      this.jYt.setVisibility(0);
      this.jYu.setData(paramw.jQg);
      if (paramw.jQh != null)
      {
        this.jYv.setText(paramw.jQh);
        this.jYv.setVisibility(0);
      }
    }
    while (paramw.jOS != null)
    {
      this.jYw.setVisibility(0);
      this.hVS.setText(paramw.jOS);
      return;
      this.jYv.setVisibility(8);
      continue;
      this.jYt.setVisibility(8);
    }
    this.jYw.setVisibility(8);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/game/ui/GameFeedSocialInfoView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */