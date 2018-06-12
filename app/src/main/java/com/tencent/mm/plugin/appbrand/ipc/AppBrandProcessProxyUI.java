package com.tencent.mm.plugin.appbrand.ipc;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Looper;
import android.os.ResultReceiver;
import android.view.Window;
import com.tencent.mm.plugin.appbrand.s.j;
import com.tencent.mm.plugin.appbrand.ui.AppBrandPluginUI;
import com.tencent.mm.plugin.appbrand.ui.AppBrandUI;
import com.tencent.mm.plugin.appbrand.ui.j;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.a;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.widget.a.c;

@a(7)
public class AppBrandProcessProxyUI
  extends MMActivity
  implements b
{
  private int fDQ = 0;
  private AppBrandProxyUIProcessTask fDR;
  private AppBrandProxyUIProcessTask.ProcessRequest fDS;
  private boolean fDT = false;
  private volatile boolean fDU = false;
  private c fDV;
  private a fDW;
  
  static <_Req extends AppBrandProxyUIProcessTask.ProcessRequest, _Result extends AppBrandProxyUIProcessTask.ProcessResult> void a(Context paramContext, Class<? extends AppBrandProcessProxyUI> paramClass, _Req param_Req, AppBrandProxyUIProcessTask.b<_Result> paramb)
  {
    if (paramContext == null) {
      paramContext = ad.getContext();
    }
    for (;;)
    {
      String str = param_Req.ahF().getName();
      Object localObject;
      if (paramClass == null)
      {
        localObject = AppBrandProcessProxyUI.class;
        localObject = new Intent(paramContext, (Class)localObject).putExtra("key_model_class_name", str);
        if (paramb != null) {
          break label125;
        }
        paramb = null;
        label50:
        paramb = ((Intent)localObject).putExtra("key_result_receiver", paramb).putExtra("appbrand_report_key_target_activity", param_Req.ahE()).putExtra("key_running_mode", 1);
        paramb.putExtra("key_request_parcel", param_Req);
        if ((paramContext instanceof Activity)) {
          break label143;
        }
        paramb.addFlags(268435456);
      }
      for (;;)
      {
        if ((AppBrandProcessProxyUI.class == paramClass) || (!(paramContext instanceof Activity))) {
          break label163;
        }
        ((Activity)paramContext).startActivityForResult(paramb, 0);
        return;
        localObject = paramClass;
        break;
        label125:
        paramb = new AppBrandProcessProxyUI.1(ag.fetchFreeHandler(Looper.getMainLooper()), paramb);
        break label50;
        label143:
        paramb.putExtra("key_need_light_status", j.c(((Activity)paramContext).getWindow()));
      }
      label163:
      paramContext.startActivity(paramb);
      return;
    }
  }
  
  static void a(Context paramContext, Class<? extends AppBrandProcessProxyUI> paramClass, String paramString1, String paramString2, String paramString3, String paramString4, DialogInterface.OnClickListener paramOnClickListener1, DialogInterface.OnClickListener paramOnClickListener2, DialogInterface.OnClickListener paramOnClickListener3)
  {
    Context localContext = paramContext;
    if (paramContext == null) {
      localContext = ad.getContext();
    }
    paramContext = new Intent(localContext, paramClass).putExtra("key_running_mode", 2).putExtra("key_result_receiver", new AppBrandProcessProxyUI.2(ag.fetchFreeHandler(Looper.getMainLooper()), paramOnClickListener1, paramOnClickListener2, paramOnClickListener3)).putExtra("key_alert_message", paramString1).putExtra("key_alert_title", paramString2).putExtra("key_alert_confirm", paramString3).putExtra("key_alert_deny", paramString4);
    if (!(localContext instanceof Activity)) {
      paramContext.addFlags(268435456);
    }
    localContext.startActivity(paramContext);
  }
  
  public static void m(Context paramContext, Intent paramIntent)
  {
    if ((!(paramContext instanceof AppBrandUI)) || ((paramContext instanceof AppBrandPluginUI)))
    {
      paramContext.startActivity(paramIntent);
      return;
    }
    paramContext.startActivity(new Intent(paramContext, AppBrandProcessProxyUI.class).putExtra("key_running_mode", 10000).putExtra("key_proxy_launch_target_intent", paramIntent).putExtra("key_proxy_launch_appbrand_ui_class", paramContext.getClass()).addFlags(268435456));
  }
  
  private static String nilAs(String paramString1, String paramString2)
  {
    if (bi.oW(paramString1)) {
      return paramString2;
    }
    return paramString1;
  }
  
  public static boolean t(Intent paramIntent)
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (paramIntent != null) {
      bool1 = bool2;
    }
    try
    {
      if (paramIntent.getComponent() != null)
      {
        bool1 = bool2;
        if (paramIntent.getComponent().getShortClassName().equals(".plugin.appbrand.ipc.AppBrandProcessProxyUI"))
        {
          int i = paramIntent.getIntExtra("key_running_mode", -1);
          bool1 = bool2;
          if (i == 10000) {
            bool1 = true;
          }
        }
      }
      return bool1;
    }
    catch (Exception paramIntent) {}
    return false;
  }
  
  public final void a(AppBrandProxyUIProcessTask.ProcessResult paramProcessResult)
  {
    this.fDU = true;
    runOnUiThread(new AppBrandProcessProxyUI.4(this, paramProcessResult));
  }
  
  public final MMActivity ahw()
  {
    return this;
  }
  
  public final boolean ahx()
  {
    return (this.tlP) || (isFinishing()) || (this.fDU);
  }
  
  public final void b(AppBrandProxyUIProcessTask.ProcessResult paramProcessResult)
  {
    ResultReceiver localResultReceiver = (ResultReceiver)getIntent().getParcelableExtra("key_result_receiver");
    if ((localResultReceiver != null) && (paramProcessResult != null))
    {
      Bundle localBundle = new Bundle(2);
      localBundle.putParcelable("key_result_parcel", paramProcessResult);
      localResultReceiver.send(0, localBundle);
    }
  }
  
  public void finish()
  {
    super.finish();
    overridePendingTransition(0, 0);
    if (this.fDR != null) {
      this.fDR.ahC();
    }
  }
  
  public final int getLayoutId()
  {
    return -1;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    x.d("MicroMsg.AppBrandProcessProxyUI", "onActivityResult, requestCode = %d, resultCode = %d, request = %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), this.fDS.getClass().getName() });
    this.fDT = false;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    int i = 0;
    super.onCreate(paramBundle);
    overridePendingTransition(0, 0);
    j.a(getWindow());
    j.a(getWindow(), getIntent().getBooleanExtra("key_need_light_status", false));
    getWindow().setBackgroundDrawable(new ColorDrawable(0));
    if (getIntent() == null)
    {
      finish();
      return;
    }
    switch (getIntent().getIntExtra("key_running_mode", 0))
    {
    default: 
      finish();
      return;
    case 1: 
      getIntent().setExtrasClassLoader(AppBrandProcessProxyUI.class.getClassLoader());
      paramBundle = getIntent().getStringExtra("key_model_class_name");
      x.i("MicroMsg.AppBrandProcessProxyUI", "onCreate, modelClass = %s", new Object[] { paramBundle });
      if (bi.oW(paramBundle)) {}
      while (i == 0)
      {
        finish();
        return;
        this.fDR = AppBrandProxyUIProcessTask.a.tf(paramBundle);
        if (this.fDR == null)
        {
          x.e("MicroMsg.AppBrandProcessProxyUI", "onCreate unknown model class = %s", new Object[] { paramBundle });
        }
        else
        {
          if (getIntent().getBooleanExtra("key_request_need_params", true))
          {
            this.fDS = ((AppBrandProxyUIProcessTask.ProcessRequest)getIntent().getParcelableExtra("key_request_parcel"));
            if (this.fDS == null) {
              x.e("MicroMsg.AppBrandProcessProxyUI", "onCreate unknown request class = %s", new Object[] { paramBundle });
            }
          }
          else
          {
            this.fDS = null;
            continue;
          }
          this.fDR.fEn = this;
          this.fDR.a(this.fDS);
          i = 1;
        }
      }
    case 2: 
      paramBundle = nilAs(getIntent().getStringExtra("key_alert_title"), "");
      String str1 = nilAs(getIntent().getStringExtra("key_alert_message"), getString(s.j.app_tip));
      String str2 = nilAs(getIntent().getStringExtra("key_alert_confirm"), "");
      String str3 = nilAs(getIntent().getStringExtra("key_alert_deny"), "");
      this.fDW = new a((byte)0);
      this.fDV = h.a(this, str1, paramBundle, str2, str3, false, this.fDW, this.fDW);
      this.fDV.setOnDismissListener(this.fDW);
      this.fDV.setOnKeyListener(new AppBrandProcessProxyUI.3(this, str3));
      return;
    }
    paramBundle = (Intent)getIntent().getParcelableExtra("key_proxy_launch_target_intent");
    if (paramBundle != null)
    {
      if (paramBundle.getComponent() != null) {}
      try
      {
        Class.forName(paramBundle.getComponent().getClassName());
        try
        {
          startActivity(paramBundle);
          return;
        }
        catch (Exception localException1)
        {
          try
          {
            x.e("MicroMsg.AppBrandProcessProxyUI", "start targetActivity, %s, e = %s", new Object[] { paramBundle, localException1 });
            return;
          }
          catch (Exception paramBundle)
          {
            return;
          }
        }
      }
      catch (Exception localException2)
      {
        for (;;)
        {
          x.e("MicroMsg.AppBrandProcessProxyUI", "proxyLaunch, Class.forName %s, e = %s", new Object[] { paramBundle.getComponent().getClassName(), localException2 });
        }
      }
    }
    finish();
  }
  
  protected final void onCreateBeforeSetContentView()
  {
    super.onCreateBeforeSetContentView();
    supportRequestWindowFeature(1);
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    if ((this.fDV != null) && (this.fDV.isShowing()))
    {
      this.fDV.dismiss();
      this.fDV = null;
      this.fDW = null;
    }
  }
  
  protected void onResume()
  {
    super.onResume();
    int i = getIntent().getIntExtra("key_running_mode", 0);
    if (i == 10000)
    {
      i = this.fDQ + 1;
      this.fDQ = i;
      if (i > 1) {
        try
        {
          Class localClass = (Class)getIntent().getSerializableExtra("key_proxy_launch_appbrand_ui_class");
          if (localClass == null)
          {
            finish();
            return;
          }
          startActivity(new Intent(this, localClass).putExtra("key_appbrand_bring_ui_to_front", true).addFlags(268435456));
          finish();
          return;
        }
        catch (Exception localException)
        {
          finish();
          return;
        }
      }
    }
    else
    {
      if (i == 2)
      {
        x.d("MicroMsg.AppBrandProcessProxyUI", "onResume, RUNNING_MODE_SHOW_ALERT");
        return;
      }
      boolean bool = ahx();
      x.d("MicroMsg.AppBrandProcessProxyUI", "onResume, mFinishOnNextResume = %b, finishing = %b, request = %s", new Object[] { Boolean.valueOf(this.fDT), Boolean.valueOf(bool), this.fDS.getClass().getName() });
      if ((this.fDT) && (this.fDS.ahD()) && (!bool)) {
        a(null);
      }
      this.fDT = true;
    }
  }
  
  private final class a
    implements DialogInterface.OnClickListener, DialogInterface.OnDismissListener
  {
    private boolean fEe = false;
    
    private a() {}
    
    private void kw(int paramInt)
    {
      if (this.fEe) {}
      ResultReceiver localResultReceiver;
      do
      {
        return;
        this.fEe = true;
        localResultReceiver = (ResultReceiver)AppBrandProcessProxyUI.this.getIntent().getParcelableExtra("key_result_receiver");
      } while (localResultReceiver == null);
      localResultReceiver.send(paramInt, null);
    }
    
    public final void onClick(DialogInterface paramDialogInterface, int paramInt)
    {
      kw(paramInt);
    }
    
    public final void onDismiss(DialogInterface paramDialogInterface)
    {
      kw(-2);
      AppBrandProcessProxyUI.this.a(null);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/appbrand/ipc/AppBrandProcessProxyUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */