package com.tencent.tencentmap.mapsdk.a;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ss
  implements sx
{
  private float a = 90.0F;
  private List<qw> b = new ArrayList();
  private List<qw> c = new ArrayList();
  private sl d;
  private sf e;
  private boolean f = false;
  private qx g = null;
  private boolean h = false;
  private boolean i = true;
  private int j = -16777216;
  private float k = 10.0F;
  private float l = 0.0F;
  private qq m;
  private float n = 0.0F;
  private int o = -983041;
  private String p;
  
  public ss(sl paramsl, rd paramrd)
  {
    this.d = paramsl;
    this.e = paramsl.e();
    this.p = j();
    this.j = paramrd.g();
    this.f = paramrd.j();
    this.h = paramrd.k();
    if ((this.h) || (this.f)) {
      this.b = paramrd.e();
    }
    b(paramrd.e());
    this.i = paramrd.i();
    this.k = paramrd.f();
    this.l = paramrd.h();
    this.m = paramrd.a();
    this.n = paramrd.b();
    this.o = paramrd.c();
    this.a = paramrd.d();
  }
  
  private static int a(byte[] paramArrayOfByte, int paramInt)
  {
    return paramArrayOfByte[(paramInt + 0)] & 0xFF | (paramArrayOfByte[(paramInt + 1)] & 0xFF) << 8 | (paramArrayOfByte[(paramInt + 2)] & 0xFF) << 16 | (paramArrayOfByte[(paramInt + 3)] & 0xFF) << 24;
  }
  
  protected static Drawable a(Context paramContext, String paramString)
  {
    Object localObject2 = paramContext.getAssets().open(paramString);
    paramString = BitmapFactory.decodeStream((InputStream)localObject2);
    int i2 = paramString.getWidth();
    int i8 = paramString.getHeight();
    Object localObject1 = new ByteArrayOutputStream();
    int i1 = 0;
    while (i1 < 32)
    {
      ((ByteArrayOutputStream)localObject1).write(0);
      i1 += 1;
    }
    Object localObject3 = new int[i2 - 2];
    paramString.getPixels((int[])localObject3, 0, i2, 1, 0, i2 - 2, 1);
    if (localObject3[0] == -16777216)
    {
      i3 = 1;
      if (localObject3[(localObject3.length - 1)] != -16777216) {
        break label177;
      }
    }
    int i6;
    int i9;
    int i7;
    label177:
    for (int i4 = 1;; i4 = 0)
    {
      i6 = 0;
      i2 = 0;
      i9 = localObject3.length;
      for (i1 = 0; i2 < i9; i1 = i5)
      {
        i7 = i6;
        i5 = i1;
        if (i6 != localObject3[i2])
        {
          i5 = i1 + 1;
          a((OutputStream)localObject1, i2);
          i7 = localObject3[i2];
        }
        i2 += 1;
        i6 = i7;
      }
      i3 = 0;
      break;
    }
    i2 = i1;
    if (i4 != 0)
    {
      i2 = i1 + 1;
      a((OutputStream)localObject1, i9);
    }
    int i5 = i2 + 1;
    i1 = i5;
    if (i3 != 0) {
      i1 = i5 - 1;
    }
    if (i4 != 0) {}
    for (int i3 = i1 - 1;; i3 = i1)
    {
      localObject3 = new int[i8 - 2];
      paramString.getPixels((int[])localObject3, 0, 1, 0, 1, 1, i8 - 2);
      if (localObject3[0] == -16777216)
      {
        i4 = 1;
        if (localObject3[(localObject3.length - 1)] != -16777216) {
          break label358;
        }
      }
      int i10;
      label358:
      for (i5 = 1;; i5 = 0)
      {
        i8 = 0;
        i6 = 0;
        i10 = localObject3.length;
        for (i1 = 0; i6 < i10; i1 = i7)
        {
          i9 = i8;
          i7 = i1;
          if (i8 != localObject3[i6])
          {
            i7 = i1 + 1;
            a((OutputStream)localObject1, i6);
            i9 = localObject3[i6];
          }
          i6 += 1;
          i8 = i9;
        }
        i4 = 0;
        break;
      }
      i6 = i1;
      if (i5 != 0)
      {
        i6 = i1 + 1;
        a((OutputStream)localObject1, i10);
      }
      i7 = i6 + 1;
      i1 = i7;
      if (i4 != 0) {
        i1 = i7 - 1;
      }
      i4 = i1;
      if (i5 != 0) {
        i4 = i1 - 1;
      }
      i1 = 0;
      while (i1 < i3 * i4)
      {
        a((OutputStream)localObject1, 1);
        i1 += 1;
      }
      localObject3 = ((ByteArrayOutputStream)localObject1).toByteArray();
      localObject3[0] = 1;
      localObject3[1] = ((byte)i2);
      localObject3[2] = ((byte)i6);
      localObject3[3] = ((byte)(i4 * i3));
      a(paramString, (byte[])localObject3);
      if (NinePatch.isNinePatchChunk((byte[])localObject3))
      {
        localObject1 = Bitmap.createBitmap(paramString, 1, 1, paramString.getWidth() - 2, paramString.getHeight() - 2);
        paramString.recycle();
        paramString = localObject1.getClass().getDeclaredField("mNinePatchChunk");
        paramString.setAccessible(true);
        paramString.set(localObject1, localObject3);
        paramString = (String)localObject1;
      }
      for (;;)
      {
        ((InputStream)localObject2).close();
        if (paramString.getNinePatchChunk() != null) {
          break;
        }
        return new BitmapDrawable(paramString);
      }
      localObject1 = new Rect();
      localObject2 = paramString.getNinePatchChunk();
      ((Rect)localObject1).left = a((byte[])localObject2, 12);
      ((Rect)localObject1).right = a((byte[])localObject2, 16);
      ((Rect)localObject1).top = a((byte[])localObject2, 20);
      ((Rect)localObject1).bottom = a((byte[])localObject2, 24);
      return new NinePatchDrawable(paramContext.getResources(), paramString, paramString.getNinePatchChunk(), (Rect)localObject1, null);
    }
  }
  
  private static void a(Bitmap paramBitmap, byte[] paramArrayOfByte)
  {
    int i2 = 0;
    int[] arrayOfInt = new int[paramBitmap.getWidth() - 2];
    paramBitmap.getPixels(arrayOfInt, 0, arrayOfInt.length, 1, paramBitmap.getHeight() - 1, arrayOfInt.length, 1);
    int i1 = 0;
    if (i1 < arrayOfInt.length)
    {
      if (-16777216 == arrayOfInt[i1]) {
        a(paramArrayOfByte, 12, i1);
      }
    }
    else
    {
      i1 = arrayOfInt.length - 1;
      label64:
      if (i1 >= 0)
      {
        if (-16777216 != arrayOfInt[i1]) {
          break label184;
        }
        a(paramArrayOfByte, 16, arrayOfInt.length - i1 - 2);
      }
      arrayOfInt = new int[paramBitmap.getHeight() - 2];
      paramBitmap.getPixels(arrayOfInt, 0, 1, paramBitmap.getWidth() - 1, 0, 1, arrayOfInt.length);
      i1 = i2;
      label121:
      if (i1 < arrayOfInt.length)
      {
        if (-16777216 != arrayOfInt[i1]) {
          break label191;
        }
        a(paramArrayOfByte, 20, i1);
      }
      i1 = arrayOfInt.length - 1;
    }
    for (;;)
    {
      if (i1 >= 0)
      {
        if (-16777216 == arrayOfInt[i1]) {
          a(paramArrayOfByte, 24, arrayOfInt.length - i1 - 2);
        }
      }
      else
      {
        return;
        i1 += 1;
        break;
        label184:
        i1 -= 1;
        break label64;
        label191:
        i1 += 1;
        break label121;
      }
      i1 -= 1;
    }
  }
  
  private void a(Canvas paramCanvas, List<PointF> paramList)
  {
    if ((paramList == null) || (paramList.size() == 0)) {
      break label13;
    }
    label13:
    while ((this.m == null) || (this.m.b() == null)) {
      return;
    }
    int i2 = this.m.c();
    int i3 = this.m.d();
    double d7 = b() / i3;
    double d8 = i2 * this.k / (i3 * this.a);
    double d1 = -(i2 * d7 / 2.0D);
    int i1 = 0;
    label95:
    PointF localPointF1;
    PointF localPointF2;
    if (i1 < paramList.size() - 1)
    {
      localPointF1 = (PointF)paramList.get(i1);
      localPointF2 = (PointF)paramList.get(i1 + 1);
      if ((localPointF1 != null) && (localPointF2 != null)) {
        break label176;
      }
    }
    label167:
    label176:
    for (double d2 = 0.0D;; d2 = Math.sqrt(Math.pow(localPointF1.x - localPointF2.x, 2.0D) + Math.pow(localPointF1.y - localPointF2.y, 2.0D)))
    {
      if (d2 + d1 >= this.a) {
        break label221;
      }
      d1 += d2;
      i1 += 1;
      break label95;
      break;
    }
    label221:
    double d9 = d2 / this.a;
    double d5 = (this.a - d1) / this.a;
    double d6 = Math.acos((localPointF2.x - localPointF1.x) / d2) * 180.0D / 3.141592653589793D;
    double d4;
    double d3;
    if ((localPointF2.x <= localPointF1.x) && (localPointF2.y >= localPointF1.y))
    {
      d2 = 180.0D - d6 + 180.0D;
      d4 = d5;
      d3 = d1;
    }
    for (;;)
    {
      d1 = d3;
      if (d4 > d9) {
        break label167;
      }
      if ((i1 == paramList.size() - 2) && (d4 + d8 > d9)) {
        break;
      }
      paramCanvas.save();
      paramCanvas.translate((float)(localPointF1.x + (localPointF2.x - localPointF1.x) * d4 / d9), (float)(localPointF1.y + (localPointF2.y - localPointF1.y) * d4 / d9));
      paramCanvas.scale((float)d7, (float)d7);
      paramCanvas.rotate((float)-d2);
      paramCanvas.drawBitmap(this.m.b(), -i2 / 2, -i3 / 2, null);
      paramCanvas.restore();
      if (1.0D + d4 > d9) {
        d3 = (d9 - d4) * this.a;
      }
      d4 += 1.0D;
      continue;
      d3 = d1;
      d2 = d6;
      d4 = d5;
      if (localPointF2.x >= localPointF1.x)
      {
        d3 = d1;
        d2 = d6;
        d4 = d5;
        if (localPointF2.y >= localPointF1.y)
        {
          d2 = 360.0D - d6;
          d3 = d1;
          d4 = d5;
        }
      }
    }
  }
  
  private static void a(OutputStream paramOutputStream, int paramInt)
  {
    paramOutputStream.write(paramInt >> 0 & 0xFF);
    paramOutputStream.write(paramInt >> 8 & 0xFF);
    paramOutputStream.write(paramInt >> 16 & 0xFF);
    paramOutputStream.write(paramInt >> 24 & 0xFF);
  }
  
  private static void a(List<qw> paramList1, List<qw> paramList2, double paramDouble)
  {
    if (paramList1.size() != 3) {}
    for (;;)
    {
      return;
      for (int i1 = 0; i1 <= 10; i1 = (int)(i1 + 1.0F))
      {
        float f1 = i1 / 10.0F;
        double d1 = f1;
        double d2 = f1;
        double d3 = ((qw)paramList1.get(0)).c();
        double d4 = 2.0F * f1;
        double d5 = f1;
        double d6 = ((qw)paramList1.get(1)).c();
        double d7 = f1 * f1;
        double d8 = ((qw)paramList1.get(2)).c();
        double d9 = f1;
        double d10 = f1;
        double d11 = ((qw)paramList1.get(0)).b();
        double d12 = 2.0F * f1;
        double d13 = f1;
        double d14 = ((qw)paramList1.get(1)).b();
        double d15 = f1 * f1;
        double d16 = ((qw)paramList1.get(2)).b();
        double d17 = f1;
        double d18 = f1;
        double d19 = 2.0F * f1;
        double d20 = f1;
        double d21 = f1 * f1;
        double d22 = f1;
        double d23 = f1;
        double d24 = 2.0F * f1;
        double d25 = f1;
        paramList2.add(new qw(((1.0D - d9) * (1.0D - d10) * d11 + d12 * (1.0D - d13) * d14 * paramDouble + d15 * d16) / (f1 * f1 + ((1.0D - d22) * (1.0D - d23) + d24 * (1.0D - d25) * paramDouble)), ((1.0D - d1) * (1.0D - d2) * d3 + d4 * (1.0D - d5) * d6 * paramDouble + d7 * d8) / ((1.0D - d17) * (1.0D - d18) + d19 * (1.0D - d20) * paramDouble + d21)));
      }
    }
  }
  
  private static void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    paramArrayOfByte[(paramInt1 + 0)] = ((byte)(paramInt2 >> 0));
    paramArrayOfByte[(paramInt1 + 1)] = ((byte)(paramInt2 >> 8));
    paramArrayOfByte[(paramInt1 + 2)] = ((byte)(paramInt2 >> 16));
    paramArrayOfByte[(paramInt1 + 3)] = ((byte)(paramInt2 >> 24));
  }
  
  private void b(List<qw> paramList)
  {
    if ((paramList == null) || (paramList.size() == 0)) {
      return;
    }
    qx.a locala = qx.a();
    this.c.clear();
    if (paramList != null)
    {
      Iterator localIterator = paramList.iterator();
      paramList = null;
      while (localIterator.hasNext())
      {
        qw localqw1 = (qw)localIterator.next();
        if ((localqw1 != null) && (!localqw1.equals(paramList)))
        {
          if (!this.h)
          {
            this.c.add(localqw1);
            locala.a(localqw1);
          }
          for (;;)
          {
            paramList = localqw1;
            break;
            if (paramList != null)
            {
              if (Math.abs(localqw1.c() - paramList.c()) >= 0.01D) {
                break label176;
              }
              this.c.add(paramList);
              locala.a(paramList);
              this.c.add(localqw1);
              locala.a(localqw1);
            }
          }
          label176:
          List localList = this.c;
          double d3 = Math.abs(paramList.c() - localqw1.c()) * 3.141592653589793D / 180.0D;
          qw localqw2 = new qw((localqw1.b() + paramList.b()) / 2.0D, (localqw1.c() + paramList.c()) / 2.0D);
          locala.a(paramList).a(localqw2).a(localqw1);
          if (localqw2.b() > 0.0D) {}
          for (int i1 = 1;; i1 = -1)
          {
            double d1 = Math.cos(0.5D * d3);
            double d2 = Math.hypot(paramList.c() - localqw1.c(), paramList.b() - localqw1.b());
            double d5 = Math.tan(d3 * 0.5D);
            d3 = localqw1.c() - paramList.c();
            double d4 = localqw1.b() - paramList.b();
            double d6 = d4 * d4 / (d3 * d3);
            d2 = (int)(d5 * (d2 * 0.5D) * i1 / Math.sqrt(d6 + 1.0D) + localqw2.b());
            d3 = d4 * (localqw2.b() - d2) / d3;
            localqw2 = new qw(d2, (int)(localqw2.c() + d3));
            ArrayList localArrayList = new ArrayList();
            localArrayList.add(paramList);
            localArrayList.add(localqw2);
            localArrayList.add(localqw1);
            a(localArrayList, localList, d1);
            break;
          }
        }
      }
    }
    this.g = locala.a();
  }
  
  public List<qw> a()
  {
    if ((this.h) || (this.f)) {
      return this.b;
    }
    return this.c;
  }
  
  public void a(float paramFloat)
  {
    this.k = paramFloat;
    this.d.a(false, false);
  }
  
  public void a(int paramInt)
  {
    this.j = paramInt;
    this.d.a(false, false);
  }
  
  public void a(Canvas paramCanvas)
  {
    ArrayList localArrayList = new ArrayList();
    if ((this.c == null) || (this.c.size() == 0) || (this.k <= 0.0F)) {
      return;
    }
    Path localPath = new Path();
    Object localObject = (qw)this.c.get(0);
    localObject = this.d.b().a((qw)localObject);
    localArrayList.add(localObject);
    localPath.moveTo(((PointF)localObject).x, ((PointF)localObject).y);
    int i1 = 1;
    while (i1 < this.c.size())
    {
      localObject = (qw)this.c.get(i1);
      localObject = this.d.b().a((qw)localObject);
      localArrayList.add(localObject);
      localPath.lineTo(((PointF)localObject).x, ((PointF)localObject).y);
      i1 += 1;
    }
    localObject = new Paint();
    ((Paint)localObject).setStyle(Paint.Style.STROKE);
    if (this.f)
    {
      i1 = (int)b();
      ((Paint)localObject).setPathEffect(new DashPathEffect(new float[] { i1 * 3, i1, i1 * 3, i1 }, 1.0F));
    }
    for (;;)
    {
      ((Paint)localObject).setAntiAlias(true);
      if (this.n > 0.0F)
      {
        ((Paint)localObject).setColor(this.o);
        ((Paint)localObject).setStrokeWidth(b() + 2.0F * this.n);
        paramCanvas.drawPath(localPath, (Paint)localObject);
      }
      ((Paint)localObject).setColor(e());
      ((Paint)localObject).setStrokeWidth(b());
      paramCanvas.drawPath(localPath, (Paint)localObject);
      if (this.m != null) {
        a(paramCanvas, localArrayList);
      }
      localArrayList.clear();
      return;
      ((Paint)localObject).setStrokeJoin(Paint.Join.ROUND);
      ((Paint)localObject).setStrokeCap(Paint.Cap.ROUND);
    }
  }
  
  public void a(List<qw> paramList)
  {
    if ((this.h) || (this.f)) {
      this.b = paramList;
    }
    b(paramList);
    this.d.a(false, false);
  }
  
  public void a(boolean paramBoolean)
  {
    this.f = paramBoolean;
    this.d.a(false, false);
  }
  
  public boolean a(sv paramsv)
  {
    return (equals(paramsv)) || (paramsv.j().equals(j()));
  }
  
  public float b()
  {
    return this.k;
  }
  
  public void b(float paramFloat)
  {
    this.l = paramFloat;
    this.e.c();
    this.d.a(false, false);
  }
  
  public void b(boolean paramBoolean)
  {
    this.i = paramBoolean;
    this.e.c();
    this.d.a(false, false);
  }
  
  public void c(boolean paramBoolean)
  {
    this.h = paramBoolean;
    this.d.a(false, false);
  }
  
  public boolean c()
  {
    return this.f;
  }
  
  public boolean d()
  {
    return this.h;
  }
  
  public int e()
  {
    return this.j;
  }
  
  public boolean h()
  {
    if (this.g == null) {}
    qx localqx;
    do
    {
      return false;
      localqx = this.d.b().c();
      if (localqx == null) {
        return true;
      }
    } while ((!localqx.a(this.g)) && (!this.g.b(localqx)));
    return true;
  }
  
  public void i()
  {
    this.e.b(j());
  }
  
  public String j()
  {
    if (this.p == null) {
      this.p = sf.a("Polyline");
    }
    return this.p;
  }
  
  public float k()
  {
    return this.l;
  }
  
  public boolean l()
  {
    return this.i;
  }
  
  public int m()
  {
    return super.hashCode();
  }
  
  public void n() {}
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/ss.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */