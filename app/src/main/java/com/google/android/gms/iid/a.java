package com.google.android.gms.iid;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.util.Base64;
import java.security.KeyPair;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.util.HashMap;
import java.util.Map;

public final class a
{
  static Map<String, a> aQR = new HashMap();
  public static e aQS;
  private static d aQT;
  public static String aQX;
  KeyPair aQU;
  public String aQV = "";
  long aQW;
  Context mContext;
  
  private a(Context paramContext, String paramString)
  {
    this.mContext = paramContext.getApplicationContext();
    this.aQV = paramString;
  }
  
  static String a(KeyPair paramKeyPair)
  {
    paramKeyPair = paramKeyPair.getPublic().getEncoded();
    try
    {
      paramKeyPair = MessageDigest.getInstance("SHA1").digest(paramKeyPair);
      paramKeyPair[0] = ((byte)((paramKeyPair[0] & 0xF) + 112 & 0xFF));
      paramKeyPair = Base64.encodeToString(paramKeyPair, 0, 8, 11);
      return paramKeyPair;
    }
    catch (NoSuchAlgorithmException paramKeyPair) {}
    return null;
  }
  
  static int an(Context paramContext)
  {
    try
    {
      int i = paramContext.getPackageManager().getPackageInfo(paramContext.getPackageName(), 0).versionCode;
      return i;
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      new StringBuilder("Never happens: can't find own package ").append(paramContext);
    }
    return 0;
  }
  
  public static a ao(Context paramContext)
  {
    return c(paramContext, null);
  }
  
  public static a c(Context paramContext, Bundle paramBundle)
  {
    if (paramBundle == null) {
      paramBundle = "";
    }
    for (;;)
    {
      try
      {
        Context localContext = paramContext.getApplicationContext();
        if (aQS == null)
        {
          aQS = new e(localContext);
          aQT = new d(localContext);
        }
        aQX = Integer.toString(an(localContext));
        a locala = (a)aQR.get(paramBundle);
        paramContext = locala;
        if (locala == null)
        {
          paramContext = new a(localContext, paramBundle);
          aQR.put(paramBundle, paramContext);
        }
        return paramContext;
      }
      finally {}
      paramBundle = paramBundle.getString("subtype");
      while (paramBundle != null) {
        break;
      }
      paramBundle = "";
    }
  }
  
  static String j(byte[] paramArrayOfByte)
  {
    return Base64.encodeToString(paramArrayOfByte, 11);
  }
  
  static e pN()
  {
    return aQS;
  }
  
  static d pO()
  {
    return aQT;
  }
  
  public static boolean pP()
  {
    String str = aQS.get("appVersion");
    if ((str == null) || (!str.equals(aQX))) {}
    long l;
    do
    {
      do
      {
        return true;
        str = aQS.get("lastToken");
      } while (str == null);
      l = Long.parseLong(str);
    } while (System.currentTimeMillis() / 1000L - Long.valueOf(l).longValue() > 604800L);
    return false;
  }
  
  public final String b(String paramString1, String paramString2, Bundle paramBundle)
  {
    paramBundle.putString("scope", paramString2);
    paramBundle.putString("sender", paramString1);
    if ("".equals(this.aQV)) {}
    for (paramString2 = paramString1;; paramString2 = this.aQV)
    {
      if (!paramBundle.containsKey("legacy.register"))
      {
        paramBundle.putString("subscription", paramString1);
        paramBundle.putString("subtype", paramString2);
        paramBundle.putString("X-subscription", paramString1);
        paramBundle.putString("X-subtype", paramString2);
      }
      d locald = aQT;
      if (this.aQU == null) {
        this.aQU = aQS.bp(this.aQV);
      }
      if (this.aQU == null)
      {
        this.aQW = System.currentTimeMillis();
        this.aQU = aQS.c(this.aQV, this.aQW);
      }
      KeyPair localKeyPair = this.aQU;
      paramString2 = locald.a(paramBundle, localKeyPair);
      paramString1 = paramString2;
      if (paramString2 != null)
      {
        paramString1 = paramString2;
        if (paramString2.hasExtra("google.messenger")) {
          paramString1 = locald.a(paramBundle, localKeyPair);
        }
      }
      return d.g(paramString1);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/google/android/gms/iid/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */