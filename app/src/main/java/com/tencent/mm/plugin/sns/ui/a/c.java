package com.tencent.mm.plugin.sns.ui.a;

import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import com.tencent.mm.model.q;
import com.tencent.mm.plugin.sns.i.e;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.ui.AsyncTextView;
import com.tencent.mm.plugin.sns.ui.PhotosContent;
import com.tencent.mm.plugin.sns.ui.TagImageView;
import com.tencent.mm.plugin.sns.ui.ap;
import com.tencent.mm.plugin.sns.ui.ar;
import com.tencent.mm.plugin.sns.ui.ay;
import com.tencent.mm.plugin.sns.ui.b.b;
import com.tencent.mm.protocal.c.atf;
import com.tencent.mm.protocal.c.boy;
import com.tencent.mm.protocal.c.bpn;
import com.tencent.mm.protocal.c.bsu;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;
import java.util.List;

public final class c
  extends a
{
  private int nUn = 103;
  
  public final void a(a.c paramc, int paramInt1, ay paramay, bsu parambsu, int paramInt2, com.tencent.mm.plugin.sns.ui.av paramav)
  {
    Object localObject = paramay.nMU;
    if (paramc.ojT != null)
    {
      if ((!paramay.oeM) || (paramc.nib.smZ == null) || (paramc.nib.smZ.snB <= 0)) {
        break label238;
      }
      paramc.ojT.setBackgroundResource(i.e.friendactivity_comment_detail_list_golden_myself);
    }
    int i;
    boolean bool;
    for (;;)
    {
      TagImageView localTagImageView = paramc.oji.xm(0);
      ArrayList localArrayList = new ArrayList();
      localArrayList.add(localTagImageView);
      ap localap = new ap();
      localap.bNH = ((String)localObject);
      localap.index = 0;
      localap.nWx = localArrayList;
      localap.nTx = this.nTx;
      if (localTagImageView != null) {
        localTagImageView.setTag(localap);
      }
      localObject = paramay.ofn;
      paramc.nJn = ((atf)localObject);
      if (localObject == null) {
        break label442;
      }
      if (!q.GF().equals(parambsu.hbL)) {
        break;
      }
      paramc.oji.setVisibility(0);
      paramav = paramav.nUc;
      paramc = paramc.oji;
      paramay = paramay.nMU;
      i = this.mActivity.hashCode();
      bool = this.nTx;
      localObject = com.tencent.mm.storage.av.clT();
      ((com.tencent.mm.storage.av)localObject).time = parambsu.lOH;
      paramav.a(paramc, parambsu, paramay, i, paramInt2, paramInt1, bool, (com.tencent.mm.storage.av)localObject, true);
      return;
      label238:
      paramc.ojT.setBackgroundResource(i.e.friendactivity_comment_detail_list_golden_arror);
    }
    if (paramay.oeP)
    {
      paramc.oji.setVisibility(0);
      paramav = paramav.nUc;
      paramc = paramc.oji;
      paramay = paramay.nMU;
      i = this.mActivity.hashCode();
      bool = this.nTx;
      localObject = com.tencent.mm.storage.av.clT();
      ((com.tencent.mm.storage.av)localObject).time = parambsu.lOH;
      paramav.a(paramc, parambsu, paramay, i, paramInt2, paramInt1, bool, (com.tencent.mm.storage.av)localObject, false);
      return;
    }
    if (((atf)localObject).ceS == 0)
    {
      paramc.oji.setVisibility(0);
      paramav = paramav.nUc;
      paramc = paramc.oji;
      paramay = paramay.nMU;
      i = this.mActivity.hashCode();
      bool = this.nTx;
      localObject = com.tencent.mm.storage.av.clT();
      ((com.tencent.mm.storage.av)localObject).time = parambsu.lOH;
      paramav.a(paramc, parambsu, paramay, i, paramInt2, paramInt1, bool, (com.tencent.mm.storage.av)localObject, true);
      return;
    }
    x.e("MiroMsg.HBRewardTimeLineItem", "mediaPostInfo.hbStatus is " + ((atf)localObject).ceS);
    return;
    label442:
    x.e("MiroMsg.HBRewardTimeLineItem", "mediaPostInfo is null " + paramay.nMU);
  }
  
  public final void c(a.c paramc)
  {
    paramc.ojb.setImageResource(i.e.lucky_friendactivity_comment_icon);
    paramc.oiH.setTextColor(-2730427);
    if (paramc.oiQ != null)
    {
      paramc.oiQ.setLayoutResource(i.g.sns_hb_reward_item);
      if (!paramc.oiR) {
        paramc.oji = ((PhotosContent)paramc.oiQ.inflate());
      }
    }
    for (paramc.oiR = true;; paramc.oiR = true)
    {
      x.i("MiroMsg.HBRewardTimeLineItem", "viewtype " + this.hER);
      TagImageView localTagImageView = (TagImageView)paramc.oji.findViewById(ar.nYB[0]);
      paramc.oji.a(localTagImageView);
      localTagImageView.setOnClickListener(this.nuc.ntw.nNR);
      return;
      paramc.oji = ((PhotosContent)paramc.jEz.findViewById(i.f.hb_content_rl));
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */