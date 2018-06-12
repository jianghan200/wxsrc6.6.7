package com.tencent.mm.model.b;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.mm.model.au;
import com.tencent.mm.model.c;

public abstract class a
  implements e
{
  protected e.a dDU;
  protected String dDV = IY();
  protected String[] dDW = IX();
  
  protected String[] IX()
  {
    return null;
  }
  
  public abstract String IY();
  
  public final String X(String paramString1, String paramString2)
  {
    au.HU();
    SharedPreferences localSharedPreferences = c.gh("banner");
    if (localSharedPreferences == null) {
      return null;
    }
    return localSharedPreferences.getString(this.dDV + paramString2 + paramString1, null);
  }
  
  public final void a(e.a parama)
  {
    this.dDU = parama;
  }
  
  public final void a(String paramString, boolean paramBoolean, String[] paramArrayOfString)
  {
    au.HU();
    SharedPreferences localSharedPreferences = c.gh("banner");
    if (localSharedPreferences == null) {}
    label188:
    do
    {
      return;
      localSharedPreferences.edit().putBoolean(this.dDV + paramString, paramBoolean).commit();
      if ((this.dDW != null) && (paramArrayOfString != null) && (this.dDW.length == paramArrayOfString.length))
      {
        String[] arrayOfString = this.dDW;
        int k = arrayOfString.length;
        int i = 0;
        int j = 0;
        if (i < k)
        {
          String str2 = arrayOfString[i];
          if (str2 != null) {
            if (paramArrayOfString[j] == null) {
              break label188;
            }
          }
          for (String str1 = paramArrayOfString[j];; str1 = "")
          {
            localSharedPreferences.edit().putString(this.dDV + str2 + paramString, str1).commit();
            j += 1;
            i += 1;
            break;
          }
        }
      }
    } while (this.dDU == null);
    this.dDU.Jk();
  }
  
  public final boolean iV(String paramString)
  {
    boolean bool2 = false;
    au.HU();
    SharedPreferences localSharedPreferences = c.gh("banner");
    boolean bool1 = bool2;
    if (localSharedPreferences != null)
    {
      bool1 = bool2;
      if (localSharedPreferences.getBoolean(this.dDV + paramString, false)) {
        bool1 = true;
      }
    }
    return bool1;
  }
  
  public final void iW(String paramString)
  {
    au.HU();
    SharedPreferences localSharedPreferences = c.gh("banner");
    if (localSharedPreferences == null) {}
    do
    {
      return;
      localSharedPreferences.edit().remove(this.dDV + paramString).commit();
      if (this.dDW != null)
      {
        String[] arrayOfString = this.dDW;
        int j = arrayOfString.length;
        int i = 0;
        while (i < j)
        {
          String str = arrayOfString[i];
          if (str != null) {
            localSharedPreferences.edit().remove(this.dDV + str + paramString).commit();
          }
          i += 1;
        }
      }
    } while (this.dDU == null);
    this.dDU.Jl();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/model/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */