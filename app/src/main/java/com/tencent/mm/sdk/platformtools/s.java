package com.tencent.mm.sdk.platformtools;

import android.content.Intent;
import android.os.Bundle;

public final class s
{
  public static int a(Intent paramIntent, String paramString, int paramInt)
  {
    if (paramIntent == null) {
      return paramInt;
    }
    try
    {
      int i = paramIntent.getIntExtra(paramString, paramInt);
      return i;
    }
    catch (Exception paramIntent)
    {
      x.e("MicroMsg.IntentUtil", "getIntExtra exception:%s", new Object[] { paramIntent.getMessage() });
    }
    return paramInt;
  }
  
  public static boolean a(Intent paramIntent, String paramString, boolean paramBoolean)
  {
    if (paramIntent == null) {
      return paramBoolean;
    }
    try
    {
      boolean bool = paramIntent.getBooleanExtra(paramString, paramBoolean);
      return bool;
    }
    catch (Exception paramIntent)
    {
      x.e("MicroMsg.IntentUtil", "getBooleanExtra exception:%s", new Object[] { paramIntent.getMessage() });
    }
    return paramBoolean;
  }
  
  public static Bundle aq(Intent paramIntent)
  {
    if (paramIntent == null) {
      return null;
    }
    try
    {
      paramIntent = paramIntent.getExtras();
      return paramIntent;
    }
    catch (Exception paramIntent)
    {
      x.e("MicroMsg.IntentUtil", "getExtras exception:%s", new Object[] { paramIntent.getMessage() });
    }
    return null;
  }
  
  public static void b(Intent paramIntent, String paramString, boolean paramBoolean)
  {
    try
    {
      paramIntent.putExtra(paramString, paramBoolean);
      return;
    }
    catch (Exception paramIntent)
    {
      x.printErrStackTrace("MicroMsg.IntentUtil", paramIntent, "", new Object[0]);
    }
  }
  
  public static int h(Bundle paramBundle, String paramString)
  {
    if (paramBundle == null) {
      return 0;
    }
    try
    {
      int i = paramBundle.getInt(paramString, 0);
      return i;
    }
    catch (Exception paramBundle)
    {
      x.e("MicroMsg.IntentUtil", "getIntExtra exception:%s", new Object[] { paramBundle.getMessage() });
    }
    return 0;
  }
  
  public static long i(Intent paramIntent, String paramString)
  {
    if (paramIntent == null) {
      return 0L;
    }
    try
    {
      long l = paramIntent.getLongExtra(paramString, 0L);
      return l;
    }
    catch (Exception paramIntent)
    {
      x.e("MicroMsg.IntentUtil", "getIntExtra exception:%s", new Object[] { paramIntent.getMessage() });
    }
    return 0L;
  }
  
  public static String i(Bundle paramBundle, String paramString)
  {
    if (paramBundle == null) {
      return null;
    }
    try
    {
      paramBundle = paramBundle.getString(paramString);
      return paramBundle;
    }
    catch (Exception paramBundle)
    {
      x.e("MicroMsg.IntentUtil", "getStringExtra exception:%s", new Object[] { paramBundle.getMessage() });
    }
    return null;
  }
  
  public static String j(Intent paramIntent, String paramString)
  {
    if (paramIntent == null) {
      return null;
    }
    try
    {
      paramIntent = paramIntent.getStringExtra(paramString);
      return paramIntent;
    }
    catch (Exception paramIntent)
    {
      x.e("MicroMsg.IntentUtil", "getStringExtra exception:%s", new Object[] { paramIntent.getMessage() });
    }
    return null;
  }
  
  public static byte[] k(Intent paramIntent, String paramString)
  {
    if (paramIntent == null) {
      return null;
    }
    try
    {
      paramIntent = paramIntent.getByteArrayExtra(paramString);
      return paramIntent;
    }
    catch (Exception paramIntent)
    {
      x.e("MicroMsg.IntentUtil", "getByteArrayExtra exception:%s", new Object[] { paramIntent.getMessage() });
    }
    return null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/sdk/platformtools/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */