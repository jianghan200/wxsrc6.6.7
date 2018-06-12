package c.t.m.g;

import android.os.Handler;
import java.util.Map;

public final class ce
{
  private static Handler a = ;
  private static boolean b = true;
  private static boolean c = true;
  
  private static int a(String paramString, int paramInt)
  {
    int j = 1;
    if (paramString.equals("HLDisconnEvent")) {
      return 0;
    }
    int i;
    if (paramInt != 0)
    {
      if ((paramInt == -4) || (paramInt == -3) || (paramInt == 65248))
      {
        i = 1;
        if (i == 0) {
          break label95;
        }
      }
    }
    else
    {
      paramString = "self_report_succ_denominator_value";
      label45:
      if (paramInt != 0)
      {
        i = j;
        if (paramInt != -4)
        {
          i = j;
          if (paramInt != -3)
          {
            if (paramInt != 65248) {
              break label101;
            }
            i = j;
          }
        }
        label74:
        if (i == 0) {
          break label106;
        }
      }
    }
    label95:
    label101:
    label106:
    for (paramInt = 100;; paramInt = 2)
    {
      return w.a(paramString, 0, Integer.MAX_VALUE, paramInt);
      i = 0;
      break;
      paramString = "self_report_fail_denominator_value";
      break label45;
      i = 0;
      break label74;
    }
  }
  
  public static void a(String paramString1, int paramInt1, int paramInt2, String paramString2, Map<String, String> paramMap1, Map<String, String> paramMap2, boolean paramBoolean)
  {
    a.post(new cf(paramString1, paramInt1, paramInt2, paramString2, paramMap1, paramMap2, paramBoolean));
  }
  
  public static void b(String paramString1, int paramInt1, int paramInt2, String paramString2, Map<String, String> paramMap1, Map<String, String> paramMap2, boolean paramBoolean)
  {
    a.post(new cg(paramString1, paramInt1, paramInt2, paramString2, paramMap1, paramMap2, paramBoolean));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/c/t/m/g/ce.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */