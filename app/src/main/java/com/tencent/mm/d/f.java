package com.tencent.mm.d;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.util.SparseArray;
import android.view.MotionEvent;
import com.tencent.mm.cache.g;
import com.tencent.mm.cache.g.1;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.t.d;
import com.tencent.mm.t.d.a;
import com.tencent.mm.t.d.b;
import java.util.HashMap;
import java.util.LinkedList;

public final class f
  extends b<g>
{
  private float VT;
  private float VU;
  private boolean bBR = false;
  private float bBS;
  private float bBT;
  private Bitmap bCD;
  private LinkedList<d.b> bCE = new LinkedList();
  public int bCF = d.a.doc;
  private boolean bCp = true;
  private Path ks = new Path();
  
  public final void aH(boolean paramBoolean)
  {
    super.aH(paramBoolean);
    g localg = (g)vG();
    Bitmap localBitmap = vL().copy(Bitmap.Config.ARGB_8888, true);
    String str1 = a.bBi.toString();
    str1 = com.tencent.mm.compatible.util.e.dgk + String.format("%s%d.%s", new Object[] { "wx_photo_edit_", Long.valueOf(System.currentTimeMillis()), str1 });
    x.i("MicroMsg.MosaicCache", "[saveCacheToLocal] path:%s size:%s", new Object[] { str1, Integer.valueOf(localg.aW(true)) });
    String str2 = (String)localg.daq.get(localg.aW(true));
    if (!bi.oW(str2))
    {
      FileOp.deleteFile(str2);
      localg.daq.remove(localg.aW(true));
    }
    localg.daq.put(localg.aW(true), str1);
    localg.dar.put(str1, localBitmap);
    com.tencent.mm.sdk.f.e.cjw();
    com.tencent.mm.sdk.f.e.a(new g.1(localg, localBitmap, str1), "[saveCacheToLocal] mosaic path:" + str1);
  }
  
  public final void onDestroy()
  {
    super.onDestroy();
    if ((this.bCD != null) && (!this.bCD.isRecycled())) {
      this.bCD.recycle();
    }
  }
  
  public final void onDraw(Canvas paramCanvas)
  {
    paramCanvas.save();
    paramCanvas.clipRect(this.bBp);
    if (this.bCF == d.a.doc)
    {
      b(paramCanvas);
      new d(this.bCF, this.ks, 1.0F / getScale(), this.bCD).draw(paramCanvas);
    }
    for (;;)
    {
      paramCanvas.restore();
      return;
      if (this.bCF == d.a.dod)
      {
        new d(this.bCF, new LinkedList(this.bCE), 1.0F / getScale()).draw(new Canvas(vL()));
        b(paramCanvas);
      }
    }
  }
  
  public final boolean q(MotionEvent paramMotionEvent)
  {
    int j = 0;
    if (!vM()) {
      return false;
    }
    Object localObject = w(paramMotionEvent.getX(), paramMotionEvent.getY());
    switch (paramMotionEvent.getActionMasked())
    {
    }
    for (;;)
    {
      return this.bCp;
      float f1;
      if (this.bBp.contains((int)localObject[0], (int)localObject[1]))
      {
        f1 = localObject[0];
        this.bBS = f1;
        this.VT = f1;
        f1 = localObject[1];
        this.bBT = f1;
        this.VU = f1;
      }
      for (this.bCp = true;; this.bCp = false)
      {
        this.bBR = false;
        break;
      }
      if ((this.bCp) && (this.bBR))
      {
        if (this.bCF != d.a.doc) {
          break label252;
        }
        ((g)vG()).a(new d(this.bCF, new Path(this.ks), 1.0F / getScale(), this.bCD));
        aH(false);
      }
      for (;;)
      {
        vP();
        this.bCE.clear();
        this.ks.reset();
        this.bBR = false;
        this.bCp = false;
        break;
        label252:
        if (this.bCF == d.a.dod)
        {
          ((g)vG()).a(new d(this.bCF, new LinkedList(this.bCE), 1.0F / getScale()));
          aH(false);
        }
      }
      if ((this.bCp) && (this.bBR))
      {
        this.bBS = this.VT;
        this.bBT = this.VU;
        this.VT = localObject[0];
        this.VU = localObject[1];
        if (this.bCF == d.a.doc) {
          this.ks.quadTo(this.bBS, this.bBT, (this.VT + this.bBS) / 2.0F, (this.VU + this.bBT) / 2.0F);
        }
        while (this.bCF != d.a.dod)
        {
          vO();
          break;
        }
        double d = Math.toDegrees(Math.atan((this.VT - this.bBS) / (this.VU - this.bBT)));
        label461:
        float f2;
        float f3;
        float f4;
        if (getRotation() == 180.0F)
        {
          i = 180;
          f1 = (float)(i + d);
          paramMotionEvent = this.bCE;
          f2 = 1.0F / getScale();
          f3 = this.VT;
          f4 = this.VU;
          localObject = this.bBn.cfS();
          if ((localObject != null) && (f3 < ((Bitmap)localObject).getWidth()) && (f4 < ((Bitmap)localObject).getHeight()) && (f3 > 0.0F) && (f4 > 0.0F)) {
            break label620;
          }
          x.w("MicroMsg.MosaicArtist", "[getPosColor] X:%s,Y:%s", new Object[] { Float.valueOf(f3), Float.valueOf(f4) });
        }
        label620:
        for (int i = j;; i = ((Bitmap)localObject).getPixel((int)f3, (int)f4))
        {
          paramMotionEvent.add(new d.b(f2, i, f1 % 360.0F, this.VT, this.VU));
          break;
          i = 0;
          break label461;
        }
      }
      if ((this.bCp) && (!this.bBR))
      {
        if (this.bCF == d.a.doc) {
          this.ks.moveTo(localObject[0], localObject[1]);
        }
        this.bBR = true;
      }
    }
  }
  
  public final a vE()
  {
    return a.bBi;
  }
  
  public final void vF()
  {
    if ((vL() != null) && (!vL().isRecycled())) {
      vL().recycle();
    }
    h(((g)vG()).yv());
  }
  
  public final void vH()
  {
    super.vH();
    h(((g)vG()).yv());
    Bitmap localBitmap2 = this.bBn.cfS();
    if (localBitmap2 == null)
    {
      x.e("MicroMsg.MosaicArtist", "[generateMosaicImage] bitmap is null");
      localBitmap1 = null;
      this.bCD = localBitmap1;
      return;
    }
    int n = localBitmap2.getWidth();
    int i1 = localBitmap2.getHeight();
    int i3 = com.tencent.mm.bx.a.aH(6.0F);
    Bitmap localBitmap1 = Bitmap.createBitmap(n, i1, Bitmap.Config.RGB_565);
    Canvas localCanvas = new Canvas(localBitmap1);
    int i4 = (int)Math.ceil(n / i3);
    int i5 = (int)Math.ceil(i1 / i3);
    Paint localPaint = new Paint();
    localPaint.setAntiAlias(true);
    int i = 0;
    label143:
    int j;
    label151:
    int i6;
    int i7;
    int k;
    if (i < i4)
    {
      j = 0;
      if (j < i5)
      {
        i6 = i3 * i;
        i7 = i3 * j;
        k = i6 + i3;
        if (k <= n) {
          break label266;
        }
        k = n;
      }
    }
    label266:
    for (;;)
    {
      int i2 = i7 + i3;
      int m = i2;
      if (i2 > i1) {
        m = i1;
      }
      i2 = localBitmap2.getPixel(i6, i7);
      Rect localRect = new Rect(i6, i7, k, m);
      localPaint.setColor(i2);
      localCanvas.drawRect(localRect, localPaint);
      j += 1;
      break label151;
      i += 1;
      break label143;
      break;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/d/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */