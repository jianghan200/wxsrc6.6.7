package com.tencent.matrix.iocanary.c;

import android.content.Context;
import com.tencent.matrix.c.b;
import com.tencent.matrix.iocanary.core.IOIssue;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import org.json.JSONException;
import org.json.JSONObject;

public final class a
{
  private static String bqz = null;
  
  public static b a(IOIssue paramIOIssue)
  {
    if (paramIOIssue == null) {
      return null;
    }
    b localb = new b(paramIOIssue.type);
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("path", paramIOIssue.path);
      localJSONObject.put("size", paramIOIssue.fileSize);
      localJSONObject.put("op", paramIOIssue.opCnt);
      localJSONObject.put("buffer", paramIOIssue.bufferSize);
      localJSONObject.put("cost", paramIOIssue.opCostTime);
      localJSONObject.put("opType", paramIOIssue.opType);
      localJSONObject.put("opSize", paramIOIssue.opSize);
      localJSONObject.put("thread", paramIOIssue.threadName);
      localJSONObject.put("stack", paramIOIssue.stack);
      localJSONObject.put("repeat", paramIOIssue.repeatReadCnt);
      localb.brm = localJSONObject;
      return localb;
    }
    catch (JSONException paramIOIssue)
    {
      for (;;) {}
    }
  }
  
  public static void ay(Context paramContext)
  {
    if (bqz == null) {
      bqz = paramContext.getPackageName();
    }
  }
  
  public static String getThrowableStack(Throwable paramThrowable)
  {
    if (paramThrowable == null) {
      return "";
    }
    Object localObject = paramThrowable.getStackTrace();
    if (localObject == null) {
      return "";
    }
    paramThrowable = new ArrayList(localObject.length);
    int i = 0;
    while (i < localObject.length)
    {
      String str = localObject[i].getClassName();
      if ((!str.contains("libcore.io")) && (!str.contains("com.tencent.matrix.iocanary")) && (!str.contains("java.io")) && (!str.contains("dalvik.system")) && (!str.contains("android.os"))) {
        paramThrowable.add(localObject[i]);
      }
      i += 1;
    }
    if ((paramThrowable.size() > 10) && (bqz != null))
    {
      localObject = paramThrowable.listIterator(paramThrowable.size());
      do
      {
        if (!((ListIterator)localObject).hasPrevious()) {
          break;
        }
        if (!((StackTraceElement)((ListIterator)localObject).previous()).getClassName().contains(bqz)) {
          ((ListIterator)localObject).remove();
        }
      } while (paramThrowable.size() > 10);
    }
    localObject = new StringBuffer(paramThrowable.size());
    paramThrowable = paramThrowable.iterator();
    while (paramThrowable.hasNext()) {
      ((StringBuffer)localObject).append((StackTraceElement)paramThrowable.next()).append('\n');
    }
    return ((StringBuffer)localObject).toString();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/matrix/iocanary/c/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */