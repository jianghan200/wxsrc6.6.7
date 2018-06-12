package com.tencent.mm.plugin.mmsight.segment.a;

import android.os.Looper;
import android.view.Surface;
import com.tencent.mm.plugin.u.i;
import com.tencent.mm.plugin.u.j;
import com.tencent.mm.sdk.platformtools.x;

public final class b
  implements a
{
  boolean Fd = false;
  boolean bTv = false;
  boolean dGv = false;
  int lnA;
  int lnB = 0;
  private int lnC = 0;
  a.a lnD;
  a.d lnE;
  a.b lnF;
  a.c lnG;
  i lnz = new i(Looper.getMainLooper());
  
  public b()
  {
    Object localObject = this.lnz;
    if (((i)localObject).ldy != null)
    {
      localObject = ((i)localObject).ldy;
      if (((j)localObject).ldg != null) {
        ((j)localObject).ldg.lda = false;
      }
    }
    this.lnz.setNeedResetExtractor(false);
    this.lnz.ldz = new b.1(this);
  }
  
  public final void a(a.a parama)
  {
    this.lnD = parama;
  }
  
  public final void a(a.b paramb)
  {
    this.lnF = paramb;
  }
  
  public final void a(a.c paramc)
  {
    this.lnG = paramc;
  }
  
  public final void a(a.d paramd)
  {
    this.lnE = paramd;
  }
  
  public final int getCurrentPosition()
  {
    return this.lnz.bdA();
  }
  
  public final int getDuration()
  {
    return (int)this.lnz.ldy.aqC;
  }
  
  public final boolean isPlaying()
  {
    return this.lnz.isPlaying();
  }
  
  public final void pause()
  {
    this.lnz.pause();
  }
  
  public final void prepareAsync()
  {
    this.lnz.bdz();
  }
  
  public final void release()
  {
    this.lnz.release();
  }
  
  public final void seekTo(int paramInt)
  {
    if (this.lnz != null)
    {
      x.i("MicroMsg.MMSegmentVideoPlayer", "seekTo: %s", new Object[] { Integer.valueOf(paramInt) });
      this.lnz.sG(paramInt);
    }
  }
  
  public final void setAudioStreamType(int paramInt) {}
  
  public final void setDataSource(String paramString)
  {
    this.lnz.setPath(paramString);
  }
  
  public final void setLoop(int paramInt1, int paramInt2)
  {
    this.lnB = paramInt1;
    this.lnC = paramInt2;
  }
  
  public final void setLooping(boolean paramBoolean)
  {
    this.dGv = paramBoolean;
  }
  
  public final void setSurface(Surface paramSurface)
  {
    this.lnz.setSurface(paramSurface);
  }
  
  public final void start()
  {
    if (this.Fd) {
      this.lnz.start();
    }
    this.bTv = true;
  }
  
  public final void stop()
  {
    this.lnz.ldy.stop();
    this.bTv = false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/mmsight/segment/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */