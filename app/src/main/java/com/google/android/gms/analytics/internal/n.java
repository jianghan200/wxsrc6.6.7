package com.google.android.gms.analytics.internal;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.w;

public class n
{
  public final q aFn;
  
  public n(q paramq)
  {
    w.ah(paramq);
    this.aFn = paramq;
  }
  
  protected static String a(String paramString, Object paramObject1, Object paramObject2, Object paramObject3)
  {
    String str1 = paramString;
    if (paramString == null) {
      str1 = "";
    }
    String str2 = ac(paramObject1);
    paramObject2 = ac(paramObject2);
    paramObject3 = ac(paramObject3);
    StringBuilder localStringBuilder = new StringBuilder();
    paramString = "";
    if (!TextUtils.isEmpty(str1))
    {
      localStringBuilder.append(str1);
      paramString = ": ";
    }
    paramObject1 = paramString;
    if (!TextUtils.isEmpty(str2))
    {
      localStringBuilder.append(paramString);
      localStringBuilder.append(str2);
      paramObject1 = ", ";
    }
    paramString = (String)paramObject1;
    if (!TextUtils.isEmpty((CharSequence)paramObject2))
    {
      localStringBuilder.append((String)paramObject1);
      localStringBuilder.append((String)paramObject2);
      paramString = ", ";
    }
    if (!TextUtils.isEmpty((CharSequence)paramObject3))
    {
      localStringBuilder.append(paramString);
      localStringBuilder.append((String)paramObject3);
    }
    return localStringBuilder.toString();
  }
  
  private static String ac(Object paramObject)
  {
    if (paramObject == null) {
      return "";
    }
    if ((paramObject instanceof String)) {
      return (String)paramObject;
    }
    if ((paramObject instanceof Boolean))
    {
      if (paramObject == Boolean.TRUE) {
        return "true";
      }
      return "false";
    }
    if ((paramObject instanceof Throwable)) {
      return ((Throwable)paramObject).toString();
    }
    return paramObject.toString();
  }
  
  protected static void nl()
  {
    if (com.google.android.gms.common.internal.f.aNr) {
      throw new IllegalStateException("Call only supported on the client side");
    }
  }
  
  public static boolean no()
  {
    return Log.isLoggable((String)aj.aHt.get(), 2);
  }
  
  public void a(int paramInt, String paramString, Object paramObject1, Object paramObject2, Object paramObject3)
  {
    Object localObject = null;
    if (this.aFn != null) {
      localObject = this.aFn.aFW;
    }
    if (localObject != null) {
      ((f)localObject).a(paramInt, paramString, paramObject1, paramObject2, paramObject3);
    }
    do
    {
      return;
      localObject = (String)aj.aHt.get();
    } while (!Log.isLoggable((String)localObject, paramInt));
    Log.println(paramInt, (String)localObject, a(paramString, paramObject1, paramObject2, paramObject3));
  }
  
  public final void a(String paramString, Object paramObject1, Object paramObject2)
  {
    a(2, paramString, paramObject1, paramObject2, null);
  }
  
  public final void aO(String paramString)
  {
    a(2, paramString, null, null, null);
  }
  
  public final void aP(String paramString)
  {
    a(3, paramString, null, null, null);
  }
  
  public final void aQ(String paramString)
  {
    a(4, paramString, null, null, null);
  }
  
  public final void aR(String paramString)
  {
    a(5, paramString, null, null, null);
  }
  
  public final void aS(String paramString)
  {
    a(6, paramString, null, null, null);
  }
  
  public final void b(String paramString, Object paramObject1, Object paramObject2)
  {
    a(3, paramString, paramObject1, paramObject2, null);
  }
  
  public final void c(String paramString, Object paramObject1, Object paramObject2)
  {
    a(5, paramString, paramObject1, paramObject2, null);
  }
  
  public final void d(String paramString, Object paramObject)
  {
    a(2, paramString, paramObject, null, null);
  }
  
  public final void d(String paramString, Object paramObject1, Object paramObject2)
  {
    a(6, paramString, paramObject1, paramObject2, null);
  }
  
  public final void e(String paramString, Object paramObject)
  {
    a(3, paramString, paramObject, null, null);
  }
  
  public final void f(String paramString, Object paramObject)
  {
    a(5, paramString, paramObject, null, null);
  }
  
  public final void g(String paramString, Object paramObject)
  {
    a(6, paramString, paramObject, null, null);
  }
  
  protected final ag nm()
  {
    q localq = this.aFn;
    q.a(localq.aFZ);
    return localq.aFZ;
  }
  
  protected final i nn()
  {
    q localq = this.aFn;
    q.a(localq.aGb);
    return localq.aGb;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/google/android/gms/analytics/internal/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */