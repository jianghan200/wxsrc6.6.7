package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.mm.bp.a;
import com.tencent.mm.plugin.game.d.cr;
import com.tencent.mm.plugin.game.e.c;
import com.tencent.mm.plugin.game.f.c;
import com.tencent.mm.plugin.game.f.e;
import com.tencent.mm.plugin.game.model.an;
import com.tencent.mm.plugin.game.model.n;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public class GameFeedNoGamePlayTemplate
  extends LinearLayout
  implements View.OnClickListener
{
  private ImageView gER;
  private com.tencent.mm.plugin.game.model.e jUA;
  GameDownloadView jUw;
  private GameRoundImageView jXY;
  private ImageView jXZ;
  private GameFeedTitleDescView jYl;
  private FrameLayout jYm;
  private RelativeLayout jYn;
  private TextView jYo;
  
  public GameFeedNoGamePlayTemplate(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public void onClick(View paramView)
  {
    if ((this.jUA == null) || (this.jUA.jLz == null) || (this.jUA.jLz.jQw == null)) {}
    do
    {
      return;
      if ((paramView.getId() == f.e.image_ly) && (!bi.oW(this.jUA.jLz.jQw.jRi)))
      {
        i = c.an(getContext(), this.jUA.jLz.jQw.jRi);
        an.a(getContext(), 10, 1024, this.jUA.position, i, this.jUA.jLz.jQb, GameIndexListView.getSourceScene(), an.Q(this.jUA.jLz.jPA, "clickType", "middle"));
        return;
      }
    } while (bi.oW(this.jUA.jLz.jOU));
    int i = c.an(getContext(), this.jUA.jLz.jOU);
    an.a(getContext(), 10, 1024, this.jUA.position, i, this.jUA.jLz.jQb, GameIndexListView.getSourceScene(), an.Q(this.jUA.jLz.jPA, "clickType", "card"));
  }
  
  public void onFinishInflate()
  {
    super.onFinishInflate();
    this.jYl = ((GameFeedTitleDescView)findViewById(f.e.game_feed_title_desc));
    this.jYm = ((FrameLayout)findViewById(f.e.image_ly));
    this.jXY = ((GameRoundImageView)findViewById(f.e.cover_image));
    this.jXZ = ((ImageView)findViewById(f.e.video_play));
    this.jYn = ((RelativeLayout)findViewById(f.e.game_desc_container));
    this.gER = ((ImageView)findViewById(f.e.game_icon));
    this.jYo = ((TextView)findViewById(f.e.game_name));
    this.jUw = ((GameDownloadView)findViewById(f.e.game_download_container));
    setOnClickListener(this);
    this.jYm.setOnClickListener(this);
  }
  
  public void setData(com.tencent.mm.plugin.game.model.e parame)
  {
    x.d("MicroMsg.GameFeedNoGamePlayTemplate", "setData");
    if ((parame == null) || (parame.jLz == null) || (parame.jLz.jQw == null))
    {
      setVisibility(8);
      return;
    }
    x.d("MicroMsg.GameFeedNoGamePlayTemplate", "setData 1");
    this.jUA = parame;
    parame = parame.jLz;
    setVisibility(0);
    this.jYl.a(parame.jQw.bHD, parame.jQw.jOS, parame.jQw.jTa);
    this.jYm.setVisibility(0);
    if (!bi.oW(parame.jQw.jOT))
    {
      com.tencent.mm.plugin.game.e.e.aVj().a(this.jXY, parame.jQw.jOT, getResources().getDimensionPixelSize(f.c.GameMatchImageWidth), getResources().getDimensionPixelSize(f.c.GameMatchImageHeight), c.getScreenWidth(getContext()) - getPaddingLeft() - getPaddingRight());
      if (!bi.oW(parame.jQw.jRi)) {
        this.jXZ.setVisibility(0);
      }
    }
    for (;;)
    {
      if (parame.jQw.jOV != null)
      {
        this.jYn.setVisibility(0);
        com.tencent.mm.plugin.game.e.e.aVj().a(this.gER, parame.jQw.jOV.jPc, a.getDensity(getContext()));
        this.jYo.setText(parame.jQw.jOV.jPe);
        parame = com.tencent.mm.plugin.game.model.ac.a(parame.jQw.jOV);
        parame.scene = 10;
        parame.bYq = 1024;
        parame.position = this.jUA.position;
        this.jUw.setDownloadInfo(new n(parame));
      }
      if (this.jUA.jLB) {
        break;
      }
      an.a(getContext(), 10, 1024, this.jUA.position, this.jUA.jLz.jQb, GameIndexListView.getSourceScene(), an.Dx(this.jUA.jLz.jPA));
      this.jUA.jLB = true;
      return;
      this.jXZ.setVisibility(8);
      continue;
      this.jYm.setVisibility(8);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/game/ui/GameFeedNoGamePlayTemplate.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */