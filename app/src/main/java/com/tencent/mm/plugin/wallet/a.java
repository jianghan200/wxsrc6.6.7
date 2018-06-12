package com.tencent.mm.plugin.wallet;

import android.content.Intent;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class a
{
  public int index = 0;
  public String oYu = "";
  public StringBuffer oYv = new StringBuffer();
  
  public static boolean a(a parama, Intent paramIntent)
  {
    if (parama == null) {
      return false;
    }
    paramIntent.putExtra("WECHAT_PAY_LOG_REPORT_INDEX", parama.index);
    paramIntent.putExtra("WECHAT_PAY_LOG_REPORT_DATA", parama.oYv.toString());
    paramIntent.putExtra("WECHAT_PAY_LOG_REPORT_BASEIFO", parama.oYu);
    return true;
  }
  
  public static a ac(Intent paramIntent)
  {
    int i = paramIntent.getIntExtra("WECHAT_PAY_LOG_REPORT_INDEX", -1);
    if (i == -1) {
      return null;
    }
    a locala = new a();
    locala.index = i;
    locala.oYv = new StringBuffer(bi.aG(paramIntent.getStringExtra("WECHAT_PAY_LOG_REPORT_DATA"), ""));
    locala.oYu = bi.aG(paramIntent.getStringExtra("WECHAT_PAY_LOG_REPORT_BASEIFO"), "");
    return locala;
  }
  
  public static a cp(String paramString, int paramInt)
  {
    a locala = new a();
    locala.oYu = (paramString + "," + paramInt);
    return locala;
  }
  
  public final void aM(int paramInt, String paramString)
  {
    paramString = String.format("{%d, %s, %d, %s},", new Object[] { Integer.valueOf(this.index), Long.valueOf(System.currentTimeMillis()), Integer.valueOf(paramInt), paramString });
    this.index += 1;
    x.i("MicroMsg.PayLogReport", "test for log " + paramString);
    this.oYv.append(paramString);
  }
  
  public final void i(int paramInt, Object... paramVarArgs)
  {
    if (paramVarArgs.length <= 0) {
      x.w("MicroMsg.PayLogReport", "vals is null, use '' as value");
    }
    StringBuilder localStringBuilder;
    for (paramVarArgs = "";; paramVarArgs = localStringBuilder.toString())
    {
      aM(paramInt, paramVarArgs);
      return;
      localStringBuilder = new StringBuilder();
      int j = paramVarArgs.length - 1;
      int i = 0;
      while (i < j)
      {
        localStringBuilder.append(String.valueOf(paramVarArgs[i])).append(',');
        i += 1;
      }
      localStringBuilder.append(String.valueOf(paramVarArgs[j]));
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/wallet/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */