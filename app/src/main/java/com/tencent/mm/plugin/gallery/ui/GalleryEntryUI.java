package com.tencent.mm.plugin.gallery.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import com.tencent.mm.plugin.gallery.model.c;
import com.tencent.mm.plugin.gallery.model.l;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.base.a;
import java.util.ArrayList;

@a(7)
public final class GalleryEntryUI
  extends ActionBarActivity
{
  private boolean gvt = false;
  private int jCU;
  private int jCt;
  private boolean mInit = false;
  
  protected final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    String str;
    if (paramIntent == null)
    {
      str = "";
      x.i("MicroMsg.GalleryEntryUI", "on activity result, requestCode %d resultCode %d, data:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), str });
      this.gvt = true;
      switch (paramInt2)
      {
      }
    }
    for (;;)
    {
      label72:
      if (this.gvt) {
        finish();
      }
      do
      {
        return;
        str = paramIntent.toString();
        break;
        x.d("MicroMsg.GalleryEntryUI", "user choose canceld");
        setResult(0);
        break label72;
      } while (paramIntent == null);
      setResult(-1, paramIntent);
      continue;
      setResult(1);
    }
  }
  
  protected final void onCreate(Bundle paramBundle)
  {
    x.i("MicroMsg.GalleryEntryUI", "on create");
    super.onCreate(paramBundle);
    x.i("MicroMsg.GalleryEntryUI", "checktask onCreate:%s#0x%x task:%s", new Object[] { getClass().getSimpleName(), Integer.valueOf(hashCode()), bi.fV(this) });
    c.initialize();
    this.jCt = getIntent().getIntExtra("query_source_type", 3);
    this.jCU = getIntent().getIntExtra("query_media_type", 1);
    x.i("MicroMsg.GalleryEntryUI", "query souce: " + this.jCt + ", queryType: " + this.jCU);
    c.aRf().qt(this.jCU);
    c.aRf().qu(this.jCt);
  }
  
  protected final void onDestroy()
  {
    super.onDestroy();
    x.i("MicroMsg.GalleryEntryUI", "onDestroy %B", new Object[] { Boolean.valueOf(this.gvt) });
    c.release(this.gvt);
    x.i("MicroMsg.GalleryEntryUI", "checktask onDestroy:%s#0x%x task:%s ", new Object[] { getClass().getSimpleName(), Integer.valueOf(hashCode()), bi.fV(this) });
  }
  
  protected final void onNewIntent(Intent paramIntent)
  {
    super.onNewIntent(paramIntent);
    x.d("MicroMsg.GalleryEntryUI", "on new intent, #0x%x", new Object[] { Integer.valueOf(hashCode()) });
  }
  
  protected final void onRestoreInstanceState(Bundle paramBundle)
  {
    x.d("MicroMsg.GalleryEntryUI", "onRestoreInstanceState");
    super.onRestoreInstanceState(paramBundle);
    this.mInit = true;
  }
  
  protected final void onResume()
  {
    x.i("MicroMsg.GalleryEntryUI", "on resume, init %B", new Object[] { Boolean.valueOf(this.mInit) });
    super.onResume();
    Object localObject;
    if (!this.mInit)
    {
      x.e("MicroMsg.GalleryEntryUI", "doRedirect %s", new Object[] { bi.cjd() });
      localObject = getIntent();
      if (!((Intent)localObject).getBooleanExtra("preview_image", false)) {
        break label223;
      }
      x.d("MicroMsg.GalleryEntryUI", "jump to preview ui directly");
      ArrayList localArrayList = ((Intent)localObject).getStringArrayListExtra("preview_image_list");
      Intent localIntent = new Intent(this, ImagePreviewUI.class);
      localIntent.addFlags(67108864);
      localIntent.putExtra("max_select_count", ((Intent)localObject).getIntExtra("max_select_count", 9));
      localIntent.putExtra("query_source_type", this.jCt);
      localIntent.putExtra("isPreviewPhoto", ((Intent)localObject).getBooleanExtra("isPreviewPhoto", false));
      localIntent.putExtra("preview_image", ((Intent)localObject).getBooleanExtra("preview_image", false));
      localObject = getIntent().getStringExtra("GalleryUI_FromUser");
      String str = getIntent().getStringExtra("GalleryUI_ToUser");
      if (!bi.oW((String)localObject)) {
        localIntent.putExtra("GalleryUI_FromUser", (String)localObject);
      }
      if (!bi.oW(str)) {
        localIntent.putExtra("GalleryUI_ToUser", str);
      }
      localIntent.putStringArrayListExtra("preview_image_list", localArrayList);
      startActivityForResult(localIntent, 1);
    }
    for (;;)
    {
      this.mInit = true;
      return;
      label223:
      ((Intent)localObject).setClass(this, AlbumPreviewUI.class);
      ((Intent)localObject).addFlags(67108864);
      ((Intent)localObject).putExtra("send_btn_string", getIntent().getStringExtra("send_btn_string"));
      ((Intent)localObject).putExtra("max_select_count", getIntent().getIntExtra("max_select_count", 9));
      ((Intent)localObject).putExtra("GalleryUI_FromUser", getIntent().getStringExtra("GalleryUI_FromUser"));
      ((Intent)localObject).putExtra("GalleryUI_ToUser", getIntent().getStringExtra("GalleryUI_ToUser"));
      ((Intent)localObject).putExtra("key_send_raw_image", getIntent().getBooleanExtra("key_send_raw_image", false));
      startActivityForResult((Intent)localObject, 0);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/gallery/ui/GalleryEntryUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */