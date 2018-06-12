package com.tencent.mm.plugin.music.b.a;

import com.tencent.mm.an.a;
import com.tencent.mm.sdk.platformtools.ah;

public abstract class b
{
  protected a bTF;
  public f lAa = new f();
  protected e lzZ;
  
  public abstract void IA(String paramString);
  
  public final void a(e parame)
  {
    this.lzZ = parame;
  }
  
  public abstract boolean bit();
  
  public abstract int biu();
  
  public abstract String biv();
  
  public void gP(boolean paramBoolean)
  {
    if (this.lzZ != null) {
      ah.A(new b.1(this, paramBoolean));
    }
  }
  
  public void gQ(boolean paramBoolean)
  {
    if (this.lzZ != null) {
      ah.A(new b.4(this, paramBoolean));
    }
  }
  
  public abstract int getDuration();
  
  public abstract boolean isPlaying();
  
  public final void o(a parama)
  {
    this.bTF = parama;
  }
  
  public final void onStart()
  {
    if (this.lzZ != null) {
      ah.A(new b.2(this));
    }
  }
  
  public abstract void pause();
  
  public abstract void play();
  
  public abstract void seek(long paramLong);
  
  public abstract void stop();
  
  public final void tK(int paramInt)
  {
    if (this.lzZ != null) {
      ah.A(new b.3(this, paramInt));
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/music/b/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */