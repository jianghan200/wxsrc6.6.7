package com.tencent.mm.plugin.sns.ui.a;

import android.app.Activity;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewStub;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.plugin.sight.decode.a.b.e;
import com.tencent.mm.plugin.sns.i.e;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.i.i;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.an;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.plugin.sns.storage.o;
import com.tencent.mm.plugin.sns.ui.AsyncNormalTextView;
import com.tencent.mm.plugin.sns.ui.ak;
import com.tencent.mm.plugin.sns.ui.ay;
import com.tencent.mm.plugin.sns.ui.j;
import com.tencent.mm.protocal.c.ate;
import com.tencent.mm.protocal.c.atg;
import com.tencent.mm.protocal.c.bsu;
import com.tencent.mm.protocal.c.qc;
import com.tencent.mm.ui.widget.MMPinProgressBtn;
import java.util.LinkedList;

public final class i
  extends a
{
  private int mScreenHeight;
  private int mScreenWidth;
  private b.e okp = new i.1(this);
  
  public final void a(a.c paramc, int paramInt1, ay paramay, bsu parambsu, int paramInt2, com.tencent.mm.plugin.sns.ui.av paramav)
  {
    ate localate;
    n localn;
    label152:
    com.tencent.mm.plugin.sns.model.g localg;
    boolean bool;
    label300:
    Object localObject1;
    Object localObject2;
    if ((parambsu.sqc != null) && (parambsu.sqc.ruA.size() > 0))
    {
      localate = (ate)parambsu.sqc.ruA.get(0);
      com.tencent.mm.sdk.platformtools.x.v("MicroMsg.VideoTimeLineItem", "videoTImeline %d ", new Object[] { Integer.valueOf(paramInt1) });
      localn = af.byo().Nk(paramc.bSZ);
      if ((!paramay.nLv) || (localate == null)) {
        break label803;
      }
      long l = paramay.oew;
      paramc.ojH.neL.setOnCompletionListener(new i.2(this, paramav, l));
      if (!paramav.obV.nLJ.ey(l)) {
        paramc.ojH.neL.setOnDecodeDurationListener(new i.3(this, paramav, l, paramc));
      }
      paramc.ojH.a(parambsu, paramInt1, paramay.nMU, paramay.nLv);
      paramc.ojH.nEJ.setVisibility(8);
      localg = af.byl();
      if ((parambsu.sqc == null) || (parambsu.sqc.ruA.size() <= 0)) {
        break label1924;
      }
      l = System.nanoTime();
      bool = com.tencent.mm.plugin.sns.model.g.t(localate);
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.VideoTimeLineItem", "isMediaSightExist %b duration %s", new Object[] { Boolean.valueOf(bool), Long.valueOf(System.nanoTime() - l) });
      if (bool) {
        break label1104;
      }
      if (!localg.w(localate)) {
        break label857;
      }
      paramc.ojH.nEI.setVisibility(8);
      paramc.ojH.nRD.setVisibility(0);
      paramc.ojH.nRD.cAt();
      localObject1 = com.tencent.mm.modelsns.e.a(paramc.ojM, paramc.ojH.neL.getUIContext(), paramay.nLv);
      if (!paramay.nLv) {
        break label1999;
      }
      localObject2 = paramay.nhc.bAF();
      paramInt2 = ((WindowManager)this.mActivity.getSystemService("window")).getDefaultDisplay().getWidth();
      if ((localObject2 == null) || (((com.tencent.mm.plugin.sns.storage.b)localObject2).nzp != 1) || (!paramc.ojG)) {
        break label1485;
      }
      paramInt2 = paramInt2 - com.tencent.mm.bp.a.fromDPToPix(this.mActivity, 50) - com.tencent.mm.bp.a.fromDPToPix(this.mActivity, 12) - com.tencent.mm.bp.a.fromDPToPix(this.mActivity, 12) - com.tencent.mm.bp.a.fromDPToPix(this.mActivity, 28);
      localObject1 = Pair.create(Integer.valueOf(paramInt2), Integer.valueOf((int)(paramInt2 * localate.rVH.rWv / localate.rVH.rWu)));
    }
    label463:
    label711:
    label734:
    label803:
    label857:
    label1104:
    label1483:
    label1485:
    label1893:
    label1899:
    label1924:
    label1967:
    label1999:
    for (;;)
    {
      paramInt2 = ((Integer)((Pair)localObject1).first).intValue();
      int i = ((Integer)((Pair)localObject1).second).intValue();
      paramc.ojH.neL.dt(paramInt2, i);
      localObject1 = paramc.ojH.nRE.getLayoutParams();
      ((ViewGroup.LayoutParams)localObject1).width = paramInt2;
      ((ViewGroup.LayoutParams)localObject1).height = i;
      paramc.ojH.nRE.setLayoutParams((ViewGroup.LayoutParams)localObject1);
      paramc.ojH.neL.setTagObject(paramc.ojH);
      localObject1 = paramc.ojH.neL;
      paramInt2 = this.mActivity.hashCode();
      localObject2 = com.tencent.mm.storage.av.clT();
      ((com.tencent.mm.storage.av)localObject2).time = parambsu.lOH;
      localg.a(localn, localate, (com.tencent.mm.plugin.sight.decode.a.a)localObject1, paramInt2, paramInt1, (com.tencent.mm.storage.av)localObject2, paramay.nLv);
      paramc.ojH.nRC.setTag(paramc.ojH);
      paramc.ojX.setTag(paramc.ojH);
      paramc.ojY.setTag(paramc.ojH);
      parambsu = an.s(af.getAccSnsPath(), localate.ksA);
      localObject1 = com.tencent.mm.plugin.sns.data.i.j(localate);
      if (FileOp.cn(parambsu + (String)localObject1))
      {
        paramav.obV.nLJ.p(paramay.oew, true);
        if (!paramay.nLv) {
          break label1899;
        }
        if (af.byl().b(localn, null) != 5) {
          break label1893;
        }
        bool = true;
        paramav.obV.nLJ.a(paramay.oew, bool, false);
      }
      for (;;)
      {
        if ((localn == null) || (localn.bzr())) {
          break label1967;
        }
        paramav.hql.c(paramc.ojH.nRC, paramav.ntw.okL, paramav.ntw.okv);
        return;
        localate = null;
        break;
        paramc.ojH.nRE.setVisibility(8);
        paramc.ojH.neL.setOnSightCompletionAction(null);
        paramc.ojH.neL.setOnCompletionListener(null);
        paramc.ojH.neL.setOnDecodeDurationListener(null);
        break label152;
        if ((paramay.nLv) && (localg.b(localn, null) == 5))
        {
          localg.A(localate);
          paramc.ojH.nEI.setVisibility(8);
          paramc.ojH.nRD.setVisibility(0);
          paramc.ojH.nRD.cAt();
          break label300;
        }
        if (localg.x(localate))
        {
          paramc.ojH.nRD.setVisibility(8);
          paramc.ojH.nEI.setImageResource(i.e.sight_chat_error);
          paramc.ojH.nEI.setVisibility(0);
          break label300;
        }
        localg.y(localate);
        paramc.ojH.nEI.setVisibility(0);
        paramc.ojH.nRD.setVisibility(8);
        paramc.ojH.nEI.setImageDrawable(com.tencent.mm.bp.a.f(this.mActivity, i.i.shortvideo_play_btn));
        paramc.ojH.nEI.setContentDescription(this.mActivity.getString(i.j.play_sight_desc));
        if ((!paramay.nLv) && (localg.a(localn, null) == 4))
        {
          paramc.ojH.nEJ.setVisibility(0);
          break label300;
        }
        if ((!paramay.nLv) || (localg.b(localn, null) != 4)) {
          break label300;
        }
        paramc.ojH.nEJ.setVisibility(0);
        break label300;
        if (localg.u(localate))
        {
          paramc.ojH.nEI.setVisibility(0);
          paramc.ojH.nRD.setVisibility(8);
          paramc.ojH.nEI.setImageDrawable(com.tencent.mm.bp.a.f(this.mActivity, i.i.shortvideo_play_btn));
          paramc.ojH.nEI.setContentDescription(this.mActivity.getString(i.j.play_sight_desc));
        }
        for (;;)
        {
          if (!paramc.ojH.neL.bvF()) {
            break label1483;
          }
          com.tencent.mm.sdk.platformtools.x.d("MicroMsg.VideoTimeLineItem", "play video error " + localate.ksA + " " + localate.jPK + " " + localate.rVE + " " + paramInt1);
          localg.y(localate);
          paramc.ojH.nEI.setVisibility(0);
          paramc.ojH.nRD.setVisibility(8);
          paramc.ojH.nEI.setImageDrawable(com.tencent.mm.bp.a.f(this.mActivity, i.i.shortvideo_play_btn));
          paramc.ojH.nEI.setContentDescription(this.mActivity.getString(i.j.play_sight_desc));
          break;
          if (localg.v(localate))
          {
            paramc.ojH.nEI.setVisibility(8);
            paramc.ojH.nRD.setVisibility(8);
          }
          else if ((paramay.nLv) && (localg.b(localn, null) <= 5))
          {
            paramc.ojH.nEI.setVisibility(8);
            paramc.ojH.nRD.setVisibility(8);
          }
          else
          {
            localg.y(localate);
            paramc.ojH.nEI.setVisibility(0);
            paramc.ojH.nRD.setVisibility(8);
            paramc.ojH.nEI.setImageDrawable(com.tencent.mm.bp.a.f(this.mActivity, i.i.shortvideo_play_btn));
            paramc.ojH.nEI.setContentDescription(this.mActivity.getString(i.j.play_sight_desc));
          }
        }
        break label300;
        if ((localObject2 == null) || (((com.tencent.mm.plugin.sns.storage.b)localObject2).nzf <= 0.0F) || (((com.tencent.mm.plugin.sns.storage.b)localObject2).nzg <= 0.0F)) {
          break label1999;
        }
        float f3 = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.e.a(((com.tencent.mm.plugin.sns.storage.b)localObject2).nzf, 1, ((com.tencent.mm.plugin.sns.storage.b)localObject2).nzh, ((com.tencent.mm.plugin.sns.storage.b)localObject2).nzi);
        float f2 = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.e.a(((com.tencent.mm.plugin.sns.storage.b)localObject2).nzg, 1, ((com.tencent.mm.plugin.sns.storage.b)localObject2).nzh, ((com.tencent.mm.plugin.sns.storage.b)localObject2).nzi);
        if (((com.tencent.mm.plugin.sns.storage.b)localObject2).nze == 0)
        {
          float f1 = f3;
          if (f3 >= paramInt2 - com.tencent.mm.bp.a.fromDPToPix(this.mActivity, 50) - com.tencent.mm.bp.a.fromDPToPix(this.mActivity, 12) - com.tencent.mm.bp.a.fromDPToPix(this.mActivity, 12))
          {
            f1 = paramInt2 - com.tencent.mm.bp.a.fromDPToPix(this.mActivity, 50) - com.tencent.mm.bp.a.fromDPToPix(this.mActivity, 12) - com.tencent.mm.bp.a.fromDPToPix(this.mActivity, 12);
            f2 = (int)(((com.tencent.mm.plugin.sns.storage.b)localObject2).nzg * f1 / ((com.tencent.mm.plugin.sns.storage.b)localObject2).nzf);
          }
          localObject1 = Pair.create(Integer.valueOf((int)f1), Integer.valueOf((int)f2));
          break label463;
        }
        if (((com.tencent.mm.plugin.sns.storage.b)localObject2).nze == 1)
        {
          paramInt2 = paramInt2 - com.tencent.mm.bp.a.fromDPToPix(this.mActivity, 50) - com.tencent.mm.bp.a.fromDPToPix(this.mActivity, 50) - com.tencent.mm.bp.a.fromDPToPix(this.mActivity, 12) - com.tencent.mm.bp.a.fromDPToPix(this.mActivity, 12);
          localObject1 = Pair.create(Integer.valueOf(paramInt2), Integer.valueOf((int)(paramInt2 * ((com.tencent.mm.plugin.sns.storage.b)localObject2).nzg / ((com.tencent.mm.plugin.sns.storage.b)localObject2).nzf)));
          paramc.oiK.setLayoutParams(new LinearLayout.LayoutParams(paramInt2, -2));
          break label463;
        }
        if (((com.tencent.mm.plugin.sns.storage.b)localObject2).nze != 2) {
          break label1999;
        }
        paramInt2 = paramInt2 - com.tencent.mm.bp.a.fromDPToPix(this.mActivity, 50) - com.tencent.mm.bp.a.fromDPToPix(this.mActivity, 12) - com.tencent.mm.bp.a.fromDPToPix(this.mActivity, 12);
        localObject1 = Pair.create(Integer.valueOf(paramInt2), Integer.valueOf((int)(paramInt2 * ((com.tencent.mm.plugin.sns.storage.b)localObject2).nzg / ((com.tencent.mm.plugin.sns.storage.b)localObject2).nzf)));
        paramc.oiK.setLayoutParams(new LinearLayout.LayoutParams(paramInt2, -2));
        break label463;
        paramav.obV.nLJ.p(paramay.oew, false);
        break label711;
        bool = false;
        break label734;
        if (af.byl().a(localn, null) == 5)
        {
          bool = true;
          break label734;
        }
        bool = false;
        break label734;
        paramay = paramc.ojH.neL;
        localg.a(paramay, "", -1, this.mActivity.hashCode());
        paramay.setThumbBmp(null);
        paramay.aO(null, false);
      }
      paramav.hql.c(paramc.ojH.nRC, paramav.ntw.okN, paramav.ntw.okv);
      return;
    }
  }
  
  public final void c(a.c paramc)
  {
    Object localObject = new DisplayMetrics();
    this.mActivity.getWindowManager().getDefaultDisplay().getMetrics((DisplayMetrics)localObject);
    this.mScreenWidth = ((DisplayMetrics)localObject).widthPixels;
    this.mScreenHeight = ((DisplayMetrics)localObject).heightPixels;
    if (paramc.oiQ != null)
    {
      paramc.oiQ.setLayoutResource(i.g.sns_media_sight_item);
      paramc.ojF = ((ViewStub)paramc.jEz.findViewById(i.f.images_keeper_li));
      if (!paramc.ojG) {
        paramc.ojH.nRB = paramc.ojF.inflate();
      }
    }
    for (paramc.ojG = true;; paramc.ojG = true)
    {
      paramc.ojH.nRC = paramc.ojH.nRB.findViewById(i.f.chatting_click_area);
      paramc.ojH.neL = ((com.tencent.mm.plugin.sight.decode.a.a)paramc.ojH.nRB.findViewById(i.f.image));
      paramc.ojH.nRC.setOnClickListener(this.nuc.ntw.okS);
      paramc.ojH.nEI = ((ImageView)paramc.ojH.nRB.findViewById(i.f.status_btn));
      paramc.ojH.nRD = ((MMPinProgressBtn)paramc.ojH.nRB.findViewById(i.f.progress));
      paramc.ojH.nRE = ((TextView)paramc.ojH.nRB.findViewById(i.f.endtv));
      paramc.ojH.nEJ = ((TextView)paramc.ojH.nRB.findViewById(i.f.errorTv));
      com.tencent.mm.kernel.g.Ek();
      if (((Boolean)com.tencent.mm.kernel.g.Ei().DT().get(344065, Boolean.valueOf(false))).booleanValue())
      {
        localObject = (TextView)((ViewStub)paramc.ojH.nRB.findViewById(i.f.sight_info_viewstub)).inflate();
        paramc.ojH.neL.setSightInfoView((TextView)localObject);
      }
      return;
      paramc.ojH.nRB = paramc.jEz.findViewById(i.f.sns_media_sight_item);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/a/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */