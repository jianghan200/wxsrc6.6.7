package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.g;
import com.tencent.mm.protocal.c.ate;
import com.tencent.mm.protocal.c.atg;
import com.tencent.mm.protocal.c.bsu;
import com.tencent.mm.protocal.c.qc;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.av;
import com.tencent.mm.ui.widget.QFadeImageView;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public final class ar
{
  public static int[] nYA = { i.f.album_img_0, i.f.album_img_1, i.f.album_img_2, i.f.album_img_3, i.f.album_img_4, i.f.album_img_5 };
  public static int[] nYB = { i.f.album_img_0, i.f.album_img_1, i.f.album_img_2, i.f.album_img_3, i.f.album_img_4, i.f.album_img_5, i.f.album_img_6, i.f.album_img_7, i.f.album_img_8 };
  static double nYC = -1.0D;
  static double nYD = -1.0D;
  static double nYE = -1.0D;
  static double nYF = -1.0D;
  static double nYG = -1.0D;
  public static int[] nYx = { 0, 0, 1, 3, 6, 9 };
  public static int[] nYy = { i.f.album_img_0 };
  public static int[] nYz = { i.f.album_img_0, i.f.album_img_1, i.f.album_img_2 };
  private Context context;
  private LinkedList<LinearLayout> nYH = new LinkedList();
  
  public ar(Context paramContext)
  {
    this.context = paramContext;
  }
  
  public ar(Context paramContext, byte paramByte)
  {
    this.context = paramContext;
  }
  
  private static void a(ate paramate, QFadeImageView paramQFadeImageView, int paramInt, av paramav)
  {
    af.byl().b(paramate, paramQFadeImageView, paramInt, paramav);
  }
  
  private static void a(ate paramate, QFadeImageView paramQFadeImageView, String paramString, int paramInt1, int paramInt2, boolean paramBoolean1, av paramav, int paramInt3, boolean paramBoolean2)
  {
    a(paramate, paramQFadeImageView, paramString, paramInt1, paramInt2, paramBoolean1, paramav, paramInt3, paramBoolean2, new atg());
  }
  
  private static void a(ate paramate, QFadeImageView paramQFadeImageView, String paramString, int paramInt1, int paramInt2, boolean paramBoolean1, av paramav, int paramInt3, boolean paramBoolean2, atg paramatg)
  {
    if (paramQFadeImageView == null) {
      x.e("MicroMsg.SnsMultiLineImageLineMgr", "");
    }
    label104:
    label298:
    label439:
    label452:
    label457:
    for (;;)
    {
      return;
      ap localap = new ap();
      localap.bNH = paramString;
      localap.index = 0;
      paramString = new ArrayList();
      paramString.add(paramQFadeImageView);
      localap.nWx = paramString;
      localap.nTx = paramBoolean1;
      localap.position = paramInt2;
      paramQFadeImageView.setTag(localap);
      double d2 = 0.0D;
      double d1 = 0.0D;
      double d3;
      if ((paramInt3 == 11) && (paramBoolean2))
      {
        af.byl().c(paramate, paramQFadeImageView, paramInt1, paramav);
        if (paramate.rVH != null)
        {
          d2 = paramate.rVH.rWu;
          d1 = paramate.rVH.rWv;
        }
        if ((d2 <= 0.0D) || (d1 <= 0.0D)) {
          break label439;
        }
        double d4 = Math.min(nYD / d2, nYD / d1);
        d3 = d2 * d4;
        d4 = d1 * d4;
        d1 = d4;
        d2 = d3;
        if (d3 < nYE)
        {
          d1 = 1.0D * nYE / d3;
          d2 = d3 * d1;
          d1 = d4 * d1;
        }
        d3 = d1;
        d4 = d2;
        if (d1 < nYE)
        {
          d3 = 1.0D * nYE / d1;
          d4 = d2 * d3;
          d3 = d1 * d3;
        }
        d1 = d4;
        if (d4 > nYD) {
          d1 = nYD;
        }
        d2 = d3;
        if (d3 > nYD) {
          d2 = nYD;
        }
        d3 = d1;
        d1 = d3;
        if (d3 < 1.0D) {
          d1 = 1.0D;
        }
        d3 = d2;
        if (d2 < 1.0D) {
          d3 = 1.0D;
        }
        if ((paramatg == null) || (paramatg.rWu <= 0.0F) || (paramatg.rWv <= 0.0F)) {
          break label452;
        }
        d1 = paramatg.rWu;
      }
      for (d2 = paramatg.rWv;; d2 = d3)
      {
        if (!(paramQFadeImageView.getLayoutParams() instanceof FrameLayout.LayoutParams)) {
          break label457;
        }
        paramate = (FrameLayout.LayoutParams)paramQFadeImageView.getLayoutParams();
        if ((paramate.width == d1) && (paramate.height == d2)) {
          break;
        }
        paramQFadeImageView.setLayoutParams(new FrameLayout.LayoutParams((int)d1, (int)d2));
        return;
        af.byl().a(paramate, paramQFadeImageView, paramInt1, paramav);
        break label104;
        d3 = nYC;
        d2 = nYC;
        break label298;
      }
    }
  }
  
  public final void a(PhotosContent paramPhotosContent, bsu parambsu, String paramString, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean, av paramav, List<atg> paramList)
  {
    Object localObject1 = nYB;
    if ((paramInt2 == 2) || (paramInt2 == 11)) {
      localObject1 = nYy;
    }
    int i;
    for (;;)
    {
      parambsu = parambsu.sqc.ruA;
      if (nYC < 0.0D)
      {
        nYC = BackwardSupportUtil.b.b(this.context, 160.0F);
        nYD = BackwardSupportUtil.b.b(this.context, 200.0F);
        nYE = BackwardSupportUtil.b.b(this.context, 44.0F);
        nYF = BackwardSupportUtil.b.b(this.context, 66.0F);
        nYG = BackwardSupportUtil.b.b(this.context, 300.0F);
      }
      i = parambsu.size();
      if (i != 0) {
        break label209;
      }
      paramInt1 = 0;
      while (paramInt1 < localObject1.length)
      {
        af.byl().cx(paramPhotosContent.xm(paramInt1));
        paramPhotosContent.xm(paramInt1).setPosition(paramInt3);
        paramInt1 += 1;
      }
      if (paramInt2 == 3) {
        localObject1 = nYz;
      } else if (paramInt2 == 4) {
        localObject1 = nYA;
      } else if (paramInt2 == 5) {
        localObject1 = nYB;
      }
    }
    paramPhotosContent.setVisibility(8);
    return;
    label209:
    paramPhotosContent.setImageViewWidth(af.byw());
    paramPhotosContent.setVisibility(0);
    Object localObject2;
    if (i == 1)
    {
      i = 1;
      while (i < localObject1.length)
      {
        localObject2 = paramPhotosContent.xm(i);
        ((QFadeImageView)localObject2).setVisibility(8);
        af.byl().cx((View)localObject2);
        paramPhotosContent.xm(i).setPosition(paramInt3);
        i += 1;
      }
      paramPhotosContent.xm(0).setVisibility(0);
      if ((paramList != null) && (paramList.size() > 0))
      {
        a((ate)parambsu.get(0), paramPhotosContent.xm(0), paramString, paramInt1, paramInt3, paramBoolean, paramav, paramInt2, false, (atg)paramList.get(0));
        return;
      }
      a((ate)parambsu.get(0), paramPhotosContent.xm(0), paramString, paramInt1, paramInt3, paramBoolean, paramav, paramInt2, false);
      return;
    }
    if (i == 4)
    {
      paramList = new ArrayList();
      paramInt2 = localObject1.length - 1;
      i = 3;
      label403:
      if (paramInt2 >= 0)
      {
        localObject1 = paramPhotosContent.xm(paramInt2);
        ((TagImageView)localObject1).setPosition(paramInt3);
        if ((paramInt2 != 0) && (paramInt2 != 1) && (paramInt2 != 3) && (paramInt2 != 4)) {
          break label550;
        }
        ((TagImageView)localObject1).setVisibility(0);
        paramList.add(localObject1);
        localObject2 = new ap();
        ((ap)localObject2).bNH = paramString;
        ((ap)localObject2).index = i;
        ((ap)localObject2).nWx = paramList;
        ((ap)localObject2).nTx = paramBoolean;
        ((ap)localObject2).position = paramInt3;
        ((TagImageView)localObject1).setTag(localObject2);
        a((ate)parambsu.get(((ap)localObject2).index), (QFadeImageView)localObject1, paramInt1, paramav);
        i -= 1;
      }
      for (;;)
      {
        paramInt2 -= 1;
        break label403;
        break;
        label550:
        ((TagImageView)localObject1).setVisibility(8);
        af.byl().cx((View)localObject1);
      }
    }
    paramList = new ArrayList();
    paramInt2 = localObject1.length - 1;
    label584:
    if (paramInt2 >= 0)
    {
      localObject1 = paramPhotosContent.xm(paramInt2);
      ((TagImageView)localObject1).setPosition(paramInt3);
      if (paramInt2 >= parambsu.size()) {
        break label713;
      }
      ((TagImageView)localObject1).setVisibility(0);
      paramList.add(localObject1);
      localObject2 = new ap();
      ((ap)localObject2).bNH = paramString;
      ((ap)localObject2).index = paramInt2;
      ((ap)localObject2).nWx = paramList;
      ((ap)localObject2).nTx = paramBoolean;
      ((ap)localObject2).position = paramInt3;
      ((TagImageView)localObject1).setTag(localObject2);
      a((ate)parambsu.get(((ap)localObject2).index), (QFadeImageView)localObject1, paramInt1, paramav);
    }
    for (;;)
    {
      paramInt2 -= 1;
      break label584;
      break;
      label713:
      ((TagImageView)localObject1).setVisibility(8);
      af.byl().cx((View)localObject1);
    }
  }
  
  public final void a(PhotosContent paramPhotosContent, bsu parambsu, String paramString, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean1, av paramav, boolean paramBoolean2)
  {
    int[] arrayOfInt = nYB;
    if ((paramInt2 == 2) || (paramInt2 == 11)) {
      arrayOfInt = nYy;
    }
    for (;;)
    {
      parambsu = parambsu.sqc.ruA;
      if (nYC < 0.0D)
      {
        nYC = BackwardSupportUtil.b.b(this.context, 160.0F);
        nYD = BackwardSupportUtil.b.b(this.context, 200.0F);
        nYE = BackwardSupportUtil.b.b(this.context, 44.0F);
        nYF = BackwardSupportUtil.b.b(this.context, 66.0F);
        nYG = BackwardSupportUtil.b.b(this.context, 300.0F);
      }
      i = parambsu.size();
      if (i != 0) {
        break label209;
      }
      paramInt1 = 0;
      while (paramInt1 < arrayOfInt.length)
      {
        af.byl().cx(paramPhotosContent.xm(paramInt1));
        paramPhotosContent.xm(paramInt1).setPosition(paramInt3);
        paramInt1 += 1;
      }
      if (paramInt2 == 3) {
        arrayOfInt = nYz;
      } else if (paramInt2 == 4) {
        arrayOfInt = nYA;
      } else if (paramInt2 == 5) {
        arrayOfInt = nYB;
      }
    }
    paramPhotosContent.setVisibility(8);
    label209:
    do
    {
      return;
      paramPhotosContent.setVisibility(0);
    } while (i != 1);
    int i = 1;
    while (i < arrayOfInt.length)
    {
      TagImageView localTagImageView = paramPhotosContent.xm(i);
      localTagImageView.setVisibility(8);
      af.byl().cx(localTagImageView);
      paramPhotosContent.xm(i).setPosition(paramInt3);
      i += 1;
    }
    paramPhotosContent.xm(0).setVisibility(0);
    a((ate)parambsu.get(0), paramPhotosContent.xm(0), paramString, paramInt1, paramInt3, paramBoolean1, paramav, paramInt2, paramBoolean2);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/ar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */