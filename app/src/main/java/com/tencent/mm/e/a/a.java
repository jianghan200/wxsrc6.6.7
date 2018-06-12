package com.tencent.mm.e.a;

import android.content.Context;
import com.tencent.mm.ab.g;
import com.tencent.mm.ab.g.a;
import com.tencent.mm.ab.g.c;
import com.tencent.mm.ab.g.d;
import com.tencent.mm.compatible.b.f;
import com.tencent.mm.compatible.b.f.a;
import com.tencent.mm.compatible.util.b.a;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.modelvoice.d;
import com.tencent.mm.modelvoice.i;
import com.tencent.mm.modelvoice.j;
import com.tencent.mm.modelvoice.o;
import com.tencent.mm.modelvoice.q;
import com.tencent.mm.modelvoice.s;
import com.tencent.mm.sdk.platformtools.x;
import junit.framework.Assert;

public final class a
  implements g, f.a
{
  private static String bCR = null;
  private d bCG = null;
  private boolean bCH = false;
  private boolean bCI = false;
  private boolean bCJ = false;
  private int bCK = 0;
  private boolean bCL = false;
  private boolean bCM = false;
  private boolean bCN = true;
  private g.c bCO;
  private g.d bCP;
  private String bCQ = null;
  private b.a bCS = new a.1(this);
  public com.tencent.mm.ab.g.b bCT = null;
  public g.a bCU;
  private Context context = null;
  
  public a(Context paramContext)
  {
    this(paramContext, 0);
  }
  
  public a(Context paramContext, int paramInt)
  {
    this.context = paramContext;
    this.bCK = paramInt;
    new com.tencent.mm.e.b.g.b();
  }
  
  private void setError()
  {
    a.2 local2 = new a.2(this);
    if (this.bCG != null) {
      this.bCG.a(local2);
    }
  }
  
  private void wa()
  {
    a.3 local3 = new a.3(this);
    if (this.bCG != null) {
      this.bCG.a(local3);
    }
  }
  
  public final void a(g.a parama)
  {
    this.bCU = parama;
  }
  
  public final void a(com.tencent.mm.ab.g.b paramb)
  {
    this.bCT = paramb;
  }
  
  public final void a(g.c paramc)
  {
    this.bCO = paramc;
  }
  
  public final void a(g.d paramd)
  {
    this.bCP = paramd;
  }
  
  public final boolean a(String paramString, boolean paramBoolean, int paramInt1, int paramInt2)
  {
    x.i("MicroMsg.SceneVoicePlayer", "start file name:[%s] speakerOn:[%b], isFullPath: %s, type: %s, userType: %s", new Object[] { paramString, Boolean.valueOf(paramBoolean), Boolean.valueOf(true), Integer.valueOf(paramInt1), Integer.valueOf(this.bCK) });
    if (paramString.length() > 0) {}
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue(bool);
      if (FileOp.cn(paramString)) {
        break;
      }
      x.e("MicroMsg.SceneVoicePlayer", "start, file %s not exist!, fullPath: %s", new Object[] { paramString, paramString });
      return false;
    }
    int i = paramInt1;
    if (paramInt1 == -1) {
      i = o.d(paramString, this.bCK, true);
    }
    if (i == 0) {
      if (this.context != null) {
        this.bCG = new s(this.context);
      }
    }
    for (;;)
    {
      if (this.bCG != null) {
        this.bCG.b(this.bCS);
      }
      this.bCH = paramBoolean;
      this.bCL = paramBoolean;
      if ((f.yz().yK()) || (f.yz().yE()))
      {
        x.i("MicroMsg.SceneVoicePlayer", "headset plugged: %b, bluetoothon: %b", new Object[] { Boolean.valueOf(f.yz().yK()), Boolean.valueOf(f.yz().yE()) });
        this.bCH = false;
      }
      f.yz().e(this.bCH, false, false);
      wa();
      setError();
      f.yz().a(this);
      if (!f.yz().yK())
      {
        f.yz().yB();
        this.bCM = true;
      }
      if (this.bCG.c(paramString, this.bCH, paramInt2)) {
        break;
      }
      x.i("MicroMsg.SceneVoicePlayer", "start play fileName[" + paramString + "], [" + paramBoolean + "]");
      f.yz().yC();
      this.bCM = false;
      return false;
      this.bCG = new s();
      continue;
      if (i == 1)
      {
        if (this.context != null) {
          this.bCG = new j(this.context);
        } else {
          this.bCG = new j();
        }
      }
      else if (i == 2) {
        if (this.context != null) {
          this.bCG = new i(this.context);
        } else {
          this.bCG = new i();
        }
      }
    }
    return true;
  }
  
  public final boolean a(String paramString, boolean paramBoolean1, boolean paramBoolean2, int paramInt)
  {
    x.i("MicroMsg.SceneVoicePlayer", "start file name:[%s] speakerOn:[%b], isFullPath: %s, type: %s, userType: %s", new Object[] { paramString, Boolean.valueOf(paramBoolean1), Boolean.valueOf(paramBoolean2), Integer.valueOf(paramInt), Integer.valueOf(this.bCK) });
    boolean bool;
    if (paramString.length() > 0)
    {
      bool = true;
      Assert.assertTrue(bool);
      bCR = this.bCQ;
      this.bCQ = paramString;
      if (!paramBoolean2) {
        break label124;
      }
      str = paramString;
      label81:
      if (FileOp.cn(str)) {
        break label142;
      }
      if (!paramBoolean2) {
        break label133;
      }
    }
    label124:
    label133:
    for (String str = paramString;; str = q.getFullPath(paramString))
    {
      x.e("MicroMsg.SceneVoicePlayer", "start, file %s not exist!, fullPath: %s", new Object[] { paramString, str });
      return false;
      bool = false;
      break;
      str = q.getFullPath(paramString);
      break label81;
    }
    label142:
    int i = paramInt;
    if (paramInt == -1) {
      i = o.d(paramString, this.bCK, paramBoolean2);
    }
    if (i == 0) {
      if (this.context != null)
      {
        this.bCG = new s(this.context);
        if (this.bCG != null) {
          this.bCG.b(this.bCS);
        }
        this.bCH = paramBoolean1;
        this.bCL = paramBoolean1;
        if ((f.yz().yK()) || (f.yz().yE()))
        {
          x.i("MicroMsg.SceneVoicePlayer", "headset plugged: %b, bluetoothon: %b", new Object[] { Boolean.valueOf(f.yz().yK()), Boolean.valueOf(f.yz().yE()) });
          this.bCH = false;
        }
        f.yz().e(this.bCH, false, false);
        wa();
        setError();
        str = null;
        if (!paramBoolean2) {
          break label508;
        }
        str = paramString;
      }
    }
    for (;;)
    {
      f.yz().a(this);
      if (!f.yz().yK())
      {
        f.yz().yB();
        this.bCM = true;
      }
      if (this.bCG.M(str, this.bCH)) {
        break label524;
      }
      x.i("MicroMsg.SceneVoicePlayer", "start play error fileName[" + paramString + "], [" + paramBoolean1 + "]");
      f.yz().yC();
      this.bCM = false;
      return false;
      this.bCG = new s();
      break;
      if (i == 1)
      {
        if (this.context != null)
        {
          this.bCG = new j(this.context);
          break;
        }
        this.bCG = new j();
        break;
      }
      if (i != 2) {
        break;
      }
      if (this.context != null)
      {
        this.bCG = new i(this.context);
        break;
      }
      this.bCG = new i();
      break;
      label508:
      if (this.bCK == 0) {
        str = q.getFullPath(paramString);
      }
    }
    label524:
    return true;
  }
  
  public final boolean aI(boolean paramBoolean)
  {
    if (this.bCG == null) {
      return false;
    }
    x.i("MicroMsg.SceneVoicePlayer", "pause");
    if (this.bCG.isPlaying()) {}
    for (boolean bool = this.bCG.aI(paramBoolean);; bool = false)
    {
      if (bool)
      {
        if (this.bCM)
        {
          f.yz().yC();
          this.bCM = false;
        }
        if (this.bCO != null) {
          this.bCO.bz(paramBoolean);
        }
      }
      f.yz().setMode(0);
      return bool;
    }
  }
  
  public final void aJ(boolean paramBoolean)
  {
    if (this.bCG == null) {
      return;
    }
    x.i("MicroMsg.SceneVoicePlayer", "stop, isRequestStartBluetooth: %b, player.isPlaying: %b, fromStart: %b", new Object[] { Boolean.valueOf(this.bCM), Boolean.valueOf(this.bCG.isPlaying()), Boolean.valueOf(paramBoolean) });
    this.bCG.wk();
    f.yz().b(this);
    if ((this.bCM) && (!paramBoolean))
    {
      f.yz().yC();
      this.bCM = false;
    }
    if ((!paramBoolean) && (this.bCP != null)) {
      this.bCP.onStop();
    }
    f.yz().setMode(0);
  }
  
  public final void aK(boolean paramBoolean)
  {
    if (this.bCH == paramBoolean) {
      return;
    }
    this.bCH = paramBoolean;
    if ((this.bCG != null) && (this.bCG.isPlaying())) {
      this.bCG.aK(paramBoolean);
    }
    f.yz().e(paramBoolean, false, false);
  }
  
  public final void aL(boolean paramBoolean)
  {
    x.i("MicroMsg.SceneVoicePlayer", "setContinuousPlay() continuousPlay:%s", new Object[] { Boolean.valueOf(paramBoolean) });
    this.bCJ = paramBoolean;
  }
  
  public final void ew(int paramInt)
  {
    x.i("MicroMsg.SceneVoicePlayer", "onBluetoothHeadsetStateChange, status: %d, currentSpeaker: %b, bluetoothResumeSpeaker: %b, isRequestStartBluetooth: %b", new Object[] { Integer.valueOf(paramInt), Boolean.valueOf(this.bCH), Boolean.valueOf(this.bCL), Boolean.valueOf(this.bCM) });
    switch (paramInt)
    {
    }
    do
    {
      do
      {
        do
        {
          return;
          aK(false);
          return;
          aK(this.bCL);
        } while (!this.bCM);
        f.yz().yC();
        this.bCM = false;
        return;
        aK(this.bCL);
      } while ((this.bCG == null) || (!this.bCG.isPlaying()));
      f.yz().yB();
      this.bCM = true;
      return;
    } while ((this.bCG == null) || (!this.bCG.isPlaying()));
    f.yz().yB();
    this.bCM = true;
  }
  
  public final boolean isPlaying()
  {
    if (this.bCG == null) {
      return false;
    }
    return this.bCG.isPlaying();
  }
  
  public final boolean m(String paramString, boolean paramBoolean)
  {
    return a(paramString, paramBoolean, false, -1);
  }
  
  public final boolean pause()
  {
    return aI(true);
  }
  
  public final void stop()
  {
    aJ(false);
  }
  
  public final boolean vY()
  {
    if (this.bCG == null) {
      return false;
    }
    x.i("MicroMsg.SceneVoicePlayer", "resume");
    boolean bool = this.bCG.vY();
    if (bool)
    {
      f.yz().yB();
      this.bCM = true;
      if (f.yz().yE()) {
        this.bCH = false;
      }
      f.yz().e(this.bCH, false, false);
    }
    return bool;
  }
  
  public final boolean vZ()
  {
    return this.bCI;
  }
  
  public final double wb()
  {
    if (this.bCG == null) {
      return 0.0D;
    }
    return this.bCG.wb();
  }
  
  public final boolean wc()
  {
    if (this.bCG == null) {}
    while (this.bCG.getStatus() != 2) {
      return false;
    }
    return true;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/e/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */