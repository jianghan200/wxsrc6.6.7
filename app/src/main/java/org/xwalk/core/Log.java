package org.xwalk.core;

import com.tencent.xweb.util.b;

public class Log
{
  private static b m_log_callback = null;
  
  public static void SetLogCallBack(b paramb)
  {
    m_log_callback = paramb;
  }
  
  public static void d(String paramString1, String paramString2)
  {
    if (m_log_callback != null) {
      m_log_callback.d(paramString1, paramString2);
    }
  }
  
  public static void e(String paramString1, String paramString2)
  {
    if (m_log_callback != null) {
      m_log_callback.e(paramString1, paramString2);
    }
  }
  
  public static void e(String paramString1, String paramString2, Throwable paramThrowable)
  {
    if (m_log_callback != null) {
      m_log_callback.e(paramString1, paramString2);
    }
  }
  
  public static void f(String paramString1, String paramString2)
  {
    if (m_log_callback != null) {
      m_log_callback.e(paramString1, paramString2);
    }
  }
  
  public static void i(String paramString1, String paramString2)
  {
    if (m_log_callback != null) {
      m_log_callback.i(paramString1, paramString2);
    }
  }
  
  public static void v(String paramString1, String paramString2)
  {
    if (m_log_callback != null) {
      m_log_callback.v(paramString1, paramString2);
    }
  }
  
  public static void w(String paramString1, String paramString2)
  {
    if (m_log_callback != null) {
      m_log_callback.w(paramString1, paramString2);
    }
  }
  
  public static void w(String paramString1, String paramString2, Throwable paramThrowable)
  {
    if (m_log_callback != null) {
      m_log_callback.w(paramString1, paramString2);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/org/xwalk/core/Log.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */