package com.tencent.tencentmap.mapsdk.a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import com.tencent.map.lib.MapLanguage;
import com.tencent.map.lib.basemap.data.GeoPoint;
import com.tencent.map.lib.d;
import com.tencent.map.lib.gl.JNI;
import com.tencent.map.lib.gl.JNICallback.a;
import com.tencent.map.lib.gl.JNICallback.b;
import com.tencent.map.lib.gl.JNICallback.c;
import com.tencent.map.lib.gl.JNICallback.d;
import com.tencent.map.lib.gl.JNICallback.e;
import com.tencent.map.lib.gl.JNICallback.f;
import com.tencent.map.lib.gl.JNICallback.h;
import com.tencent.map.lib.gl.JNICallback.j;
import com.tencent.map.lib.gl.JNICallback.k;
import com.tencent.map.lib.mapstructure.BlockRouteCityData;
import com.tencent.map.lib.mapstructure.MapRouteSectionWithName;
import com.tencent.map.lib.mapstructure.MaskLayer;
import com.tencent.map.lib.mapstructure.Polygon2D;
import com.tencent.map.lib.mapstructure.TappedElement;
import com.tencent.map.lib.mapstructure.TrafficRequestItem;
import com.tencent.map.lib.util.SystemUtil;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import javax.microedition.khronos.opengles.GL10;

public class hq
  implements JNICallback.a, JNICallback.e, JNICallback.h, jh
{
  private static boolean i = true;
  private JNI a = new JNI();
  private long b;
  private ie c;
  private ji d = new ji();
  private jh e;
  private JNICallback.e f;
  private hv g;
  private long h = 0L;
  private int j = 0;
  private float k = 1.0F;
  
  public hq(Context paramContext, hv paramhv)
  {
    this.d.a(this);
    this.g = paramhv;
    this.k = paramContext.getResources().getDisplayMetrics().density;
    if (i) {
      jk.a(paramContext, "txmapengine");
    }
  }
  
  public void A()
  {
    if (0L == this.b) {
      return;
    }
    try
    {
      this.a.nativeClearRouteNameSegments(this.b);
      return;
    }
    finally {}
  }
  
  public int B()
  {
    if (this.b == 0L) {
      return 0;
    }
    try
    {
      int m = this.a.nativeGetLanguage(this.b);
      return m;
    }
    finally {}
  }
  
  public double a(Rect paramRect1, Rect paramRect2)
  {
    if (0L == this.b) {
      return 1.0D;
    }
    try
    {
      double d1 = this.a.nativeGetTargetScale(this.b, paramRect1, paramRect2);
      return d1;
    }
    finally {}
  }
  
  public int a(MaskLayer paramMaskLayer)
  {
    if (this.b == 0L) {
      return 0;
    }
    return this.a.nativeAddMaskLayer(this.b, paramMaskLayer);
  }
  
  public int a(Polygon2D paramPolygon2D)
  {
    if (this.b == 0L) {
      return 0;
    }
    try
    {
      int m = this.a.nativeAddPolygon(this.b, paramPolygon2D);
      return m;
    }
    finally {}
  }
  
  public int a(iq paramiq)
  {
    if (this.b == 0L) {
      return -1;
    }
    for (;;)
    {
      int m;
      boolean bool2;
      Object localObject1;
      try
      {
        n = paramiq.m();
        boolean bool1 = false;
        m = n;
        if (n == 3)
        {
          m = 0;
          bool1 = true;
        }
        bool2 = false;
        localObject1 = paramiq.c();
        if (localObject1[0] == 33)
        {
          n = 2;
          localObject1 = new int[0];
          if (paramiq.y() != null)
          {
            localObject2 = new int[paramiq.y().size()];
            m = 0;
            localObject1 = localObject2;
            if (m < paramiq.y().size())
            {
              localObject2[m] = ((Integer)paramiq.y().get(m)).intValue();
              m += 1;
              continue;
            }
          }
          Object localObject2 = new int[0];
          if (paramiq.f() != null)
          {
            int[] arrayOfInt = new int[paramiq.f().length];
            m = 0;
            localObject2 = arrayOfInt;
            if (m < paramiq.f().length)
            {
              arrayOfInt[m] = paramiq.f()[m];
              m += 1;
              continue;
            }
          }
          m = this.a.nativeCreateLine(this.b, paramiq.c(), paramiq.b(), (GeoPoint[])paramiq.a().toArray(new GeoPoint[0]), paramiq.q(), paramiq.n(), n, bool1, bool2, paramiq.l(), paramiq.j(), paramiq.t(), paramiq.d(), paramiq.e(), (int[])localObject2, paramiq.g(), (int[])localObject1, paramiq.o());
          return m;
        }
      }
      finally {}
      int n = m;
      if (localObject1[0] == 20)
      {
        bool2 = true;
        n = m;
      }
    }
  }
  
  public int a(String paramString, double paramDouble1, double paramDouble2, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, int paramInt)
  {
    if (0L == this.b) {
      return 0;
    }
    try
    {
      paramInt = this.a.nativeAddMarker(this.b, paramString, paramDouble1, paramDouble2, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6, paramBoolean1, paramBoolean2, paramBoolean3, paramBoolean4, paramInt);
      return paramInt;
    }
    finally {}
  }
  
  public int a(byte[] paramArrayOfByte, int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    try
    {
      if (this.b == 0L) {
        return -1;
      }
      paramInt = this.a.nativeRefreshTrafficData(this.b, paramArrayOfByte, paramInt, paramBoolean1, paramBoolean2);
      return paramInt;
    }
    finally {}
  }
  
  public PointF a(byte[] paramArrayOfByte, double paramDouble1, double paramDouble2)
  {
    if (this.b == 0L) {
      return new PointF();
    }
    try
    {
      float[] arrayOfFloat = new float[2];
      this.a.nativeToScreenLocation(this.b, paramArrayOfByte, paramDouble1, paramDouble2, arrayOfFloat);
      paramArrayOfByte = new PointF(arrayOfFloat[0], arrayOfFloat[1]);
      return paramArrayOfByte;
    }
    finally {}
  }
  
  public GeoPoint a(byte[] paramArrayOfByte, float paramFloat1, float paramFloat2)
  {
    if (this.b == 0L) {
      return new GeoPoint();
    }
    try
    {
      double[] arrayOfDouble = new double[2];
      this.a.nativeFromScreenLocation(this.b, paramArrayOfByte, paramFloat1, paramFloat2, arrayOfDouble);
      int m = (int)(arrayOfDouble[0] * 1000000.0D);
      paramArrayOfByte = new GeoPoint((int)(arrayOfDouble[1] * 1000000.0D), m);
      return paramArrayOfByte;
    }
    finally {}
  }
  
  public TappedElement a(float paramFloat1, float paramFloat2)
  {
    if (this.b == 0L) {
      return null;
    }
    try
    {
      byte[] arrayOfByte1 = this.a.nativeOnTap(this.b, paramFloat1, paramFloat2);
      if (arrayOfByte1 == null) {
        return null;
      }
    }
    finally {}
    try
    {
      TappedElement localTappedElement = TappedElement.fromBytes(arrayOfByte2);
      return localTappedElement;
    }
    catch (Exception localException) {}
    return null;
  }
  
  public String a(GeoPoint paramGeoPoint)
  {
    if (this.b == 0L) {
      return "";
    }
    paramGeoPoint = this.a.nativeGetCityName(this.b, paramGeoPoint);
    if (paramGeoPoint != null) {
      try
      {
        paramGeoPoint = new String(paramGeoPoint, "GBK").trim();
        return paramGeoPoint;
      }
      catch (UnsupportedEncodingException paramGeoPoint) {}
    }
    return "";
  }
  
  public List<Integer> a(Rect paramRect, int paramInt)
  {
    if (0L == this.b) {
      return null;
    }
    try
    {
      int[] arrayOfInt = new int[100];
      int m = this.a.nativeQueryCityCodeList(this.b, paramRect, paramInt, arrayOfInt, 100);
      if (m > 0)
      {
        paramRect = new ArrayList(m);
        paramInt = 0;
        while (paramInt < m)
        {
          paramRect.add(Integer.valueOf(arrayOfInt[paramInt]));
          paramInt += 1;
        }
        return paramRect;
      }
    }
    finally {}
    return null;
  }
  
  public void a()
  {
    this.d.a();
    if (this.d != null) {
      this.d.a(null);
    }
    if (this.b != 0L) {
      try
      {
        this.a.nativeDestroyEngine(this.b);
        this.b = 0L;
        return;
      }
      finally {}
    }
  }
  
  public void a(double paramDouble)
  {
    if ((0L == this.b) || (this.g == null)) {
      return;
    }
    this.a.nativeSetScale(this.b, paramDouble, false);
  }
  
  public void a(final double paramDouble, boolean paramBoolean)
  {
    if ((0L == this.b) || (this.g == null)) {
      return;
    }
    this.g.a(new hv.a()
    {
      public void a(GL10 paramAnonymousGL10)
      {
        hq.b(hq.this).nativeSetScale(hq.a(hq.this), paramDouble, this.b);
      }
    });
  }
  
  public void a(float paramFloat)
  {
    if (0L == this.b) {
      return;
    }
    try
    {
      this.a.nativeSetRotate(this.b, paramFloat, false);
      return;
    }
    finally {}
  }
  
  public void a(float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    if ((0L == this.b) || (this.g == null)) {
      return;
    }
    this.g.a(new hq.4(this, paramFloat1, paramFloat2, paramBoolean));
  }
  
  public void a(int paramInt)
  {
    if (this.b == 0L) {
      return;
    }
    this.a.nativeRemoveMaskLayer(this.b, paramInt);
  }
  
  public void a(int paramInt1, int paramInt2)
  {
    if ((this.b == 0L) || (paramInt1 < 0) || (this.g == null)) {
      return;
    }
    this.g.a(new hq.1(this, paramInt1, paramInt2));
  }
  
  public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if ((0L == this.b) || (this.g == null)) {
      return;
    }
    this.g.a(new hq.12(this, paramInt1, paramInt2, paramInt3, paramInt4));
  }
  
  public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    if (this.b != 0L) {
      try
      {
        this.a.nativeCheckTrafficBlockCache(this.b, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
        return;
      }
      finally {}
    }
  }
  
  public void a(int paramInt1, String paramString, double paramDouble1, double paramDouble2, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, int paramInt2)
  {
    if (0L == this.b) {
      return;
    }
    this.g.a(new hq.22(this, paramInt1, paramString, paramDouble1, paramDouble2, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6, paramBoolean1, paramBoolean2, paramBoolean3, paramBoolean4, paramInt2));
  }
  
  public void a(int paramInt, boolean paramBoolean)
  {
    if (this.b == 0L) {}
    while (paramInt == -1) {
      return;
    }
    try
    {
      this.a.nativeDeleteLine(this.b, paramInt, paramBoolean);
      return;
    }
    finally {}
  }
  
  public void a(Rect paramRect1, Rect paramRect2, boolean paramBoolean)
  {
    if ((0L == this.b) || (this.g == null)) {
      return;
    }
    this.g.a(new hq.25(this, paramRect1, paramRect2, paramBoolean));
  }
  
  public void a(GeoPoint paramGeoPoint, boolean paramBoolean)
  {
    if ((0L == this.b) || (this.g == null)) {
      return;
    }
    this.g.a(new hq.6(this, paramGeoPoint, paramBoolean));
  }
  
  public void a(JNICallback.b paramb)
  {
    this.a.setHandDrawTileLoadCallback(paramb);
  }
  
  public void a(JNICallback.c paramc)
  {
    this.a.setHandDrawTileWriteCallback(paramc);
  }
  
  public void a(JNICallback.d paramd)
  {
    this.a.setHeatTileLoadCallback(paramd);
  }
  
  public void a(JNICallback.e parame)
  {
    this.f = parame;
  }
  
  public void a(JNICallback.f paramf)
  {
    this.a.setMapCallbackGetGLContext(paramf);
  }
  
  public void a(JNICallback.j paramj)
  {
    this.a.setWorldTileLoadCallback(paramj);
  }
  
  public void a(JNICallback.k paramk)
  {
    this.a.setTileWriteCallback(paramk);
  }
  
  public void a(ie paramie)
  {
    this.c = paramie;
  }
  
  public void a(jg paramjg)
  {
    this.d.a(paramjg);
  }
  
  public void a(String paramString)
  {
    if (this.b == 0L) {
      return;
    }
    this.g.a(new hq.17(this, paramString));
  }
  
  public void a(String paramString, byte[] paramArrayOfByte)
  {
    this.g.a(new hq.19(this, paramString, paramArrayOfByte));
    if (this.e != null) {
      this.e.a(paramString, paramArrayOfByte);
    }
  }
  
  public void a(List<BlockRouteCityData> paramList)
  {
    if (0L == this.b) {
      return;
    }
    if (paramList != null) {}
    try
    {
      if (paramList.isEmpty()) {
        return;
      }
    }
    finally {}
    int n = paramList.size();
    int[] arrayOfInt1 = new int[n];
    int[] arrayOfInt2 = new int[n];
    int m = 0;
    for (;;)
    {
      if (m < n)
      {
        BlockRouteCityData localBlockRouteCityData = (BlockRouteCityData)paramList.get(m);
        if (localBlockRouteCityData != null)
        {
          arrayOfInt1[m] = localBlockRouteCityData.cityCode;
          arrayOfInt2[m] = localBlockRouteCityData.version;
        }
      }
      else
      {
        this.a.nativeLoadBlockRouteCityList(this.b, arrayOfInt1, arrayOfInt2, n);
        return;
      }
      m += 1;
    }
  }
  
  public void a(List<MapRouteSectionWithName> paramList, List<GeoPoint> paramList1)
  {
    if (0L == this.b) {
      return;
    }
    if (paramList != null) {}
    for (;;)
    {
      int m;
      try
      {
        if ((!paramList.isEmpty()) && (paramList1 != null) && (!paramList1.isEmpty()))
        {
          int n = paramList.size();
          byte[][] arrayOfByte = new byte[n][];
          m = 0;
          if (m < n)
          {
            MapRouteSectionWithName localMapRouteSectionWithName = (MapRouteSectionWithName)paramList.get(m);
            if (localMapRouteSectionWithName != null) {
              arrayOfByte[m] = localMapRouteSectionWithName.toBytes();
            }
          }
          else
          {
            m = paramList1.size();
            this.a.nativeAddRouteNameSegments(this.b, arrayOfByte, n, (GeoPoint[])paramList1.toArray(new GeoPoint[m]), m);
          }
        }
        else
        {
          return;
        }
      }
      finally {}
      m += 1;
    }
  }
  
  public void a(boolean paramBoolean)
  {
    if (this.b == 0L) {
      return;
    }
    this.g.a(new hq.5(this, paramBoolean));
  }
  
  public void a(int[] paramArrayOfInt, int paramInt)
  {
    if (0L == this.b) {
      return;
    }
    try
    {
      this.a.nativeDeleteIcons(this.b, paramArrayOfInt, paramInt);
      return;
    }
    finally {}
  }
  
  public boolean a(Context paramContext, if paramif, String paramString1, String paramString2, String paramString3, float paramFloat)
  {
    boolean bool = hw.a();
    int[] arrayOfInt = new int[1];
    this.b = this.a.nativeInitEngine(paramString1, paramString2, paramString3, SystemUtil.getDensity(paramContext), 256, SystemUtil.getDensity(paramContext), arrayOfInt, bool, MapLanguage.LAN_CHINESE.ordinal());
    if (arrayOfInt[0] != 0)
    {
      d.a("init engine fail:" + arrayOfInt[0]);
      this.b = 0L;
      return false;
    }
    this.a.initCallback(paramif, this, this, this, this.g.a(), this.b);
    this.a.nativeSetTrafficColor(this.b, -14803236, -15611905, -11088785, -16777063);
    return true;
  }
  
  public String b(GeoPoint paramGeoPoint)
  {
    if (0L == this.b) {
      return null;
    }
    try
    {
      paramGeoPoint = this.a.nativeGetCurIndoorName(this.b, paramGeoPoint);
      return paramGeoPoint;
    }
    finally {}
  }
  
  public void b(float paramFloat)
  {
    if (0L == this.b) {
      return;
    }
    try
    {
      this.a.nativeSetSkew(this.b, paramFloat, false);
      return;
    }
    finally {}
  }
  
  public void b(float paramFloat1, float paramFloat2)
  {
    if ((0L == this.b) || (this.g == null)) {
      return;
    }
    this.g.a(new hq.8(this, paramFloat1, paramFloat2));
  }
  
  public void b(float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    if ((0L == this.b) || (this.g == null)) {
      return;
    }
    this.g.a(new hq.10(this, paramBoolean, paramFloat1, paramFloat2));
  }
  
  public void b(int paramInt)
  {
    if (0L == this.b) {
      return;
    }
    try
    {
      this.a.nativeSetMaxScaleLevel(this.b, paramInt);
      return;
    }
    finally {}
  }
  
  public void b(int paramInt1, int paramInt2)
  {
    if (this.b == 0L) {
      return;
    }
    this.a.nativeUpdateMaskLayer(this.b, paramInt1, paramInt2);
  }
  
  public void b(int paramInt, boolean paramBoolean)
  {
    if (0L == this.b) {
      return;
    }
    this.g.a(new hq.13(this, paramInt, paramBoolean));
  }
  
  public void b(Polygon2D paramPolygon2D)
  {
    if (this.b == 0L) {
      return;
    }
    try
    {
      this.a.nativeUpdatePolygon(this.b, paramPolygon2D.polygonId, paramPolygon2D.borldLineId, paramPolygon2D);
      return;
    }
    finally {}
  }
  
  public void b(iq paramiq)
  {
    if (this.b == 0L) {}
    int m;
    do
    {
      return;
      m = paramiq.r();
    } while (m == -1);
    try
    {
      paramiq = paramiq.p();
      if (paramiq == null) {
        return;
      }
    }
    finally {}
    this.a.nativeSetTurnArrow(this.b, m, paramiq.a, paramiq.b);
  }
  
  public void b(String paramString)
  {
    this.j += 1;
    if (this.j >= 30)
    {
      m();
      this.j = 0;
    }
    this.g.a(new hq.20(this, paramString));
    if (this.e != null) {
      this.e.b(paramString);
    }
  }
  
  public void b(boolean paramBoolean)
  {
    if (0L != this.b) {
      try
      {
        this.a.nativeSetBuilding3DEffect(this.b, paramBoolean);
        return;
      }
      finally {}
    }
  }
  
  public boolean b()
  {
    if (this.b == 0L) {
      return false;
    }
    return this.a.nativeGenerateTextures(this.b);
  }
  
  public int c(int paramInt, boolean paramBoolean)
  {
    if (this.b == 0L) {
      return -1;
    }
    try
    {
      paramInt = this.a.nativeAddHeatTileOverlay(this.b, paramInt, paramBoolean);
      return paramInt;
    }
    finally {}
  }
  
  public void c(int paramInt)
  {
    if (0L == this.b) {
      return;
    }
    try
    {
      this.a.nativeSetMinScaleLevel(this.b, paramInt);
      return;
    }
    finally {}
  }
  
  public void c(int paramInt1, int paramInt2)
  {
    if (0L == this.b) {
      return;
    }
    this.g.a(new hq.24(this, paramInt1, paramInt2));
  }
  
  public void c(GeoPoint paramGeoPoint)
  {
    if ((0L == this.b) || (this.g == null)) {
      return;
    }
    this.a.nativeSetCenter(this.b, paramGeoPoint, false);
  }
  
  public void c(iq paramiq)
  {
    if (this.b == 0L) {}
    int m;
    do
    {
      return;
      m = paramiq.r();
    } while (m == -1);
    paramiq = paramiq.w();
    this.g.a(new hq.18(this, m, paramiq));
  }
  
  public void c(String paramString)
  {
    this.d.a(paramString);
  }
  
  public void c(final boolean paramBoolean)
  {
    if (0L == this.b) {
      return;
    }
    this.g.a(new hv.a()
    {
      public void a(GL10 paramAnonymousGL10)
      {
        hq.b(hq.this).nativeSetCompassVisible(hq.a(hq.this), paramBoolean);
      }
    });
  }
  
  public boolean c()
  {
    if (this.b == 0L) {
      return false;
    }
    this.a.nativeDrawFrame(this.b);
    return true;
  }
  
  public int d()
  {
    if (this.b == 0L) {
      return -1;
    }
    return this.a.nativeClearCache(this.b);
  }
  
  public void d(int paramInt)
  {
    if (this.b == 0L) {
      return;
    }
    try
    {
      this.a.nativeRemoveHeatTileOverlay(this.b, paramInt);
      return;
    }
    finally {}
  }
  
  public void d(int paramInt1, int paramInt2)
  {
    if (this.b == 0L) {
      return;
    }
    this.a.nativeBringElementAbove(this.b, paramInt1, paramInt2);
  }
  
  public void d(iq paramiq)
  {
    if (this.b == 0L) {}
    int m;
    do
    {
      return;
      m = paramiq.r();
    } while (m == -1);
    try
    {
      this.a.nativeSetLineDrawArrow(this.b, m, paramiq.j());
      return;
    }
    finally {}
  }
  
  public void d(String paramString)
  {
    if (this.b == 0L) {
      return;
    }
    try
    {
      this.a.nativeMapLoadKMLFile(this.b, paramString);
      return;
    }
    finally {}
  }
  
  public void d(boolean paramBoolean)
  {
    if ((this.b == 0L) || (this.g == null)) {
      return;
    }
    try
    {
      this.a.nativeIndoorBuildingEnabled(this.b, paramBoolean);
      return;
    }
    finally {}
  }
  
  public void e()
  {
    if (this.b == 0L) {
      return;
    }
    this.a.nativeLockEngine(this.b);
  }
  
  public void e(int paramInt)
  {
    if (this.b == 0L) {
      return;
    }
    try
    {
      this.a.nativeReloadHeatTileOverlay(this.b, paramInt);
      return;
    }
    finally {}
  }
  
  public void e(iq paramiq)
  {
    if (this.b == 0L) {}
    int m;
    do
    {
      return;
      m = paramiq.r();
    } while (m == -1);
    try
    {
      this.a.nativeSetLineDirectionArrowTextureName(this.b, m, paramiq.u());
      return;
    }
    finally {}
  }
  
  public void e(String paramString)
  {
    if (this.b == 0L) {
      return;
    }
    this.g.a(new hq.15(this, paramString));
  }
  
  public void e(boolean paramBoolean)
  {
    if (0L == this.b) {
      return;
    }
    this.g.a(new hq.3(this, paramBoolean));
  }
  
  public void f()
  {
    if (this.b == 0L) {
      return;
    }
    this.a.nativeUnlockEngine(this.b);
  }
  
  public void f(int paramInt)
  {
    if (this.g != null)
    {
      ic localic = this.g.e();
      if (localic != null) {
        localic.a();
      }
    }
  }
  
  public void f(iq paramiq)
  {
    if (this.b == 0L) {}
    int m;
    do
    {
      return;
      m = paramiq.r();
    } while (m == -1);
    try
    {
      this.a.nativeSetDrawCap(this.b, m, paramiq.k());
      return;
    }
    finally {}
  }
  
  public void f(boolean paramBoolean)
  {
    if (0L == this.b) {
      return;
    }
    try
    {
      this.a.nativeSetNeedDisplay(this.b, paramBoolean);
      return;
    }
    finally {}
  }
  
  public void g(iq paramiq)
  {
    if (this.b == 0L) {}
    int m;
    do
    {
      return;
      m = paramiq.r();
    } while (m == -1);
    GeoPoint localGeoPoint;
    try
    {
      localGeoPoint = paramiq.h();
      if (localGeoPoint == null) {
        return;
      }
    }
    finally {}
    this.a.nativeLineInsertPoint(this.b, m, localGeoPoint, paramiq.i());
  }
  
  public void g(boolean paramBoolean)
  {
    if (0L == this.b) {
      return;
    }
    try
    {
      this.a.nativeSetBlockRouteVisible(this.b, paramBoolean);
      return;
    }
    finally {}
  }
  
  public boolean g()
  {
    if (this.b == 0L) {
      return true;
    }
    try
    {
      boolean bool = this.a.nativeIsMapDrawFinished(this.b);
      return bool;
    }
    finally {}
  }
  
  public void h(iq paramiq)
  {
    if (this.b == 0L) {}
    int m;
    do
    {
      return;
      m = paramiq.r();
    } while (m == -1);
    GeoPoint localGeoPoint;
    try
    {
      localGeoPoint = paramiq.h();
      if (localGeoPoint == null) {
        return;
      }
    }
    finally {}
    this.a.nativeLineClearPoint(this.b, m, localGeoPoint, paramiq.i());
  }
  
  public void h(boolean paramBoolean)
  {
    if (this.b == 0L) {
      return;
    }
    this.a.nativeEnablePOI(this.b, paramBoolean);
  }
  
  public TrafficRequestItem[] h()
  {
    if (this.b == 0L) {
      return null;
    }
    try
    {
      int[] arrayOfInt = this.a.nativeFetchLackedTrafficBlocks(this.b);
      if ((arrayOfInt == null) || (arrayOfInt.length == 0)) {
        return null;
      }
    }
    finally {}
    TrafficRequestItem[] arrayOfTrafficRequestItem = new TrafficRequestItem[localObject.length / 6];
    int m = 0;
    while (m < localObject.length / 6)
    {
      arrayOfTrafficRequestItem[m] = new TrafficRequestItem();
      arrayOfTrafficRequestItem[m].level = localObject[(m * 6)];
      arrayOfTrafficRequestItem[m].blockNo = localObject[(m * 6 + 1)];
      arrayOfTrafficRequestItem[m].minLon = localObject[(m * 6 + 2)];
      arrayOfTrafficRequestItem[m].minLat = localObject[(m * 6 + 3)];
      arrayOfTrafficRequestItem[m].maxLon = localObject[(m * 6 + 4)];
      arrayOfTrafficRequestItem[m].maxLat = localObject[(m * 6 + 5)];
      m += 1;
    }
    return arrayOfTrafficRequestItem;
  }
  
  public void i()
  {
    if (this.b == 0L) {
      return;
    }
    this.g.a(new hv.a()
    {
      public void a(GL10 paramAnonymousGL10)
      {
        hq.b(hq.this).nativeShowStreetRoad(hq.a(hq.this));
      }
    });
  }
  
  public void i(iq paramiq)
  {
    if (this.b == 0L) {}
    int m;
    do
    {
      return;
      m = paramiq.r();
    } while ((m == -1) || (paramiq.v() < 0.0F));
    int n = paramiq.m();
    if ((n == 3) || (n == 0)) {
      try
      {
        this.a.nativeSetLineArrowSpacing(this.b, m, paramiq.v());
        return;
      }
      finally {}
    }
    try
    {
      this.a.nativeSetLineFootPrintSpacing(this.b, m, paramiq.v());
      return;
    }
    finally {}
  }
  
  public void i(boolean paramBoolean)
  {
    if (this.b == 0L) {
      return;
    }
    this.a.nativeEnableVectorMap(this.b, paramBoolean);
  }
  
  public void j()
  {
    if (this.b != 0L) {
      try
      {
        this.a.nativeHideStreetRoad(this.b);
        return;
      }
      finally {}
    }
  }
  
  public void k()
  {
    if (this.b == 0L) {
      return;
    }
    this.g.a(new hq.14(this));
  }
  
  public void l()
  {
    if (this.b == 0L) {
      return;
    }
    this.g.a(new hq.16(this));
  }
  
  public void m()
  {
    if (this.b != 0L) {
      this.g.a(new hq.11(this));
    }
  }
  
  public void n()
  {
    if (0L == this.b) {
      return;
    }
    this.g.a(new hv.a()
    {
      public void a(GL10 paramAnonymousGL10)
      {
        hq.b(hq.this).nativeHideCompass(hq.a(hq.this));
      }
    });
  }
  
  public int o()
  {
    if (0L == this.b) {
      return -1;
    }
    try
    {
      int m = this.a.nativeGetIndoorCurrentFloorId(this.b);
      return m;
    }
    finally {}
  }
  
  public String[] p()
  {
    if (0L == this.b) {
      return null;
    }
    try
    {
      String[] arrayOfString = this.a.nativeGetIndoorFloorNames(this.b);
      return arrayOfString;
    }
    finally {}
  }
  
  public GeoPoint q()
  {
    if (0L == this.b) {
      return null;
    }
    try
    {
      GeoPoint localGeoPoint = new GeoPoint();
      this.a.nativeGetCenterMapPoint(this.b, localGeoPoint);
      return localGeoPoint;
    }
    finally {}
  }
  
  public float r()
  {
    if (0L == this.b) {
      return 1.0F;
    }
    try
    {
      float f1 = (float)this.a.nativeGetScale(this.b);
      return f1;
    }
    finally {}
  }
  
  public int s()
  {
    if (0L == this.b) {
      return ic.a.c;
    }
    try
    {
      int m = this.a.nativeGetScaleLevel(this.b);
      return m;
    }
    finally {}
  }
  
  public void t()
  {
    if ((0L == this.b) || (this.g == null)) {
      return;
    }
    this.g.a(new hq.9(this));
  }
  
  public void u()
  {
    if (0L == this.b) {
      return;
    }
    for (;;)
    {
      long l;
      try
      {
        l = System.currentTimeMillis();
        if (this.h == 0L)
        {
          this.a.nativeUpdateFrame(this.b, 0.0D);
          this.h = l;
          return;
        }
      }
      finally {}
      this.a.nativeUpdateFrame(this.b, l - this.h);
    }
  }
  
  public boolean v()
  {
    if (0L == this.b) {
      return false;
    }
    try
    {
      boolean bool = this.a.nativeNeedDispaly(this.b);
      return bool;
    }
    finally {}
  }
  
  public float w()
  {
    if (0L == this.b) {
      return 0.0F;
    }
    return this.a.nativeGetSkew(this.b);
  }
  
  public float x()
  {
    if (0L == this.b) {
      return 0.0F;
    }
    return this.a.nativeGetRotate(this.b);
  }
  
  public int y()
  {
    if (0L == this.b) {
      return 1;
    }
    try
    {
      int m = this.a.nativeGetMapMode(this.b);
      return m;
    }
    finally {}
  }
  
  public void z()
  {
    if (this.f != null) {
      this.f.z();
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/hq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */