package com.tencent.mm.plugin.webview.ui.tools;

import android.app.Activity;
import android.content.Intent;
import com.tencent.mm.platformtools.af;
import com.tencent.mm.protocal.GeneralControlWrapper;
import com.tencent.mm.protocal.JsapiPermissionWrapper;
import com.tencent.mm.protocal.c.yl;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.xweb.WebView;
import java.util.HashMap;
import java.util.Map;

public final class e
{
  private WebView pVK;
  private Map<String, a> pWV;
  private JsapiPermissionWrapper pWW;
  private GeneralControlWrapper pWX;
  private final JsapiPermissionWrapper pWY = new JsapiPermissionWrapper(2);
  private final GeneralControlWrapper pWZ = GeneralControlWrapper.qVY;
  private int[] pXa;
  private int[] pXb;
  
  public e(Activity paramActivity, WebView paramWebView)
  {
    this.pWW = ((JsapiPermissionWrapper)paramActivity.getIntent().getParcelableExtra("hardcode_jspermission"));
    if ((af.exh == null) || (af.exh.length() == 0))
    {
      x.i("MicroMsg.WebViewPermission", "setHardcodeJsPermission, Test.jsapiPermission is null");
      this.pWX = ((GeneralControlWrapper)paramActivity.getIntent().getParcelableExtra("hardcode_general_ctrl"));
      if ((af.exi != null) && (af.exi.length() != 0)) {
        break label376;
      }
      x.i("MicroMsg.WebViewPermission", "setHardcodeGeneralCtrl, Test.generalCtrl is null");
    }
    for (;;)
    {
      x.i("MicroMsg.WebViewPermission", "edw <init> hardcodeJsPerm = " + this.pWW + ", hardcodeGenCtrl = " + this.pWX);
      this.pVK = paramWebView;
      this.pWV = new HashMap();
      this.pXa = paramActivity.getIntent().getIntArrayExtra("jsapi_blacklist");
      this.pXb = paramActivity.getIntent().getIntArrayExtra("jsapi_whitelist");
      if ((this.pXa != null) && (this.pXa.length > 0) && (this.pWW != null))
      {
        x.i("MicroMsg.WebViewPermission", "albie: setBlacklist jsapi(%s).", new Object[] { this.pXa });
        this.pWW.q(this.pXa);
      }
      if ((this.pXb != null) && (this.pXb.length > 0) && (this.pWW != null))
      {
        x.i("MicroMsg.WebViewPermission", "albie: setWhitelist jsapi(%s).", new Object[] { this.pXb });
        this.pWW.r(this.pXb);
      }
      return;
      int i;
      try
      {
        i = bi.getInt(af.exh, 0);
        if (i < 0) {
          x.w("MicroMsg.WebViewPermission", "setHardcodeJsPermission, Test.jsapiPermission wrong");
        }
      }
      catch (Exception localException1)
      {
        x.e("MicroMsg.WebViewPermission", "setHardcodeJsPermission, parse jsapi fail, ex = " + localException1.getMessage());
        this.pWW = null;
      }
      for (;;)
      {
        x.i("MicroMsg.WebViewPermission", "setHardcodeJsPermission, hardcodeJsPerm = " + this.pWW);
        break;
        this.pWW = new JsapiPermissionWrapper(i);
      }
      try
      {
        label376:
        i = bi.getInt(af.exi, 0);
        x.i("MicroMsg.WebViewPermission", "setHardcodeGeneralCtrl, permission = %d", new Object[] { Integer.valueOf(i) });
        yl localyl = new yl();
        localyl.rEl = i;
        this.pWX = new GeneralControlWrapper(localyl);
        x.i("MicroMsg.WebViewPermission", "setHardcodeGeneralCtrl, hardcodeGenCtrl = " + this.pWX);
      }
      catch (Exception localException2)
      {
        for (;;)
        {
          x.e("MicroMsg.WebViewPermission", "setHardcodeGeneralCtrl fail, ex = %s", new Object[] { localException2.getMessage() });
          this.pWX = null;
        }
      }
    }
  }
  
  private static String Dq(String paramString)
  {
    int i = paramString.indexOf("#");
    if (i < 0) {
      return paramString;
    }
    return paramString.substring(0, i);
  }
  
  public final JsapiPermissionWrapper Rl(String paramString)
  {
    if (this.pWW != null)
    {
      x.i("MicroMsg.WebViewPermission", "getJsPerm, return hardcodeJsPerm = " + this.pWW);
      return this.pWW;
    }
    if (bi.oW(paramString))
    {
      x.e("MicroMsg.WebViewPermission", "getJsPerm fail, url = " + paramString);
      return this.pWY;
    }
    paramString = Dq(paramString);
    if (this.pWV == null)
    {
      x.e("MicroMsg.WebViewPermission", "getJsPerm fail, permMap is null");
      return this.pWY;
    }
    paramString = (a)this.pWV.get(paramString);
    if (paramString == null) {
      return this.pWY;
    }
    return paramString.pXc;
  }
  
  public final void b(String paramString, JsapiPermissionWrapper paramJsapiPermissionWrapper, GeneralControlWrapper paramGeneralControlWrapper)
  {
    if (bi.oW(paramString))
    {
      x.e("MicroMsg.WebViewPermission", "update fail, url is null");
      return;
    }
    String str = Dq(paramString);
    paramString = paramJsapiPermissionWrapper;
    if (paramJsapiPermissionWrapper == null) {
      paramString = this.pWY;
    }
    paramJsapiPermissionWrapper = paramGeneralControlWrapper;
    if (paramGeneralControlWrapper == null) {
      paramJsapiPermissionWrapper = this.pWZ;
    }
    if ((this.pXa != null) && (this.pXa.length > 0))
    {
      x.i("MicroMsg.WebViewPermission", "albie: update setBlacklist jsapi(%s).", new Object[] { this.pXa });
      paramString.q(this.pXa);
    }
    if ((this.pXb != null) && (this.pXb.length > 0))
    {
      x.i("MicroMsg.WebViewPermission", "albie: update setWhitelist jsapi(%s).", new Object[] { this.pXb });
      paramString.r(this.pXb);
    }
    x.i("MicroMsg.WebViewPermission", "edw update, jsPerm = " + paramString + ", genCtrl = " + paramJsapiPermissionWrapper + ", url = " + str);
    this.pWV.put(str, new a(paramString, paramJsapiPermissionWrapper));
  }
  
  public final JsapiPermissionWrapper bVR()
  {
    if (this.pWW != null)
    {
      x.i("MicroMsg.WebViewPermission", "getJsPerm, return hardcodeJsPerm = " + this.pWW);
      return this.pWW;
    }
    if (this.pVK == null) {}
    for (String str = null;; str = this.pVK.getUrl()) {
      return Rl(str);
    }
  }
  
  public final GeneralControlWrapper bVS()
  {
    Object localObject = null;
    if (this.pWX != null)
    {
      x.i("MicroMsg.WebViewPermission", "getGenCtrl, return hardcodeGenCtrl = " + this.pWX);
      return this.pWX;
    }
    String str;
    if (this.pVK != null)
    {
      str = this.pVK.getUrl();
      if (!bi.oW(str)) {}
    }
    for (localObject = str;; localObject = null)
    {
      x.e("MicroMsg.WebViewPermission", "getGenCtrl fail, url = " + (String)localObject);
      return this.pWZ;
      str = Dq(str);
      a locala = (a)this.pWV.get(str);
      StringBuilder localStringBuilder = new StringBuilder("edw getGenCtrl, genCtrl = ");
      if (locala == null) {}
      for (;;)
      {
        x.i("MicroMsg.WebViewPermission", localObject + ", url = " + str);
        if (locala != null) {
          break;
        }
        return this.pWZ;
        localObject = locala.pXd;
      }
      return locala.pXd;
    }
  }
  
  public final void detach()
  {
    x.i("MicroMsg.WebViewPermission", "detach");
    this.pWV.clear();
    this.pWV = null;
    this.pVK = null;
  }
  
  public final boolean has(String paramString)
  {
    if (bi.oW(paramString))
    {
      x.e("MicroMsg.WebViewPermission", "has fail, url is null");
      return false;
    }
    paramString = Dq(paramString);
    paramString = (a)this.pWV.get(paramString);
    return (paramString != null) && (paramString.pXc != this.pWY) && (paramString.pXd != this.pWZ);
  }
  
  private static final class a
  {
    public JsapiPermissionWrapper pXc;
    public GeneralControlWrapper pXd;
    
    public a(JsapiPermissionWrapper paramJsapiPermissionWrapper, GeneralControlWrapper paramGeneralControlWrapper)
    {
      this.pXc = paramJsapiPermissionWrapper;
      this.pXd = paramGeneralControlWrapper;
    }
    
    public final String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Permission: jsPerm = ");
      localStringBuilder.append(this.pXc);
      localStringBuilder.append(", genCtrl = ");
      localStringBuilder.append(this.pXd);
      return localStringBuilder.toString();
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/webview/ui/tools/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */