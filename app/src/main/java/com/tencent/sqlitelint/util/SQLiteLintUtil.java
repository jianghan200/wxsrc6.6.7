package com.tencent.sqlitelint.util;

import com.tencent.sqlitelint.e;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.ListIterator;

public class SQLiteLintUtil
{
  public static String acM(String paramString)
  {
    if (oW(paramString)) {}
    do
    {
      return null;
      paramString = paramString.split("/");
    } while ((paramString == null) || (paramString.length <= 0));
    return paramString[(paramString.length - 1)];
  }
  
  public static String getThrowableStack()
  {
    try
    {
      String str = getThrowableStack(new Throwable());
      return str;
    }
    catch (Throwable localThrowable)
    {
      SLog.e("SQLiteLint.SQLiteLintUtil", "getThrowableStack ex %s", new Object[] { localThrowable.getMessage() });
    }
    return "";
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
      if (!localObject[i].getClassName().contains("com.tencent.sqlitelint")) {
        paramThrowable.add(localObject[i]);
      }
      i += 1;
    }
    if ((paramThrowable.size() > 6) && (e.bqz != null))
    {
      localObject = paramThrowable.listIterator(paramThrowable.size());
      do
      {
        if (!((ListIterator)localObject).hasPrevious()) {
          break;
        }
        if (!((StackTraceElement)((ListIterator)localObject).previous()).getClassName().contains(e.bqz)) {
          ((ListIterator)localObject).remove();
        }
      } while (paramThrowable.size() > 6);
    }
    localObject = new StringBuffer(paramThrowable.size());
    paramThrowable = paramThrowable.iterator();
    while (paramThrowable.hasNext()) {
      ((StringBuffer)localObject).append((StackTraceElement)paramThrowable.next()).append('\n');
    }
    return ((StringBuffer)localObject).toString();
  }
  
  public static String h(String paramString, long paramLong)
  {
    return new SimpleDateFormat(paramString).format(new Date(paramLong));
  }
  
  public static String oV(String paramString)
  {
    String str = paramString;
    if (paramString == null) {
      str = "";
    }
    return str;
  }
  
  public static boolean oW(String paramString)
  {
    return (paramString == null) || (paramString.length() <= 0);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/sqlitelint/util/SQLiteLintUtil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */