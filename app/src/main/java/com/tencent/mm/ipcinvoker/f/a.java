package com.tencent.mm.ipcinvoker.f;

import android.os.IBinder.DeathRecipient;
import com.tencent.mm.sdk.platformtools.x;

public final class a
  implements IBinder.DeathRecipient
{
  private String process;
  
  public a(String paramString)
  {
    this.process = paramString;
  }
  
  public final void binderDied()
  {
    x.i("IPC.DeathRecipientImpl", "binderDied(%s)", new Object[] { this.process });
    if ((this.process == null) || (this.process.length() == 0)) {
      return;
    }
    b.fI(this.process);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/ipcinvoker/f/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */