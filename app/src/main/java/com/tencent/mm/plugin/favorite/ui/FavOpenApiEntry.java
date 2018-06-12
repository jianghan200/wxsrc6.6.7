package com.tencent.mm.plugin.favorite.ui;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import com.tencent.mm.R.l;
import com.tencent.mm.a.e;
import com.tencent.mm.model.q;
import com.tencent.mm.opensdk.modelmsg.SendMessageToWX.Req;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.plugin.fav.a.b;
import com.tencent.mm.pluginsdk.model.app.ReportUtil;
import com.tencent.mm.pluginsdk.ui.applet.q.a;
import com.tencent.mm.protocal.c.vx;
import com.tencent.mm.protocal.c.wl;
import com.tencent.mm.protocal.c.wr;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.al.a;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.a;

@a(3)
public class FavOpenApiEntry
  extends MMActivity
{
  private String appId;
  private al bAZ = new al(new al.a()
  {
    public final boolean vD()
    {
      boolean bool = false;
      if ((FavOpenApiEntry.this.getWindow() == null) || (FavOpenApiEntry.this.getWindow().getDecorView() == null) || (FavOpenApiEntry.this.getWindow().getDecorView().getWindowToken() == null))
      {
        if (FavOpenApiEntry.a(FavOpenApiEntry.this) < 10)
        {
          FavOpenApiEntry.b(FavOpenApiEntry.this);
          bool = true;
        }
        return bool;
      }
      FavOpenApiEntry.a(FavOpenApiEntry.this, FavOpenApiEntry.c(FavOpenApiEntry.this).message);
      return false;
    }
  }, true);
  private Intent bSk;
  private String bhd;
  private Bundle jfZ;
  private SendMessageToWX.Req jga;
  private String jgb;
  private int jgc = 0;
  
  private void H(com.tencent.mm.plugin.fav.a.g paramg)
  {
    wr localwr = new wr();
    localwr.VC(this.appId);
    localwr.CO(4);
    localwr.Vw(q.GF());
    localwr.Vx(q.GF());
    paramg.field_fromUser = localwr.bSS;
    paramg.field_toUser = localwr.toUser;
    paramg.field_favProto.a(localwr);
  }
  
  private q.a a(final WXMediaMessage paramWXMediaMessage)
  {
    new q.a()
    {
      public final void a(boolean paramAnonymousBoolean, String paramAnonymousString, int paramAnonymousInt)
      {
        if (paramAnonymousBoolean)
        {
          FavOpenApiEntry.b(FavOpenApiEntry.this, paramWXMediaMessage);
          paramAnonymousString = ReportUtil.c(FavOpenApiEntry.this.getIntent().getExtras(), 0);
          ReportUtil.a(FavOpenApiEntry.this, paramAnonymousString);
          return;
        }
        FavOpenApiEntry.this.finish();
        ReportUtil.a(FavOpenApiEntry.this, ReportUtil.c(FavOpenApiEntry.this.getIntent().getExtras(), -2));
      }
    };
  }
  
  private static vx a(WXMediaMessage paramWXMediaMessage, String paramString, byte[] paramArrayOfByte, int paramInt)
  {
    vx localvx = new vx();
    localvx.UB(paramWXMediaMessage.title);
    localvx.UC(paramWXMediaMessage.description);
    localvx.CF(paramInt);
    if (paramString != null)
    {
      localvx.UP(paramString);
      localvx.UL(e.cp(paramString));
      a(paramWXMediaMessage, localvx, paramInt);
      return localvx;
    }
    paramString = com.tencent.mm.a.g.u(paramArrayOfByte);
    if (paramArrayOfByte.length >= 256) {
      localvx.UN(paramString);
    }
    for (;;)
    {
      localvx.UM(paramString);
      localvx.fO(paramArrayOfByte.length);
      localvx.UO(b.bm(localvx.toString(), paramInt));
      e.e(b.b(localvx), paramArrayOfByte);
      break;
      byte[] arrayOfByte = new byte['Ā'];
      System.arraycopy(paramArrayOfByte, 0, arrayOfByte, 0, 256);
      localvx.UN(com.tencent.mm.a.g.u(arrayOfByte));
    }
  }
  
  private static void a(WXMediaMessage paramWXMediaMessage, com.tencent.mm.plugin.fav.a.g paramg)
  {
    paramg.field_sourceType = 4;
    paramg.field_favProto.Vu(paramWXMediaMessage.title);
    paramg.field_favProto.Vv(paramWXMediaMessage.description);
  }
  
  private static void a(WXMediaMessage paramWXMediaMessage, vx paramvx, int paramInt)
  {
    if (paramWXMediaMessage.thumbData != null)
    {
      Object localObject = com.tencent.mm.a.g.u(paramWXMediaMessage.thumbData);
      paramvx.UR((String)localObject);
      if (paramWXMediaMessage.thumbData.length >= 256) {
        paramvx.US((String)localObject);
      }
      for (;;)
      {
        if (bi.oW(paramvx.jdM)) {
          paramvx.UO(b.bm(paramvx.toString(), paramInt));
        }
        paramvx.fP(paramWXMediaMessage.thumbData.length);
        e.e(b.c(paramvx), paramWXMediaMessage.thumbData);
        return;
        localObject = new byte['Ā'];
        System.arraycopy(paramWXMediaMessage.thumbData, 0, localObject, 0, 256);
        paramvx.US(com.tencent.mm.a.g.u((byte[])localObject));
      }
    }
    paramvx.kY(true);
  }
  
  protected final int getLayoutId()
  {
    return -1;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (this.bSk == null) {
      this.bSk = getIntent();
    }
    this.jfZ = this.bSk.getExtras();
    this.appId = this.jfZ.getString("SendAppMessageWrapper_AppId");
    if (this.appId == null) {
      this.appId = Uri.parse(this.jfZ.getString("_mmessage_content")).getQueryParameter("appid");
    }
    this.jga = new SendMessageToWX.Req(this.jfZ);
    if (this.jga.scene != 2)
    {
      x.e("MicroMsg.FavOpenApiEntry", "scene not WXSceneFavorite!");
      finish();
      return;
    }
    this.jgb = getString(R.l.favorite);
    paramBundle = b.getAppName(this, this.appId);
    this.bhd = getString(R.l.confirm_dialog_source, new Object[] { paramBundle });
    this.bAZ.J(100L, 100L);
  }
  
  public void onNewIntent(Intent paramIntent)
  {
    super.onNewIntent(paramIntent);
    this.bSk = paramIntent;
  }
  
  protected void onPause()
  {
    super.onPause();
  }
  
  protected void onResume()
  {
    super.onResume();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/favorite/ui/FavOpenApiEntry.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */