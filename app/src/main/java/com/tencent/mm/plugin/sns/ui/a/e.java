package com.tencent.mm.plugin.sns.ui.a;

import android.app.Activity;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.i.c;
import com.tencent.mm.plugin.sns.i.e;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.i.i;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.am.a;
import com.tencent.mm.plugin.sns.model.g;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.plugin.sns.ui.TagImageView;
import com.tencent.mm.plugin.sns.ui.ay;
import com.tencent.mm.plugin.sns.ui.bg;
import com.tencent.mm.plugin.sns.ui.r;
import com.tencent.mm.protocal.c.ate;
import com.tencent.mm.protocal.c.bsu;
import com.tencent.mm.protocal.c.cfn;
import com.tencent.mm.protocal.c.qc;
import com.tencent.mm.sdk.platformtools.bi;
import java.util.LinkedList;

public final class e
  extends a
{
  public final void a(a.c paramc, int paramInt1, ay paramay, bsu parambsu, int paramInt2, com.tencent.mm.plugin.sns.ui.av paramav)
  {
    paramc.oiT.setPosition(paramInt1);
    Object localObject1 = paramay.nMU;
    Object localObject2 = paramay.nhc;
    paramInt1 = 0;
    int i;
    if (paramay.nLv)
    {
      if (((n)localObject2).bAF().nzp == 2)
      {
        paramInt1 = 1;
        paramc.oaa.setTag(paramc);
        paramc.oaa.setOnClickListener(paramav.ntw.ole);
      }
      i = 0;
    }
    for (;;)
    {
      label101:
      int j;
      if (paramInt1 != 0)
      {
        paramav.hql.c(paramc.oaa, paramav.ntw.okO, paramav.ntw.okv);
        if (parambsu.sqc.ruz != 9) {
          break label1179;
        }
        j = 1;
        label117:
        if (j == 0) {
          break label1199;
        }
        paramay = com.tencent.mm.plugin.sns.ui.av.Oa(parambsu.sqc.jPK);
        label134:
        if ((parambsu.sqc.ruz != 9) && (parambsu.sqc.ruz != 14) && (parambsu.sqc.ruz != 12) && (parambsu.sqc.ruz != 13) && (paramInt1 == 0)) {
          break label1621;
        }
      }
      label385:
      label410:
      label1179:
      label1199:
      label1530:
      label1542:
      label1566:
      label1575:
      label1621:
      for (paramav = parambsu.sqc.jOS;; paramav = paramay)
      {
        paramay = parambsu.sqc.bHD;
        if ((paramay != null) && (paramay.length() > 40)) {
          paramay = paramay.substring(0, 40) + "...";
        }
        for (;;)
        {
          paramc.nLz.setVisibility(8);
          TagImageView localTagImageView;
          com.tencent.mm.storage.av localav;
          if (!parambsu.sqc.ruA.isEmpty())
          {
            paramc.oiT.setVisibility(0);
            localObject1 = (ate)parambsu.sqc.ruA.get(0);
            if (parambsu.sqc.ruz == 5)
            {
              paramay = ((ate)localObject1).bHD;
              paramc.nLz.setImageResource(i.e.video_playicon_normal);
              paramc.nLz.setVisibility(0);
              localObject2 = af.byl();
              localTagImageView = paramc.oiT;
              paramInt1 = i.i.app_attach_file_icon_video;
              j = this.mActivity.hashCode();
              localav = com.tencent.mm.storage.av.clT();
              localav.time = parambsu.lOH;
              ((g)localObject2).b((ate)localObject1, localTagImageView, paramInt1, j, localav);
              if (bi.oW(paramav)) {
                break label1530;
              }
              paramc.oiU.setVisibility(0);
              paramc.oiU.setText(paramav);
              if (bi.oW(paramay)) {
                break label1575;
              }
              if (paramc.oiU.getVisibility() != 8) {
                break label1542;
              }
              if (paramc.oiV != 2) {
                paramc.eBO.setMaxLines(2);
              }
            }
          }
          for (paramc.oiV = 2;; paramc.oiV = 1)
          {
            paramc.eBO.setVisibility(0);
            if (i == 0) {
              break label1566;
            }
            paramc.eBO.setText(i.a(paramay, this.mActivity, paramc.eBO));
            return;
            if (parambsu.sqc.ruz == 9)
            {
              if (parambsu.sqc.ruA.size() <= 0) {
                break label1627;
              }
              paramc.oaa.setTag(new r(parambsu, (String)localObject1));
              paramc.oaa.setOnClickListener(paramav.nUk.ohx);
              paramInt1 = 0;
              i = 0;
              break;
            }
            if (parambsu.sqc.ruz == 10)
            {
              if (parambsu.sqc.ruA.size() <= 0) {
                break label1627;
              }
              paramc.oaa.setTag(new r(parambsu, (String)localObject1));
              paramc.oaa.setOnClickListener(paramav.nUk.ohz);
              paramInt1 = 0;
              i = 0;
              break;
            }
            if (parambsu.sqc.ruz == 17)
            {
              if (parambsu.sqc.ruA.size() <= 0) {
                break label1627;
              }
              paramc.oaa.setTag(new r(parambsu, (String)localObject1));
              paramc.oaa.setOnClickListener(paramav.nUk.ohA);
              paramInt1 = 0;
              i = 0;
              break;
            }
            if (parambsu.sqc.ruz == 22)
            {
              if (parambsu.sqc.ruA.size() <= 0) {
                break label1627;
              }
              paramc.oaa.setTag(new r(parambsu, (String)localObject1));
              paramc.oaa.setOnClickListener(paramav.nUk.ohB);
              paramInt1 = 0;
              i = 0;
              break;
            }
            if (parambsu.sqc.ruz == 23)
            {
              if (parambsu.sqc.ruA.size() <= 0) {
                break label1627;
              }
              paramc.oaa.setTag(new r(parambsu, (String)localObject1));
              paramc.oaa.setOnClickListener(paramav.nUk.ohC);
              paramInt1 = 0;
              i = 0;
              break;
            }
            if (parambsu.sqc.ruz == 14)
            {
              if (parambsu.sqc.ruA.size() <= 0) {
                break label1627;
              }
              paramc.oaa.setTag(new r(parambsu, (String)localObject1));
              paramc.oaa.setOnClickListener(paramav.nUk.ohy);
              paramInt1 = 0;
              i = 0;
              break;
            }
            if (parambsu.sqc.ruz == 12)
            {
              if (parambsu.sqc.ruA.size() <= 0) {
                break label1627;
              }
              paramc.oaa.setTag(new r(parambsu, (String)localObject1));
              paramc.oaa.setOnClickListener(paramav.nUk.ohG);
              paramInt1 = 0;
              i = 0;
              break;
            }
            if (parambsu.sqc.ruz == 13)
            {
              if (parambsu.sqc.ruA.size() > 0)
              {
                paramc.oaa.setTag(new r(parambsu, (String)localObject1));
                paramc.oaa.setOnClickListener(paramav.nUk.ohH);
                paramInt1 = 0;
                i = 0;
                break;
              }
              paramc.oaa.setOnClickListener(null);
              paramInt1 = 0;
              i = 0;
              break;
            }
            if (parambsu.sqc.ruz == 26)
            {
              paramc.oaa.setTag(new r(parambsu, (String)localObject1));
              paramc.oaa.setOnClickListener(paramav.nUk.ohI);
              paramInt1 = 0;
              i = 0;
              break;
            }
            paramc.oaa.setTag(new r(parambsu, (String)localObject1));
            paramc.oaa.setOnClickListener(paramav.nUk.nZN);
            if ((parambsu.dwt & 0x1) <= 0) {
              break label1627;
            }
            paramInt1 = 0;
            i = 1;
            break;
            paramav.hql.c(paramc.oaa, paramav.ntw.okK, paramav.ntw.okv);
            break label101;
            if ((am.a.byN() & 0x1) <= 0)
            {
              j = 1;
              break label117;
            }
            j = 0;
            break label117;
            paramay = "";
            break label134;
            if (parambsu.sqc.ruz == 18)
            {
              paramc.nLz.setVisibility(0);
              paramc.nLz.setImageResource(i.e.video_playicon_normal);
              paramc.oiT.setVisibility(0);
              localObject2 = af.byl();
              localTagImageView = paramc.oiT;
              paramInt1 = i.i.app_attach_file_icon_video;
              j = this.mActivity.hashCode();
              localav = com.tencent.mm.storage.av.clT();
              localav.time = parambsu.lOH;
              ((g)localObject2).b((ate)localObject1, localTagImageView, paramInt1, j, localav);
              break label385;
            }
            if ((parambsu.nsD != null) && (!bi.oW(parambsu.nsD.pLr)))
            {
              paramc.nLz.setImageResource(i.e.video_playicon_normal);
              paramc.nLz.setVisibility(0);
            }
            localObject2 = af.byl();
            localTagImageView = paramc.oiT;
            paramInt1 = this.mActivity.hashCode();
            localav = com.tencent.mm.storage.av.clT();
            localav.time = parambsu.lOH;
            ((g)localObject2).b((ate)localObject1, localTagImageView, paramInt1, localav);
            break label385;
            if (parambsu.sqc.ruz == 18)
            {
              paramc.nLz.setVisibility(0);
              paramc.nLz.setImageResource(i.e.video_playicon_normal);
              paramc.oiT.setVisibility(0);
              af.byl().a(paramc.oiT, -1, i.i.app_attach_file_icon_video, this.mActivity.hashCode());
              break label385;
            }
            if (parambsu.sqc.ruz == 26)
            {
              paramc.oiT.setVisibility(0);
              af.byl().a(paramc.oiT, -1, i.i.note_sns_link_default, this.mActivity.hashCode());
              break label385;
            }
            paramc.oiT.setVisibility(0);
            af.byl().a(paramc.oiT, -1, i.i.app_attach_file_icon_webpage, this.mActivity.hashCode());
            break label385;
            paramc.oiU.setVisibility(8);
            break label410;
            if (paramc.oiV != 1) {
              paramc.eBO.setMaxLines(1);
            }
          }
          paramc.eBO.setText(paramay);
          return;
          if (paramInt2 == 1)
          {
            paramc.eBO.setText(com.tencent.mm.plugin.sns.ui.av.Oa(parambsu.sqc.jPK));
            paramc.eBO.setVisibility(0);
            return;
          }
          paramc.eBO.setVisibility(8);
          return;
        }
      }
      label1627:
      paramInt1 = 0;
      i = 0;
    }
  }
  
  public final void c(a.c paramc)
  {
    if ((paramc.oiQ != null) && (paramc.oiQ.getParent() != null))
    {
      paramc.oiQ.setLayoutResource(i.g.sns_media_sub_item2);
      if (!paramc.ojB) {
        paramc.ojC = paramc.oiQ.inflate();
      }
    }
    for (paramc.ojB = true;; paramc.ojB = true)
    {
      paramc.oaa = paramc.ojC;
      paramc.oiT = ((TagImageView)paramc.oaa.findViewById(i.f.image_left));
      paramc.nLz = ((ImageView)paramc.oaa.findViewById(i.f.state));
      paramc.oiU = ((TextView)paramc.oaa.findViewById(i.f.righttext));
      paramc.eBO = ((TextView)paramc.oaa.findViewById(i.f.titletext));
      paramc.eBO.setTextColor(this.mActivity.getResources().getColor(i.c.black));
      i.b(paramc.oiT, this.mActivity);
      return;
      paramc.ojC = paramc.jEz.findViewById(i.f.media_content_rl);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/a/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */