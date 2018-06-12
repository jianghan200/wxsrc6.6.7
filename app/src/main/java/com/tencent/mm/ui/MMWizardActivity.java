package com.tencent.mm.ui;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.HashMap;
import java.util.Map;
import junit.framework.Assert;

public abstract class MMWizardActivity
  extends MMActivity
{
  public static final Map<String, Intent> tob = new HashMap();
  
  public static void D(Context paramContext, Intent paramIntent)
  {
    x.i("MicroMsg.MMWizardActivity", "startWizardActivity()");
    Assert.assertTrue("startWizardActivity: Param context should be a Activity :" + paramContext.toString(), paramContext instanceof Activity);
    Object localObject = ((Activity)paramContext).getIntent();
    String str1;
    if (localObject != null)
    {
      str1 = ((Intent)localObject).getStringExtra("WizardRootClass");
      localObject = ((Intent)localObject).getStringExtra("WizardTransactionId");
    }
    for (;;)
    {
      String str2 = str1;
      if (bi.oW(str1)) {}
      try
      {
        str2 = paramIntent.getComponent().getClassName();
        Assert.assertFalse("startWizardActivity: ERROR in Get Root Class :[" + paramIntent + "][ " + paramIntent.getComponent() + " ]", bi.oW(str2));
        paramIntent.putExtra("WizardRootClass", str2);
        if (localObject != null) {
          paramIntent.putExtra("WizardTransactionId", (String)localObject);
        }
        paramContext.startActivity(paramIntent);
        return;
      }
      catch (Exception localException)
      {
        for (;;)
        {
          x.printErrStackTrace("MicroMsg.MMWizardActivity", localException, "", new Object[0]);
          String str3 = str1;
        }
      }
      localObject = null;
      str1 = null;
    }
  }
  
  public static void b(Context paramContext, Intent paramIntent1, Intent paramIntent2)
  {
    try
    {
      String str = "trans." + bi.VG() + "." + paramIntent2.hashCode();
      tob.put(str, paramIntent2);
      paramIntent1.putExtra("WizardTransactionId", str);
      paramIntent2 = ((Activity)paramContext).getIntent();
      if (paramIntent2 != null) {
        paramIntent2.putExtra("WizardTransactionId", str);
      }
      D(paramContext, paramIntent1);
      return;
    }
    catch (Exception paramContext)
    {
      x.e("MicroMsg.MMWizardActivity", "%s", new Object[] { bi.i(paramContext) });
    }
  }
  
  public final void DT(int paramInt)
  {
    x.i("MicroMsg.MMWizardActivity", "finishWizard()");
    Object localObject = getIntent().getExtras().getString("WizardRootClass");
    Assert.assertFalse("finishWizard: ERROR in Get Root Class :[" + (String)localObject + "]", bi.oW((String)localObject));
    localObject = new Intent().setClassName(this, (String)localObject);
    ((Intent)localObject).putExtra("WizardRootClass", getIntent().getStringExtra("WizardRootClass"));
    ((Intent)localObject).putExtra("WizardTransactionId", getIntent().getStringExtra("WizardTransactionId"));
    ((Intent)localObject).putExtra("WizardRootKillSelf", true);
    ((Intent)localObject).putExtra("wizard_activity_result_code", paramInt);
    ((Intent)localObject).addFlags(67108864);
    startActivity((Intent)localObject);
  }
  
  public final void cancel()
  {
    x.i("MicroMsg.MMWizardActivity", "cancel()");
    String str = getIntent().getStringExtra("WizardTransactionId");
    Intent localIntent = (Intent)tob.get(str);
    tob.remove(str);
    if (localIntent != null) {
      x.d("MicroMsg.MMWizardActivity", "canceled exit for transaction=" + str + ", intent=" + localIntent);
    }
  }
  
  public final void exit(int paramInt)
  {
    x.i("MicroMsg.MMWizardActivity", "exit()");
    String str = getIntent().getStringExtra("WizardTransactionId");
    Intent localIntent = (Intent)tob.get(str);
    tob.remove(str);
    if (localIntent != null)
    {
      x.d("MicroMsg.MMWizardActivity", "doing post exit for transaction=" + str + ", intent=" + localIntent);
      localIntent.putExtra("wizard_activity_result_code", paramInt);
      startActivity(localIntent);
    }
  }
  
  public void finish()
  {
    x.i("MicroMsg.MMWizardActivity", "finish()");
    String str = getIntent().getStringExtra("WizardRootClass");
    if (getComponentName().getClassName().equals(str))
    {
      x.d("MicroMsg.MMWizardActivity", "root wizard activity");
      exit(-1);
    }
    super.finish();
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    x.i("MicroMsg.MMWizardActivity", "onCreate()");
    Assert.assertFalse("MMWizardActivity Should Start By startWizardActivity or startWizardNextStep", bi.oW(getIntent().getExtras().getString("WizardRootClass")));
    if (getIntent().getExtras().getBoolean("WizardRootKillSelf", false))
    {
      super.finish();
      x.i("MicroMsg.MMWizardActivity", "finish wizard, root=" + getComponentName().getClassName());
      exit(getIntent().getExtras().getInt("wizard_activity_result_code"));
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/ui/MMWizardActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */