package com.tencent.smtt.sdk;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.smtt.export.external.DexLoader;
import com.tencent.smtt.export.external.libwebp;
import com.tencent.smtt.utils.TbsLog;
import com.tencent.smtt.utils.b;
import java.util.Map;

class bi
{
  private Context a = null;
  private Context b = null;
  private String c = null;
  private String[] d = null;
  private DexLoader e = null;
  private String f = "TbsDexOpt";
  private String g = null;
  
  public bi(Context paramContext1, Context paramContext2, String paramString1, String paramString2, String[] paramArrayOfString, String paramString3, am paramam)
  {
    TbsLog.i("TbsWizard", "construction start...");
    if ((paramContext1 == null) || ((paramContext2 == null) && (TbsShareManager.getHostCorePathAppDefined() == null)) || (TextUtils.isEmpty(paramString1)) || (paramArrayOfString == null) || (paramArrayOfString.length == 0)) {
      throw new Exception("TbsWizard paramter error:-1callerContext:" + paramContext1 + "hostcontext" + paramContext2 + "isEmpty" + TextUtils.isEmpty(paramString1) + "dexfileList" + paramArrayOfString);
    }
    this.a = paramContext1.getApplicationContext();
    this.b = paramContext2;
    this.c = paramString1;
    this.d = paramArrayOfString;
    this.f = paramString2;
    if (paramam != null) {
      paramam.a("load_tbs_dex", (byte)1);
    }
    this.e = new DexLoader(paramString3, this.a, this.d, paramString2, QbSdk.n);
    if (paramam != null) {
      paramam.a("load_tbs_dex", (byte)2);
    }
    libwebp.loadWepLibraryIfNeed(paramContext2, this.c);
    if ("com.nd.android.pandahome2".equals(this.a.getApplicationInfo().packageName))
    {
      paramContext2 = this.e;
      paramString1 = this.a;
      paramContext2.invokeStaticMethod("com.tencent.tbs.common.beacon.X5CoreBeaconUploader", "getInstance", new Class[] { Context.class }, new Object[] { paramString1 });
    }
    if (QbSdk.n != null)
    {
      paramContext2 = this.e;
      paramString1 = QbSdk.n;
      paramContext2.invokeStaticMethod("com.tencent.tbs.tbsshell.TBSShell", "initTbsSettings", new Class[] { Map.class }, new Object[] { paramString1 });
    }
    if (paramam != null) {
      paramam.a("init_tbs", (byte)1);
    }
    int i = a(paramContext1);
    if (paramam != null) {
      paramam.a("init_tbs", (byte)2);
    }
    if (i < 0) {
      throw new Exception("TbsWizard init error: " + i + "; msg: " + this.g);
    }
    TbsLog.i("TbsWizard", "construction end...");
  }
  
  private int a(Context paramContext)
  {
    Object localObject1 = this.e;
    Object localObject2 = b.a;
    Object localObject3 = b.b;
    Object localObject4 = b.c;
    String str1 = b.d;
    ((DexLoader)localObject1).invokeStaticMethod("com.tencent.tbs.tbsshell.TBSShell", "putInfo", new Class[] { Context.class, String.class, String.class, String.class, String.class }, new Object[] { paramContext, localObject2, localObject3, localObject4, str1 });
    String str2;
    String str3;
    int i;
    if ((this.b == null) && (TbsShareManager.getHostCorePathAppDefined() != null))
    {
      localObject1 = this.e;
      localObject2 = Integer.TYPE;
      localObject3 = this.b;
      localObject4 = this.e;
      str1 = this.c;
      str2 = this.f;
      str3 = QbSdk.a();
      String str4 = TbsShareManager.getHostCorePathAppDefined();
      localObject1 = ((DexLoader)localObject1).invokeStaticMethod("com.tencent.tbs.tbsshell.TBSShell", "initTesRuntimeEnvironment", new Class[] { Context.class, Context.class, DexLoader.class, String.class, String.class, String.class, localObject2, String.class, String.class }, new Object[] { paramContext, localObject3, localObject4, str1, str2, "3.6.0.1240", Integer.valueOf(43610), str3, str4 });
      localObject2 = localObject1;
      if (localObject1 == null)
      {
        c();
        d();
        localObject1 = this.e;
        localObject2 = this.b;
        localObject3 = this.e;
        localObject4 = this.c;
        str1 = this.f;
        localObject2 = ((DexLoader)localObject1).invokeStaticMethod("com.tencent.tbs.tbsshell.TBSShell", "initTesRuntimeEnvironment", new Class[] { Context.class, Context.class, DexLoader.class, String.class, String.class }, new Object[] { paramContext, localObject2, localObject3, localObject4, str1 });
      }
      if (localObject2 != null) {
        break label628;
      }
      i = -3;
    }
    for (;;)
    {
      if (i >= 0) {
        break label686;
      }
      paramContext = this.e.invokeStaticMethod("com.tencent.tbs.tbsshell.TBSShell", "getLoadFailureDetails", new Class[0], new Object[0]);
      if ((paramContext instanceof Throwable))
      {
        localObject1 = (Throwable)paramContext;
        this.g = ("#" + ((Throwable)localObject1).getMessage() + "; cause: " + ((Throwable)localObject1).getCause() + "; th: " + localObject1);
      }
      if ((paramContext instanceof String)) {
        this.g = ((String)paramContext);
      }
      return i;
      localObject1 = this.e;
      localObject2 = Integer.TYPE;
      localObject3 = this.b;
      localObject4 = this.e;
      str1 = this.c;
      str2 = this.f;
      str3 = QbSdk.a();
      localObject1 = ((DexLoader)localObject1).invokeStaticMethod("com.tencent.tbs.tbsshell.TBSShell", "initTesRuntimeEnvironment", new Class[] { Context.class, Context.class, DexLoader.class, String.class, String.class, String.class, localObject2, String.class }, new Object[] { paramContext, localObject3, localObject4, str1, str2, "3.6.0.1240", Integer.valueOf(43610), str3 });
      break;
      label628:
      if ((localObject2 instanceof Integer))
      {
        i = ((Integer)localObject2).intValue();
      }
      else if ((localObject2 instanceof Throwable))
      {
        TbsCoreLoadStat.getInstance().a(this.a, 328, (Throwable)localObject2);
        i = -5;
      }
      else
      {
        i = -4;
      }
    }
    label686:
    this.g = null;
    return i;
  }
  
  private void c()
  {
    this.e.invokeStaticMethod("com.tencent.tbs.tbsshell.TBSShell", "setTesSdkVersionName", new Class[] { String.class }, new Object[] { "3.6.0.1240" });
  }
  
  private void d()
  {
    this.e.setStaticField("com.tencent.tbs.tbsshell.TBSShell", "VERSION", Integer.valueOf(43610));
  }
  
  public String a()
  {
    String str = null;
    Object localObject1 = this.e;
    Object localObject2 = Boolean.TYPE;
    Object[] arrayOfObject = new Object[0];
    localObject2 = ((DexLoader)localObject1).invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "invokeStaticMethod", new Class[] { localObject2, String.class, String.class, Class[].class, Object[].class }, new Object[] { Boolean.valueOf(true), "com.tencent.smtt.util.CrashTracker", "getCrashExtraInfo", null, arrayOfObject });
    localObject1 = localObject2;
    if (localObject2 == null) {
      localObject1 = this.e.invokeStaticMethod("com.tencent.smtt.util.CrashTracker", "getCrashExtraInfo", null, new Object[0]);
    }
    if (localObject1 != null)
    {
      str = String.valueOf(localObject1);
      str = str + " ReaderPackName=" + TbsReaderView.gReaderPackName + " ReaderPackVersion=" + TbsReaderView.gReaderPackVersion;
    }
    localObject1 = str;
    if (str == null) {
      localObject1 = "X5 core get nothing...";
    }
    return (String)localObject1;
  }
  
  public boolean a(Context paramContext, String paramString1, String paramString2, Bundle paramBundle)
  {
    paramContext = this.e.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "installLocalQbApk", new Class[] { Context.class, String.class, String.class, Bundle.class }, new Object[] { paramContext, paramString1, paramString2, paramBundle });
    if (paramContext == null) {
      return false;
    }
    return ((Boolean)paramContext).booleanValue();
  }
  
  public DexLoader b()
  {
    return this.e;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/smtt/sdk/bi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */