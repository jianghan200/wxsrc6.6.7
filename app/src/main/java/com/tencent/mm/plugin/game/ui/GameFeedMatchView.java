package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import com.tencent.mm.plugin.game.d.ac;
import com.tencent.mm.plugin.game.d.cj;
import com.tencent.mm.plugin.game.e.c;
import com.tencent.mm.plugin.game.f.c;
import com.tencent.mm.plugin.game.f.e;
import com.tencent.mm.plugin.game.model.an;
import com.tencent.mm.sdk.platformtools.bi;

public class GameFeedMatchView
  extends LinearLayout
  implements View.OnClickListener
{
  private com.tencent.mm.plugin.game.model.e jUA;
  private GameFeedTitleDescView jXU;
  private GameFeedSubscriptView jYh;
  private GameRoundImageView jYk;
  
  public GameFeedMatchView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public void onClick(View paramView)
  {
    if ((this.jUA == null) || (this.jUA.jLz == null)) {}
    while (bi.oW(this.jUA.jLz.jOU)) {
      return;
    }
    int i = c.an(getContext(), this.jUA.jLz.jOU);
    an.a(getContext(), 10, 1024, this.jUA.position, i, this.jUA.jLz.jQb, GameIndexListView.getSourceScene(), an.Q(this.jUA.jLz.jPA, "clickType", "card"));
  }
  
  protected void onFinishInflate()
  {
    super.onFinishInflate();
    this.jXU = ((GameFeedTitleDescView)findViewById(f.e.game_feed_title_desc));
    this.jYk = ((GameRoundImageView)findViewById(f.e.big_image));
    this.jYh = ((GameFeedSubscriptView)findViewById(f.e.subscript));
    setOnClickListener(this);
  }
  
  public void setData(com.tencent.mm.plugin.game.model.e parame)
  {
    if ((parame == null) || (parame.jLz == null) || (parame.jLz.jQu == null))
    {
      setVisibility(8);
      return;
    }
    this.jUA = parame;
    parame = parame.jLz;
    setVisibility(0);
    this.jXU.a(parame.jQu.bHD, parame.jQu.jOS, null);
    if (!bi.oW(parame.jQu.jOT))
    {
      this.jYk.setVisibility(0);
      com.tencent.mm.plugin.game.e.e.aVj().a(this.jYk, parame.jQu.jOT, getResources().getDimensionPixelSize(f.c.GameMatchImageWidth), getResources().getDimensionPixelSize(f.c.GameMatchImageHeight), c.getScreenWidth(getContext()) - getPaddingLeft() - getPaddingRight());
    }
    for (;;)
    {
      this.jYh.setData(parame);
      if (this.jUA.jLB) {
        break;
      }
      an.a(getContext(), 10, 1024, this.jUA.position, this.jUA.jLz.jQb, GameIndexListView.getSourceScene(), an.Dx(this.jUA.jLz.jPA));
      this.jUA.jLB = true;
      return;
      setVisibility(8);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/game/ui/GameFeedMatchView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */