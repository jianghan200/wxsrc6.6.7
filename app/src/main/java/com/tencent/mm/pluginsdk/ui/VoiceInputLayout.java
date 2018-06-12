package com.tencent.mm.pluginsdk.ui;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.tencent.mm.modelvoiceaddr.f;
import com.tencent.mm.modelvoiceaddr.f.a;
import com.tencent.mm.sdk.f.e;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Set;

public abstract class VoiceInputLayout
  extends LinearLayout
{
  private final al erD = new al(new VoiceInputLayout.4(this), true);
  ag giD = new VoiceInputLayout.1(this);
  int qHA = 10000;
  public a qHB;
  private ag qHC = new VoiceInputLayout.3(this);
  public int qHc = 1;
  private b qHw = null;
  private f qHx;
  protected boolean qHy = false;
  int qHz = 3000;
  
  public VoiceInputLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  @TargetApi(11)
  public VoiceInputLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public abstract void BV(int paramInt);
  
  public final void Uh()
  {
    x.d("MicroMsg.VoiceInputLayout", "doCancel. state = %s", new Object[] { Integer.valueOf(this.qHc) });
    if (this.qHc == 1) {
      return;
    }
    this.qHc = 1;
    if (this.qHw != null) {
      this.qHw.cdH();
    }
    if (this.qHx != null) {
      this.qHx.an(true);
    }
    onReset();
  }
  
  public final void af(int paramInt1, int paramInt2, int paramInt3)
  {
    x.d("MicroMsg.VoiceInputLayout", "doNetworkError localerrorType:%s,errorType:%s,errCode:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    this.qHc = 1;
    onReset();
    if (this.qHw != null) {
      this.qHw.ag(paramInt1, paramInt2, paramInt3);
    }
  }
  
  public final void bs()
  {
    x.d("MicroMsg.VoiceInputLayout", "do Stop. currentState = %s", new Object[] { Integer.valueOf(this.qHc) });
    if ((this.qHc == 1) || (this.qHc != 2)) {}
    do
    {
      return;
      this.qHc = 3;
      if (this.qHw != null) {
        this.qHw.cdG();
      }
      if (this.erD != null) {
        this.erD.SO();
      }
      this.giD.removeMessages(0);
      this.giD.sendEmptyMessageDelayed(0, this.qHz);
      this.giD.sendEmptyMessageDelayed(1, this.qHA);
      cN(true);
    } while (this.qHx == null);
    this.qHx.aJ(true);
  }
  
  public abstract void cN(boolean paramBoolean);
  
  public abstract void cdB();
  
  public final void cdC()
  {
    if ((com.tencent.mm.p.a.by(getContext())) || (com.tencent.mm.p.a.bw(getContext())))
    {
      x.d("MicroMsg.VoiceInputLayout", "voip is running, cann't record voice");
      onReset();
    }
    do
    {
      do
      {
        return;
        boolean bool = com.tencent.mm.pluginsdk.permission.a.bj(getContext(), "android.permission.RECORD_AUDIO");
        x.d("MicroMsg.VoiceInputLayout", "summerper checkPermission checkMicrophone[%s]", new Object[] { Boolean.valueOf(bool) });
        if (!bool) {
          break;
        }
        x.d("MicroMsg.VoiceInputLayout", "doStart currentState = %s", new Object[] { Integer.valueOf(this.qHc) });
      } while (this.qHc != 1);
      this.qHc = 2;
      if (this.qHw != null) {
        this.qHw.cdF();
      }
      this.erD.J(50L, 50L);
      cdB();
      this.qHx = new f(new VoiceInputLayout.2(this));
      f localf = this.qHx;
      x.i("MicroMsg.SceneVoiceInputAddr", "start record");
      e.b(new f.a(localf, (byte)0), "SceneVoiceInputAddr_record", 10);
      return;
    } while (!(getContext() instanceof Activity));
    com.tencent.mm.pluginsdk.permission.a.g((Activity)getContext(), "android.permission.RECORD_AUDIO");
  }
  
  public final void cdD()
  {
    af(12, -1, -1);
  }
  
  public int getCurrentState()
  {
    return this.qHc;
  }
  
  public abstract void onReset();
  
  public final void reset(boolean paramBoolean)
  {
    x.d("MicroMsg.VoiceInputLayout", "reset currentState %s", new Object[] { Integer.valueOf(this.qHc) });
    if (this.qHc == 1) {}
    do
    {
      return;
      this.qHc = 1;
      onReset();
    } while ((!paramBoolean) || (this.qHw == null));
    this.qHw.cdI();
  }
  
  public void setFromFullScreen(boolean paramBoolean)
  {
    this.qHy = paramBoolean;
  }
  
  public void setLongClickLisnter(a parama)
  {
    this.qHB = parama;
  }
  
  public void setVoiceDetectListener(b paramb)
  {
    this.qHw = paramb;
  }
  
  public static abstract interface a
  {
    public abstract void cdE();
  }
  
  public static abstract interface b
  {
    public abstract void ag(int paramInt1, int paramInt2, int paramInt3);
    
    public abstract void b(String[] paramArrayOfString, Set<String> paramSet);
    
    public abstract void cdF();
    
    public abstract void cdG();
    
    public abstract void cdH();
    
    public abstract void cdI();
    
    public abstract void cdJ();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/pluginsdk/ui/VoiceInputLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */