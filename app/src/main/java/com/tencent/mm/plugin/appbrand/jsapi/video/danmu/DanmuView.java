package com.tencent.mm.plugin.appbrand.jsapi.video.danmu;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Looper;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class DanmuView
  extends View
{
  private int gbV = 5;
  private int gbW = 500;
  private int gbX = 10;
  public float gbY = 0.0F;
  public float gbZ = 0.6F;
  private boolean gca = false;
  private boolean gcb = false;
  private c gcc;
  private HashMap<Integer, ArrayList<d>> gcd;
  public final Deque<d> gce = new LinkedList();
  public List<d> gcf = new LinkedList();
  private int[] gcg;
  private volatile boolean gch;
  private LinkedList<Long> gci;
  private Paint gcj;
  private long gck = 0L;
  private LinkedList<Float> gcl;
  private final Context mContext;
  public volatile int status = 3;
  
  public DanmuView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public DanmuView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.mContext = paramContext;
  }
  
  private void akg()
  {
    this.gcd = new HashMap(this.gbV);
    int i = 0;
    while (i < this.gbV)
    {
      ArrayList localArrayList = new ArrayList(this.gbX);
      this.gcd.put(Integer.valueOf(i), localArrayList);
      i += 1;
    }
    akh();
  }
  
  private void akh()
  {
    int j = 0;
    this.gcg = new int[this.gbV];
    float f1 = b.cB(this.mContext);
    float f2 = getHeight();
    f2 = this.gbY * f2;
    int i = 0;
    while (i < this.gbV)
    {
      this.gcg[i] = ((int)((i + 1) * f1 + f2 - 3.0F * f1 / 4.0F));
      i += 1;
    }
    if (this.gcb)
    {
      this.gcl.clear();
      this.gcl.add(Float.valueOf(f2));
      i = j;
      while (i < this.gbV)
      {
        this.gcl.add(Float.valueOf((i + 1) * f1 + f2));
        i += 1;
      }
    }
  }
  
  private double akl()
  {
    long l = System.nanoTime();
    this.gci.addLast(Long.valueOf(l));
    double d = (l - ((Long)this.gci.getFirst()).longValue()) / 1.0E9D;
    if (this.gci.size() > 100) {
      this.gci.removeFirst();
    }
    if (d > 0.0D) {
      return this.gci.size() / d;
    }
    return 0.0D;
  }
  
  private int b(d paramd)
  {
    int i = 0;
    try
    {
      while (i < this.gbV)
      {
        int j = (i + 0) % this.gbV;
        ArrayList localArrayList = (ArrayList)this.gcd.get(Integer.valueOf(j));
        if (localArrayList.size() == 0) {
          return j;
        }
        if (localArrayList.size() <= this.gbX)
        {
          boolean bool = paramd.a((d)localArrayList.get(localArrayList.size() - 1));
          if (!bool) {
            return j;
          }
        }
        i += 1;
      }
      return -1;
    }
    catch (Exception paramd)
    {
      x.w("MicroMsg.DanmuView", "findVacant,Exception:" + paramd.getMessage());
    }
  }
  
  private static boolean isMainThread()
  {
    return Looper.getMainLooper().getThread() == Thread.currentThread();
  }
  
  public final void aki()
  {
    if (isMainThread())
    {
      this.gch = true;
      return;
    }
    post(new DanmuView.1(this));
  }
  
  public final void akj()
  {
    if (isMainThread())
    {
      this.gch = false;
      invalidate();
      return;
    }
    post(new DanmuView.2(this));
  }
  
  public final void akk()
  {
    if ((this.gcd != null) && (!this.gcd.isEmpty())) {
      this.gcd.clear();
    }
    synchronized (this.gce)
    {
      if (!this.gce.isEmpty()) {
        this.gce.clear();
      }
      return;
    }
  }
  
  public float getYOffset()
  {
    return this.gbZ - this.gbY;
  }
  
  public final void hide()
  {
    this.status = 4;
    invalidate();
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    if (this.gch)
    {
      x.i("MicroMsg.DanmuView", "inTransition");
      return;
    }
    if (this.status == 1) {}
    for (;;)
    {
      int i;
      Object localObject1;
      try
      {
        paramCanvas.drawColor(0);
        i = 0;
        if (i >= this.gcd.size()) {
          break label142;
        }
        localObject1 = ((ArrayList)this.gcd.get(Integer.valueOf(i))).iterator();
        if (!((Iterator)localObject1).hasNext()) {
          break label686;
        }
        ??? = (d)((Iterator)localObject1).next();
        if (((d)???).akd())
        {
          ((Iterator)localObject1).remove();
          continue;
        }
        ((d)???).b(paramCanvas, false);
      }
      catch (Exception paramCanvas)
      {
        x.w("MicroMsg.DanmuView", "STATUS_RUNNING onDraw e=%s", new Object[] { paramCanvas });
        invalidate();
        return;
      }
      continue;
      label142:
      if (System.currentTimeMillis() - this.gck > this.gbW) {
        this.gck = System.currentTimeMillis();
      }
      float f;
      synchronized (this.gce)
      {
        if (this.gce.size() > 0)
        {
          localObject1 = (d)this.gce.getFirst();
          i = this.gcc.NK();
          while ((localObject1 != null) && (((d)localObject1).kY(i)))
          {
            this.gce.pollFirst();
            localObject1 = (d)this.gce.getFirst();
          }
          if ((localObject1 != null) && (((d)localObject1).kX(i)))
          {
            i = b((d)localObject1);
            if (i >= 0)
            {
              ((d)localObject1).bN(paramCanvas.getWidth() - 2, this.gcg[i]);
              ((d)localObject1).b(paramCanvas, false);
              ((ArrayList)this.gcd.get(Integer.valueOf(i))).add(localObject1);
              this.gce.pollFirst();
            }
          }
        }
        if ((this.gca) && (this.gci != null))
        {
          i = (int)akl();
          paramCanvas.drawText("FPS:" + i, 5.0F, 20.0F, this.gcj);
        }
        if ((!this.gcb) || (this.gcl == null)) {
          continue;
        }
        localObject1 = this.gcl.iterator();
        if (!((Iterator)localObject1).hasNext()) {
          continue;
        }
        f = ((Float)((Iterator)localObject1).next()).floatValue();
        paramCanvas.drawLine(0.0F, f, getWidth(), f, this.gcj);
      }
      if (this.status != 2) {
        break;
      }
      try
      {
        paramCanvas.drawColor(0);
        i = 0;
        if (i < this.gcd.size())
        {
          localObject1 = ((ArrayList)this.gcd.get(Integer.valueOf(i))).iterator();
          while (((Iterator)localObject1).hasNext())
          {
            ((d)((Iterator)localObject1).next()).b(paramCanvas, true);
            continue;
            invalidate();
          }
        }
      }
      catch (Exception paramCanvas)
      {
        x.w("MicroMsg.DanmuView", "STATUS_PAUSE onDraw e=%s", new Object[] { paramCanvas });
      }
      for (;;)
      {
        return;
        i += 1;
        break;
        if ((this.gca) && (this.gci != null))
        {
          i = (int)akl();
          paramCanvas.drawText("FPS:" + i, 5.0F, 20.0F, this.gcj);
        }
        if ((this.gcb) && (this.gcl != null))
        {
          localObject1 = this.gcl.iterator();
          while (((Iterator)localObject1).hasNext())
          {
            f = ((Float)((Iterator)localObject1).next()).floatValue();
            paramCanvas.drawLine(0.0F, f, getWidth(), f, this.gcj);
          }
        }
      }
      label686:
      i += 1;
    }
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    akh();
  }
  
  public final void pause()
  {
    this.status = 2;
    invalidate();
  }
  
  public final void prepare()
  {
    float f1 = this.gbY;
    float f2 = this.gbZ;
    if (f1 >= f2) {
      throw new IllegalArgumentException("start_Y_offset must < end_Y_offset");
    }
    if ((f1 < 0.0F) || (f1 >= 1.0F) || (f2 < 0.0F) || (f2 > 1.0F)) {
      throw new IllegalArgumentException("start_Y_offset and end_Y_offset must between 0 and 1)");
    }
    setBackgroundColor(0);
    setDrawingCacheBackgroundColor(0);
    akg();
  }
  
  public void setDanmuViewCallBack(c paramc)
  {
    this.gcc = paramc;
  }
  
  public void setMaxRow(int paramInt)
  {
    this.gbV = paramInt;
    HashMap localHashMap;
    if (this.gcd != null)
    {
      localHashMap = this.gcd;
      paramInt = 0;
    }
    for (;;)
    {
      try
      {
        if (paramInt < this.gcd.size())
        {
          ArrayList localArrayList = (ArrayList)this.gcd.get(Integer.valueOf(paramInt));
          if (localArrayList != null) {
            localArrayList.clear();
          }
        }
        else
        {
          akg();
          return;
        }
      }
      finally {}
      paramInt += 1;
    }
  }
  
  public void setMaxRunningPerRow(int paramInt)
  {
    this.gbX = paramInt;
  }
  
  public void setPickItemInterval(int paramInt)
  {
    this.gbW = paramInt;
  }
  
  public void setShowFps(boolean paramBoolean)
  {
    this.gca = paramBoolean;
    if ((paramBoolean) && ((this.gcj == null) || (this.gci == null)))
    {
      this.gcj = new TextPaint(1);
      this.gcj.setColor(65280);
      this.gcj.setTextSize(20.0F);
      this.gci = new LinkedList();
    }
  }
  
  public void setShowLines(boolean paramBoolean)
  {
    this.gcb = paramBoolean;
    if ((paramBoolean) && (this.gcl == null)) {
      this.gcl = new LinkedList();
    }
  }
  
  public final void show()
  {
    this.status = 1;
    invalidate();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/video/danmu/DanmuView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */