package com.tencent.mm.plugin.remittance.bankcard.ui;

import android.app.Activity;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.s;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public abstract class BankRemitBaseUI
  extends WalletBaseUI
{
  public static int E(Activity paramActivity)
  {
    int j = 0;
    int i = j;
    if (Build.VERSION.SDK_INT >= 19)
    {
      if (Build.VERSION.SDK_INT < 23) {
        break label37;
      }
      paramActivity.getWindow().getDecorView().setSystemUiVisibility(8192);
      i = 3;
    }
    label37:
    do
    {
      return i;
      if (F(paramActivity)) {
        return 1;
      }
      i = j;
    } while (!e(paramActivity.getWindow()));
    return 2;
  }
  
  private static boolean F(Activity paramActivity)
  {
    Window localWindow = paramActivity.getWindow();
    if (localWindow != null)
    {
      Class localClass1 = localWindow.getClass();
      try
      {
        Class localClass2 = Class.forName("android.view.MiuiWindowManager$LayoutParams");
        int i = localClass2.getField("EXTRA_FLAG_STATUS_BAR_DARK_MODE").getInt(localClass2);
        localClass1.getMethod("setExtraFlags", new Class[] { Integer.TYPE, Integer.TYPE }).invoke(localWindow, new Object[] { Integer.valueOf(i), Integer.valueOf(i) });
        return false;
      }
      catch (Exception paramActivity)
      {
        try
        {
          if (Build.VERSION.SDK_INT >= 23) {
            paramActivity.getWindow().getDecorView().setSystemUiVisibility(8192);
          }
          return true;
        }
        catch (Exception paramActivity)
        {
          return true;
        }
        paramActivity = paramActivity;
        return false;
      }
    }
  }
  
  private static boolean e(Window paramWindow)
  {
    if (paramWindow != null) {
      try
      {
        WindowManager.LayoutParams localLayoutParams = paramWindow.getAttributes();
        Field localField1 = WindowManager.LayoutParams.class.getDeclaredField("MEIZU_FLAG_DARK_STATUS_BAR_ICON");
        Field localField2 = WindowManager.LayoutParams.class.getDeclaredField("meizuFlags");
        localField1.setAccessible(true);
        localField2.setAccessible(true);
        localField2.setInt(localLayoutParams, localField1.getInt(null) | localField2.getInt(localLayoutParams));
        paramWindow.setAttributes(localLayoutParams);
        return true;
      }
      catch (Exception paramWindow) {}
    }
    return false;
  }
  
  protected void aWd()
  {
    x.i("BankRemitBase", "ret: %s", new Object[] { Integer.valueOf(E(this)) });
    this.mController.contentView.setFitsSystemWindows(true);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    aWd();
    setBackBtn(new BankRemitBaseUI.1(this));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/remittance/bankcard/ui/BankRemitBaseUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */