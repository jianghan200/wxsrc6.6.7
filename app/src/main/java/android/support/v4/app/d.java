package android.support.v4.app;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build.VERSION;

public final class d
{
  private static final b mv = new b((byte)0);
  
  static
  {
    if (Build.VERSION.SDK_INT >= 23)
    {
      mv = new a((byte)0);
      return;
    }
  }
  
  public static int c(Context paramContext, String paramString1, String paramString2)
  {
    return mv.c(paramContext, paramString1, paramString2);
  }
  
  public static String permissionToOp(String paramString)
  {
    return mv.permissionToOp(paramString);
  }
  
  private static final class a
    extends d.b
  {
    private a()
    {
      super();
    }
    
    public final int c(Context paramContext, String paramString1, String paramString2)
    {
      return ((AppOpsManager)paramContext.getSystemService(AppOpsManager.class)).noteProxyOp(paramString1, paramString2);
    }
    
    public final String permissionToOp(String paramString)
    {
      return AppOpsManager.permissionToOp(paramString);
    }
  }
  
  private static class b
  {
    public int c(Context paramContext, String paramString1, String paramString2)
    {
      return 1;
    }
    
    public String permissionToOp(String paramString)
    {
      return null;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/android/support/v4/app/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */