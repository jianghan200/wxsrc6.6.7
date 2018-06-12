package com.tencent.mm.plugin.game.gamewebview.ipc;

import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory.Options;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.mm.R.l;
import com.tencent.mm.a.e;
import com.tencent.mm.k.b;
import com.tencent.mm.plugin.webview.a.a;
import com.tencent.mm.plugin.webview.stub.WebviewScanImageActivity;
import com.tencent.mm.pluginsdk.a.d;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.o;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.ui.base.h;

public class CommonActivityTask
  extends GameProcessActivityTask
{
  public static final Parcelable.Creator<CommonActivityTask> CREATOR = new CommonActivityTask.3();
  public Bundle jfZ = new Bundle();
  public int type;
  
  public CommonActivityTask(Context paramContext)
  {
    super(paramContext);
  }
  
  private CommonActivityTask(Parcel paramParcel)
  {
    g(paramParcel);
  }
  
  public final void a(Context paramContext, GameProcessActivityTask.a parama)
  {
    Object localObject1;
    int i;
    int j;
    Object localObject3;
    switch (this.type)
    {
    default: 
    case 1: 
      do
      {
        return;
        localObject1 = this.jfZ.getString("result");
      } while (bi.oW((String)localObject1));
      localObject2 = this.jfZ.getString("url");
      i = this.jfZ.getInt("codeType");
      j = this.jfZ.getInt("codeVersion");
      localObject3 = new Intent();
      ((Intent)localObject3).setClass(paramContext, WebviewScanImageActivity.class);
      ((Intent)localObject3).setFlags(603979776);
      ((Intent)localObject3).putExtra("key_string_for_scan", (String)localObject1);
      ((Intent)localObject3).putExtra("key_string_for_url", (String)localObject2);
      ((Intent)localObject3).putExtra("key_codetype_for_scan", i);
      ((Intent)localObject3).putExtra("key_codeversion_for_scan", j);
      paramContext.startActivity((Intent)localObject3);
      parama.ahz();
      return;
    }
    Object localObject2 = this.jfZ.getString("img_path");
    if (o.Wf((String)localObject2))
    {
      localObject1 = com.tencent.mm.a.g.cu((String)localObject2);
      localObject1 = ((com.tencent.mm.plugin.emoji.b.c)com.tencent.mm.kernel.g.n(com.tencent.mm.plugin.emoji.b.c.class)).getEmojiMgr().zi((String)localObject1);
      if ((localObject1 != null) && (((EmojiInfo)localObject1).cnv())) {
        break label567;
      }
      localObject1 = ((com.tencent.mm.plugin.emoji.b.c)com.tencent.mm.kernel.g.n(com.tencent.mm.plugin.emoji.b.c.class)).getEmojiMgr().zj((String)localObject2);
      localObject1 = ((com.tencent.mm.plugin.emoji.b.c)com.tencent.mm.kernel.g.n(com.tencent.mm.plugin.emoji.b.c.class)).getEmojiMgr().zi((String)localObject1);
    }
    label275:
    label414:
    label561:
    label567:
    for (;;)
    {
      if (localObject1 == null)
      {
        i = 0;
        if (localObject1 != null) {
          break label414;
        }
        localObject3 = new BitmapFactory.Options();
        ((BitmapFactory.Options)localObject3).inJustDecodeBounds = true;
        if (((com.tencent.mm.sdk.platformtools.c.decodeFile((String)localObject2, (BitmapFactory.Options)localObject3) == null) || (((BitmapFactory.Options)localObject3).outHeight <= b.Az())) && (((BitmapFactory.Options)localObject3).outWidth <= b.Az())) {
          break label561;
        }
      }
      for (j = 1;; j = 0)
      {
        if ((i > b.AA()) || (j != 0))
        {
          h.a(paramContext, paramContext.getString(R.l.emoji_custom_gif_max_size_limit_cannot_send), "", paramContext.getString(R.l.i_know_it), null);
          h.a(paramContext, paramContext.getString(R.l.emoji_custom_gif_max_size_limit_cannot_send), "", paramContext.getString(R.l.i_know_it), "", false, new CommonActivityTask.1(this, parama), new CommonActivityTask.2(this, parama));
          return;
          i = e.cm(((EmojiInfo)localObject1).cnF());
          break;
          localObject2 = ((EmojiInfo)localObject1).cnF();
          break label275;
        }
        localObject2 = new Intent();
        if (localObject1 != null) {}
        for (localObject1 = ((EmojiInfo)localObject1).Xh();; localObject1 = "")
        {
          ((Intent)localObject2).putExtra("Retr_File_Name", (String)localObject1);
          ((Intent)localObject2).putExtra("Retr_Msg_Type", 5);
          ((Intent)localObject2).putExtra("Retr_MsgImgScene", 1);
          a.ezn.l((Intent)localObject2, paramContext);
          parama.ahz();
          return;
        }
        localObject1 = new Intent();
        ((Intent)localObject1).putExtra("Retr_File_Name", (String)localObject2);
        ((Intent)localObject1).putExtra("Retr_Compress_Type", 0);
        ((Intent)localObject1).putExtra("Retr_Msg_Type", 0);
        ((Intent)localObject1).addFlags(268435456);
        a.ezn.l((Intent)localObject1, paramContext);
        parama.ahz();
        return;
      }
    }
  }
  
  public final void aaj() {}
  
  public final void g(Parcel paramParcel)
  {
    this.type = paramParcel.readInt();
    this.jfZ = paramParcel.readBundle(getClass().getClassLoader());
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(this.type);
    paramParcel.writeBundle(this.jfZ);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/game/gamewebview/ipc/CommonActivityTask.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */