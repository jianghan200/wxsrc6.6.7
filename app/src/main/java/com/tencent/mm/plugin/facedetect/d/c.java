package com.tencent.mm.plugin.facedetect.d;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import com.tencent.mm.plugin.facedetect.a.a;
import com.tencent.mm.plugin.facedetect.a.e;
import com.tencent.mm.plugin.facedetect.a.g;
import com.tencent.mm.plugin.facedetect.a.h;
import com.tencent.mm.plugin.facedetect.model.FaceCharacteristicsResult;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.as;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Timer;

public final class c
  implements b
{
  private static String TAG = "MicroMsg.NormalFaceMotion";
  private static long iOK = 500L;
  private boolean iOL = false;
  private boolean iOM = false;
  private View iON = null;
  private View iOO = null;
  private String iOP;
  private long iOQ;
  private final Object iOR = new Object();
  private Timer iOS = null;
  private volatile boolean iOT = false;
  private Animation iOU;
  private volatile boolean iOV = false;
  private volatile boolean iOW = false;
  
  public c(String paramString, long paramLong)
  {
    this.iOP = paramString;
    this.iOQ = paramLong;
    this.iOU = AnimationUtils.loadAnimation(ad.getContext(), a.a.slide_right_in);
  }
  
  public final void a(Context paramContext, ViewGroup paramViewGroup1, ViewGroup paramViewGroup2)
  {
    this.iON = LayoutInflater.from(paramContext).inflate(a.g.face_hint_normal, paramViewGroup1);
    this.iOO = LayoutInflater.from(paramContext).inflate(a.g.face_hint_normal_center, paramViewGroup2);
    this.iOO.setVisibility(4);
    if (aKh() != null) {
      aKh().setText(this.iOP);
    }
    long l = this.iOQ;
    x.i(TAG, "hy: starting tween timer: tween: %d", new Object[] { Long.valueOf(l) });
    if (this.iOS != null) {
      this.iOS.cancel();
    }
    this.iOS = new Timer("FaceDetect_hint", true);
    this.iOT = true;
    this.iOS.scheduleAtFixedRate(new c.2(this), 0L, l);
  }
  
  public final boolean a(FaceCharacteristicsResult paramFaceCharacteristicsResult)
  {
    if ((this.iOL) && (paramFaceCharacteristicsResult != null) && (paramFaceCharacteristicsResult.errCode == 18))
    {
      x.d(TAG, "hy: ignore too active");
      return true;
    }
    return false;
  }
  
  public final boolean aKc()
  {
    return (this.iOL) && (this.iOM);
  }
  
  public final boolean aKd()
  {
    return false;
  }
  
  public final void aKe()
  {
    this.iOT = false;
    if (this.iOS != null) {
      this.iOS.cancel();
    }
    this.iOL = false;
    this.iOV = false;
    this.iOW = false;
    this.iOM = false;
  }
  
  public final b.b aKf()
  {
    if (this.iOL) {
      return new b.b(90025, "user cancelled in intermediate page");
    }
    return new b.b(90004, "user cancelled in processing");
  }
  
  public final b.a aKg()
  {
    if ((this.iOL) && (!this.iOW))
    {
      this.iOW = true;
      return new b.a();
    }
    return null;
  }
  
  public final TextView aKh()
  {
    if ((!this.iOL) && (this.iON != null)) {
      return (TextView)this.iON.findViewById(a.e.hint_msg_tv);
    }
    if ((this.iOL) && (this.iOO != null)) {
      return (TextView)this.iOO.findViewById(a.e.hint_msg_tv);
    }
    return null;
  }
  
  public final boolean b(FaceCharacteristicsResult paramFaceCharacteristicsResult)
  {
    if (paramFaceCharacteristicsResult.errCode == -1)
    {
      this.iOL = true;
      if (!this.iOV)
      {
        as.I(ad.getContext(), a.h.qrcode_completed);
        paramFaceCharacteristicsResult = (TextView)this.iON.findViewById(a.e.hint_msg_tv);
        Animation localAnimation1 = AnimationUtils.loadAnimation(ad.getContext(), a.a.faded_out);
        Animation localAnimation2 = AnimationUtils.loadAnimation(ad.getContext(), a.a.fast_faded_in);
        localAnimation1.setDuration(iOK);
        localAnimation2.setDuration(iOK);
        paramFaceCharacteristicsResult.startAnimation(localAnimation1);
        paramFaceCharacteristicsResult.setVisibility(4);
        this.iOO.setVisibility(0);
        this.iOO.startAnimation(localAnimation2);
        this.iOO.findViewById(a.e.face_normal_confirm_btn).setOnClickListener(new c.1(this));
        this.iOV = true;
        return true;
      }
    }
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/facedetect/d/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */