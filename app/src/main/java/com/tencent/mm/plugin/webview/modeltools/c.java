package com.tencent.mm.plugin.webview.modeltools;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.ValueCallback;
import com.tencent.mm.R.l;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.plugin.webview.model.aj;
import com.tencent.mm.plugin.webview.ui.tools.e;
import com.tencent.mm.pluginsdk.ui.tools.s;
import com.tencent.mm.protocal.JsapiPermissionWrapper;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import java.io.File;

public final class c
{
  private String pTH = null;
  private String pTI = null;
  private ValueCallback<Uri> pTJ = null;
  private ValueCallback<Uri[]> pTK = null;
  
  private void bUQ()
  {
    this.pTH = null;
    this.pTJ = null;
    this.pTK = null;
    this.pTI = null;
  }
  
  private void j(Uri paramUri)
  {
    if (this.pTJ != null) {
      this.pTJ.onReceiveValue(paramUri);
    }
    while (this.pTK == null) {
      return;
    }
    if (paramUri == null)
    {
      this.pTK.onReceiveValue(null);
      return;
    }
    this.pTK.onReceiveValue(new Uri[] { paramUri });
  }
  
  public final void a(Activity paramActivity, e parame, ValueCallback<Uri> paramValueCallback, ValueCallback<Uri[]> paramValueCallback1, String paramString1, String paramString2)
  {
    Object localObject = null;
    x.i("MicroMsg.WebViewUI.FileChooser", "openFileChooser with wvPerm(%s), callback(%s), callbackLL(%s), acceptType(%s), capture(%s)", new Object[] { parame, paramValueCallback, paramValueCallback1, paramString1, paramString2 });
    bUQ();
    if ((parame == null) || (parame.bVR() == null))
    {
      x.e("MicroMsg.WebViewUI.FileChooser", "openFileChooser fail, wvPerm is null");
      j(null);
      return;
    }
    if (!parame.bVR().gu(56))
    {
      x.e("MicroMsg.WebViewUI.FileChooser", "open file chooser failed, permission fail");
      j(null);
      return;
    }
    this.pTJ = paramValueCallback;
    this.pTK = paramValueCallback1;
    this.pTI = System.currentTimeMillis();
    this.pTH = paramString1;
    paramValueCallback = this.pTI;
    paramValueCallback1 = new Intent("android.intent.action.GET_CONTENT");
    paramValueCallback1.addCategory("android.intent.category.OPENABLE");
    int i;
    if (bi.oW(paramString1))
    {
      paramValueCallback1.setType("*/*");
      if (bi.oW(paramString2)) {
        break label426;
      }
      if (!"camera".equalsIgnoreCase(paramString2)) {
        break label279;
      }
      parame = aj.Qs(paramValueCallback);
      i = 0;
      parame = new Intent[] { parame };
    }
    for (;;)
    {
      label202:
      if ((i != 0) || (parame == null) || (parame.length == 0))
      {
        paramValueCallback = new Intent("android.intent.action.CHOOSER");
        paramValueCallback.putExtra("android.intent.extra.INITIAL_INTENTS", parame);
        paramValueCallback.putExtra("android.intent.extra.TITLE", ad.getContext().getString(R.l.wv_select_file_alert_title));
        paramValueCallback.putExtra("android.intent.extra.INTENT", paramValueCallback1);
      }
      for (parame = paramValueCallback;; parame = parame[0])
      {
        paramActivity.startActivityForResult(parame, 1);
        return;
        paramValueCallback1.setType(paramString1);
        break;
        label279:
        if ("camcorder".equalsIgnoreCase(paramString2))
        {
          parame = aj.bUn();
          i = 0;
          parame = new Intent[] { parame };
          break label202;
        }
        if ("microphone".equalsIgnoreCase(paramString2))
        {
          parame = aj.bUo();
          i = 0;
          parame = new Intent[] { parame };
          break label202;
        }
        if (!"*".equalsIgnoreCase(paramString2)) {
          break label468;
        }
        if (paramString1.equalsIgnoreCase("image/*"))
        {
          parame = new Intent[1];
          parame[0] = aj.Qs(paramValueCallback);
        }
        for (;;)
        {
          i = 1;
          break;
          if (paramString1.equalsIgnoreCase("audio/*"))
          {
            parame = new Intent[1];
            parame[0] = aj.bUo();
          }
          else
          {
            parame = (e)localObject;
            if (paramString1.equalsIgnoreCase("video/*"))
            {
              parame = new Intent[1];
              parame[0] = aj.bUn();
            }
          }
        }
        label426:
        if (!d.fS(16)) {
          break label468;
        }
        x.i("MicroMsg.WebviewJSSDKUtil", "android API version is below 16.");
        parame = aj.Qs(paramValueCallback);
        i = 0;
        parame = new Intent[] { parame };
        break label202;
      }
      label468:
      i = 0;
      parame = null;
    }
  }
  
  public final boolean b(MMActivity paramMMActivity, int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (paramInt1 == 1)
    {
      if ((this.pTJ == null) && (this.pTK == null))
      {
        x.w("MicroMsg.WebViewUI.FileChooser", "uploadFileCallback is null.");
        return true;
      }
      Object localObject1;
      Object localObject2;
      if (paramInt2 == -1)
      {
        localObject1 = null;
        if (paramIntent != null)
        {
          localObject1 = null;
          if (paramIntent.getData() != null) {
            break label215;
          }
          localObject2 = paramIntent.getExtras();
          if (localObject2 != null)
          {
            if (((Bundle)localObject2).getParcelable("android.intent.extra.STREAM") != null) {
              localObject1 = (Uri)((Bundle)localObject2).getParcelable("android.intent.extra.STREAM");
            }
          }
          else
          {
            label86:
            localObject1 = bi.h(paramMMActivity, (Uri)localObject1);
            x.i("MicroMsg.WebViewUI.FileChooser", "get file path:[%s]", new Object[] { localObject1 });
          }
        }
        else
        {
          if (bi.oW((String)localObject1)) {
            break label430;
          }
          paramMMActivity = s.Ui((String)localObject1);
          x.d("MicroMsg.WebViewUI.FileChooser", "get file mime type [%s]", new Object[] { paramMMActivity });
          if (!bi.oW(this.pTH)) {
            break label225;
          }
          paramInt1 = 1;
          label151:
          if (paramInt1 == 0) {
            break label460;
          }
          if (paramIntent.getData() != null) {
            break label421;
          }
          paramMMActivity = Uri.fromFile(new File((String)localObject1));
        }
      }
      for (;;)
      {
        x.d("MicroMsg.WebViewUI.FileChooser", "result = " + paramMMActivity);
        j(paramMMActivity);
        bUQ();
        break;
        localObject1 = null;
        break label86;
        label215:
        localObject1 = paramIntent.getData();
        break label86;
        label225:
        localObject2 = this.pTH.split(",");
        paramInt2 = localObject2.length;
        paramInt1 = 0;
        for (;;)
        {
          if (paramInt1 >= paramInt2) {
            break label416;
          }
          Object localObject3 = localObject2[paramInt1].replace(" ", "");
          boolean bool;
          if (bi.oW((String)localObject3)) {
            bool = true;
          }
          for (;;)
          {
            if (!bool) {
              break label409;
            }
            paramInt1 = 1;
            break;
            if (!bi.oW(paramMMActivity))
            {
              if ((!((String)localObject3).contains("/")) || (!paramMMActivity.contains("/")))
              {
                bool = ((String)localObject3).equals(paramMMActivity);
                continue;
              }
              localObject3 = ((String)localObject3).split("/");
              String[] arrayOfString = paramMMActivity.split("/");
              if (bi.oV(localObject3[0]).equals(arrayOfString[0]))
              {
                if ((bi.oV(localObject3[1]).equals("*")) || (bi.oV(localObject3[1]).equals(arrayOfString[1])))
                {
                  bool = true;
                  continue;
                }
                bool = false;
                continue;
              }
            }
            bool = false;
          }
          label409:
          paramInt1 += 1;
        }
        label416:
        paramInt1 = 0;
        break label151;
        label421:
        paramMMActivity = paramIntent.getData();
        continue;
        label430:
        paramMMActivity = new File(aj.Qr(this.pTI));
        if (paramMMActivity.exists()) {
          paramMMActivity = Uri.fromFile(paramMMActivity);
        } else {
          label460:
          paramMMActivity = null;
        }
      }
    }
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/webview/modeltools/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */