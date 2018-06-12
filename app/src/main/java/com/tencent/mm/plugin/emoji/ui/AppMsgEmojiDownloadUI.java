package com.tencent.mm.plugin.emoji.ui;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.mm.R.f;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.bp.a;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.model.au;
import com.tencent.mm.plugin.emoji.model.i;
import com.tencent.mm.pluginsdk.model.app.ac;
import com.tencent.mm.pluginsdk.model.app.ao;
import com.tencent.mm.pluginsdk.model.app.b;
import com.tencent.mm.pluginsdk.ui.chat.l.b;
import com.tencent.mm.pluginsdk.ui.emoji.PreViewEmojiView;
import com.tencent.mm.sdk.e.j.a;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.storage.emotion.d;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.s;
import com.tencent.mm.y.g.a;
import java.io.IOException;

public class AppMsgEmojiDownloadUI
  extends MMActivity
  implements com.tencent.mm.ab.e, j.a
{
  private String appName;
  private String bGP;
  private long bJC;
  private String bOX;
  private String bPS;
  private String bWW;
  private bd bXQ;
  private String dwq;
  private ProgressBar eVR;
  private ac ijW;
  private com.tencent.mm.ab.f ijX;
  private TextView ijY;
  private String ijZ;
  private PreViewEmojiView ika;
  
  private static void a(AppMsgEmojiDownloadUI paramAppMsgEmojiDownloadUI, TextView paramTextView, Bitmap paramBitmap)
  {
    paramBitmap = new BitmapDrawable(paramBitmap);
    int i = (int)paramAppMsgEmojiDownloadUI.getResources().getDimension(R.f.HintTextSize);
    paramBitmap.setBounds(0, 0, i, i);
    paramTextView.setCompoundDrawables(paramBitmap, null, null, null);
  }
  
  private static boolean n(String paramString, Bitmap paramBitmap)
  {
    try
    {
      com.tencent.mm.sdk.platformtools.c.a(paramBitmap, 100, Bitmap.CompressFormat.PNG, paramString, true);
      return true;
    }
    catch (IOException paramString) {}
    return false;
  }
  
  private void oM(int paramInt)
  {
    this.eVR.setProgress(paramInt);
    if (paramInt >= 100)
    {
      au.HU();
      localObject1 = com.tencent.mm.model.c.Gg();
      localObject2 = ao.asF().SR(this.bGP);
      if (localObject2 != null) {
        break label93;
      }
      x.e("MicroMsg.emoji.AppMsgEmojiDownloadUI", "saveImageAndPreview fail, info is null, attachid = " + this.bGP + ", msgContent = " + this.bWW);
    }
    label93:
    byte[] arrayOfByte;
    String str;
    for (;;)
    {
      ao.asF().d(this);
      au.DF().b(221, this);
      return;
      paramInt = com.tencent.mm.a.e.cm(((b)localObject2).field_fileFullPath);
      arrayOfByte = com.tencent.mm.a.e.e(((b)localObject2).field_fileFullPath, 0, paramInt);
      str = com.tencent.mm.a.g.u(arrayOfByte);
      if (!bi.oW(str))
      {
        if ((str == null) || (this.dwq == null) || (str.equalsIgnoreCase(this.dwq))) {
          break;
        }
        x.e("MicroMsg.emoji.AppMsgEmojiDownloadUI", "md5 not match!! emoticonmd5 is=" + this.dwq + ", gen md5 is=" + str);
        x.e("MicroMsg.emoji.AppMsgEmojiDownloadUI", "fileFullPath = " + ((b)localObject2).field_fileFullPath + ", fileLength = " + paramInt + ", bufLength = " + arrayOfByte.length + ", buf = " + arrayOfByte);
        Toast.makeText(this, getString(R.l.download_fail), 0).show();
        finish();
      }
    }
    com.tencent.mm.a.e.i((String)localObject1, this.ijZ, str);
    ((b)localObject2).field_fileFullPath = ((String)localObject1 + str);
    ao.asF().a(((b)localObject2).field_msgInfoId, (com.tencent.mm.sdk.e.c)localObject2);
    Object localObject2 = com.tencent.mm.ak.o.Pf().a(this.bOX, 1.0F, true);
    if (localObject2 != null) {
      n((String)localObject1 + str + "_thumb", (Bitmap)localObject2);
    }
    if (com.tencent.mm.sdk.platformtools.o.bv(arrayOfByte)) {}
    for (Object localObject1 = i.aEA().igx.a(str, "", EmojiInfo.tcB, EmojiInfo.tcL, paramInt, this.bPS, "");; localObject1 = i.aEA().igx.a(str, "", EmojiInfo.tcB, EmojiInfo.tcM, paramInt, this.bPS, ""))
    {
      this.eVR.setVisibility(8);
      this.ijY.setVisibility(8);
      if (localObject1 == null) {
        break;
      }
      this.ika.setImageFilePath(((EmojiInfo)localObject1).cnF());
      this.ika.resume();
      break;
    }
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ab.l paraml)
  {
    if (paraml.getType() != 221) {
      return;
    }
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      oM(this.eVR.getMax());
      return;
    }
    Toast.makeText(this, R.l.download_fail, 0).show();
    this.eVR.setVisibility(8);
    this.ijY.setVisibility(8);
    x.e("MicroMsg.emoji.AppMsgEmojiDownloadUI", "onSceneEnd, download fail, errType = " + paramInt1 + ", errCode = " + paramInt2);
  }
  
  public final void a(String paramString, com.tencent.mm.sdk.e.l paraml)
  {
    paramString = ao.asF().SR(this.bGP);
    if (paramString == null)
    {
      x.e("MicroMsg.emoji.AppMsgEmojiDownloadUI", "updateProgress fail");
      return;
    }
    long l1 = paramString.field_totalLen;
    long l2 = paramString.field_offset;
    this.ijY.setText(getString(R.l.download_ing) + " " + getString(R.l.download_data, new Object[] { bi.bF(l2), bi.bF(l1) }));
    int i = (int)(paramString.field_offset * 100L / paramString.field_totalLen);
    x.v("MicroMsg.emoji.AppMsgEmojiDownloadUI", "attach progress:" + i + " offset:" + l2 + " totallen:" + l1);
    oM(i);
  }
  
  protected final int getLayoutId()
  {
    return R.i.app_msg_emoji_download;
  }
  
  protected final void initView()
  {
    this.ika = ((PreViewEmojiView)findViewById(R.h.custom_smiley_preview_emojiview));
    Object localObject1 = com.tencent.mm.ak.o.Pf().a(this.bOX, 1.0F, true);
    this.ika.setImageBitmap((Bitmap)localObject1);
    setMMTitle("");
    this.ijY = ((TextView)findViewById(R.h.download_text));
    localObject1 = (TextView)findViewById(R.h.appsource);
    Object localObject2 = com.tencent.mm.pluginsdk.model.app.g.bl(this.bPS, true);
    this.appName = com.tencent.mm.pluginsdk.model.app.g.b(this.mController.tml, (com.tencent.mm.pluginsdk.model.app.f)localObject2, null);
    int i;
    if ((this.bPS != null) && (this.bPS.length() > 0))
    {
      localObject2 = this.appName;
      if ((localObject2 == null) || (((String)localObject2).trim().length() == 0) || (((String)localObject2).equals("weixinfile")) || (((String)localObject2).equals("invalid_appname")))
      {
        i = 0;
        if (i == 0) {
          break label316;
        }
        ((TextView)localObject1).setText(getString(R.l.chatting_source_from, new Object[] { this.appName }));
        ((TextView)localObject1).setVisibility(0);
        localObject2 = this.bPS;
        l.b localb = new l.b();
        localb.appId = ((String)localObject2);
        localb.bXS = "message";
        ((View)localObject1).setTag(localb);
        ((View)localObject1).setOnClickListener(new com.tencent.mm.pluginsdk.ui.chat.l(this));
        localObject2 = com.tencent.mm.pluginsdk.model.app.g.b(this.bPS, 2, a.getDensity(this));
        if ((localObject2 == null) || (((Bitmap)localObject2).isRecycled())) {
          break label298;
        }
        a(this, (TextView)localObject1, (Bitmap)localObject2);
      }
    }
    for (;;)
    {
      this.eVR = ((ProgressBar)findViewById(R.h.emoji_download_pb));
      this.eVR.setMax(100);
      setBackBtn(new AppMsgEmojiDownloadUI.2(this));
      return;
      i = 1;
      break;
      label298:
      a(this, (TextView)localObject1, BitmapFactory.decodeResource(getResources(), R.g.nosdcard_watermark_icon));
      continue;
      label316:
      ((TextView)localObject1).setVisibility(8);
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    int i = 1;
    super.onCreate(paramBundle);
    this.ijZ = ("da_" + bi.VF());
    this.bJC = getIntent().getLongExtra("msgid", -1L);
    if (this.bJC == -1L) {
      i = 0;
    }
    while (i == 0)
    {
      finish();
      return;
      au.HU();
      this.bXQ = com.tencent.mm.model.c.FT().dW(this.bJC);
      if ((this.bXQ == null) || (this.bXQ.field_msgId == 0L) || (this.bXQ.field_content == null))
      {
        i = 0;
      }
      else
      {
        this.bWW = this.bXQ.field_content;
        paramBundle = g.a.gp(this.bWW);
        if (paramBundle == null)
        {
          i = 0;
        }
        else
        {
          this.dwq = paramBundle.dwq;
          this.bGP = paramBundle.bGP;
          this.bPS = paramBundle.appId;
          paramBundle = com.tencent.mm.pluginsdk.model.app.g.bl(this.bPS, true);
          this.appName = com.tencent.mm.pluginsdk.model.app.g.b(this.mController.tml, paramBundle, null);
          this.bOX = this.bXQ.field_imgPath;
        }
      }
    }
    ao.asF().c(this);
    initView();
    this.ijX = new AppMsgEmojiDownloadUI.1(this);
    if (ao.asF().SR(this.bGP) == null)
    {
      long l = this.bJC;
      paramBundle = this.bWW;
      StringBuilder localStringBuilder = new StringBuilder();
      au.HU();
      com.tencent.mm.pluginsdk.model.app.l.c(l, paramBundle, com.tencent.mm.model.c.Gg() + this.ijZ);
    }
    this.ijW = new ac(this.bGP, this.ijX, 8);
    au.DF().a(this.ijW, 0);
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    au.DF().c(this.ijW);
    ao.asF().d(this);
  }
  
  protected void onPause()
  {
    super.onPause();
    au.DF().b(221, this);
  }
  
  protected void onResume()
  {
    super.onResume();
    au.DF().a(221, this);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/emoji/ui/AppMsgEmojiDownloadUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */