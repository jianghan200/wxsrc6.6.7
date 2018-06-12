package com.tencent.mm.booter;

import android.content.Context;
import android.content.Intent;
import com.tencent.mm.kernel.k;
import com.tencent.mm.sdk.platformtools.e;
import com.tencent.mm.sdk.platformtools.x;

public final class b
{
  public static boolean v(Context paramContext, String paramString)
  {
    if (((!paramString.equals("noop")) || ((e.sFE) && (e.sFD))) && (k.bA(paramContext)))
    {
      x.i("MicroMsg.CoreServiceHelper", "fully exited, no need to start service");
      return false;
    }
    x.d("MicroMsg.CoreServiceHelper", "ensure service running, type=" + paramString);
    Intent localIntent = new Intent(paramContext, CoreService.class);
    localIntent.setFlags(268435456);
    localIntent.putExtra("START_TYPE", paramString);
    paramContext.startService(localIntent);
    return true;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/booter/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */