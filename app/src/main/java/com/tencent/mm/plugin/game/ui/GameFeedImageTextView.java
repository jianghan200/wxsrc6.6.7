package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.bp.a;
import com.tencent.mm.plugin.game.d.ac;
import com.tencent.mm.plugin.game.d.bz;
import com.tencent.mm.plugin.game.e.c;
import com.tencent.mm.plugin.game.e.e.a;
import com.tencent.mm.plugin.game.e.e.a.a;
import com.tencent.mm.plugin.game.f.c;
import com.tencent.mm.plugin.game.f.e;
import com.tencent.mm.plugin.game.model.an;
import com.tencent.mm.sdk.platformtools.bi;
import java.util.LinkedList;

public class GameFeedImageTextView
  extends LinearLayout
  implements View.OnClickListener
{
  private int hmV = 0;
  private com.tencent.mm.plugin.game.model.e jUA;
  private GameFeedTitleDescView jXU;
  private GameRoundImageView jXY;
  private LinearLayout jYc;
  private GameRoundImageView jYd;
  private GameRoundImageView jYe;
  private GameRoundImageView jYf;
  private TextView jYg;
  private GameFeedSubscriptView jYh;
  private int jYi = 0;
  private int jYj;
  
  public GameFeedImageTextView(Context paramContext, AttributeSet paramAttributeSet)
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
    this.jXY = ((GameRoundImageView)findViewById(f.e.big_image));
    this.jYc = ((LinearLayout)findViewById(f.e.small_image_layout));
    this.jYd = ((GameRoundImageView)findViewById(f.e.first_image));
    this.jYe = ((GameRoundImageView)findViewById(f.e.second_image));
    this.jYf = ((GameRoundImageView)findViewById(f.e.third_image));
    this.jYg = ((TextView)findViewById(f.e.more_image_text));
    this.jYh = ((GameFeedSubscriptView)findViewById(f.e.subscript));
    setOnClickListener(this);
    this.hmV = (c.getScreenWidth(getContext()) - getPaddingLeft() - getPaddingRight());
    this.jYi = ((this.hmV - a.fromDPToPix(getContext(), 10) * 2) / 3);
    this.jYj = a.fromDPToPix(getContext(), 105);
    if (this.jYi < this.jYj) {
      this.jYj = this.jYi;
    }
    ViewGroup.LayoutParams localLayoutParams = this.jYd.getLayoutParams();
    localLayoutParams.width = this.jYj;
    localLayoutParams.height = this.jYj;
    this.jYd.setLayoutParams(localLayoutParams);
    this.jYe.setLayoutParams(localLayoutParams);
    this.jYf.setLayoutParams(localLayoutParams);
  }
  
  public void setData(com.tencent.mm.plugin.game.model.e parame)
  {
    if ((parame == null) || (parame.jLz == null) || (parame.jLz.jQr == null))
    {
      setVisibility(8);
      return;
    }
    this.jUA = parame;
    parame = parame.jLz;
    setVisibility(0);
    this.jXU.a(parame.jQr.bHD, parame.jQr.jSA, null);
    int i;
    if (!bi.cX(parame.jQr.jSB))
    {
      i = parame.jQr.jSB.size();
      if (i == 1)
      {
        this.jYc.setVisibility(8);
        this.jXY.setVisibility(0);
        com.tencent.mm.plugin.game.e.e.aVj().a(this.jXY, (String)parame.jQr.jSB.get(0), getResources().getDimensionPixelSize(f.c.GameImageTextWidth), getResources().getDimensionPixelSize(f.c.GameImageTextHeight), c.getScreenWidth(getContext()) - getPaddingLeft() - getPaddingRight());
      }
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
      this.jXY.setVisibility(8);
      this.jYc.setVisibility(0);
      this.jYg.setVisibility(8);
      Object localObject = new e.a.a();
      ((e.a.a)localObject).kdA = true;
      localObject = ((e.a.a)localObject).aVk();
      com.tencent.mm.plugin.game.e.e.aVj().a(this.jYd, (String)parame.jQr.jSB.get(0), (e.a)localObject);
      com.tencent.mm.plugin.game.e.e.aVj().a(this.jYe, (String)parame.jQr.jSB.get(1), (e.a)localObject);
      if (i > 2)
      {
        com.tencent.mm.plugin.game.e.e.aVj().a(this.jYf, (String)parame.jQr.jSB.get(2), (e.a)localObject);
        this.jYf.setVisibility(0);
        if (i > 3)
        {
          this.jYg.setVisibility(0);
          this.jYg.setText(String.format("共%d张", new Object[] { Integer.valueOf(i) }));
        }
      }
      else
      {
        this.jYf.setVisibility(4);
        continue;
        this.jXY.setVisibility(8);
        this.jYc.setVisibility(8);
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/game/ui/GameFeedImageTextView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */