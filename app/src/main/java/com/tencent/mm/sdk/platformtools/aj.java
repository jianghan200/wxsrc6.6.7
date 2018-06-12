package com.tencent.mm.sdk.platformtools;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public final class aj
{
  public static String b(StackTraceElement[] paramArrayOfStackTraceElement)
  {
    if ((paramArrayOfStackTraceElement == null) || (paramArrayOfStackTraceElement.length < 4)) {
      return "";
    }
    StringBuilder localStringBuilder = new StringBuilder();
    int i = 3;
    while (i < paramArrayOfStackTraceElement.length)
    {
      if ((paramArrayOfStackTraceElement[i].getClassName().contains("com.tencent.mm")) && (!paramArrayOfStackTraceElement[i].getClassName().contains("sdk.platformtools.Log")))
      {
        localStringBuilder.append("[");
        localStringBuilder.append(paramArrayOfStackTraceElement[i].getClassName().substring(15));
        localStringBuilder.append(":");
        localStringBuilder.append(paramArrayOfStackTraceElement[i].getMethodName());
        localStringBuilder.append("(" + paramArrayOfStackTraceElement[i].getLineNumber() + ")]");
      }
      i += 1;
    }
    return localStringBuilder.toString();
  }
  
  public static String cin()
  {
    try
    {
      Object localObject = new Throwable().getStackTrace();
      if ((localObject != null) && (localObject.length >= 3))
      {
        String str = localObject[2].getClassName().substring(15);
        str = str + ":" + localObject[2].getMethodName();
        localObject = str + "(" + localObject[2].getLineNumber() + ")";
        return (String)localObject;
      }
    }
    catch (Throwable localThrowable)
    {
      x.e("MicroMsg.Util.MMStack", "getCaller e:%s", new Object[] { i(localThrowable) });
      return "";
    }
    return "";
  }
  
  public static String cio()
  {
    StackTraceElement[] arrayOfStackTraceElement = new Throwable().getStackTrace();
    if ((arrayOfStackTraceElement == null) || (arrayOfStackTraceElement.length < 4)) {
      return "";
    }
    StringBuilder localStringBuilder = new StringBuilder();
    int i = 3;
    while (i < arrayOfStackTraceElement.length)
    {
      if ((arrayOfStackTraceElement[i].getClassName().contains("com.tencent.mm")) && (!arrayOfStackTraceElement[i].getClassName().contains("sdk.platformtools.Log")))
      {
        localStringBuilder.append("[");
        localStringBuilder.append(arrayOfStackTraceElement[i].getClassName().substring(15));
        localStringBuilder.append(":");
        localStringBuilder.append(arrayOfStackTraceElement[i].getMethodName());
        localStringBuilder.append("(" + arrayOfStackTraceElement[i].getLineNumber() + ")]");
      }
      i += 1;
    }
    return localStringBuilder.toString();
  }
  
  public static String i(Throwable paramThrowable)
  {
    if (paramThrowable == null) {
      return "";
    }
    try
    {
      ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
      PrintStream localPrintStream = new PrintStream(localByteArrayOutputStream);
      paramThrowable.printStackTrace(localPrintStream);
      paramThrowable = localByteArrayOutputStream.toString();
      localPrintStream.close();
      localByteArrayOutputStream.close();
      return paramThrowable;
    }
    catch (Exception paramThrowable) {}
    return "";
  }
  
  public final String toString()
  {
    return cio();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/sdk/platformtools/aj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */