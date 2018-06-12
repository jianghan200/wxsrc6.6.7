package com.tinkerboots.sdk.tinker.b;

import android.content.Context;
import android.os.Looper;
import android.os.MessageQueue;
import android.os.MessageQueue.IdleHandler;
import com.tencent.tinker.lib.e.d;
import com.tencent.tinker.lib.f.c;
import com.tencent.tinker.loader.shareutil.ShareTinkerInternals;
import java.io.File;

public final class a
  extends com.tencent.tinker.lib.d.a
{
  public a(Context paramContext)
  {
    super(paramContext);
  }
  
  public final void a(File paramFile, int paramInt, long paramLong)
  {
    super.a(paramFile, paramInt, paramLong);
    Looper.getMainLooper();
    Looper.myQueue().addIdleHandler(new MessageQueue.IdleHandler()
    {
      public final boolean queueIdle()
      {
        c.hQ(a.this.context).cGY();
        return false;
      }
    });
  }
  
  public final void a(File paramFile, int paramInt, boolean paramBoolean)
  {
    super.a(paramFile, paramInt, paramBoolean);
    if (paramInt == 1)
    {
      paramFile = com.tencent.tinker.lib.e.a.hL(this.context).vsD;
      if ((paramFile.vsI != null) && ("00000000000000000000000000000000".equals(paramFile.vsI)))
      {
        com.tencent.tinker.lib.f.a.e("Tinker.ServerLoadReporter", "Roll back patch when restarting main process, restart all other process also!", new Object[0]);
        ShareTinkerInternals.ie(this.context);
      }
    }
  }
  
  public final void a(String paramString1, String paramString2, File paramFile, String paramString3)
  {
    super.a(paramString1, paramString2, paramFile, paramString3);
  }
  
  public final void a(Throwable paramThrowable, int paramInt)
  {
    super.a(paramThrowable, paramInt);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tinkerboots/sdk/tinker/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */