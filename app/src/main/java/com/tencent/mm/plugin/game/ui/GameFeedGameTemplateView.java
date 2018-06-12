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
import com.tencent.mm.bp.a;
import com.tencent.mm.plugin.game.d.av;
import com.tencent.mm.plugin.game.e.c;
import com.tencent.mm.plugin.game.f.c;
import com.tencent.mm.plugin.game.f.e;
import com.tencent.mm.plugin.game.model.an;
import com.tencent.mm.plugin.game.model.n;
import com.tencent.mm.plugin.game.widget.GameTagListView;
import com.tencent.mm.sdk.platformtools.bi;

public class GameFeedGameTemplateView
  extends LinearLayout
  implements View.OnClickListener
{
  private TextView hVS;
  private com.tencent.mm.plugin.game.model.e jUA;
  private int jUy;
  private ImageView jWE;
  private TextView jWF;
  private GameTagListView jXW;
  private FrameLayout jXX;
  private GameRoundImageView jXY;
  private ImageView jXZ;
  private GameFeedSubscriptView jYa;
  private GameDownloadView jYb;
  
  public GameFeedGameTemplateView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  private void b(ImageView paramImageView, String paramString)
  {
    int i = getResources().getDimensionPixelSize(f.c.GameMatchImageWidth);
    int j = getResources().getDimensionPixelSize(f.c.GameMatchImageHeight);
    com.tencent.mm.plugin.game.e.e.aVj().a(paramImageView, paramString, i, j, c.getScreenWidth(getContext()) - getPaddingLeft() - getPaddingRight());
  }
  
  public void onAttachedToWindow()
  {
    super.onAttachedToWindow();
  }
  
  public void onClick(View paramView)
  {
    if ((this.jUA == null) || (this.jUA.jLz == null)) {}
    do
    {
      return;
      if ((paramView.getId() == f.e.video_ly) && (!bi.oW(this.jUA.jLz.jQv.jRh)))
      {
        i = c.an(getContext(), this.jUA.jLz.jQv.jRh);
        an.a(getContext(), 10, 1024, this.jUA.position, i, this.jUA.jLz.jQb, GameIndexListView.getSourceScene(), an.Q(this.jUA.jLz.jPA, "clickType", "middle"));
        return;
      }
    } while (bi.oW(this.jUA.jLz.jOU));
    int i = c.an(getContext(), this.jUA.jLz.jOU);
    an.a(getContext(), 10, 1024, this.jUA.position, i, this.jUA.jLz.jQb, GameIndexListView.getSourceScene(), an.Q(this.jUA.jLz.jPA, "clickType", "card"));
  }
  
  public void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
  }
  
  protected void onFinishInflate()
  {
    super.onFinishInflate();
    this.jWE = ((ImageView)findViewById(f.e.game_icon));
    this.jWF = ((TextView)findViewById(f.e.game_name));
    this.jXW = ((GameTagListView)findViewById(f.e.game_tag_list));
    this.hVS = ((TextView)findViewById(f.e.desc));
    this.jXX = ((FrameLayout)findViewById(f.e.video_ly));
    this.jXY = ((GameRoundImageView)findViewById(f.e.image));
    this.jXZ = ((ImageView)findViewById(f.e.video_play));
    this.jYa = ((GameFeedSubscriptView)findViewById(f.e.subscript));
    this.jYb = ((GameDownloadView)findViewById(f.e.game_download_container));
    setOnClickListener(this);
    this.jUy = (c.getScreenWidth(getContext()) - a.fromDPToPix(getContext(), 175));
  }
  
  public void setData(com.tencent.mm.plugin.game.model.e parame)
  {
    if ((parame == null) || (parame.jLz == null) || (parame.jLz.jQv == null))
    {
      setVisibility(8);
      return;
    }
    this.jUA = parame;
    parame = parame.jLz;
    setVisibility(0);
    com.tencent.mm.plugin.game.e.e.aVj().a(this.jWE, parame.jQv.jOV.jPc, a.getDensity(getContext()));
    this.jWF.setText(parame.jQv.jOV.jPe);
    this.jXW.e(parame.jQv.jOV.jPt, this.jUy);
    if (!bi.oW(parame.jQv.jRg))
    {
      this.hVS.setText(parame.jQv.jRg);
      this.hVS.setVisibility(0);
      label143:
      this.jXX.setVisibility(0);
      if (bi.oW(parame.jQv.jRi)) {
        break label335;
      }
      b(this.jXY, parame.jQv.jOT);
      this.jXZ.setVisibility(0);
    }
    for (;;)
    {
      this.jXX.setOnClickListener(this);
      this.jYa.setData(parame);
      parame = com.tencent.mm.plugin.game.model.ac.a(this.jUA.jLz.jQv.jOV);
      parame.scene = 10;
      parame.bYq = 1024;
      parame.position = this.jUA.position;
      this.jYb.setDownloadInfo(new n(parame));
      if (this.jUA.jLB) {
        break;
      }
      an.a(getContext(), 10, 1024, this.jUA.position, this.jUA.jLz.jQb, GameIndexListView.getSourceScene(), an.Dx(this.jUA.jLz.jPA));
      this.jUA.jLB = true;
      return;
      this.hVS.setVisibility(8);
      break label143;
      label335:
      if (!bi.oW(parame.jQv.jOT))
      {
        b(this.jXY, parame.jQv.jOT);
        this.jXZ.setVisibility(8);
      }
      else
      {
        this.jXX.setVisibility(8);
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/game/ui/GameFeedGameTemplateView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */