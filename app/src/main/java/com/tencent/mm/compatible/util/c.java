package com.tencent.mm.compatible.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.AudioManager;
import android.media.AudioManager.OnAudioFocusChangeListener;
import com.tencent.mm.sdk.platformtools.x;

@TargetApi(8)
public final class c
  implements b.b
{
  private Context context;
  private AudioManager dge;
  b.a dgf;
  private AudioManager.OnAudioFocusChangeListener dgg = new c.1(this);
  
  public c(Context paramContext)
  {
    this.context = paramContext;
  }
  
  public final void a(b.a parama)
  {
    this.dgf = parama;
  }
  
  public final boolean requestFocus()
  {
    if ((this.dge == null) && (this.context != null)) {
      this.dge = ((AudioManager)this.context.getSystemService("audio"));
    }
    boolean bool;
    if (this.dge != null) {
      if (1 == this.dge.requestAudioFocus(this.dgg, 3, 2)) {
        bool = true;
      }
    }
    for (;;)
    {
      x.l("MicroMsg.AudioFocusHelper", "jacks requestFocus: %B, %x", new Object[] { Boolean.valueOf(bool), Integer.valueOf(this.dgg.hashCode()) });
      return bool;
      bool = false;
      continue;
      bool = false;
    }
  }
  
  public final boolean zY()
  {
    if ((this.dge == null) && (this.context != null)) {
      this.dge = ((AudioManager)this.context.getSystemService("audio"));
    }
    boolean bool;
    if (this.dge != null) {
      if (1 == this.dge.abandonAudioFocus(this.dgg)) {
        bool = true;
      }
    }
    for (;;)
    {
      x.l("MicroMsg.AudioFocusHelper", "jacks abandonFocus: %B, %x", new Object[] { Boolean.valueOf(bool), Integer.valueOf(this.dgg.hashCode()) });
      return bool;
      bool = false;
      continue;
      bool = false;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/compatible/util/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */