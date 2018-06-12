package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.plugin.game.d.ac;
import com.tencent.mm.plugin.game.d.ci;
import com.tencent.mm.plugin.game.d.dk;
import com.tencent.mm.plugin.game.e.c;
import com.tencent.mm.plugin.game.f.c;
import com.tencent.mm.plugin.game.f.e;
import com.tencent.mm.plugin.game.model.an;
import com.tencent.mm.sdk.platformtools.bi;

public class GameFeedVideoView
  extends LinearLayout
  implements View.OnClickListener
{
  private com.tencent.mm.plugin.game.model.e jUA;
  private GameFeedTitleDescView jXU;
  private FrameLayout jXX;
  private GameRoundImageView jYE;
  private LinearLayout jYF;
  private ImageView jYG;
  private TextView jYH;
  private GameFeedSubscriptView jYh;
  
  public GameFeedVideoView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public void onClick(View paramView)
  {
    if (this.jUA == null) {}
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
    this.jXX = ((FrameLayout)findViewById(f.e.video_ly));
    this.jYE = ((GameRoundImageView)findViewById(f.e.video_cover_image));
    this.jYF = ((LinearLayout)findViewById(f.e.video_desc));
    this.jYG = ((ImageView)findViewById(f.e.video_redot));
    this.jYH = ((TextView)findViewById(f.e.video_desc_text));
    this.jYh = ((GameFeedSubscriptView)findViewById(f.e.subscript));
    setOnClickListener(this);
  }
  
  public void setLiveData(com.tencent.mm.plugin.game.model.e parame)
  {
    if ((parame == null) || (parame.jLz == null) || (parame.jLz.jQt == null))
    {
      setVisibility(8);
      return;
    }
    this.jUA = parame;
    parame = parame.jLz;
    setVisibility(0);
    this.jXU.a(parame.jQt.bHD, parame.jQt.jOS, null);
    if (!bi.oW(parame.jQt.jOT))
    {
      this.jXX.setVisibility(0);
      com.tencent.mm.plugin.game.e.e.aVj().a(this.jYE, parame.jQt.jOT, getResources().getDimensionPixelSize(f.c.GameImageTextWidth), getResources().getDimensionPixelSize(f.c.GameImageTextHeight), c.getScreenWidth(getContext()) - getPaddingLeft() - getPaddingRight());
      label140:
      if (bi.oW(parame.jQt.jSN)) {
        break label267;
      }
      this.jYF.setVisibility(0);
      this.jYG.setVisibility(0);
      this.jYH.setText(parame.jQt.jSN);
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
      this.jXX.setVisibility(8);
      break label140;
      label267:
      this.jYF.setVisibility(8);
    }
  }
  
  public void setVideoData(com.tencent.mm.plugin.game.model.e parame)
  {
    if ((parame == null) || (parame.jLz == null) || (parame.jLz.jQs == null) || (bi.oW(parame.jLz.jQs.jOT)))
    {
      setVisibility(8);
      return;
    }
    this.jUA = parame;
    parame = parame.jLz;
    setVisibility(0);
    this.jXU.a(parame.jQs.bHD, parame.jQs.jOS, null);
    com.tencent.mm.plugin.game.e.e.aVj().a(this.jYE, parame.jQs.jOT, getResources().getDimensionPixelSize(f.c.GameImageTextWidth), getResources().getDimensionPixelSize(f.c.GameImageTextHeight), c.getScreenWidth(getContext()) - getPaddingLeft() - getPaddingRight());
    if (!bi.oW(parame.jQs.jTw))
    {
      this.jYF.setVisibility(0);
      this.jYG.setVisibility(8);
      this.jYH.setText(parame.jQs.jTw);
    }
    for (;;)
    {
      this.jYh.setData(parame);
      return;
      this.jYF.setVisibility(8);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/game/ui/GameFeedVideoView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */