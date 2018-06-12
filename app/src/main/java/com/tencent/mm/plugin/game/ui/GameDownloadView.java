package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.FrameLayout;
import com.tencent.mm.plugin.game.e.c;
import com.tencent.mm.plugin.game.f.e;
import com.tencent.mm.plugin.game.f.f;
import com.tencent.mm.plugin.game.model.m;
import com.tencent.mm.plugin.game.model.m.b;
import com.tencent.mm.plugin.game.model.n;
import com.tencent.mm.plugin.game.widget.TextProgressBar;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ah;

public class GameDownloadView
  extends FrameLayout
  implements View.OnClickListener
{
  private n jWB;
  private m.b jWz = new GameDownloadView.4(this);
  private Button jXG;
  private TextProgressBar jXH;
  private d jXI;
  
  public GameDownloadView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  private void aUU()
  {
    ah.A(new GameDownloadView.3(this));
  }
  
  public void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    m.a(this.jWz);
  }
  
  public void onClick(View paramView)
  {
    this.jWB.dC(ad.getContext());
    this.jXI.a(this.jWB.jMa, this.jWB);
  }
  
  public void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    m.b(this.jWz);
  }
  
  public void onFinishInflate()
  {
    super.onFinishInflate();
    View localView = LayoutInflater.from(getContext()).inflate(f.f.game_download_view, this, true);
    this.jXG = ((Button)localView.findViewById(f.e.game_download_btn));
    this.jXH = ((TextProgressBar)localView.findViewById(f.e.game_download_progress));
    this.jXH.setTextSize(14);
    this.jXG.setOnClickListener(this);
    this.jXH.setOnClickListener(this);
    this.jXI = new d(getContext());
    this.jXI.jUg = new GameDownloadView.1(this);
  }
  
  public final void refresh()
  {
    if (this.jWB != null)
    {
      this.jWB.dC(ad.getContext());
      this.jWB.aTT();
      aUU();
    }
  }
  
  public void setDownloadInfo(n paramn)
  {
    this.jWB = paramn;
    c.Em().H(new GameDownloadView.2(this));
    aUU();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/game/ui/GameDownloadView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */