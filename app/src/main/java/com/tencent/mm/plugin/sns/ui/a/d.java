package com.tencent.mm.plugin.sns.ui.a;

import android.app.Activity;
import android.content.res.Resources;
import android.text.SpannableString;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.TextView.BufferType;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.i.c;
import com.tencent.mm.plugin.sns.i.e;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.i.i;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.g;
import com.tencent.mm.plugin.sns.ui.TagImageView;
import com.tencent.mm.plugin.sns.ui.ay;
import com.tencent.mm.plugin.sns.ui.bg;
import com.tencent.mm.plugin.sns.ui.r;
import com.tencent.mm.protocal.c.ate;
import com.tencent.mm.protocal.c.avq;
import com.tencent.mm.protocal.c.bsu;
import com.tencent.mm.protocal.c.qc;
import com.tencent.mm.sdk.platformtools.bi;
import java.util.LinkedList;

public final class d
  extends a
{
  public final void a(a.c paramc, int paramInt1, ay paramay, bsu parambsu, int paramInt2, com.tencent.mm.plugin.sns.ui.av paramav)
  {
    String str = paramay.nMU;
    if (!parambsu.sqc.ruA.isEmpty())
    {
      paramc.oiT.setPosition(paramInt1);
      paramc.oaa.setVisibility(0);
      paramay = (ate)parambsu.sqc.ruA.get(0);
      Object localObject1 = af.byl();
      Object localObject2 = paramc.oiT;
      paramInt1 = i.i.app_attach_file_icon_music;
      paramInt2 = this.mActivity.hashCode();
      com.tencent.mm.storage.av localav = com.tencent.mm.storage.av.clT();
      localav.time = parambsu.lOH;
      ((g)localObject1).b(paramay, (View)localObject2, paramInt1, paramInt2, localav);
      paramc.nLz.setPressed(false);
      localObject1 = parambsu.ksA;
      if (com.tencent.mm.an.b.PY())
      {
        localObject2 = com.tencent.mm.an.b.Qa();
        if ((localObject2 != null) && (com.tencent.mm.an.b.d((avq)localObject2)) && (((String)localObject1).equals(((avq)localObject2).rsp)))
        {
          paramInt1 = 1;
          if (paramInt1 == 0) {
            break label343;
          }
          paramc.nLz.setImageResource(i.e.music_pauseicon);
          label172:
          paramc.oiT.setTag(new r(parambsu, str));
          paramc.oiT.setOnClickListener(paramav.nUk.ohD);
          paramc.oaa.setTag(new r(parambsu, str));
          paramav.hql.c(paramc.oaa, paramav.ntw.okK, paramav.ntw.okv);
          paramc.oaa.setOnClickListener(paramav.nUk.nZN);
          parambsu = paramay.jOS;
          if (bi.oW(parambsu)) {
            break label356;
          }
          paramc.oiU.setVisibility(0);
          paramc.oiU.setText(parambsu);
        }
      }
      for (;;)
      {
        paramay = paramay.bHD;
        if (bi.oW(paramay)) {
          break label367;
        }
        paramc.eBO.setVisibility(0);
        paramay = new SpannableString(paramay);
        paramc.eBO.setText(paramay, TextView.BufferType.SPANNABLE);
        return;
        paramInt1 = 0;
        break;
        label343:
        paramc.nLz.setImageResource(i.e.music_playicon);
        break label172;
        label356:
        paramc.oiU.setVisibility(4);
      }
      label367:
      paramc.eBO.setVisibility(8);
      return;
    }
    paramc.oaa.setVisibility(8);
  }
  
  public final void c(a.c paramc)
  {
    if (paramc.oiQ != null)
    {
      paramc.oiQ.setLayoutResource(i.g.sns_media_sub_item2);
      paramc.ojA = ((ViewStub)paramc.jEz.findViewById(i.f.images_keeper_li));
      if ((!paramc.ojB) && (paramc.ojA != null)) {
        paramc.ojC = paramc.ojA.inflate();
      }
    }
    for (paramc.ojB = true;; paramc.ojB = true)
    {
      paramc.oaa = paramc.ojC;
      paramc.oaa.findViewById(i.f.state).setOnTouchListener(this.nuc.nNj);
      paramc.oiT = ((TagImageView)paramc.oaa.findViewById(i.f.image_left));
      paramc.nLz = ((ImageView)paramc.oaa.findViewById(i.f.state));
      paramc.oiU = ((TextView)paramc.oaa.findViewById(i.f.righttext));
      paramc.eBO = ((TextView)paramc.oaa.findViewById(i.f.titletext));
      paramc.eBO.setTextColor(this.mActivity.getResources().getColor(i.c.sns_link_color));
      paramc.eBO.setMaxLines(1);
      i.b(paramc.oiT, this.mActivity);
      return;
      paramc.ojC = paramc.jEz.findViewById(i.f.media_content_rl);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */