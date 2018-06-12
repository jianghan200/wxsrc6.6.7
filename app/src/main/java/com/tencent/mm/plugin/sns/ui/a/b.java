package com.tencent.mm.plugin.sns.ui.a;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.i.i;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.g;
import com.tencent.mm.plugin.sns.ui.TagImageView;
import com.tencent.mm.plugin.sns.ui.ap;
import com.tencent.mm.plugin.sns.ui.ay;
import com.tencent.mm.plugin.sns.ui.r;
import com.tencent.mm.protocal.c.ate;
import com.tencent.mm.protocal.c.bsu;
import com.tencent.mm.protocal.c.qc;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public final class b
  extends a
{
  public final void a(a.c paramc, int paramInt1, ay paramay, bsu parambsu, int paramInt2, com.tencent.mm.plugin.sns.ui.av paramav)
  {
    paramc.oiT.setPosition(paramInt1);
    Object localObject2 = paramay.nMU;
    paramInt2 = parambsu.sqc.ruA.size();
    if (paramInt2 > 0)
    {
      paramay = (ate)parambsu.sqc.ruA.get(0);
      switch (parambsu.sqc.ruz)
      {
      }
    }
    for (;;)
    {
      paramav.hql.c(paramc.oiT, paramav.ntw.okM, paramav.ntw.okv);
      return;
      paramc.oiT.setOnClickListener(paramav.ntw.nNR);
      Object localObject1 = new ap();
      ((ap)localObject1).bNH = ((String)localObject2);
      ((ap)localObject1).index = 0;
      localObject2 = new ArrayList();
      ((List)localObject2).add(paramc.oiT);
      ((ap)localObject1).nWx = ((List)localObject2);
      ((ap)localObject1).nTx = this.nTx;
      ((ap)localObject1).position = paramInt1;
      paramc.oiT.setTag(localObject1);
      paramc.oiT.setVisibility(0);
      localObject1 = af.byl();
      localObject2 = paramc.oiT;
      paramInt1 = this.mActivity.hashCode();
      com.tencent.mm.storage.av localav = com.tencent.mm.storage.av.clT();
      localav.time = parambsu.lOH;
      ((g)localObject1).b(paramay, (View)localObject2, paramInt1, localav);
      paramc.nLz.setVisibility(8);
      paramc.eBO.setText(this.mActivity.getString(i.j.sns_photo_collapse_title, new Object[] { Integer.valueOf(paramInt2) }));
      paramc.eBO.setVisibility(0);
      continue;
      paramc.oiT.setTag(new r(parambsu, (String)localObject2));
      paramc.oiT.setOnClickListener(paramav.ntw.okT);
      paramc.nLz.setImageResource(i.i.sns_collapse_video_play);
      paramc.nLz.setVisibility(0);
      paramc.eBO.setVisibility(8);
      localObject1 = af.byl();
      localObject2 = paramc.oiT;
      paramInt1 = this.mActivity.hashCode();
      localav = com.tencent.mm.storage.av.clT();
      localav.time = parambsu.lOH;
      ((g)localObject1).b(paramay, (View)localObject2, paramInt1, localav);
    }
  }
  
  public final void c(a.c paramc)
  {
    int i = af.byw();
    if (paramc.oiQ != null) {
      if (!paramc.ojB)
      {
        paramc.oiQ.setLayoutResource(i.g.sns_media_collapse_item);
        paramc.ojC = paramc.oiQ.inflate();
      }
    }
    for (paramc.ojB = true;; paramc.ojB = true)
    {
      paramc.oiT = ((TagImageView)paramc.ojC.findViewById(i.f.content_preview));
      paramc.nLz = ((ImageView)paramc.ojC.findViewById(i.f.state));
      paramc.eBO = ((TextView)paramc.ojC.findViewById(i.f.content_hint));
      View localView = paramc.ojC;
      ViewGroup.LayoutParams localLayoutParams = localView.getLayoutParams();
      localLayoutParams.height = i;
      localLayoutParams.width = i;
      localView.setLayoutParams(localLayoutParams);
      i.b(paramc.oiT, this.mActivity);
      return;
      paramc.ojC = paramc.jEz.findViewById(i.f.content_collapse_rl);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */