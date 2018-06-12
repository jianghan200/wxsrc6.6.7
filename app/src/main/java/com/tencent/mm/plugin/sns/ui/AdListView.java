package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.ListView;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelstat.p.a;
import com.tencent.mm.plugin.sight.decode.ui.SightPlayImageView;
import com.tencent.mm.plugin.sns.a.b.j;
import com.tencent.mm.plugin.sns.b.c;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.h.d;
import com.tencent.mm.plugin.sns.model.e;
import com.tencent.mm.plugin.sns.model.f;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.plugin.sns.storage.o;
import com.tencent.mm.plugin.sns.ui.a.a.c;
import com.tencent.mm.protocal.c.bqw;
import com.tencent.mm.protocal.c.bqx;
import com.tencent.mm.protocal.c.bsu;
import com.tencent.mm.protocal.c.dc;
import com.tencent.mm.protocal.c.qc;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.HashSet;

public class AdListView
  extends ListView
{
  com.tencent.mm.plugin.sns.a.b.b nKo;
  f nKp;
  private e nKq;
  private boolean nKr = true;
  private HashSet<String> nKs = new HashSet();
  
  public AdListView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public AdListView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  protected void attachViewToParent(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams)
  {
    super.attachViewToParent(paramView, paramInt, paramLayoutParams);
    String str1 = "";
    paramLayoutParams = str1;
    a.c localc;
    d locald;
    String str2;
    if (paramView.getTag() != null)
    {
      paramLayoutParams = str1;
      if ((paramView.getTag() instanceof a.c))
      {
        localc = (a.c)paramView.getTag();
        str1 = localc.position + " " + localc.bKW;
        d.nxJ.MT(localc.ojM.ksA);
        locald = d.nxJ;
        str2 = localc.ojM.ksA;
        if (localc.ojM.sqb != null) {
          break label458;
        }
      }
    }
    label458:
    for (paramLayoutParams = "";; paramLayoutParams = localc.ojM.sqb.ksA)
    {
      locald.eF(str2, paramLayoutParams);
      if ((this.nKo != null) && (localc.nkG)) {
        this.nKo.a(localc.position, localc.bKW, localc.fvT, localc.jLu, paramView, localc.oiF, localc.nkH, localc.nib, localc.hER, 1);
      }
      if ((!this.nKs.contains(localc.bSZ)) && (((localc.nkG) && (localc.ojM.sqc.ruz == 15)) || (localc.ojM.sqc.ruz == 18)))
      {
        boolean bool2 = false;
        boolean bool1 = bool2;
        if (localc.ojM.sqc.ruz == 15)
        {
          bool1 = bool2;
          if ((localc.ojH.neL instanceof SightPlayImageView)) {
            bool1 = ((SightPlayImageView)localc.ojH.neL).ndx.bvH();
          }
        }
        j.a(com.tencent.mm.plugin.sns.model.af.byo().Nk(localc.bSZ), false, bool1);
        this.nKs.add(localc.bSZ);
      }
      if (this.nKp != null) {
        this.nKp.a(localc.bKW, localc.ojM);
      }
      if (this.nKq != null) {
        this.nKq.a(localc.position, localc.bKW, localc.oiF, localc.fvT, localc.ojM, localc.nkG, localc.nkH);
      }
      paramLayoutParams = str1;
      if (com.tencent.mm.platformtools.af.exM) {
        x.d("MicroMsg.AdListView", "3childview  onAdded " + paramLayoutParams + " count:" + getChildCount());
      }
      return;
    }
  }
  
  protected void detachViewFromParent(int paramInt)
  {
    if (com.tencent.mm.platformtools.af.exM) {
      x.d("MicroMsg.AdListView", "2childview  onRemoved " + paramInt + " count:" + getChildCount());
    }
    super.detachViewFromParent(paramInt);
  }
  
  protected void detachViewFromParent(View paramView)
  {
    String str = "";
    Object localObject = str;
    if (paramView.getTag() != null)
    {
      localObject = str;
      if ((paramView.getTag() instanceof a.c))
      {
        localObject = (a.c)paramView.getTag();
        localObject = ((a.c)localObject).position + " " + ((a.c)localObject).bKW;
      }
    }
    if (com.tencent.mm.platformtools.af.exM) {
      x.d("MicroMsg.AdListView", "1childview  onRemoved " + (String)localObject + " count:" + getChildCount());
    }
    super.detachViewFromParent(paramView);
  }
  
  protected void detachViewsFromParent(int paramInt1, int paramInt2)
  {
    int i = paramInt1;
    while (i < paramInt1 + paramInt2)
    {
      View localView = getChildAt(i);
      String str = "";
      Object localObject = str;
      if (localView.getTag() != null)
      {
        localObject = str;
        if ((localView.getTag() instanceof a.c))
        {
          localObject = (a.c)localView.getTag();
          if ((this.nKo != null) && (((a.c)localObject).nkG)) {
            this.nKo.t(((a.c)localObject).position, ((a.c)localObject).bKW, ((a.c)localObject).fvT);
          }
          if (this.nKp != null) {
            this.nKp.LX(((a.c)localObject).bKW);
          }
          if (this.nKq != null) {
            this.nKq.a(((a.c)localObject).position, ((a.c)localObject).bKW, ((a.c)localObject).oiF, ((a.c)localObject).fvT, ((a.c)localObject).ojM, ((a.c)localObject).nkG);
          }
          localObject = ((a.c)localObject).position + " " + ((a.c)localObject).bKW;
        }
      }
      if (com.tencent.mm.platformtools.af.exM) {
        x.d("MicroMsg.AdListView", "8removeView  detachViewsFromParent " + (String)localObject + " count:" + getChildCount());
      }
      i += 1;
    }
    super.detachViewsFromParent(paramInt1, paramInt2);
  }
  
  protected void layoutChildren()
  {
    super.layoutChildren();
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public void onViewAdded(View paramView)
  {
    String str2 = "";
    String str1 = str2;
    a.c localc;
    d locald;
    String str3;
    if (paramView.getTag() != null)
    {
      str1 = str2;
      if ((paramView.getTag() instanceof a.c))
      {
        localc = (a.c)paramView.getTag();
        str2 = localc.position + " " + localc.bKW;
        d.nxJ.MT(localc.ojM.ksA);
        locald = d.nxJ;
        str3 = localc.ojM.ksA;
        if (localc.ojM.sqb != null) {
          break label451;
        }
      }
    }
    label451:
    for (str1 = "";; str1 = localc.ojM.sqb.ksA)
    {
      locald.eF(str3, str1);
      if ((this.nKo != null) && (localc.nkG)) {
        this.nKo.a(localc.position, localc.bKW, localc.fvT, localc.jLu, paramView, localc.oiF, localc.nkH, localc.nib, localc.hER, 1);
      }
      if ((!this.nKs.contains(localc.bSZ)) && (((localc.nkG) && (localc.ojM.sqc.ruz == 15)) || (localc.ojM.sqc.ruz == 18)))
      {
        boolean bool2 = false;
        boolean bool1 = bool2;
        if (localc.ojM.sqc.ruz == 15)
        {
          bool1 = bool2;
          if ((localc.ojH.neL instanceof SightPlayImageView)) {
            bool1 = ((SightPlayImageView)localc.ojH.neL).ndx.bvH();
          }
        }
        j.a(com.tencent.mm.plugin.sns.model.af.byo().Nk(localc.bSZ), false, bool1);
        this.nKs.add(localc.bSZ);
      }
      if (this.nKp != null) {
        this.nKp.a(localc.bKW, localc.ojM);
      }
      if (this.nKq != null) {
        this.nKq.a(localc.position, localc.bKW, localc.oiF, localc.fvT, localc.ojM, localc.nkG, localc.nkH);
      }
      str1 = str2;
      if (com.tencent.mm.platformtools.af.exM) {
        x.d("MicroMsg.AdListView", "4childview  onViewAdded " + str1 + " count:" + getChildCount());
      }
      return;
    }
  }
  
  public void onViewRemoved(View paramView)
  {
    Object localObject2 = "";
    Object localObject1 = localObject2;
    int i;
    p.a locala;
    String str1;
    String str2;
    if (paramView.getTag() != null)
    {
      localObject1 = localObject2;
      if ((paramView.getTag() instanceof a.c))
      {
        localObject1 = (a.c)paramView.getTag();
        paramView = ((a.c)localObject1).position + " " + ((a.c)localObject1).bKW;
        if ((this.nKo != null) && (((a.c)localObject1).nkG)) {
          this.nKo.t(((a.c)localObject1).position, ((a.c)localObject1).bKW, ((a.c)localObject1).fvT);
        }
        if (this.nKp != null) {
          this.nKp.LX(((a.c)localObject1).bKW);
        }
        if (this.nKq != null) {
          this.nKq.a(((a.c)localObject1).position, ((a.c)localObject1).bKW, ((a.c)localObject1).oiF, ((a.c)localObject1).fvT, ((a.c)localObject1).ojM, ((a.c)localObject1).nkG);
        }
        if (((a.c)localObject1).ojM.sqc.ruz != 3) {
          break label475;
        }
        localObject2 = com.tencent.mm.plugin.sns.model.af.byo().Nk(((a.c)localObject1).bSZ);
        if (localObject2 != null) {
          break label308;
        }
        i = 0;
        locala = p.a.ekV;
        str1 = ((a.c)localObject1).ojM.nNV;
        str2 = i.eF(((a.c)localObject1).oiF);
        if (bi.oW(str1)) {
          break label475;
        }
        localObject1 = new byte[0];
      }
    }
    try
    {
      localObject2 = Base64.decode(str1, 0);
      localObject1 = localObject2;
    }
    catch (Exception localException2)
    {
      for (;;)
      {
        label308:
        x.printErrStackTrace("MicroMsg.SnsStatExtUtil", localException2, null, new Object[0]);
      }
    }
    localObject2 = new bqw();
    for (;;)
    {
      try
      {
        ((bqw)localObject2).aG((byte[])localObject1);
        localObject1 = ((bqw)localObject2).soW;
        if (localObject1 != null) {
          continue;
        }
        localObject1 = paramView;
      }
      catch (Exception localException1)
      {
        x.printErrStackTrace("MicroMsg.SnsStatExtUtil", localException1, "", new Object[0]);
        localView = paramView;
        continue;
        x.i("MicroMsg.SnsStatExtUtil", "report adPageExposure(13235): scene(%d), statExtStr:%s(id=%s, uxinfo=%s)", new Object[] { Integer.valueOf(locala.value), str1, localException2.soW.soZ, localException2.soW.spa });
        ((c)g.l(c.class)).a(13235, i, new Object[] { locala.value, localException2.soW.soZ, localException2.soW.spa, str2 });
      }
      if (com.tencent.mm.platformtools.af.exM) {
        x.d("MicroMsg.AdListView", "5childview  onViewRemoved " + (String)localObject1 + " count:" + getChildCount());
      }
      return;
      i = ((n)localObject2).bBq();
      break;
      label475:
      View localView = paramView;
    }
  }
  
  public void removeView(View paramView)
  {
    super.removeView(paramView);
    String str2 = "";
    String str1 = str2;
    if (paramView.getTag() != null)
    {
      str1 = str2;
      if ((paramView.getTag() instanceof a.c))
      {
        paramView = (a.c)paramView.getTag();
        str1 = paramView.position + " " + paramView.bKW;
      }
    }
    if (com.tencent.mm.platformtools.af.exM) {
      x.d("MicroMsg.AdListView", "7removeView  onViewRemoved " + str1 + " count:" + getChildCount());
    }
  }
  
  public void removeViewInLayout(View paramView)
  {
    String str = "";
    Object localObject = str;
    if (paramView.getTag() != null)
    {
      localObject = str;
      if ((paramView.getTag() instanceof a.c))
      {
        localObject = (a.c)paramView.getTag();
        localObject = ((a.c)localObject).position + " " + ((a.c)localObject).bKW;
      }
    }
    if (com.tencent.mm.platformtools.af.exM) {
      x.d("MicroMsg.AdListView", "6removeViewInLayout  onViewRemoved " + (String)localObject + " count:" + getChildCount());
    }
    super.removeViewInLayout(paramView);
  }
  
  public void setTimelineEvent(e parame)
  {
    this.nKq = parame;
  }
  
  public void setTimelineStat(f paramf)
  {
    this.nKp = paramf;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/AdListView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */