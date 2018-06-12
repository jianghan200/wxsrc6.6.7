package com.eclipsesource.v8;

public class V8ScriptExecutionException
  extends V8ScriptException
{
  V8ScriptExecutionException(String paramString1, int paramInt1, String paramString2, String paramString3, int paramInt2, int paramInt3, String paramString4)
  {
    this(paramString1, paramInt1, paramString2, paramString3, paramInt2, paramInt3, paramString4, null);
  }
  
  V8ScriptExecutionException(String paramString1, int paramInt1, String paramString2, String paramString3, int paramInt2, int paramInt3, String paramString4, Throwable paramThrowable)
  {
    super(paramString1, paramInt1, paramString2, paramString3, paramInt2, paramInt3, paramString4, paramThrowable);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/eclipsesource/v8/V8ScriptExecutionException.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */