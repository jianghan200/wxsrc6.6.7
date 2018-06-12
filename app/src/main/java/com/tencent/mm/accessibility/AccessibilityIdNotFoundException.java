package com.tencent.mm.accessibility;

public class AccessibilityIdNotFoundException
  extends AccessibilityCaptureNotSupportException
{
  public AccessibilityIdNotFoundException()
  {
    super("Unable to find accessibility id");
  }
  
  public AccessibilityIdNotFoundException(String paramString)
  {
    super(paramString);
  }
  
  public AccessibilityIdNotFoundException(String paramString, Throwable paramThrowable)
  {
    super(paramString, paramThrowable);
  }
  
  public AccessibilityIdNotFoundException(Throwable paramThrowable)
  {
    super("Unable to find accessibility id", paramThrowable);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/accessibility/AccessibilityIdNotFoundException.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */