package com.tencent.mm.aa;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.os.Looper;
import android.widget.Toast;
import com.tencent.mm.ab.e;
import com.tencent.mm.ab.l;
import com.tencent.mm.h.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.comm.a.h;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.base.h;
import junit.framework.Assert;

public final class o
  implements e
{
  private Context context;
  private ProgressDialog dId;
  private Runnable dIe = null;
  private Runnable dIf = null;
  private String path;
  
  public o(Context paramContext, String paramString)
  {
    this.context = paramContext;
    this.path = paramString;
    this.dId = null;
    g.DF().a(157, this);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    x.i("MicroMsg.ProcessUploadHDHeadImg", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    g.DF().b(157, this);
    if ((this.dId != null) && (this.dId.isShowing()) && ((this.context instanceof Activity)) && (!((Activity)this.context).isFinishing())) {}
    try
    {
      this.dId.dismiss();
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        Toast.makeText(this.context, a.h.settings_upload_hd_avatar_success, 0).show();
        if (this.dIe != null) {
          new ag(Looper.getMainLooper()).post(this.dIe);
        }
        return;
      }
    }
    catch (IllegalArgumentException paraml)
    {
      for (;;)
      {
        x.e("MicroMsg.ProcessUploadHDHeadImg", "dismiss dialog err" + paraml.getMessage());
      }
      if (this.dIf != null) {
        new ag(Looper.getMainLooper()).post(this.dIf);
      }
      if ((paramString != null) && (paramString.length() > 0))
      {
        paramString = a.eV(paramString);
        if (paramString != null)
        {
          paramString.a(this.context, null, null);
          return;
        }
      }
      if ((paramInt1 == 4) && (paramInt2 == -4))
      {
        Toast.makeText(this.context, a.h.contact_info_no_user, 0).show();
        return;
      }
      Toast.makeText(this.context, a.h.settings_upload_hd_avatar_fail, 0).show();
    }
  }
  
  public final boolean a(Runnable paramRunnable1, Runnable paramRunnable2)
  {
    if ((this.context != null) && (this.path != null) && (this.path.length() > 0)) {}
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue(bool);
      this.dIe = paramRunnable1;
      this.dIf = paramRunnable2;
      paramRunnable1 = new n(1, this.path);
      g.DF().a(paramRunnable1, 0);
      x.i("MicroMsg.ProcessUploadHDHeadImg", "post is null ? %B", new Object[] { Boolean.valueOf(false) });
      return true;
    }
  }
  
  public final boolean b(int paramInt, Runnable paramRunnable)
  {
    if ((this.context != null) && (this.path != null) && (this.path.length() > 0))
    {
      bool = true;
      Assert.assertTrue(bool);
      this.dIe = paramRunnable;
      Object localObject = this.context;
      this.context.getString(a.h.app_tip);
      this.dId = h.a((Context)localObject, this.context.getString(a.h.settings_uploading_hd_avatar), true, null);
      localObject = new n(paramInt, this.path);
      g.DF().a((l)localObject, 0);
      if (paramRunnable != null) {
        break label128;
      }
    }
    label128:
    for (boolean bool = true;; bool = false)
    {
      x.i("MicroMsg.ProcessUploadHDHeadImg", "post is null ? %B", new Object[] { Boolean.valueOf(bool) });
      return true;
      bool = false;
      break;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/aa/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */