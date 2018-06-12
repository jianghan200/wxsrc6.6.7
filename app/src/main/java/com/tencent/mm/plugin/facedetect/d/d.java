package com.tencent.mm.plugin.facedetect.d;

import android.content.Context;
import android.content.res.Resources;
import android.os.CountDownTimer;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.TranslateAnimation;
import android.widget.TextView;
import com.tencent.mm.plugin.facedetect.FaceProNative;
import com.tencent.mm.plugin.facedetect.a.a;
import com.tencent.mm.plugin.facedetect.a.c;
import com.tencent.mm.plugin.facedetect.a.e;
import com.tencent.mm.plugin.facedetect.a.f;
import com.tencent.mm.plugin.facedetect.a.g;
import com.tencent.mm.plugin.facedetect.a.h;
import com.tencent.mm.plugin.facedetect.model.FaceCharacteristicsResult;
import com.tencent.mm.plugin.facedetect.model.f;
import com.tencent.mm.plugin.facedetect.model.g;
import com.tencent.mm.plugin.facedetect.service.FaceDetectProcessService;
import com.tencent.mm.plugin.facedetect.views.FaceNumberItemView;
import com.tencent.mm.plugin.facedetect.views.FaceNumberView;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;

public final class d
  implements b
{
  boolean hxu = false;
  private a.b iOA = new d.9(this);
  boolean iOL = false;
  private String iOZ = null;
  private int iPa = 0;
  a iPb = null;
  String[] iPc = null;
  int iPd = 0;
  int iPe = 0;
  private FaceNumberView iPf = null;
  private long iPg = -1L;
  private long iPh = -1L;
  boolean iPi = false;
  boolean iPj = false;
  boolean iPk = false;
  boolean iPl = false;
  private Animation iPm;
  private Animation iPn;
  private AnimationSet iPo;
  private Animation iPp;
  final Object iPq = new Object();
  boolean iPr = false;
  b.a iPs = null;
  ag iPt = new d.1(this, Looper.getMainLooper());
  private CountDownTimer iPu = new d.2(this);
  Runnable iPw = new d.3(this);
  private View idE = null;
  
  public d(String paramString)
  {
    this.iPb.iOA = this.iOA;
    this.iPm = AnimationUtils.loadAnimation(ad.getContext(), a.a.slide_right_in);
    this.iPn = AnimationUtils.loadAnimation(ad.getContext(), a.a.face_slide_left_out);
    this.iPp = AnimationUtils.loadAnimation(ad.getContext(), a.a.fast_faded_in);
    this.iPp.setDuration(250L);
    this.iPp.setFillAfter(true);
    this.iOZ = paramString;
    int i;
    if (this.iOZ == null)
    {
      i = 0;
      this.iPa = i;
      aKj();
      if (!aKi()) {
        break label361;
      }
    }
    label361:
    for (this.iPo = ((AnimationSet)AnimationUtils.loadAnimation(ad.getContext(), a.a.face_title_scale_multi));; this.iPo = ((AnimationSet)AnimationUtils.loadAnimation(ad.getContext(), a.a.face_title_scale_single)))
    {
      paramString = new TranslateAnimation(0.0F, 0.0F, 0.0F, ad.getResources().getDimensionPixelSize(a.c.face_hint_msg_tv_anim_distance));
      paramString.setDuration(ad.getContext().getResources().getInteger(a.f.scaleAnimDuration));
      this.iPo.addAnimation(paramString);
      x.i("MicroMsg.NumberFaceMotion", "hy: starting read number: %s", new Object[] { this.iOZ });
      return;
      i = this.iOZ.length();
      break;
    }
  }
  
  private TextView aKh()
  {
    if (this.idE != null) {
      return (TextView)this.idE.findViewById(a.e.hint_msg_tv);
    }
    return null;
  }
  
  private boolean aKi()
  {
    return this.iPa >= 6;
  }
  
  private void aKj()
  {
    int i = 0;
    int j;
    if ((!bi.oW(this.iOZ)) && (aKi()))
    {
      x.i("MicroMsg.NumberFaceMotion", "hy: data too long. need to split into %d rounds", new Object[] { Integer.valueOf(2) });
      this.iPc = new String[2];
      j = this.iPa / 2;
    }
    while (i < 2)
    {
      this.iPc[i] = this.iOZ.substring(j * i, (i + 1) * j);
      i += 1;
      continue;
      this.iPc = new String[1];
      this.iPc[0] = this.iOZ;
    }
  }
  
  private void cy(int paramInt1, int paramInt2)
  {
    x.i("MicroMsg.NumberFaceMotion", "alvinluo groupIndex: %d, itemDataLength: %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt1) });
    if (aKh() != null)
    {
      if (paramInt1 == 1) {
        aKh().setText(ad.getContext().getString(a.h.face_number_msg_single));
      }
    }
    else {
      return;
    }
    TextView localTextView = aKh();
    Context localContext;
    int i;
    if (paramInt2 == -1)
    {
      localContext = ad.getContext();
      i = a.h.face_number_msg_first;
      switch (paramInt1)
      {
      default: 
        localObject = pB(paramInt1);
      }
    }
    label102:
    for (Object localObject = localContext.getString(i, new Object[] { localObject });; localObject = ad.getContext().getString(a.h.face_number_msg, new Object[] { pB(this.iPd + 1) }))
    {
      localTextView.setText((CharSequence)localObject);
      if (paramInt2 <= 0) {
        break;
      }
      x.i("MicroMsg.NumberFaceMotion", "alvinluo start %d group number", new Object[] { Integer.valueOf(paramInt2 + 1) });
      localObject = f.iNu.iNv.iPA;
      if (((g)localObject).iNy != null) {
        break label224;
      }
      x.e("MicroMsg.FaceDetectNativeManager", "hy: startRecord not init");
      return;
      localObject = ad.getContext().getString(a.h.face_number_hint_2nd);
      break label102;
    }
    label224:
    ((g)localObject).iNy.engineGroupChange();
  }
  
  private static String pB(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      x.e("MicroMsg.NumberFaceMotion", "hy: unknown length!!");
      return "";
    case 1: 
      return ad.getContext().getString(a.h.face_number_hint_1);
    case 2: 
      return ad.getContext().getString(a.h.face_number_hint_2);
    case 3: 
      return ad.getContext().getString(a.h.face_number_hint_3);
    }
    return ad.getContext().getString(a.h.face_number_hint_4);
  }
  
  public final void a(Context paramContext, ViewGroup paramViewGroup1, ViewGroup paramViewGroup2)
  {
    x.d("MicroMsg.NumberFaceMotion", "hy: on number init motion");
    this.idE = LayoutInflater.from(paramContext).inflate(a.g.face_hint_number, paramViewGroup2);
    this.iPf = ((FaceNumberView)this.idE.findViewById(a.e.face_text_number));
    cy(this.iPc.length, -1);
    aKh().startAnimation(this.iPm);
    if (this.iPf != null)
    {
      this.iPf.setVisibility(0);
      this.iPf.startAnimation(this.iPm);
      this.iPd = 0;
      eK(false);
      this.iPe = -1;
      aKk();
      this.iPg = bi.VG();
      this.iPh = bi.VG();
      this.hxu = false;
    }
  }
  
  public final boolean a(FaceCharacteristicsResult paramFaceCharacteristicsResult)
  {
    this.iPj = true;
    return this.iPr;
  }
  
  public final boolean aKc()
  {
    return this.iOL;
  }
  
  public final boolean aKd()
  {
    this.iPj = true;
    return this.iPr;
  }
  
  public final void aKe()
  {
    this.hxu = true;
    this.iPr = false;
    Object localObject1 = this.iPb;
    ((a)localObject1).iOB = true;
    x.i("MicroMsg.FaceVoiceRecordLogic", "hy: face start reset");
    for (;;)
    {
      try
      {
        if (((a)localObject1).bDp != null)
        {
          ((a)localObject1).bDp.we();
          ((a)localObject1).bDp = null;
        }
        if (((a)localObject1).eqz != null)
        {
          ((a)localObject1).eqz.wA();
          ((a)localObject1).eqz = null;
        }
        Object localObject2 = ((a)localObject1).eqF;
        if (localObject2 != null) {}
        try
        {
          ((a)localObject1).eqF.release();
          ((a)localObject1).eqF = null;
          ((a)localObject1).erb = true;
          ((a)localObject1).equ = 0;
          localObject1 = this.iPb;
          x.i("MicroMsg.FaceVoiceRecordLogic", "hy: recycling voice.");
          ((a)localObject1).iOA = null;
          this.iPb.aKa();
          if ((com.tencent.mm.plugin.facedetect.e.a.aKA().iSn) && (com.tencent.mm.plugin.facedetect.e.a.aKA().isStarted()))
          {
            localObject1 = this.iPb;
            localObject2 = com.tencent.mm.plugin.facedetect.e.a.aKA().aKB();
            ((a)localObject1).iOD.remove(localObject2);
            if (this.iOL) {
              com.tencent.mm.plugin.facedetect.e.a.aKA().a(null);
            }
          }
          else
          {
            this.iPu.cancel();
            this.iPt.removeCallbacksAndMessages(null);
            if (this.iPf != null)
            {
              localObject1 = this.iPf;
              if ((((FaceNumberView)localObject1).iUq != null) && (((FaceNumberView)localObject1).iUq.length > 0)) {
                break label285;
              }
            }
            if (this.idE != null)
            {
              this.iOL = false;
              this.iPg = -1L;
              this.idE = null;
              this.iPf = null;
            }
            return;
          }
        }
        catch (Exception localException)
        {
          x.printErrStackTrace("MicroMsg.FaceVoiceRecordLogic", localException, "mVoiceSilentDetectAPI.release error", new Object[0]);
          continue;
        }
        com.tencent.mm.plugin.facedetect.e.a.aKA().aKC();
      }
      finally {}
      continue;
      label285:
      int i = 0;
      while (i < ((FaceNumberView)localObject1).iUq.length)
      {
        localObject1.iUq[i].aKM();
        i += 1;
      }
    }
  }
  
  public final b.b aKf()
  {
    return new b.b(90004, "user cancelled in processing");
  }
  
  public final b.a aKg()
  {
    return this.iPs;
  }
  
  final void aKk()
  {
    if (this.iPf != null)
    {
      if (this.iPd >= 0) {
        this.iPf.AY(this.iPc[this.iPd].substring(0, this.iPe + 1));
      }
    }
    else {
      return;
    }
    this.iPf.AY(null);
  }
  
  final void aKl()
  {
    this.iPu.start();
  }
  
  public final boolean b(FaceCharacteristicsResult paramFaceCharacteristicsResult)
  {
    this.iPj = false;
    return this.iPr;
  }
  
  final void eK(boolean paramBoolean)
  {
    if (this.iPf != null)
    {
      cy(this.iPc.length, this.iPd);
      this.iPf.setNumberLengthAndInflate(this.iPc[this.iPd].length());
      this.iPl = false;
      if (!paramBoolean) {
        break label82;
      }
      this.iPm.setAnimationListener(new d.4(this));
      if (this.idE != null) {
        this.idE.startAnimation(this.iPm);
      }
    }
    return;
    label82:
    ah.i(new d.5(this), 500L);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/facedetect/d/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */