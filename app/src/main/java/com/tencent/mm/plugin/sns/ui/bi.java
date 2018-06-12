package com.tencent.mm.plugin.sns.ui;

import android.widget.ListView;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.x;

public final class bi
{
  ListView kww;
  SnsCommentFooter nLN;
  public int nUa = -1;
  int nVx = -1;
  int ohP = -1;
  int ohQ = -1;
  public int ohR = 0;
  boolean ohS = false;
  int ohT;
  protected long ohU;
  Runnable ohV = new bi.1(this);
  Runnable ohW = new bi.2(this);
  Runnable ohX = new bi.3(this);
  int position = -1;
  
  public bi(ListView paramListView, SnsCommentFooter paramSnsCommentFooter)
  {
    this.kww = paramListView;
    this.nLN = paramSnsCommentFooter;
  }
  
  public final void bEE()
  {
    this.ohS = true;
    new ag().postDelayed(this.ohV, 30L);
    this.ohT = 10;
    x.e("MicroMsg.TimeLineScrollAnimation", "footerTop when up :" + this.nLN.getTop());
    this.ohU = com.tencent.mm.sdk.platformtools.bi.VG();
  }
  
  public final void bEF()
  {
    this.ohS = true;
    this.ohT = 20;
    new ag().postDelayed(this.ohW, 100L);
  }
  
  public final void bEG()
  {
    if (this.ohS)
    {
      this.ohS = false;
      new ag().postDelayed(this.ohX, 30L);
      this.ohT = 10;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/bi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */