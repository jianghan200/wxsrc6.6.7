package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.bp.a;
import com.tencent.mm.plugin.game.d.ar;
import com.tencent.mm.plugin.game.d.w;
import com.tencent.mm.plugin.game.e.c;
import com.tencent.mm.plugin.game.f.e;
import com.tencent.mm.plugin.game.model.an;
import com.tencent.mm.plugin.game.model.d;
import com.tencent.mm.plugin.game.model.n;
import com.tencent.mm.plugin.game.widget.AutoResizeTextView;
import com.tencent.mm.plugin.game.widget.GameTagListView;
import com.tencent.mm.sdk.platformtools.bi;
import java.util.LinkedList;

public class GameBestSellingItemView
  extends LinearLayout
  implements View.OnClickListener
{
  private com.tencent.mm.plugin.game.model.e jUA;
  AutoResizeTextView jUs;
  ImageView jUt;
  TextView jUu;
  GameTagListView jUv;
  GameDownloadView jUw;
  View jUx;
  private int jUy;
  private w jUz;
  
  public GameBestSellingItemView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public void onClick(View paramView)
  {
    if ((this.jUz == null) || (bi.oW(this.jUz.jOV.jOX))) {
      return;
    }
    int i = c.an(getContext(), this.jUz.jOV.jOX);
    an.a(getContext(), 10, 1022, this.jUA.jLA + 1, i, this.jUz.jOV.jPc, GameIndexListView.getSourceScene(), an.Dx(this.jUA.jLz.jPA));
  }
  
  protected void onFinishInflate()
  {
    super.onFinishInflate();
    this.jUs = ((AutoResizeTextView)findViewById(f.e.game_num));
    this.jUt = ((ImageView)findViewById(f.e.game_icon));
    this.jUu = ((TextView)findViewById(f.e.game_name));
    this.jUv = ((GameTagListView)findViewById(f.e.tag_list));
    this.jUw = ((GameDownloadView)findViewById(f.e.game_btn_container));
    this.jUx = findViewById(f.e.social_stub);
    this.jUy = (c.getScreenWidth(getContext()) - a.fromDPToPix(getContext(), 190));
    setOnClickListener(this);
  }
  
  public void setData(com.tencent.mm.plugin.game.model.e parame)
  {
    if ((parame == null) || (parame.jLz == null) || (parame.jLz.jQx == null) || (bi.cX(parame.jLz.jQx.jPz))) {
      setVisibility(8);
    }
    for (;;)
    {
      return;
      this.jUA = parame;
      w localw = (w)parame.jLz.jQx.jPz.get(parame.jLA);
      int i = parame.jLA + 1;
      if ((localw == null) || (localw.jOV == null)) {
        setVisibility(8);
      }
      while (!parame.jLB)
      {
        an.a(getContext(), 10, 1022, parame.jLA + 1, localw.jOV.jPc, GameIndexListView.getSourceScene(), an.Dx(parame.jLz.jPA));
        parame.jLB = true;
        return;
        this.jUz = localw;
        d locald = com.tencent.mm.plugin.game.model.ac.a(this.jUz.jOV);
        locald.scene = 10;
        locald.bYq = 1022;
        locald.position = (this.jUA.jLA + 1);
        this.jUw.setDownloadInfo(new n(locald));
        setVisibility(0);
        this.jUs.setText(String.valueOf(i));
        if (i == 1) {
          this.jUs.setTextColor(c.parseColor("#EED157"));
        }
        for (;;)
        {
          com.tencent.mm.plugin.game.e.e.aVj().a(this.jUt, localw.jOV.jPc, a.getDensity(getContext()));
          this.jUu.setText(localw.jOV.jPe);
          this.jUv.e(localw.jOV.jPt, this.jUy);
          if ((bi.cX(localw.jQg)) && (localw.jQh == null) && (localw.jOS == null)) {
            break label422;
          }
          if ((this.jUx instanceof ViewStub)) {
            this.jUx = ((ViewStub)this.jUx).inflate();
          }
          ((GameFeedSocialInfoView)this.jUx.findViewById(f.e.game_social_info)).setData(localw);
          break;
          if (i == 2) {
            this.jUs.setTextColor(c.parseColor("#BDC5CB"));
          } else if (i == 3) {
            this.jUs.setTextColor(c.parseColor("#D4B897"));
          } else {
            this.jUs.setTextColor(c.parseColor("#B2B2B2"));
          }
        }
        label422:
        this.jUx.setVisibility(8);
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/game/ui/GameBestSellingItemView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */