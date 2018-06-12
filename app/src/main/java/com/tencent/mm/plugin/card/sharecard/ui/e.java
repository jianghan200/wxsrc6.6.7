package com.tencent.mm.plugin.card.sharecard.ui;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.plugin.card.a.d;
import com.tencent.mm.plugin.card.a.e;
import com.tencent.mm.plugin.card.model.am;
import com.tencent.mm.plugin.card.sharecard.a.b;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;

public final class e
{
  private ImageView bRk;
  private MMActivity gKS;
  View hzL;
  b hzM;
  protected LinearLayout hzN;
  protected LinearLayout hzO;
  private TextView hzP;
  
  public e(MMActivity paramMMActivity)
  {
    this.gKS = paramMMActivity;
  }
  
  private void axT()
  {
    this.hzN.setVisibility(8);
    this.hzO.setVisibility(8);
  }
  
  public final void aL()
  {
    Integer localInteger2 = (Integer)am.axn().getValue("key_share_card_show_type");
    Integer localInteger1 = localInteger2;
    if (localInteger2 == null) {
      localInteger1 = Integer.valueOf(0);
    }
    if ((this.hzM != null) && (b.axK()) && ((localInteger1.intValue() == 1) || (localInteger1.intValue() == 4)) && (b.axH()))
    {
      this.hzP.setVisibility(0);
      axT();
    }
    do
    {
      return;
      this.hzP.setVisibility(8);
      if (this.hzM == null) {
        break;
      }
      x.d("MicroMsg.ShareCardFooterController", "updateView isLocalEnd %s isOtherEnd %s ", new Object[] { Boolean.valueOf(b.axK()), Boolean.valueOf(b.axL()) });
      if ((!b.axK()) || (!b.axL()))
      {
        axR();
        return;
      }
    } while ((!b.axK()) || (!b.axL()));
    this.hzN.setVisibility(8);
    this.hzO.setVisibility(8);
  }
  
  public final void axQ()
  {
    if (this.hzL == null)
    {
      this.hzL = View.inflate(this.gKS, a.e.card_othercity_footer, null);
      this.bRk = ((ImageView)this.hzL.findViewById(a.d.album_next_progress));
      this.hzP = ((TextView)this.hzL.findViewById(a.d.show_other_city));
      this.hzN = ((LinearLayout)this.hzL.findViewById(a.d.loading_more_state));
      this.hzO = ((LinearLayout)this.hzL.findViewById(a.d.loading_end));
      this.hzN.setVisibility(8);
      this.hzO.setVisibility(8);
      RotateAnimation localRotateAnimation = new RotateAnimation(0.0F, 359.0F, 1, 0.5F, 1, 0.5F);
      localRotateAnimation.setDuration(1000L);
      localRotateAnimation.setRepeatCount(-1);
      localRotateAnimation.setInterpolator(new LinearInterpolator());
      this.bRk.startAnimation(localRotateAnimation);
    }
    aL();
  }
  
  public final void axR()
  {
    this.hzN.setVisibility(0);
    this.hzO.setVisibility(8);
  }
  
  public final void axS()
  {
    this.hzN.setVisibility(8);
  }
  
  public final void axU()
  {
    axT();
    this.hzP.setVisibility(8);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/card/sharecard/ui/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */