package com.tencent.sqlitelint;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import com.tencent.sqlitelint.behaviour.b.a.a;
import com.tencent.sqlitelint.util.SLog;
import com.tencent.sqlitelint.util.SQLite3ProfileHooker;
import com.tencent.sqlitelint.util.SQLiteLintUtil;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.xmlpull.v1.XmlPullParserException;

public class e
{
  public static String bqz;
  private static int vni;
  static a.a vnj;
  
  static
  {
    if (!e.class.desiredAssertionStatus()) {}
    for (boolean bool = true;; bool = false)
    {
      $assertionsDisabled = bool;
      SQLiteLintNativeBridge.loadLibrary();
      vni = 0;
      bqz = null;
      return;
    }
  }
  
  public static void Hs(int paramInt)
  {
    if (vni != 0) {}
    do
    {
      return;
      vni = paramInt;
    } while (paramInt != c.vnp);
    SQLite3ProfileHooker.cGj();
  }
  
  public static void M(String paramString1, String paramString2, int paramInt)
  {
    if (g.vnt.acI(paramString1) == null) {
      return;
    }
    g.vnt.acI(paramString1);
    SQLiteLintNativeBridge.nativeNotifySqlExecute(paramString1, paramString2, paramInt, SQLiteLintUtil.getThrowableStack(new Throwable()));
  }
  
  public static void a(Context paramContext, a parama, b paramb)
  {
    assert (parama != null);
    assert (vni != 0) : "SqlExecutionCallbackMode is UNKNOWN！setSqlExecutionCallbackMode must be called before install";
    b localb = paramb;
    if (paramb == null) {
      localb = b.vnm;
    }
    paramb = g.vnt;
    String str = parama.vnk;
    if (paramb.vnu.containsKey(str))
    {
      SLog.w("SQLiteLint.SQLiteLintAndroidCoreManager", "install twice!! ignore", new Object[0]);
      return;
    }
    paramContext = new f(paramContext, parama, localb);
    paramb.vnu.put(str, paramContext);
  }
  
  static void a(a.a parama)
  {
    vnj = parama;
  }
  
  public static void acH(String paramString)
  {
    f localf = g.vnt.acI(paramString);
    if (vni == c.vnp) {
      SQLite3ProfileHooker.cGk();
    }
    SQLiteLintNativeBridge.nativeUninstall(localf.vnk);
    g.vnt.vnu.remove(paramString);
  }
  
  public static void ay(Context paramContext)
  {
    if (bqz == null) {
      bqz = paramContext.getPackageName();
    }
  }
  
  public static int cGf()
  {
    return vni;
  }
  
  public static void dD(String paramString, int paramInt)
  {
    str1 = null;
    if (g.vnt.acI(paramString) == null) {
      return;
    }
    Object localObject = g.vnt.acI(paramString);
    paramString = ((f)localObject).mContext;
    String str2 = ((f)localObject).vnk;
    try
    {
      localObject = paramString.getResources().getXml(paramInt);
      if (localObject == null)
      {
        SLog.w("SQLiteLint.CheckerWhiteListLogic", "buildWhiteListSet: parser null", new Object[0]);
        return;
      }
    }
    catch (Exception paramString)
    {
      SLog.w("SQLiteLint.CheckerWhiteListLogic", "buildWhiteListSet: getResources exp=%s", new Object[] { paramString.getLocalizedMessage() });
      return;
    }
    try
    {
      paramInt = ((XmlResourceParser)localObject).getEventType();
      localHashMap = new HashMap();
      i = 0;
      paramString = str1;
    }
    catch (XmlPullParserException paramString)
    {
      for (;;)
      {
        HashMap localHashMap;
        int i;
        int j;
        ArrayList localArrayList;
        SLog.w("SQLiteLint.CheckerWhiteListLogic", "buildWhiteListSet: exp=%s", new Object[] { paramString.getLocalizedMessage() });
      }
    }
    catch (IOException paramString)
    {
      for (;;)
      {
        SLog.w("SQLiteLint.CheckerWhiteListLogic", "buildWhiteListSet: exp=%s", new Object[] { paramString.getLocalizedMessage() });
        continue;
        continue;
        str1 = paramString;
        continue;
        if (paramInt != 1)
        {
          str1 = paramString;
          switch (paramInt)
          {
          }
        }
      }
    }
    SLog.w("SQLiteLint.CheckerWhiteListLogic", "buildWhiteListMap: default branch , eventType:%d", new Object[] { Integer.valueOf(paramInt) });
    str1 = paramString;
    ((XmlResourceParser)localObject).next();
    paramInt = ((XmlResourceParser)localObject).getEventType();
    j = i + 1;
    paramString = str1;
    i = j;
    if (j > 10000)
    {
      SLog.e("SQLiteLint.CheckerWhiteListLogic", "buildWhiteListMap:maybe dead loop!!", new Object[0]);
      a.u(str2, localHashMap);
      ((XmlResourceParser)localObject).close();
      return;
      str1 = ((XmlResourceParser)localObject).getName();
      if ("checker".equalsIgnoreCase(str1))
      {
        paramString = ((XmlResourceParser)localObject).getAttributeValue(null, "name");
        if ((!"element".equalsIgnoreCase(str1)) || (SQLiteLintUtil.oW(paramString))) {
          break label382;
        }
        str1 = ((XmlResourceParser)localObject).nextText();
        if (localHashMap.get(paramString) == null)
        {
          localArrayList = new ArrayList();
          localArrayList.add(str1);
          localHashMap.put(paramString, localArrayList);
        }
        for (;;)
        {
          SLog.v("SQLiteLint.CheckerWhiteListLogic", "buildWhiteListMap: add to whiteList[%s]: %s", new Object[] { paramString, str1 });
          str1 = paramString;
          break;
          ((List)localHashMap.get(paramString)).add(str1);
        }
      }
    }
  }
  
  public static void v(String paramString, List<String> paramList)
  {
    if (g.vnt.acI(paramString) == null) {}
    while ((paramList == null) || (paramList.isEmpty())) {
      return;
    }
    paramString = g.vnt.acI(paramString);
    String[] arrayOfString = new String[paramList.size()];
    int i = 0;
    while (i < paramList.size())
    {
      arrayOfString[i] = ((String)paramList.get(i));
      i += 1;
    }
    SQLiteLintNativeBridge.nativeEnableCheckers(paramString.vnk, arrayOfString);
  }
  
  public static final class a
  {
    public final String vnk;
    final c vnl;
    
    static
    {
      if (!e.class.desiredAssertionStatus()) {}
      for (boolean bool = true;; bool = false)
      {
        $assertionsDisabled = bool;
        return;
      }
    }
    
    public a(String paramString, c paramc)
    {
      assert (paramString != null);
      this.vnk = paramString;
      this.vnl = paramc;
    }
  }
  
  public static final class b
  {
    public static final b vnm = new a().cGg();
    int vnn;
    
    public static final class a
    {
      public int vno;
      
      public a()
      {
        this.vno |= 0x1;
      }
      
      public final e.b cGg()
      {
        e.b localb = new e.b();
        e.b.a(localb, this.vno);
        return localb;
      }
    }
  }
  
  public static enum c {}
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/sqlitelint/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */