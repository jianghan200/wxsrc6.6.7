package com.google.android.gms.gcm;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import com.google.android.gms.iid.d;
import com.google.android.gms.iid.e;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public final class a
{
  public static int aQA = 7000000;
  static a aQB;
  private static final AtomicInteger aQE = new AtomicInteger(1);
  public static int aQy = 5000000;
  public static int aQz = 6500000;
  private PendingIntent aQC;
  private Map<String, Handler> aQD = Collections.synchronizedMap(new HashMap());
  private final BlockingQueue<Intent> aQF = new LinkedBlockingQueue();
  final Messenger aQG = new Messenger(new Handler(Looper.getMainLooper())
  {
    public final void handleMessage(Message paramAnonymousMessage)
    {
      if (paramAnonymousMessage != null) {
        Object localObject = paramAnonymousMessage.obj;
      }
      paramAnonymousMessage = (Intent)paramAnonymousMessage.obj;
      if ("com.google.android.c2dm.intent.REGISTRATION".equals(paramAnonymousMessage.getAction())) {
        a.a(a.this).add(paramAnonymousMessage);
      }
      while (a.a(a.this, paramAnonymousMessage)) {
        return;
      }
      paramAnonymousMessage.setPackage(a.b(a.this).getPackageName());
      a.b(a.this).sendBroadcast(paramAnonymousMessage);
    }
  });
  private Context context;
  
  public static a al(Context paramContext)
  {
    try
    {
      if (aQB == null)
      {
        a locala = new a();
        aQB = locala;
        locala.context = paramContext.getApplicationContext();
      }
      paramContext = aQB;
      return paramContext;
    }
    finally {}
  }
  
  public static int am(Context paramContext)
  {
    PackageManager localPackageManager = paramContext.getPackageManager();
    try
    {
      int i = localPackageManager.getPackageInfo(d.aq(paramContext), 0).versionCode;
      return i;
    }
    catch (PackageManager.NameNotFoundException paramContext) {}
    return -1;
  }
  
  public static String c(Intent paramIntent)
  {
    if (!"com.google.android.c2dm.intent.RECEIVE".equals(paramIntent.getAction())) {
      paramIntent = null;
    }
    String str;
    do
    {
      return paramIntent;
      str = paramIntent.getStringExtra("message_type");
      paramIntent = str;
    } while (str != null);
    return "gcm";
  }
  
  private void d(Intent paramIntent)
  {
    try
    {
      if (this.aQC == null)
      {
        Intent localIntent = new Intent();
        localIntent.setPackage("com.google.example.invalidpackage");
        this.aQC = PendingIntent.getBroadcast(this.context, 0, localIntent, 0);
      }
      paramIntent.putExtra("app", this.aQC);
      return;
    }
    finally {}
  }
  
  @Deprecated
  private Intent g(Bundle paramBundle)
  {
    if (Looper.getMainLooper() == Looper.myLooper()) {
      throw new IOException("MAIN_THREAD");
    }
    if (am(this.context) < 0) {
      throw new IOException("Google Play Services missing");
    }
    Intent localIntent = new Intent("com.google.android.c2dm.intent.REGISTER");
    localIntent.setPackage(d.aq(this.context));
    d(localIntent);
    localIntent.putExtra("google.message_id", "google.rpc" + String.valueOf(aQE.getAndIncrement()));
    localIntent.putExtras(paramBundle);
    localIntent.putExtra("google.messenger", this.aQG);
    this.context.startService(localIntent);
    try
    {
      paramBundle = (Intent)this.aQF.poll(30000L, TimeUnit.MILLISECONDS);
      return paramBundle;
    }
    catch (InterruptedException paramBundle)
    {
      throw new IOException(paramBundle.getMessage());
    }
  }
  
  public final void a(String paramString1, String paramString2, Bundle paramBundle)
  {
    if (paramString1 == null) {
      throw new IllegalArgumentException("Missing 'to'");
    }
    Object localObject1 = new Intent("com.google.android.gcm.intent.SEND");
    if (paramBundle != null) {
      ((Intent)localObject1).putExtras(paramBundle);
    }
    d((Intent)localObject1);
    ((Intent)localObject1).setPackage(d.aq(this.context));
    ((Intent)localObject1).putExtra("google.to", paramString1);
    ((Intent)localObject1).putExtra("google.message_id", paramString2);
    ((Intent)localObject1).putExtra("google.ttl", Long.toString(0L));
    ((Intent)localObject1).putExtra("google.delay", Integer.toString(-1));
    if (d.aq(this.context).contains(".gsf"))
    {
      localObject1 = new Bundle();
      Iterator localIterator = paramBundle.keySet().iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        Object localObject2 = paramBundle.get(str);
        if ((localObject2 instanceof String)) {
          ((Bundle)localObject1).putString("gcm." + str, (String)localObject2);
        }
      }
      ((Bundle)localObject1).putString("google.to", paramString1);
      ((Bundle)localObject1).putString("google.message_id", paramString2);
      com.google.android.gms.iid.a.ao(this.context).b("GCM", "upstream", (Bundle)localObject1);
      return;
    }
    this.context.sendOrderedBroadcast((Intent)localObject1, "com.google.android.gtalkservice.permission.GTALK_SERVICE");
  }
  
  @Deprecated
  public final String c(String... paramVarArgs)
  {
    int j = 0;
    Object localObject;
    Bundle localBundle;
    com.google.android.gms.iid.a locala;
    try
    {
      localObject = paramVarArgs[0];
      localBundle = new Bundle();
      if (!d.aq(this.context).contains(".gsf")) {
        break label216;
      }
      localBundle.putString("legacy.sender", (String)localObject);
      locala = com.google.android.gms.iid.a.ao(this.context);
      if (Looper.getMainLooper() == Looper.myLooper()) {
        throw new IOException("MAIN_THREAD");
      }
    }
    finally {}
    int i = 1;
    String str;
    if (com.google.android.gms.iid.a.pP())
    {
      str = null;
      paramVarArgs = str;
      if (str == null)
      {
        if (localBundle.getString("ttl") != null) {
          i = 0;
        }
        if (!"jwt".equals(localBundle.getString("type"))) {
          break label300;
        }
        i = j;
      }
    }
    label216:
    label300:
    for (;;)
    {
      str = locala.b((String)localObject, "GCM", localBundle);
      paramVarArgs = str;
      if (str != null)
      {
        paramVarArgs = str;
        if (i != 0)
        {
          com.google.android.gms.iid.a.aQS.b(locala.aQV, (String)localObject, "GCM", str, com.google.android.gms.iid.a.aQX);
          paramVarArgs = str;
        }
      }
      do
      {
        return paramVarArgs;
        str = com.google.android.gms.iid.a.aQS.e(locala.aQV, (String)localObject, "GCM");
        break;
        localBundle.putString("sender", (String)localObject);
        localObject = g(localBundle);
        if (localObject == null) {
          throw new IOException("SERVICE_NOT_AVAILABLE");
        }
        str = ((Intent)localObject).getStringExtra("registration_id");
        paramVarArgs = str;
      } while (str != null);
      paramVarArgs = ((Intent)localObject).getStringExtra("error");
      if (paramVarArgs != null) {
        throw new IOException(paramVarArgs);
      }
      throw new IOException("SERVICE_NOT_AVAILABLE");
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/google/android/gms/gcm/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */